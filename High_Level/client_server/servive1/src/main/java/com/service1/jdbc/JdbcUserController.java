package com.service1.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jdbc")
public class JdbcUserController {
    
    @Autowired
    private JdbcUserService service;

    @GetMapping("/users")
    public List<JdbcUser> getUsers(){
        return service.getUsers();
    }

    @GetMapping("/create")
    public void createTable(){
        service.createTable();
    }

    @PostMapping("/users")
    public String createUser(@RequestBody JdbcUser user){
        service.insertUser(user.getUsername(), user.getAge());
        return "User created successfully";
    }
/*
[
  {
    "age": 20,
    "userId": 1,
    "username": "kumar"
  },
  {
    "age": 40,
    "userId": 2,
    "username": "dhinesh"
  }
]
*/

}
