package com.limo.blog.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
	public int id;
	public String sur_name;
	
	public String firstname;
	public String dob;
	public String email;
	public String mobile_no;
	
	
	
	
	public Person() {
		super();
	}
	public Person(String sur_name, String first_name, String dob, String email, String mobile_no) {
	
		this.sur_name = sur_name;
		this.firstname = first_name;
		this.dob = dob;
		this.email = email;
		this.mobile_no = mobile_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSur_name() {
		return sur_name;
	}
	public void setSur_name(String sur_name) {
		this.sur_name = sur_name;
	}
	public String getFirst_name() {
		return firstname;
	}
	public void setFirst_name(String first_name) {
		this.firstname = first_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	
	
	
}
