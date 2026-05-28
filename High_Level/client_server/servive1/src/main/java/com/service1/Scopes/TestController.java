package com.service1.Scopes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;


// For scope = "Prototype"

@RestController
@RequestMapping("/api")
@Scope("prototype")
public class TestController {
    
    

    @Autowired
    UserScope user;

    @Autowired
    Student student;


    public TestController(){
        System.out.println("TestController instance initialized for prototype!!");
    }


    @PostConstruct
    public void init(){
        System.out.println("TestController object hashcode: "+this.hashCode()+
    " User object hashcode: "+user.hashCode()+" Student object hashcode: "+student.hashCode());
    }

    @GetMapping
    public ResponseEntity<String> testController(){
        System.out.println("Testcontroller api!!");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }




}
