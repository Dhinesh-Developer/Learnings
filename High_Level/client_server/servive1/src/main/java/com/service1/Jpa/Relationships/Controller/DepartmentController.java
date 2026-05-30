package com.service1.Jpa.Relationships.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service1.Jpa.Relationships.Entity.Department;
import com.service1.Jpa.Relationships.Service.DepartmentService;

@RestController
@RequestMapping("/example")
public class DepartmentController {
    

    @Autowired
    private DepartmentService service;

    @PostMapping
    public Department create(@RequestBody Department dept){
        return service.create(dept);
    }

    @GetMapping
    public List<Department> getAll(){
        return service.getAll();
    }
}
/*
{
  "name":"IT",
  "location":"Chennai Zoho corportaion",
  "employees":[
    {
      "name":"dhineshkumar M",
      "email":"dhineshdeveloper07@gmail.com",
      "amount":100000
    },
    {
      "name":"testing",
      "email":"testing@gmail.com",
      "amount":50000
    }
    ]
}


[
  {
    "deptId": 1,
    "employees": [
      {
        "amount": 100000,
        "email": "master@gmail.com",
        "id": 1,
        "name": "master"
      }
    ],
    "location": "coimbatore",
    "name": "Sales"
  },
  {
    "deptId": 2,
    "employees": [
      {
        "amount": 100000,
        "email": "dhineshdeveloper07@gmail.com",
        "id": 2,
        "name": "dhineshkumar M"
      },
      {
        "amount": 50000,
        "email": "testing@gmail.com",
        "id": 3,
        "name": "testing"
      }
    ],
    "location": "Chennai Zoho corportaion",
    "name": "IT"
  }
]
*/
