package com.service1.Scopes;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Student {
    
    @Autowired
    UserScope user;


    public Student(){
        System.out.println("Student instance created!!");
    }

    @PostConstruct
    public void init(){
        System.out.println("Student object created: "+this.hashCode()+" User object hashcode: "+user.hashCode());
    }
}
