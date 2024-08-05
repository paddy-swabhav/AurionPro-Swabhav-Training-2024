package com.techlabs.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.list.model.BankApp;

public class BankAppTest {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		List<BankApp> accounts_list= new ArrayList<BankApp>();
		
		createAccounts(scanner,accounts_list);
		displayAccounts(accounts_list);
		
		System.out.println("\n ACCOUNTS IN DESCENDING ORDER OF BALANCE: ");
		displayDescendingAccountsList(accounts_list);
		
		System.out.println("\nACCOUNT WITH MAXIMUM BALANCE: ");
		System.out.println(getMaximumBalanceAccount(accounts_list));
		
		
	}
	
	private static void createAccounts(Scanner scanner,List<BankApp> accounts_list)
	{
		int flag =0;
		while(flag!=1)
		{
			System.out.println("Select your option: \n\t1. Create Accounts. \n\t2. Exit");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("ENTER NAME: ");
				String name=scanner.next();
				System.out.println("ENTER BALANCE");
				double balance = scanner.nextDouble();
				long account_number = account_number_generator();
				accounts_list.add(new BankApp(account_number,name,balance));
				break;
			case 2:
				flag=1;
				break;
			default:
				System.out.println("INVALID INPUT !!!!!!!");
				break;
			}
		}
	}
	
	private static void displayAccounts(List<BankApp> accounts_list)
	{
		for(int i=0;i<accounts_list.size();i++)
		{
//			System.out.println("\n");
			System.out.println("ACCOUNT NUMBER: "+accounts_list.get(i).getAccount_number());
			System.out.println("NAME: "+accounts_list.get(i).getName());
			System.out.println("BALANCE: "+accounts_list.get(i).getBalance());
		
		}
	}
	
	private static BankApp getMaximumBalanceAccount(List<BankApp> accounts_list)
	{
		BankApp maximum_balance_account= accounts_list.get(0);
		for(int i=1;i<accounts_list.size();i++)
		{
			if(maximum_balance_account.getBalance()<accounts_list.get(i).getBalance())
				maximum_balance_account=accounts_list.get(i);
		}
		return maximum_balance_account;
	}
	
	private static void displayDescendingAccountsList(List<BankApp> accounts_list)
	{
		List<BankApp> descending_accounts_list=getDescendingAccountsList(accounts_list);
		for(BankApp accounts:descending_accounts_list)
			System.out.println(accounts);
	}
	
	private static List<BankApp> getDescendingAccountsList(List<BankApp> accounts_list)
	{
		List<BankApp> temp_list= new ArrayList<BankApp>();
		temp_list=accounts_list;
		for(int i=0;i<accounts_list.size();i++)
		{
//			listsorter(temp_list,i);
			for(int j=i+1;j<temp_list.size();j++)
			{
				if(temp_list.get(i).getBalance()<temp_list.get(j).getBalance())
				{
					BankApp temp=temp_list.get(i);
					temp_list.set(i, temp_list.get(j));
					temp_list.set(j, temp);
				}
			}
		}
		return temp_list;
	}
	
	public static void listsorter(List<BankApp> temp_list,int i)
	{
		for(int j=1;j<temp_list.size();j++)
		{
			if(temp_list.get(i).getBalance()<temp_list.get(j).getBalance())
			{
				BankApp temp=temp_list.get(i);
				temp_list.set(i, temp_list.get(j));
				temp_list.set(j, temp);
			}
		}
	}
	
	public static long account_number_generator()
	{
		long account_number= (long)(Math.random()* 9_000_000_000L + 1_000_000_000L);
		return account_number;
		
	}

}
