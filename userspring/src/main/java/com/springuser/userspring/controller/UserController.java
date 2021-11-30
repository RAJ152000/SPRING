package com.springuser.userspring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.springuser.userspring.entities.User;
import com.springuser.userspring.entities.UserAdd;
import com.springuser.userspring.repository.UserRepository;
import com.springuser.userspring.service.UserService;




@RequestMapping("/user")

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	@Autowired
	UserRepository userRepository;
	

	
/*	
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
	@PostMapping
	public User createNewUser(@RequestBody User user)
	{
	     user.setId(2);
		return userRepository.save(user);
	}
	/*@PostMapping("/add-address/{id}")
	public User addAddress(@RequestBody UserAdd useradd,@PathVariable Integer id)
	{
		useradd.setId(UUID.randomUUID().toString());
		useradd.setUser_id(id);
		userRepository.save(useradd);
		List<UserAdd> addressList=new ArrayList<>();
		addressList.add(useradd);
		Optional<User> user=userRepository.findById(id);
		if(user.isPresent())
		{
			user.get().setUseradd(addressList);
			for(int i=0;i<addressList.size();i++)
			{
				
					addressList.get(i).getUser_id().equals(1);
			}
			return user.get();
		}
		else
		{
		return null;
		}
	}*/
	
	@PostMapping("/address/{id}")
	public Optional<UserAdd> inserts(@RequestBody List<UserAdd> useradd, @PathVariable Integer id) {
		return userService.insertaddr(useradd, id);
	}
	
   
}



