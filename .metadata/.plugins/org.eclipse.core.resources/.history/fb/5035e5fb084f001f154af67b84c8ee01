package com.techlabs.creational.factory.model;


public class SavingsAccount implements IAccount{

	private int account_number;
	private int balance;
	
	
	public SavingsAccount(int account_number, int balance) {
		super();
		this.account_number = account_number;
		this.balance = balance;
	}
	@Override
	public void credit(int amount) {
		System.out.println("\nTHIS IS SAVINGS");
		if(amount>0)
			balance=balance+amount;
		
		System.out.println("AMOUNT CREDITED SUCCSESSFULLY OF RS: "+amount);
		System.out.println("YOUR CURRENT BALANCE IS :" +balance+" For Account: "+account_number);
	}
	@Override
	public void debit(int amount) {
		System.out.println("\nTHIS IS SAVINGS");
		if(amount>0)
			balance=balance-amount;
		System.out.println("AMOUNT DEBITED SUCCSESSFULLY OF RS: "+amount);
		System.out.println("YOUR CURRENT BALANCE IS :" +balance+" For Account: "+account_number);
	}
	
}
