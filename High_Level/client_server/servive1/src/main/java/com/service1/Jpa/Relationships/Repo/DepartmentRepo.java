package com.service1.Jpa.Relationships.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service1.Jpa.Relationships.Entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long>{
    
}
