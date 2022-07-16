package com.example.demo.project.Exception;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {
	
	// Exception to handle not valid cases
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String>handleInvalidArguments(MethodArgumentNotValidException ex){
		Map<String,String> errorMap=new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error->{
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		return errorMap;
	}
	
	// Exception to handle SQL
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(SQLException.class)
	public String handleInvalidArguments(SQLException ex){
		Map<String,String> errorMap=new HashMap<>();
		String msg="Phone number Already Exist";
		return msg;
	}
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(contactNotFoundException.class)
	public Map<String, String>handleException(contactNotFoundException ex)
	{
		Map<String,String> errorMap=new HashMap<>();
		String msg1="Contact Not found";
		errorMap.put("errorMessage",msg1);
		System.out.println("Not Found");
		return errorMap;
	}
	
}
