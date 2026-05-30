package com.service1.Jpa.Relationships.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service1.Jpa.Relationships.Entity.Person;
import com.service1.Jpa.Relationships.Service.PersonService;

@RestController
@RequestMapping("/data")
public class PersonController{

    @Autowired
    private PersonService service;

    @PostMapping("/create")
    public Person create(@RequestBody Person person){
        return service.create(person);
    }

    @GetMapping
    public List<Person> getAll(){
        return service.getAllPersons();
    }

}
/*
{
    "age": 20,
    "fullName": "dhinesh kumar",
    "gender": "Male",
    "id": 1,
    "passport": {
      "id": 1,
      "nationality": "Indian",
      "passportNumber": "3306"
    }
  }
*/