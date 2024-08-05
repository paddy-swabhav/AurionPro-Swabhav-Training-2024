package com.techlabs.test;

import com.techlabs.model.BankTransferPayment;
import com.techlabs.model.CreditCardPayment;
import com.techlabs.model.PayPalPayments;
import com.techlabs.model.Payment;

public class PaymentTest {

	public static void main(String[] args) {
		Payment payment;
		
		payment= new CreditCardPayment();
		payment.processPayment();
		payment.refund();
		
		payment=new PayPalPayments();
		payment.processPayment();
		payment.refund();
		
		payment= new BankTransferPayment();
		payment.processPayment();
		payment.refund();

	}

}
