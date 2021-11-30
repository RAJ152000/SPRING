package com.springuser.userspring.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_address" )
public class UserAdd {
	@Id
	private Integer pincode;
	private String district;
	private String state;
	private Integer user_id;
	
	
	public UserAdd() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserAdd(Integer pincode, String district, String state, Integer user_id) {
		super();
		this.pincode = pincode;
		this.district = district;
		this.state = state;
		this.user_id = user_id;
	}


	public Integer getPincode() {
		return pincode;
	}


	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Integer getUser_id() {
		return user_id;
	}


	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}


	@Override
	public String toString() {
		return "UserAdd [pincode=" + pincode + ", district=" + district + ", state=" + state + ", user_id=" + user_id
				+ ", getPincode()=" + getPincode() + ", getDistrict()=" + getDistrict() + ", getState()=" + getState()
				+ ", getUser_id()=" + getUser_id() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}



	
	
	
}