package com.springuser.userspring.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.stereotype.Repository;

//import com.springuser.userspring.entities.User;
import com.springuser.userspring.entities.UserAdd;






@Repository
@EnableJpaRepositories
public interface AddRepository extends JpaRepository<UserAdd, Integer>
{

	

	

	
}


