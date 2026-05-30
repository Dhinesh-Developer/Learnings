package com.service1.Jpa.Relationships.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service1.Jpa.Relationships.Entity.OrderDetails;

@Repository
public interface OrderDetailRepo extends JpaRepository<OrderDetails,Long>{

    
} 