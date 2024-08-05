package com.techlabs.creational.factory.model;

public class AccountFactory {

	public static IAccount createAcoount(AccountType accountType,int account_number,int balance)
	{
		IAccount account= null;
		if(accountType.equals(AccountType.Current))
			account = new CurrentAccount(account_number,balance);
		if(accountType.equals(AccountType.Savings))
			account = new SavingsAccount(account_number,balance);
		
		return account;
	}
	
}
