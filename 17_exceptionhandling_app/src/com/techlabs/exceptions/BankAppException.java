package com.techlabs.exceptions;

public class BankAppException extends RuntimeException{
	
	
	public String getMessage()
	{
		return "ENTERED AMOUNT CANNOT BE NEGATIVE OR '0', PLEASE ENTER RIGHT AMOUNT";
	}
	public String getMinimumBalanceMessage()
	{
		return "MINIMUM BALANCE SHOULD BE 1000";
	}
	
}
