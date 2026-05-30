package com.service1.Jpa.Relationships.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service1.Jpa.Relationships.Entity.UserDetail;
import com.service1.Jpa.Relationships.Repo.UserDetailRepo;

@Service
public class UserDetailService {
    
     @Autowired
    private UserDetailRepo repo;

    public UserDetail saveUser(UserDetail user){
        return repo.save(user);
    }

    public UserDetail updateUser(Long id,UserDetail user){
        Optional<UserDetail> exitinsUser = repo.findById(id);
        if(exitinsUser.isPresent()){
            return repo.save(user);
        }
        return user;
    }
}
