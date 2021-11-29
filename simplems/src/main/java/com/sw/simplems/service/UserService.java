package com.sw.simplems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.simplems.model.User;
import com.sw.simplems.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User changeEmail(String mail, Integer id) {
		Optional<User> savedUser = userRepository.findById(id);
		System.out.println(id);// Getting the saved user from DB using id (Primary field)
		if (savedUser.isEmpty()) {
			System.err.println("Not found for ID: " + id);
			return null;
		} else {
			savedUser.get().setEmail(mail); // setting the incoming new email
			return userRepository.save(savedUser.get()); // saving the updated data in DB
		}
	}

	public Iterable<User> fetchAllRecords() {
		return userRepository.findAll();
	}

	public List<User> findSimilarRecords(String name) {
		return userRepository.findByName(name);
	}
	
	public List<User> findSimilarRecords(String name, String email) {
		System.out.println("name: "+name+" - email: "+email);
		return userRepository.findByNameAndEmail(name, email);
	}
}