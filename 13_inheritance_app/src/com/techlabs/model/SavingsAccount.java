package com.techlabs.model;

public class SavingsAccount extends Account {

	private int min_balance;
	public SavingsAccount(int min_balance,long account_number, String name, double balance) {
		super(account_number, name, balance);
		this.min_balance=min_balance;
	}
	@Override
	public String toString() {
		return "SavingsAccount \nmin_balance=" + min_balance + ", Account_number=" + getAccount_number()
				+ ", Name=" + getName() + ", Balance=" + getBalance()+"\n";
	}

}
