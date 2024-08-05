package com.techlabs.model;

public class CreditCardPayment extends Payment{

	@Override
	public void processPayment() {
		System.out.println("Paymnet Through Credit Card");
		
	}

	@Override
	public void refund() {
		System.out.println("Refund Through Credit Card");
		
	}

}
