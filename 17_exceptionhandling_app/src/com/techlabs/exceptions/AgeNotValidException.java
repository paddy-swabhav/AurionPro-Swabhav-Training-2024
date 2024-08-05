package com.techlabs.exceptions;

public class AgeNotValidException extends RuntimeException{
	
	private int age;
	
	
	
	public AgeNotValidException(int age) {
		this.age = age;
	}



	public String getMessage()
	{
		return "age cannot be less than 18. YOU HAVE ENTERED: "+age;
	}
}
