package com.techlabs.test;
import java.util.Scanner;
import com.techlabs.exceptions.InsufficientBalanceException;
import com.techlabs.exceptions.NegativeAmountException;
import com.techlabs.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account=null;
		int flag=0,amount;
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER ACCOUNT NUMBER: ");
		long account_number=scanner.nextInt();
		System.out.println("ENTER NAME: ");
		String name= scanner.next();
		System.out.println("ENTER BALANCE:");
		
		int balance=scanner.nextInt();
		account = new Account(account_number,name,balance);
		
		System.out.println(account);
		try
		{
			while(flag!=1)
			{
			System.out.println("\n\n1. Account Details\n2. Credit\n3. Debit\n 4.Exit");
			int choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println(account);
				break;
			case 2:
				System.out.println("ENTER AMOUNT TO CREDIT");
				amount=scanner.nextInt();
				account.credit(amount);
				break;
			case 3:
				System.out.println("ENTER AMOUNT TO DEBIT");
				amount=scanner.nextInt();
				account.debit(amount);
				break;
			case 4:
				System.out.println("THANK YOU ");
				flag=1;
				break;
			default:
				System.out.println("WRONG INPUT");
				break;
			}
			}
		}
		catch(InsufficientBalanceException exception)
		{
			System.out.println(exception.getMessage());
		}
		catch(NegativeAmountException exception)
		{
			System.out.println(exception.getMessage());
		}
	}

}
