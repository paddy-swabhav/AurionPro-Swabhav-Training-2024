package com.techlabs.model;

import com.techlabs.exceptions.InsufficientBalanceException;
import com.techlabs.exceptions.NegativeAmountException;

public class Account {
	private long account_number;
	private String name;
	private int balance;
	
	
	public Account(long account_number, String name, int balance) {
		super();
		this.account_number = account_number;
		this.name = name;
		this.balance = balance;
	}
	
	public long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void credit(int amount)
	{
		if(amount<=0)
			throw new NegativeAmountException(amount);
		balance+=amount;
	}

	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", name=" + name + ", balance=" + balance + "]";
	}

	public void debit(int amount)
	{
		if(amount<=0)
			throw new NegativeAmountException(amount);
		if(amount>balance)
			throw new InsufficientBalanceException(amount);
		
		balance-=amount;
		System.out.println("YOUR CURRENT BALANCE IS :"+balance);
		
		
	}
	
}
