package com.service1.Dependency_Injection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Order {
    
    public Order(){
        System.out.println("Order initalized");
    }
}
