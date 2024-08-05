package com.techlabs.exceptions;

public class InsufficientBalanceException extends RuntimeException {

	private int amount;

	public InsufficientBalanceException(double amount) {
		super();
		this.amount = (int) amount;
	}
	
	public String getMessage()
	{
		return "INSUFFICIENT BALANCE, YOUR ENTERED AMOUNT IS: "+amount;
	}
}
