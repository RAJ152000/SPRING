package com.studspring.springstud.entites;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="studentpersonal")
public class StudentPer {
	@Id
	@Column(name="fathername")
	private String fathername;
	@Column(name="dob")
	private Date dob;
	@Column(name="bloodgroup")
	private String bloodgroup;
	@Column(name="sid")
	private Integer sid;
	 
	@OneToOne(mappedBy="studentPer")
	private Student student;
	
	public StudentPer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentPer(String fathername, Date dob, String bloodgroup, Integer sid, Student student) {
		super();
		this.fathername = fathername;
		this.dob = dob;
		this.bloodgroup = bloodgroup;
		this.sid = sid;
		
	}

	
	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
	
	

	

		
	
	
	
}
