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
	  
<<<<<<< HEAD
	   
=======
	   @OneToOne(cascade = CascadeType.ALL, mappedBy = "student")
	  
	    @JsonManagedReference
	    private StudentPer studentPer;
>>>>>>> 40fb5a6d094ecb26e97652e343e7c15793e0de9e

	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(Integer id, String name, String email) {
		super();
		this.id = id;
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


<<<<<<< HEAD

	public void setEmail(String email) {
		this.email = email;
=======
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", studentPer=" + studentPer + "]";
>>>>>>> 40fb5a6d094ecb26e97652e343e7c15793e0de9e
	}

		
}
