package com.techlabs.model;

import java.util.Scanner;

import com.techlabs.exceptions.BankAppException;

public class BankApp {
	private long account_number;
	private String name;
	private double balance;
	public BankApp(long account_number, String name, double balance) {
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public boolean positive_amount_checker(double amount)
	{
		if(amount<=0)
			return false;
		return true;
	}
	
	public boolean debit_balance_checker(double amount)
	{
		if(amount>balance)
			return false;
		return true;
	}

	public void credit(double amount)
	{
		if(positive_amount_checker(amount)==false)
		{	
			throw new BankAppException();
//			System.out.println("AMOUNT CANNOT BE CREDITED !!!!!!!!!");
//			return;
		}
		setBalance(getBalance()+amount);
		System.out.println("AMOUNT CREDITED SUCCESSFULLY");
		System.out.println("YOUR CURRENT BALANCE IS: "+getBalance());
	}
	
	public void savingsDebit(double amount)
	{
//		if(positive_amount_checker(amount)==false)
//		{
//			System.out.println("AMOUNT CANNOT BE DEBITED !!!!!!");
//			return;
//		}
//		if(debit_balance_checker(amount)==false)
//		{
//			System.out.println("AMOUNT CANNOT BE DEBITED !!!!!!!!!!!");
//			return;
//		}
//		double amount_after_debit=(getBalance()-amount);
//		if(amount_after_debit<1000)
//		{	
//			System.out.println("AMOUNT CANNOT BE DEBITED !!!!!!!!!!!");
//			return;
//		}
//		setBalance(amount_after_debit);
//		System.out.println("YOUR CURRENT BALANCE IS: "+getBalance());
	}
	
	public void currentDebit(double amount,Scanner scanner)
	{
//		if(positive_amount_checker(amount)==false)
//		{
//			System.out.println("AMOUNT CANNOT BE DEBITED !!!!!!");
//			return;
//		}
//		if(debit_balance_checker(amount)==false)
//		{
//			over_draft_limit_checker(amount,scanner);
//			return;
//		}
//		setBalance(getBalance()-amount);
//		System.out.println("YOUR CURRENT BALANCE IS: "+getBalance());
	}
	
	public void over_draft_limit_checker(double amount,Scanner scanner)
	{
//		long over_draft_limit=5000;
//		if(amount>over_draft_limit)
//		{
//			System.out.println("AMOUNT CANNOT BE DEBITED !!!!!!");
//			return;
//		}
//		System.out.println("YOU DONT HAVE ENOUGH BALANCE, DO YOU WANT TO USE THE OVER DRAFT LIMIT ? (Y/N) ");
//		char input=scanner.next().charAt(0);
//		if(input=='N' || input=='n')
//		{
//			System.out.println("AMOUNT CANNOT BE DEBITED!!!!!!!!!");
//			return;
//		}
//		
//		over_draft_limit -= amount;
//		System.out.println("AMOUNT DEBITED FROM THE OVER DRAFT LIMIT SUCCESSFULLY");
//		System.out.println("YOUR CURRENT BALANCE IS: "+getBalance());
//		System.out.println("YOUR REMAINING OVER DRAFT LIMIT IS: "+over_draft_limit);
	}
	
	
}
