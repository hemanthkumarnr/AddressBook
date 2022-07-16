package com.example.demo.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name="addressbook_table")

public class PhoneBook {
	
	//Id is auto increment and primary key
	@Id
	@GeneratedValue
	private int id;
	
	
	@NotNull
	@Size(min=2, message="firstname should have atleast 2 characters")
	private String firstName;
	
	@NotNull
	@Size(min=2, message="surname should have atleast 2 characters")
	private String surName;
	
	@NotNull
	@Size(min=2, message="phonelabel should have atleast 2 characters")
	private String phoneLabel;
	
	// to avoid duplicate phone number we use unique 
	@Column(unique=true)
	@NotNull
	@Size(min=10, message="Phone number must be 10 digit")
	private String phoneNumber;
	
	@NotNull
	@Size(min=2, message="Company name should have atleast 2 characters")
	private String companyName;
	
	@NotNull
	@Size(min=2, message="Address should have atleast 2 characters")
	private String address;
	
	@Email
	private String email;
	
	
	
	public PhoneBook() {
		super();
	}



	public PhoneBook(String firstName,String surName,String phoneLabel,String phoneNumber,String companyName,String address,String email) 
	{
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.phoneLabel = phoneLabel;
		this.phoneNumber = phoneNumber;
		this.companyName = companyName;
		this.address = address;
		this.email = email;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}


	public String getPhoneLabel() {
		return phoneLabel;
	}

	public void setPhoneLabel(String phoneLabel) {
		this.phoneLabel = phoneLabel;
	}

	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "PhoneBook [id=" + id + ", firstName=" + firstName + ", surName=" + surName + ", phoneLabel="
				+ phoneLabel + ", phoneNumber=" + phoneNumber + ", companyName=" + companyName + ", address=" + address
				+ ", email=" + email + "]";
	}

	
}
