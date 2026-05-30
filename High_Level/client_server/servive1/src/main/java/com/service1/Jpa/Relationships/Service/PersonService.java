package com.service1.Jpa.Relationships.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service1.Jpa.Relationships.Entity.Person;
import com.service1.Jpa.Relationships.Repo.PersonRepo;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepo repo;


    public Person create(Person person){
        return repo.save(person);
    }

    public List<Person> getAllPersons(){
        return repo.findAll();
    } 


}
