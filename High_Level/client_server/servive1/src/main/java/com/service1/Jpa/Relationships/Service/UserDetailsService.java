package com.service1.Jpa.Relationships.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service1.Jpa.Relationships.Entity.UserDetails;
import com.service1.Jpa.Relationships.Repo.JpaUserDetailsRepository;

@Service
public class UserDetailsService {
    

    @Autowired
    private JpaUserDetailsRepository repo;

    public UserDetails saveUser(UserDetails user){
        return repo.save(user);
    }

    public UserDetails updateUser(Long id,UserDetails user){
        Optional<UserDetails> exitinsUser = repo.findById(id);
        if(exitinsUser.isPresent()){
            return repo.save(user);
        }
        return user;
    }
}
