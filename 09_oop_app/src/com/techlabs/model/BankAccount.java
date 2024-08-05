package com.techlabs.model;

public class BankAccount {
	private long account_number;
	private String name;
	private double balance;
	
	
	public BankAccount()  //DEFAULT
	{
		account_number=1234567890;
		name="DEFAULT";
		balance=1000;
	}
	
	public BankAccount(long account_number,String name,double balance) //PARAMETERIZED
	{
		this.account_number=account_number;
		this.name=name;
		this.balance=balance;
	}
	
	public void setaccountNumber(long account_number)
	{
		this.account_number=account_number;
	}
	public long getaccountNumber()
	{
		return account_number;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	public double getbalance()
	{
		return balance;
	}
	
	
	
	public double creditAmount(int amount)
	{
		if(amount<0)
			System.out.println("AMOUNT CANNOT BE LESS THAN 0");
		else
		{
		balance += amount;
		System.out.println("Amount Credited to your account: "+amount);
		}
		return balance;
	}
	
	public double DebitAmount(int amount)
	{
		if(amount<=balance)
		{
			balance -= amount;
			System.out.println("Amount Debited Successfully: "+amount);
		}
		else 
			System.out.println("No Sufficient Balance, Amount "+amount+" cannot be debited");
		return balance;
	}
}
