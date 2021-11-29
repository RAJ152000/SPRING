package com.sw.simplems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sw.simplems.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	//Auto query
	List<User> findByEmail(String email);
	List<User> findByName(String name);
	
	//Native query (Manual query)
	@Query("SELECT u FROM User u WHERE u.name = ?1 AND u.email = ?2")
	List<User> findByNameAndEmail(String name, String email);
}
