package com.studspring.springstud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.studspring.springstud.entites.StudentPer;

@Repository
@EnableJpaRepositories
public interface PersRepository  extends JpaRepository<StudentPer,Integer>{

}
