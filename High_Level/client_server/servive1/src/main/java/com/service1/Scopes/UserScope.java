package com.service1.Scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope("prototype")
public class UserScope {
    
    public UserScope(){
        System.out.println("User initailized");
    }
    
    @PostConstruct
    public void init(){
        System.out.println("User object hashcode: "+this.hashCode());
    }
}
