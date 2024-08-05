package com.techlabs.model;

public class BankAccountApp {
	private long account_number;
	private String name;
	private double balance;
	private AccountTypeEnum account_type;
	
	
	public BankAccountApp()  //DEFAULT
	{
		account_number=1234567890;
		name="DEFAULT";
		balance=1000;
		account_type=AccountTypeEnum.Current;
	}
	
	public BankAccountApp(long account_number,String name,double balance,AccountTypeEnum account_type) //PARAMETERIZED
	{
		this.account_number=account_number;
		this.name=name;
		this.balance=balance;
		this.account_type=account_type;
	}
	
	public void setAccountNumber(long account_number)
	{
		this.account_number=account_number;
	}
	public long getAccountNumber()
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
	
	public void setAccountType(AccountTypeEnum account_type)
	{
		this.account_type=account_type;
	}
	public AccountTypeEnum getAccountType()
	{
		return account_type;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
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
		if(amount<0)
			System.out.println("Amount Should be greater than 0");
		else if(amount<=balance)
		{
			balance -= amount;
			System.out.println("Amount Debited Successfully: "+amount);
		}
		else 
			System.out.println("No Sufficient Balance, Amount "+amount+" cannot be debited");
		return balance;
	}
}
