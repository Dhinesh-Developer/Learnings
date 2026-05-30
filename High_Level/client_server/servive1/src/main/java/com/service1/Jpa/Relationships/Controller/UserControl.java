package com.service1.Jpa.Relationships.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.service1.Jpa.Relationships.Entity.UserDetail;
import com.service1.Jpa.Relationships.Repo.UserDetailRepo;
import com.service1.Jpa.Relationships.Service.UserDetailService;

@RestController
@RequestMapping("/one-to-many")
public class UserControl {
    
    @Autowired
    private UserDetailService service;

    @Autowired
    private UserDetailRepo repo;

    @PostMapping("/create")
    public UserDetail insertUser(@RequestBody UserDetail user){
        return service.saveUser(user);
    }

    @PutMapping("/{id}")
    public UserDetail fetchUser(@PathVariable Long id,@RequestBody UserDetail user){
        return service.updateUser(id, user);
    }

    @GetMapping
    public List<UserDetail> getAll(){
        return repo.findAll();
    }
    
}
/*
{
  "name":"kumar",
  "phone":"987987932",
  "orderDetails":[
    {
      "productName":"Ice Cream"
    },
    {
      "productName":"Briyani"
    },
    {
      "productName":"parota"
    }
    ]
}


[
  {
    "name": "kumar",
    "orderDetails": [
      {
        "id": 1,
        "productName": "bovonto"
      },
      {
        "id": 2,
        "productName": "pepse"
      }
    ],
    "phone": "8878723432",
    "userId": 1
  },
  {
    "name": "kumar",
    "orderDetails": [
      {
        "id": 3,
        "productName": "Ice Cream"
      },
      {
        "id": 4,
        "productName": "Briyani"
      },
      {
        "id": 5,
        "productName": "parota"
      }
    ],
    "phone": "987987932",
    "userId": 2
  },
  {
    "name": "dk",
    "orderDetails": [
      {
        "id": 6,
        "productName": "pups"
      },
      {
        "id": 7,
        "productName": "bonta"
      },
      {
        "id": 8,
        "productName": "parota"
      }
    ],
    "phone": "6897983274",
    "userId": 3
  }
]
*/