package com.service1.Scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api2")
public class TestController2 {
    
    @Autowired
    UserScope user;

    public TestController2(){
        System.out.println("TestController1 instance initialized!!");
    }


    @PostConstruct
    public void init(){
        System.out.println("TestController1 object hashcode: "+this.hashCode()+
    " User object hashcode: "+user.hashCode());
    }

    @GetMapping
    public ResponseEntity<String> testController(){
        System.out.println("Testcontroller1 api!!");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }


}
