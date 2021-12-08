package com.studspring.springstud.entites;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="studentpersonal")
public class StudentPer {
	@Id
	@Column(name="sid")
	private Integer sid;
	
	@Column(name="fathername")
	private String fathername;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="stud_id")
	private Integer stud_id;
	 
<<<<<<< HEAD
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "stud_id", nullable = false, updatable = false, insertable = false)


	private Student student;
=======
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "id")
	    @JsonBackReference
	    private Student student;
>>>>>>> 40fb5a6d094ecb26e97652e343e7c15793e0de9e
	
	public StudentPer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentPer(Integer sid, String fathername, String gender, Date dob, Integer stud_id, Student student) {
		super();
		this.sid = sid;
		this.fathername = fathername;
		this.gender = gender;
		this.dob = dob;
		this.stud_id = stud_id;
		this.student = student;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getStud_id() {
		return stud_id;
	}

	public void setStud_id(Integer stud_id) {
		this.stud_id = stud_id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

<<<<<<< HEAD
=======
	@Override
	public String toString() {
		return "StudentPer [fathername=" + fathername + ", dob=" + dob + ", bloodgroup=" + bloodgroup + ", sid=" + sid
				+ ", student=" + student + ", getFathername()=" + getFathername() + ", getDob()=" + getDob()
				+ ", getBloodgroup()=" + getBloodgroup() + ", getSid()=" + getSid() + ", getStudent()=" + getStudent()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	

	

>>>>>>> 40fb5a6d094ecb26e97652e343e7c15793e0de9e
		
	
}
