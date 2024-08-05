package com.techlabs.test;

import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingsAccount;

public class AccountTest {

	public static void main(String[] args) {
		
		CurrentAccount account1= new CurrentAccount(10000,1234567890,"PADDY",9000);
		System.out.println(account1);

		SavingsAccount account2=new SavingsAccount(1000,112345678,"PADDY",8000);
		System.out.println(account2);
	}

}
