package com.techlabs.exceptions;

public class NegativeAmountException extends RuntimeException{

	private int amount;

	public NegativeAmountException(int amount) {
		super();
		this.amount = amount;
	}

	public String getMessage()
	{
		return "AMOUNT CANNOT BE NEGATIVE OR '0', YOUR ENTERED AMOUNT IS: "+amount;
	}

}
