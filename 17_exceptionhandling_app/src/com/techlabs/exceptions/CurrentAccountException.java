package com.techlabs.exceptions;

public class CurrentAccountException extends RuntimeException{
	
	public String getInsufficeintBalance()
	{
		return "Insufficeient balance in your account";
	}

}
