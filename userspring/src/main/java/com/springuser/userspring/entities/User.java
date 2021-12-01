package com.springuser.userspring.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="email")
	private String email;
	@Column(name="name")
	private String name;
	
	
	@OneToMany
	@JoinColumn(name="user_id",nullable=false,updatable=false,insertable=false)
	private List<UserAdd> useradd;


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Integer id, String email, String name, List<UserAdd> useradd) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.useradd = useradd;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<UserAdd> getUseradd() {
		return useradd;
	}


	public void setUseradd(List<UserAdd> useradd) {
		this.useradd = useradd;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + ", useradd=" + useradd + "]";
	}


	
	
}
	