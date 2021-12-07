package com.studspring.springstud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studspring.springstud.entites.Student;
import com.studspring.springstud.entites.StudentPer;
import com.studspring.springstud.service.StudService;

@RequestMapping("/studentdetail")
@RestController
public class StudController 
{
	@Autowired
	StudService studService;
	
	
	
	@GetMapping("/get")
	public List<StudentPer> getAll()
	{
		return studService.getDetail();
	}
	
	@PostMapping("/create")
	public Student createrecord(@RequestBody Student student) {
	return studService.createRecord(student);
	}
	
	

}
