package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.BankAccount;

public class BankAccountTest {

	public static long account_number_generator()
	{
		long account_number= (long)(Math.random()* 9_000_000_000L + 1_000_000_000L);
		return account_number;
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int amount=0,flag =0;
		
		System.out.println("ENTER ACOOUNT DETAILS\n");
		long account_number=account_number_generator();
		System.out.println("ENTER NAME: ");
		String name = scanner.next();
		System.out.println("Enter Balance");
		double balance=scanner.nextDouble();
		BankAccount account1= new BankAccount(account_number,name,balance);

		while(flag!=1)
		{
		System.out.println("\n\nSELECT YOUR OPTION: \n1. Account Details(Balance) \n2. Withdraw Amount \n3. Desposit Amount \n4. Go back to Main Menu");
		int choice1=scanner.nextInt();
		switch(choice1)
		{
		case 1:
			System.out.println("\nACCOUNT NUMBER :"+account1.getaccountNumber());
			System.out.println("NAME: "+account1.getName());
			System.out.println("YOU CURRENT BALANCE: "+account1.getbalance()+" Rs.");
			break;
		case 2:
			System.out.println("ENTER THE AMOUNT TO WITHDRAW");
			amount=scanner.nextInt();
			System.out.println("YOUR CURRENT BALANCE IS : "+account1.DebitAmount(amount));
			break;
		case 3:
			System.out.println("ENTER THE AMOUNT TO CREDIT");
			amount=scanner.nextInt();
			System.out.println("YOUR CURRENT BALANCE IS : "+account1.creditAmount(amount));
			break;
		case 4:
			flag=1;
			break;
		default:
		break;
		}
		}
		
		System.out.println("THANKYOU..................!!!!!!!!!");
		scanner.close();
	}
}


