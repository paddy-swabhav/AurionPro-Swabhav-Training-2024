package com.techlabs.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.techlabs.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		
		List<Account> accounts=Arrays.asList(new Account(1,"Paddy",1000),new Account(2,"Vinayak",9876),new Account(3,"Devansh",23445),new Account(20,"Sova",98765));
		
		
		
		//ACCOUNT WITH MINIMUM BAL
		System.out.println("\nACCOUNT WITH MINIMUM BALANCE");
//		System.out.println(accounts.stream()
//				.min((account1,account2)->(int)account1.getBalance()-(int)account2.getBalance()).get());
		
		double min_balance=accounts.stream()
					.mapToDouble(Account :: getBalance)
					.sum();
		System.out.println(min_balance);
		
		//ACCOUNT WITH MAXIMUM BAL
		System.out.println("\nACCOUNT WITH MINIMUM BALANCE");
		System.out.println(accounts.stream()
				.max((account1,account2)->(int)account1.getBalance()-(int)account2.getBalance()).get());
				
		//NAMES GREATER THAN 6 CHAR
		System.out.println("\nACCOUNTS WITH NAME WITH > 6 CHARS");
		accounts.stream()
				.filter((account)->account.getName().length()>6)
				.forEach((account)->System.out.println(account));
		
		//TOTAL BALANCE OF ALL ACCOUNTS
		System.out.println("\nTOTAL BALANCE");
		System.out.println(accounts.stream()
				.map((account)->account.getBalance())
				.reduce(0.00,(account1,account2)->account1+account2));
				
	}

}
