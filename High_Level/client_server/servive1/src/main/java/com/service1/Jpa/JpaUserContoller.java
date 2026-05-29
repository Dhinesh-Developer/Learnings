package com.service1.Jpa;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa")
public class JpaUserContoller {
    
    @Autowired
    private UserDetailsRepository repo;

    @PostMapping("/create")
    public UserDetails createUser(@RequestBody UserDetails user){
        return repo.save(user);
    }

    @GetMapping
    public List<UserDetails> getAllUsers(){
        return repo.findAll();
    }

}
