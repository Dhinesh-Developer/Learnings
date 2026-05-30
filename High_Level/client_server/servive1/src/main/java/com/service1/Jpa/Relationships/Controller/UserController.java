package com.service1.Jpa.Relationships.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service1.Jpa.Relationships.Entity.UserDetails;
import com.service1.Jpa.Relationships.Service.UserDetailsService;

@RestController
@RequestMapping("/api")
public class UserController {
    
    @Autowired
    private UserDetailsService service;

    @PostMapping(path = "/user")
    public UserDetails insertUser(@RequestBody UserDetails user){
        return service.saveUser(user);
    }

    @PutMapping(path = "/user/{id}")
    public UserDetails updateUser(@PathVariable Long id,@RequestBody UserDetails user){
        return service.updateUser(id, user);
    }
    
}
/*
{
  "name":"kumar",
  "phone":"9879879234",
  "userAddress":{
    "street":"5th perumal kovil street",
    "city":"Salem",
    "state":"Tamil Nadu",
    "country":"India",
    "pinCode":"637504"
  }
}
*/