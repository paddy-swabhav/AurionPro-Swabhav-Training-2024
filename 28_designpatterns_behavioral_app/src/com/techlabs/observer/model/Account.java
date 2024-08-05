package com.techlabs.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private int account_number;
	private String name;
	private double balance;
	private List<INotifier> notifierList;
	private INotifier notifier;
	
	public Account(int account_number, String name, double balance) {
		super();
		this.account_number = account_number;
		this.name = name;
		this.balance = balance;
		this.notifierList = new ArrayList<INotifier>();
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<INotifier> getNotifierList() {
		return notifierList;
	}

	public void setNotifierList(List<INotifier> notifierList) {
		this.notifierList = notifierList;
	}
	
	public void debit(double amount)
	{
		if(amount<=0)
		{
			System.out.println("WRONG AMOUNT< PLEASE ENTER PROPER AMOUNT");
			return;
		}
		if(amount>balance)
		{
			System.out.println("AMOUNT CANNOT BE DEBITED< INSUFFICIENT BALANCE");
			return;
		}
		
		System.out.println("BALANCE BEFORE DEBITING: "+balance);
		balance=balance-amount;
		System.out.println("YOUR CURRENT BALANCE AFTER DEBIT: "+balance);
		
		notification(this,"Debit",amount);
	}
	
	public void credit(double amount)
	{
		if(amount<=0)
		{
			System.out.println("WRONG AMOUNT< PLEASE ENTER PROPER AMOUNT");
			return;
		}
		System.out.println("BALANCE BEFORE CREDITING: "+balance);
		balance=balance+amount;
		System.out.println("YOUR CURRENT BALANCE AFTER CREDIT: "+balance);	
		notification(this,"Credit",amount);
	}
	
	
	public void addNotifiers(INotifier notifier)
	{
		notifierList.add(notifier);
	}
	
	
	public void notification(Account account,String operation,double amount)
	{
		for(INotifier notifier:notifierList)
			notifier.notify(account, operation, amount);
	}
}
