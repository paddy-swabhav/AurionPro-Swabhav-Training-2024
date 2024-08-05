package com.techlabs.model;

public class InputValidator {
	private String userName;
	private String password;
	private String email;
	
	public InputValidator() 
	{
		userName=null;
		password=" ";
		email=" ";
	}
	
	public InputValidator(String userName,String password,String email)
	{
		this.email=email;
		this.password=password;
		this.userName=userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public boolean validateNull(String value)
	{
		if(value!=null)
		return true;
		return false;
	}
	public boolean validateEmpty(String value)
	{
		if(value!="")
			return true;
		return false;
	}
	
	public boolean validateLength(String userName,int max_length,int min_length)
	{
		int length=userName.length();
		if(length>min_length && length<=max_length)
			return true;
		return false;
	}
	

	
	public boolean vaildateEmailFormat(String email)
	{
		if(email.contains("@") && email.contains("."))
			return true;
		return false;
	}

}
