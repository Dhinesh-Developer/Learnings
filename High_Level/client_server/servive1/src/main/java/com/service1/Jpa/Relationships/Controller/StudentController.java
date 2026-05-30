package com.service1.Jpa.Relationships.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.service1.Jpa.Relationships.Entity.Student;
import com.service1.Jpa.Relationships.Service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student saveStudent(
            @RequestBody Student student) {

        return service.saveStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudent(
            @PathVariable Long id) {

        return service.getStudent(id);
    }
}
/*
{
  "name": "kumar",
  "email": "kumar@gmail.com",
  "department": "CSE",
  "courses": [
    {
      "courseName": "Java",
      "trainer": "Arun"
    }
  ]
}
*/