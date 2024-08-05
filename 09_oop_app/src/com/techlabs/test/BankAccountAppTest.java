package com.techlabs.test;
import java.util.Scanner;

import com.techlabs.model.AccountTypeEnum;
import com.techlabs.model.BankAccountApp;

public class BankAccountAppTest {
	
	public static long account_number_generator()
	{
		long account_number= (long)(Math.random()* 9_000_000_000L + 1_000_000_000L);
		return account_number;
		
	}
	
	public static BankAccountApp getMaximumBalanceAccount(BankAccountApp[] accounts)
	{
//		double max =accounts[0].getBalance();
//		for(int i=0;i<accounts.length;i++)
//		{
//			max=Math.max((accounts[i].getBalance()), max);
//		}
//		return max;
		
		if (accounts.length == 0) {
            return null;
        }
        BankAccountApp maxBalanceAccount = accounts[0];
        for (int i = 1; i < accounts.length; i++) {
            if (accounts[i].getBalance() > maxBalanceAccount.getBalance()) {
                maxBalanceAccount = accounts[i];
            }
        }
        return maxBalanceAccount;
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ACOOUNTS YOU WANT TO CREATE");
		int no_of_accounts=scanner.nextInt();
		BankAccountApp accounts[]=new BankAccountApp[no_of_accounts];
		AccountTypeEnum account_type1 = null;
		for(int i=0;i<no_of_accounts;i++)
		{
			System.out.println("Enter Bank Account Details For Account: "+(i+1));
			System.out.println("Enter Name: ");
			String name=scanner.next();
			System.out.println("Select Account Type: \n 1. Savings \n 2. Current");
			int account_type=scanner.nextInt();
			if(account_type==1)
			account_type1 = AccountTypeEnum.Savings;
			else if(account_type==2)
				account_type1 = AccountTypeEnum.Current;
			
			System.out.println("Enter Balance: ");
			double balance=scanner.nextDouble();
			long account_number = account_number_generator();
			accounts[i]= new BankAccountApp(account_number,name,balance,account_type1);
		}
		
		for(int i=0;i<no_of_accounts;i++)
		{
			System.out.println("\n\nBank Account Details For Account: "+(i+1));
			System.out.println("ACCOUNT NUMBER: "+accounts[i].getAccountNumber());
			System.out.println("Name: "+ accounts[i].getName());
			System.out.println("Account Type: "+ accounts[i].getAccountType());
			System.out.println("Balance: "+ accounts[i].getBalance());
		}
		
		BankAccountApp maxBalanceAccount = getMaximumBalanceAccount(accounts);
        if (maxBalanceAccount != null) {
            System.out.println("\n\nAccount with maximum balance:");
            System.out.println("Account Number: " + maxBalanceAccount.getAccountNumber());
            System.out.println("Name: " + maxBalanceAccount.getName());
            System.out.println("Balance: " + maxBalanceAccount.getBalance());
            System.out.println("Account Type: " + maxBalanceAccount.getAccountType());
        } else {
            System.out.println("No accounts found.");
        }

		scanner.close();
	}

}
