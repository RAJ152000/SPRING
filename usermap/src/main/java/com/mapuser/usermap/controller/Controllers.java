package com.mapuser.usermap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapuser.usermap.entities.User;
import com.mapuser.usermap.service.UsersService;


@RequestMapping("/user")

@RestController
public class Controllers {
	
	@Autowired
     UsersService usersService;
	
	
	
	@GetMapping("/getall")
	public List<User> getAll() {
		return usersService.getDetail();
	}

}
