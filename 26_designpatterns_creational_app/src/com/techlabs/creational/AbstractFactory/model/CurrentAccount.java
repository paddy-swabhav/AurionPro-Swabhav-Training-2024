package com.techlabs.creational.AbstractFactory.model;

public class CurrentAccount implements IAccount{

	private int account_number;
	private int balance;
	
	
	public CurrentAccount(int account_number, int balance) {
		super();
		this.account_number = account_number;
		this.balance = balance;
	}
	@Override
	public void credit(int amount) {
		if(amount>0)
			balance=balance+amount;
		
		System.out.println("AMOUNT CREDITED SUCCSESSFULLY OF RS: "+amount);
		System.out.println("YOUR CURRENT BALANCE IS :" +balance+" For Account: "+account_number);
	}
	@Override
	public void debit(int amount) {
		if(amount>0)
			balance=balance-amount;
		System.out.println("AMOUNT DEBITED SUCCSESSFULLY OF RS: "+amount);
		System.out.println("YOUR CURRENT BALANCE IS :" +balance+" For Account: "+account_number);
	}
}
