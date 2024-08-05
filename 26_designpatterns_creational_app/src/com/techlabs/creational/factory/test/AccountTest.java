package com.techlabs.creational.factory.test;

import com.techlabs.creational.factory.model.AccountFactory;
import com.techlabs.creational.factory.model.AccountType;
import com.techlabs.creational.factory.model.IAccount;

public class AccountTest {

	public static void main(String[] args) {
		
		IAccount account;
		System.out.println("\n CURRENT");
		account = AccountFactory.createAcoount(AccountType.Current,101,10000);
		account.credit(200);
		account.debit(1000);
		System.out.println("\n\n SAVINGS");
		account = AccountFactory.createAcoount(AccountType.Savings,201,20000);
		account.credit(200);
		account.debit(1000);

	}

}
