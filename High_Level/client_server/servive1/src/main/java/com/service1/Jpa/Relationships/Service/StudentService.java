package com.service1.Jpa.Relationships.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service1.Jpa.Relationships.Entity.Student;
import com.service1.Jpa.Relationships.Repo.StudentRepo;



@Service
public class StudentService {

    @Autowired
    private StudentRepo repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public Student getStudent(Long id) {
        return repository.findById(id).orElse(null);
    }
}
