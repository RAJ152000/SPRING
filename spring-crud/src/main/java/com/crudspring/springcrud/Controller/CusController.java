package com.crudspring.springcrud.Controller;

import com.crudspring.springcrud.Entity.Customer;
import com.crudspring.springcrud.Repository.CustomerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CusController {

@Autowired
   CustomerRepo cusRep;


    @GetMapping("/myfirstapi")
    public String testApi()
    {
        return "API TEST SUCCESSFUL";
    }
    @PostMapping("/saveCustomer")
    public Customer saveCus()
    {
        Customer cus=new Customer(1000L,"Raj");


        return cusRep.save(cus);
    }
    
}
