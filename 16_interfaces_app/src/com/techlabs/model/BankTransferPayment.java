package com.techlabs.model;

public class BankTransferPayment implements Payment{
	@Override
	public void processPayment() {
		System.out.println("Paymnet Through Bank Transfer");
		
	}

	@Override
	public void refund() {
		System.out.println("Refund Through Bank Transfer");
		
	}
}
