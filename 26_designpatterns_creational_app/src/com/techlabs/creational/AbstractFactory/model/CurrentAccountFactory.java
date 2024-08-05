package com.techlabs.creational.AbstractFactory.model;

public class CurrentAccountFactory implements IAccountFactory{

	@Override
	public IAccount createAccount(int account_number,int balance) {
		// TODO Auto-generated method stub
		return new CurrentAccount(account_number,balance);
	}

}
