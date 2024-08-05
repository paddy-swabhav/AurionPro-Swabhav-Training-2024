package com.techlabs.model;

public class CurrentAccount extends Account{

	private long over_draft_limit;
	public CurrentAccount(int over_draft_limit,long account_number, String name, double balance) {
		super(account_number, name, balance);
		this.over_draft_limit=over_draft_limit;
	}
	@Override
	public String toString() {
		return "CurrentAccount \nover_draft_limit=" + over_draft_limit + ", Account_number=" + getAccount_number()
				+ ", Name=" + getName() + ", Balance=" + getBalance()+"\n";
	}


	
}
