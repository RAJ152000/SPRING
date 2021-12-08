package com.mapuser.usermap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapuser.usermap.Repository.Repositories;
import com.mapuser.usermap.entities.User;


@Service
public class UsersService {
	
	
	@Autowired
	 Repositories repositories;
	

	public List<User> getDetail() {
		// TODO Auto-generated method stub
		return repositories.findAll();
	}

}
