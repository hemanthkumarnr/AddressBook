package com.example.demo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.project.entity.PhoneBook;

public interface phonebookRepository extends JpaRepository<PhoneBook, Integer>{
	// search by first name
	PhoneBook findByfirstName(String firstName);
	
	//search by phonenumber
	PhoneBook findByphoneNumber(String phoneNumber);


	
	
}
