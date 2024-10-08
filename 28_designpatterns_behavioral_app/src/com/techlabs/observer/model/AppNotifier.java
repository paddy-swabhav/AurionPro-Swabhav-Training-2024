package com.techlabs.observer.model;

public class AppNotifier implements INotifier{

	@Override
	public void notify(Account account, String operation, double amount) {
		System.out.println("\n\n********** APP ************");
		System.out.println(operation.toUpperCase()+" OPERATION HAS BEEN PERFORMED ON YOUR ACCOUNT WITH ACCOUNT NUMBER '"+account.getAccount_number()+"' ");
//		System.out.println("BALANCE BEFORE "+operation.toUpperCase()+": ");
		if(operation.equalsIgnoreCase("credit"))
		{
			System.out.println("BALANCE BEFORE "+operation.toUpperCase()+": "+(account.getBalance()-amount));
//			System.out.println((account.getBalance()-amount));
			System.out.println(amount+" Rupees, has been successfully credited to your account");
			System.out.println("Your current balance is: "+account.getBalance());
		}
		if(operation.equalsIgnoreCase("debit"))
		{
			System.out.println("BALANCE BEFORE "+operation.toUpperCase()+": "+(account.getBalance()+amount));
//			System.out.println((account.getBalance()+amount));
			System.out.println(amount+" Rupees, has been successfully Debited from your account");
			System.out.println("Your current balance is: "+account.getBalance());
		}
	}
}
