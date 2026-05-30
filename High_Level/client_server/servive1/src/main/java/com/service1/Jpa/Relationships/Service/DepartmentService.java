package com.service1.Jpa.Relationships.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service1.Jpa.Relationships.Entity.Department;
import com.service1.Jpa.Relationships.Repo.DepartmentRepo;

@Service
public class DepartmentService {
    
    @Autowired
    private DepartmentRepo repo;


    public Department create(Department dept){
        return repo.save(dept);
    }

    public List<Department> getAll(){
        return repo.findAll();
    }
}
