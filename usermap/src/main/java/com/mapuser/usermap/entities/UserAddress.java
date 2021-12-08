package com.mapuser.usermap.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="useradd")
public class UserAddress {
	@Id
	@Column(name="uid")
	private Integer uid;
	@Column(name="district")
	private String district;
	@Column(name="state")
	private String state;
	@Column(name="pincode")
	private Integer pincode;
	@Column(name="user_id")
	private Integer user_id;
	
	
	
	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserAddress(Integer uid, String district, String state, Integer pincode, Integer user_id) {
		super();
		this.uid = uid;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
		this.user_id = user_id;
	}



	public Integer getUid() {
		return uid;
	}



	public void setUid(Integer uid) {
		this.uid = uid;
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



	public Integer getPincode() {
		return pincode;
	}



	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}



	public Integer getUser_id() {
		return user_id;
	}



	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}



	@Override
	public String toString() {
		return "UserAddress [uid=" + uid + ", district=" + district + ", state=" + state + ", pincode=" + pincode
				+ ", user_id=" + user_id + ", getUid()=" + getUid() + ", getDistrict()=" + getDistrict()
				+ ", getState()=" + getState() + ", getPincode()=" + getPincode() + ", getUser_id()=" + getUser_id()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



		
	

}
