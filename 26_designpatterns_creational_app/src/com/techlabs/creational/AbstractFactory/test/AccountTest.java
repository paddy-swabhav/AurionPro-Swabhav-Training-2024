package com.techlabs.creational.AbstractFactory.test;


import java.util.Scanner;

import com.techlabs.creational.AbstractFactory.model.CurrentAccountFactory;
import com.techlabs.creational.AbstractFactory.model.IAccount;
import com.techlabs.creational.AbstractFactory.model.IAccountFactory;
import com.techlabs.creational.AbstractFactory.model.SavingsAccountFactory;


public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IAccount account;
		
		System.out.println("ENTER YOUR CHOICE: \n\t1. SAVINGS ACCOUNT \n\t2. CURRENT ACCOUNT");
		int choice = scanner.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("\n CURRENT");
				IAccountFactory savingsAccountFactory= new SavingsAccountFactory();
				account = savingsAccountFactory.createAccount(101,10000);
				account.credit(200);
				System.out.println("\n");
				account.debit(1000);
				break;
				
			case 2:
				System.out.println("\n\n SAVINGS");
				IAccountFactory CurrentAccountFactory= new CurrentAccountFactory();
				account = CurrentAccountFactory.createAccount(201,20000);
				account.credit(200);
				System.out.println("\n");
				account.debit(1000);
				break;
				
			default:
				System.out.println("Please Choose Correct Option From '1 & 2'");
			
		}
		

	}

}
