package com.techlabs.creational.AbstractFactory.model;

public class SavingsAccountFactory implements IAccountFactory{

	@Override
	public IAccount createAccount(int account_number,int balance) {
		
		// TODO Auto-generated method stub
		return new SavingsAccount(account_number,balance);
	}
	
	

}
