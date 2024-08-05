package com.techlabs.creational.AbstractFactory.model;

public interface IAccountFactory {

	public IAccount createAccount(int account_number,int balance);
}
