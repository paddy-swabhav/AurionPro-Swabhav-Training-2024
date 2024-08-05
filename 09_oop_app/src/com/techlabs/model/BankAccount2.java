package com.techlabs.model;

public class BankAccount2 {
	private long account_number;
	private String name;
	private double balance;
	
	
	public BankAccount2()  //DEFAULT
	{
		account_number=1234567890;
		name="DEFAULT";
		balance=1000;
	}
	
	public BankAccount2(long a,String n,double b) //PARAMETERIZED
	{
		account_number=a;
		name=n;
		balance=b;
	}
	
	public void setaccountNumber(long l)
	{
		account_number=l;
	}
	public long getaccountNumber()
	{
		return account_number;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	
	public void setbalance(double b)
	{
		balance=b;
	}
	public double getbalance()
	{
		return balance;
	}
	
	public long account_number_generator()
	{
		account_number= (long)(Math.random()* 9_000_000_000L + 1_000_000_000L);
		return account_number;
		
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
