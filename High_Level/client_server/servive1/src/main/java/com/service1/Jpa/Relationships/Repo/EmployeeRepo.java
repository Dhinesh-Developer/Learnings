package com.service1.Jpa.Relationships.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service1.Jpa.Relationships.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long>{
    
}
