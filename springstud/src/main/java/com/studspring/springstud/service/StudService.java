package com.studspring.springstud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studspring.springstud.entites.Student;
import com.studspring.springstud.entites.StudentPer;
import com.studspring.springstud.repository.PersRepository;
import com.studspring.springstud.repository.StudRepository;

@Service
public class StudService {
	@Autowired
	PersRepository persRepository;

	public List<StudentPer> getDetail() {
		// TODO Auto-generated method stub
		return persRepository.findAll();
	}

	
}