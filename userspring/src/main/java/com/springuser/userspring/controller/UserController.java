package com.springuser.userspring.controller;





import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.springuser.userspring.entities.User;
//import com.springuser.userspring.entities.UserAdd;
import com.springuser.userspring.service.UserService;





@RequestMapping("/user")

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/beat")
	public String ping() {
		return "HELLO WORLD";
	}
	
	
	@PostMapping("/change-email/{id}")
	public User requestChangeEmail(@RequestBody String mail, @PathVariable Integer id) {
		return userService.changeEmail(mail, id); 
	}
	@DeleteMapping("/delete-email/{id}")
	public void requestDeleteEmail( @PathVariable(value="id") Integer id) {
		userService.deleteEmail(id); 
	}
	
	@GetMapping("/all")
	public Iterable<User> fetchAll() {
		return userService.fetchAllRecords();
	}
	@GetMapping("/similar-records/{name}")
	public List<User> fetchSimlarRecordsByName(@PathVariable String name){
		return userService.findSimilarRecords(name);
	}
	
	@PostMapping("/similar-records-email/{name}")
	public List<User> fetchSimlarRecordsByName(@PathVariable String name,@RequestBody String email){
    return userService.findSimilarRecords(name,email);
    }
	
	@PostMapping("/add")
	public User fetchAll(@RequestBody User user)
	{
		return userService.add(user);
		
	}
	@GetMapping("/address")
	public List<User> getAll()
	{
		return userService.getDetail();
	}
	
   
}



