package com.studspring.springstud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.studspring.springstud.entites.Student;

@Repository
@EnableJpaRepositories
public interface StudRepository  extends JpaRepository<Student,Integer>{

	
	

}
