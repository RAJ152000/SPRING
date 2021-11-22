package com.crudspring.springcrud.Repository;

import com.crudspring.springcrud.Entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long>
 {
    
}
