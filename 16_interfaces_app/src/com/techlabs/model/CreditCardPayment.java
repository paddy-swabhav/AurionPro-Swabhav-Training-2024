package com.techlabs.model;

public class CreditCardPayment implements Payment{

	@Override
	public void processPayment() {
		System.out.println("Paymnet Through Credit Card");
		
	}

	@Override
	public void refund() {
		System.out.println("Refund Through Credit Card");
		
	}

}
