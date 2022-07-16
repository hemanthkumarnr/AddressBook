package com.example.demo.project.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.project.Exception.contactNotFoundException;
import com.example.demo.project.entity.PhoneBook;
import com.example.demo.project.repository.phonebookRepository;

@Service
public class phonebookservice {
	
	@Autowired
	private phonebookRepository repository;
	
	
	//post method to add 1 record
	public PhoneBook savePhoneBook(@Valid PhoneBook phonebook)
	{
		return repository.save(phonebook); 
	}
	//post method to add 2 or more record
	public List<PhoneBook> savePhoneBook( @Valid List<PhoneBook> phonebook)
	{
		return repository.saveAll(phonebook);
	}
	
	
	//get method to display all
	public List<PhoneBook> getPhoneBook(){
		return repository.findAll();
	}
	
	//get method to display by  ID
	public Optional<PhoneBook> getPhoneBookById(int id) throws contactNotFoundException {
		Optional<PhoneBook> phonebookid =repository.findById(id);
		if(phonebookid!=null)
		{
			return phonebookid;
		}
		else {
			throw new contactNotFoundException("Contact not found  "+ id);
		}
	}
	
	//get method to display by  first name
	public Optional<PhoneBook> getPhoneBookByfirstName(String firstName)throws contactNotFoundException {
		Optional<PhoneBook> phonebookfirstnumber=  Optional.ofNullable(repository.findByfirstName(firstName));
		if(phonebookfirstnumber!=null)
		{
			return phonebookfirstnumber;
		}
		else
		{
			throw new contactNotFoundException("Contact not found  "+ firstName);
		}
	}
	
	//get method to display by  phonenumber
	public Optional<PhoneBook> getPhoneBookByphoneNumber(String phoneNumber) throws contactNotFoundException {
		Optional<PhoneBook> phonebookphoneNumber =Optional.ofNullable(repository.findByphoneNumber(phoneNumber));
		if(phoneNumber!=null)
		{
			return phonebookphoneNumber;
		}
		else {
			throw new contactNotFoundException("Contact not found "+phoneNumber);
	}
	}
	
	//delete by ID
	public String deletePhoneBook(int id) {
		repository.deleteById(id);
		return "Contact Deleted of ID = "+ id;
	}
	
	
	//update
		public PhoneBook updatePhoneBook(@Valid PhoneBook phonebook) {
		PhoneBook existingPhoneBook=repository.findById(phonebook.getId()).orElse(null);
		 existingPhoneBook.setFirstName(phonebook.getFirstName());
		 existingPhoneBook.setSurName(phonebook.getSurName());
		 existingPhoneBook.setPhoneLabel(phonebook.getPhoneLabel());
		 existingPhoneBook.setPhoneNumber(phonebook.getPhoneNumber());
		 existingPhoneBook.setCompanyName(phonebook.getCompanyName());
		 existingPhoneBook.setAddress(phonebook.getAddress());
		 existingPhoneBook.setEmail(phonebook.getEmail());
		 return repository.save(existingPhoneBook);
		 
		}

		

		
}
