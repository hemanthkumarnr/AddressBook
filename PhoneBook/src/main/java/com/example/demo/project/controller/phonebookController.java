package com.example.demo.project.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.project.Exception.contactNotFoundException;
import com.example.demo.project.entity.PhoneBook;
import com.example.demo.project.service.phonebookservice;


@RestController
@RequestMapping("/api/phonebook")
public class phonebookController {
	
	@Autowired
	private phonebookservice service;
	
	
	// PostMapping (Adding) the data 
	
	@PostMapping("/add")
	public PhoneBook addPhoneBook(@Valid @RequestBody PhoneBook phonebook) {
		return service.savePhoneBook(phonebook);
	}
	@PostMapping("/addmany")
	public List<PhoneBook> addPhoneBook(@Valid @RequestBody List<PhoneBook> phonebook1){
		return service.savePhoneBook(phonebook1);
	}
	
	
	// GetMapping (View) the data
	//viewall
	@GetMapping("/viewall")
	public List<PhoneBook> findAllPhoneBook(){
		return service.getPhoneBook();
	}
	
	//search by ID
	@GetMapping("/viewById/{id}")
	public Optional<PhoneBook> findPhoneBookById(@PathVariable int id) throws contactNotFoundException {
		return service.getPhoneBookById(id);
	}
	
	//search by first name
	@GetMapping("/viewByName/{firstName}")
	public Optional<PhoneBook> findPhoneBookByfirstName(@PathVariable String firstName)throws contactNotFoundException {
		return service.getPhoneBookByfirstName(firstName);
	}
	
	//search by phone number
	@GetMapping("/viewBynumber/{phoneNumber}")
	public Optional<PhoneBook> findPhoneBookByphoneNumber(@PathVariable String phoneNumber) throws contactNotFoundException {
		return service.getPhoneBookByphoneNumber(phoneNumber);
	}
	
	
	//updating the contact details
	@PutMapping("/update")
	public PhoneBook updatePhoneBook( @Valid @RequestBody PhoneBook phonebook) {
		return service.updatePhoneBook(phonebook);
	}
	
	//deleting the contact record by using ID
	@DeleteMapping("/delete/{id}")
	public String deletePhoneBook(@PathVariable int id) {
		return service.deletePhoneBook(id);
	}
	
}
