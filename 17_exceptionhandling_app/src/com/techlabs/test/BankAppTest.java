package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exceptions.BankAppException;
import com.techlabs.exceptions.CurrentAccountException;
import com.techlabs.exceptions.InsufficientBalanceException;
import com.techlabs.model.BankApp;
import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingsAccount;

public class BankAppTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		BankApp account1= new CurrentBankApp(1234567890,"PADDY",9000);
//		System.out.println(account1);
//
//		BankApp account2=new SavingsBankApp(112345678,"PADDY",8000);
//		System.out.println(account2);
		
		System.out.println("--------------------------------WELCOME-----------------------");
		accountFunctions(scanner);
	}
		private static void accountFunctions(Scanner scanner)
		{
			int flag=0;
			while(flag!=1)
			{
				System.out.println("Select What you want\n\n 1. SAVINGS ACCOUNT\n 2. CURRENT ACCOUNT");
				int choice=scanner.nextInt();
				if(choice!=1 && choice!=2)
				{
					System.out.println("WRONG INPUT !!!!!!!!!!!");
					return;
				}
				if(choice==1)
				{
					System.out.println("\n\n\t\tSAVINGS ACCOUNT");
					BankApp account=savings(scanner);
					savingsFunctions(scanner,flag,account);
					return;
				}
				if(choice==2)
				{
					System.out.println("\n\n\t\tCURRENT ACCOUNT");
					BankApp account=current(scanner);
					currentFunctions(scanner,flag,account);
					return;
				}
				
			}
		}
		
		private static BankApp savings(Scanner scanner)
		{
			long account_number=account_number_generator();
			System.out.println("ENTER NAME");
			String name=scanner.next();
			System.out.println("ENTER THE BALANCE");
			double balance = scanner.nextDouble();
			while(balance<1000)
			{
				System.out.println("MINIMUM BALANCE SHOULD BE 1000, ENTER AGAIN");
				balance=scanner.nextDouble();
			}
			BankApp account=new SavingsAccount(account_number,name,balance);
			return account;
		}
		
		public static void savingsFunctions(Scanner scanner,int flag,BankApp account)
		{
			double amount;
			int flag1=0;
			while(flag1!=1)
			{
				
				System.out.println("\n\n 1. BankApp Details\n 2. Credit Money\n 3. Withdraw Money\n 4. EXIT.");
				int choice = scanner.nextInt();
				try
				{
					switch(choice)
					{
					case 1:
						System.out.println(account);
						break;
					case 2:
						System.out.println("\nEnter Amount to Credit/Deposit");
						amount=scanner.nextDouble();
						((SavingsAccount)account).credit(amount);
						break;
					case 3:
						System.out.println("\nEnter Amount to Debit/Withdraw");
						amount=scanner.nextDouble();
						account.savingsDebit(amount);
						break;
					case 4:
						System.out.println("THANK YOU !!!!!!!!!");
						flag1=1;
						break;
					default:
						System.out.println("WRONG INPUT.");
						break;
					}
				}
				catch(BankAppException e)
				{
					System.out.println(e.getMessage());
				}
				catch(InsufficientBalanceException exception)
				{
					System.out.println(exception.getMessage());
				}
			}
			
		}
			
		private static BankApp current(Scanner scanner)
		{
			long account_number=account_number_generator();
			System.out.println("ENTER NAME");
			String name=scanner.next();
			System.out.println("ENTER THE BALANCE");
			double balance = scanner.nextDouble();
			while(balance<1000)
			{
				System.out.println("MINIMUM BALANCE SHOULD BE 1000, ENTER AGAIN");
				balance=scanner.nextDouble();
			}
			BankApp account=new CurrentAccount(account_number,name,balance);
			return account;
		}
		
			public static void currentFunctions(Scanner scanner,int flag,BankApp account)
			{
				double amount;
				int flag1=0;
				while(flag1!=1)
				{
					System.out.println("\n\n 1. BankApp Details\n 2. Credit Money\n 3. Withdraw Money\n 4. EXIT.");
					int choice = scanner.nextInt();
					try
					{
						switch(choice)
						{
						case 1:
							System.out.println(account);
							break;
						case 2:
							System.out.println("\nEnter Amount to Credit/Deposit");
							amount=scanner.nextDouble();
							account.credit(amount);
							break;
						case 3:
							System.out.println("\nEnter Amount to Debit/Withdraw");
							amount=scanner.nextDouble();
							account.currentDebit(amount,scanner);
							break;
						case 4:
							System.out.println("THANK YOU !!!!!!!!!");
							flag1=1;
							break;
						default:
							System.out.println("WRONG INPUT.");
							break;
						}
					}
					catch(BankAppException exception)
					{
						System.out.println(exception.getMessage());
					}
					catch(CurrentAccountException exception)
					{
						System.out.println(exception.getInsufficeintBalance());
					}
				}
		}
		
		
		public static long account_number_generator()
		{
			long account_number= (long)(Math.random()* 9_000_000_000L + 1_000_000_000L);
			return account_number;
			
		}
		
}

