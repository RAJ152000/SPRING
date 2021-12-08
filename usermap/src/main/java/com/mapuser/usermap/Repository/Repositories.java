package com.mapuser.usermap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.mapuser.usermap.entities.User;



@Repository

@EnableJpaRepositories
public interface Repositories extends JpaRepository<User, Integer>{

}
