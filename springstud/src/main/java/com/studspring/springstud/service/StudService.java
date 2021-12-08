package com.studspring.springstud.service;



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
	@Autowired
	StudRepository studRepository;

<<<<<<< HEAD
	public List<StudentPer> getDetail() {
=======
	public Iterable<Student> fetchAllRecords() {
>>>>>>> 40fb5a6d094ecb26e97652e343e7c15793e0de9e
		// TODO Auto-generated method stub
		return persRepository.findAll();
	}



	public Student createRecord(Student student) {
		// TODO Auto-generated method stub
		return studRepository.save(student);
	}
	}

	/*public List<Student> getDetail() {
		// TODO Auto-generated method stub
		return studRepository.findAll();
	}*/

	

	
