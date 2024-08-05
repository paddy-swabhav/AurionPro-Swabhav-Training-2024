package com.techlabs.model;

public class PayPalPayments implements Payment{
	@Override
	public void processPayment() {
		System.out.println("Paymnet Through Paypal");
		
	}

	@Override
	public void refund() {
		System.out.println("Refund Through Paypal");
		
	}
}
