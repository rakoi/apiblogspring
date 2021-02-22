package com.limo.blog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public String surname;
	
	public String firstname;
	public String dob;
	public String email;
	public String mobile_no;
	
	
	
	
	public Person() {
		super();
	}
	
	public Person(int id, String surname, String firstname, String dob, String email, String mobile_no) {
		super();
		this.id = id;
		this.surname = surname;
		this.firstname = firstname;
		this.dob = dob;
		this.email = email;
		this.mobile_no = mobile_no;
	}

	public Person(String sur_name, String first_name, String dob, String email, String mobile_no) {
	
		this.surname = sur_name;
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", surname=" + surname + ", firstname=" + firstname + ", dob=" + dob + ", email="
				+ email + ", mobile_no=" + mobile_no + "]";
	}
	
	
}
