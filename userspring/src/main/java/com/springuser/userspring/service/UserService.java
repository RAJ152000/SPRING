package com.springuser.userspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springuser.userspring.entities.User;
import com.springuser.userspring.entities.UserAdd;
import com.springuser.userspring.repository.AddRepository;
import com.springuser.userspring.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AddRepository addRepository;

	
	
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

	public Iterable<User> deleteEmail(Integer id) {
		// TODO Auto-generated method stub
		Optional<User> savedUser = userRepository.findById(id);
		System.out.println(savedUser);
		userRepository.deleteById(id);
		return fetchAllRecords();

	}

	public User add(User user) {
		return userRepository.save(user);
	}

	public List<User> findByName() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public List<User> getDetail() {
		return userRepository.findAll();
	}

	public List<User> findSimilarRecords(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByName(name);
	}

	public List<User> findSimilarRecords(String name, String email) {
		// TODO Auto-generated method stub
		System.out.println("name: " + name + " - email: " + email);
		return userRepository.findByNameAndEmail(name, email);
	}

	public Optional<UserAdd> insertaddr(List<UserAdd> useradd, Integer id) {
		// TODO Auto-generated method stub
		addRepository.saveAll(useradd);

		return addRepository.findById(id);
	}

}
