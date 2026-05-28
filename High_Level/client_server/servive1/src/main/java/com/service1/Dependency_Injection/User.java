
package com.service1.Dependency_Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User{

    // Field injection
    // @Autowired
    // Order order;

    public Order order;

    // Setter injection
    // @Autowired
    // public void serOrderDependency(Order order){
    //     this.order = order;
    // }

    // constructor injection
    
    @Autowired
    public User(Order order){
        this.order = order;
        System.out.println("User initialized!!");
    }

    // public User(){
    //     System.out.println("User initialized");
    // }
}