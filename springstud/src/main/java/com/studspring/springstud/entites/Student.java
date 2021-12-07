package com.studspring.springstud.entites;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(name="studentdetail")
public class Student
     {
	   @Id
	   @Column(name="id")
       private Integer id;
	   @Column(name="name")
       private String name;
	   @Column(name="email")
       private String email;
	  
	   @OneToOne(cascade = CascadeType.ALL, mappedBy = "student")
	  
	    @JsonManagedReference
	    private StudentPer studentPer;

	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student( String name, String email, StudentPer studentPer) {
		super();
		
		this.name = name;
		this.email = email;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", studentPer=" + studentPer + "]";
	}

	
	
}
