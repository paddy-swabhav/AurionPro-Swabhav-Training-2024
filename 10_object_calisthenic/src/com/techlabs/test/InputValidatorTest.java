package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.InputValidator;

public class InputValidatorTest {
	
	private static void userNameValidator(String username,InputValidator validate)
	{
		if((validate.validateEmpty(username)==false) || (validate.validateLength(username, 21, 3)==false) || (validate.validateNull(username)))
		{
			System.out.println("INVALID USERNAME !");
			return;
		}
		System.out.println("VALID USERNAME");
		validate.setUserName(username);
	}
	
	private static void passwordValidator(String username,InputValidator validate)
	{
		if((validate.validateEmpty(username)==false) || (validate.validateLength(username, 31, 7)==false) || (validate.validateNull(username)))
		{
			System.out.println("INVALID password !");
			return;
		}
		System.out.println("VALID password");
		validate.setUserName(username);
	}
	
	private static void emailValidator(String username,InputValidator validate)
	{
		if((validate.vaildateEmailFormat(username)==false) || (validate.validateEmpty(username)==false) || (validate.validateLength(username, 51, 4)==false) || (validate.validateNull(username)))
		{
			System.out.println("INVALID password !");
			return;
		}
		System.out.println("VALID password");
		validate.setUserName(username);
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		InputValidator validate= new InputValidator();
		
		System.out.println("ENTER Username:");
		String username=scanner.next();
		userNameValidator(username,validate);
		
		System.out.println("ENTER Password:");
		String password=scanner.next();
		passwordValidator(password,validate);
		
		System.out.println("ENTER Email:");
		String email=scanner.next();
		emailValidator(email,validate);
		
		
		
	}

}
