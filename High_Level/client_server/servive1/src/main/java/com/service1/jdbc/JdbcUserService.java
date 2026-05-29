package com.service1.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JdbcUserService {
 
    @Autowired
    JdbcUserRepository repo;

    public void createTable(){
        repo.createTable();
    }

    public void insertUser(String username,int age){
        repo.insertUser(username,age);
    }

    public List<JdbcUser> getUsers(){
        List<JdbcUser> users = repo.getUsers();
        for(JdbcUser x : users){
            System.out.println(x.userId+":"+x.getUsername()+":"+x.getAge());
        }
        return users;
    }

}
