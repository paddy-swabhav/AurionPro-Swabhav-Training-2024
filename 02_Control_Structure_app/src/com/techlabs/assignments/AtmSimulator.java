package com.techlabs.assignments;
import java.util.*;

public class AtmSimulator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("-----------------------WELCOME TO OUR ATM---------------------\n");
		int choice;
		System.out.println("PLEASE ENTER YOUR ACCOUNT BALANCE AMOUNT: ");
		double balance=scanner.nextDouble(),amount;
		do
		{
			System.out.println("\n\n==================================  MENU  ===============================");
			System.out.println("\n1. Check Balance\n" + 
					"2. Deposit Money\n" + 
					"3. Withdraw Money\n" + 
					"4. Exit\n");
			System.out.println("Please choose one option: ");
			choice=scanner.nextInt();
			
			
			switch(choice)
			{
			case 1:
				{
					System.out.println("\nYOUR CURRENT BALANCE IS: "+balance);
					break;
				}
			case 2:
				{
					System.out.println("ENTER AMOUNT TO DEPOSIT: ");
					amount=scanner.nextDouble();
					balance=balance+amount;
					System.out.println("\nProcessing..............\n\nTranscation Completed Successfully :)");
					System.out.println("\nYOUR NEW BALANCE IS: "+balance);
					break;
				}
			case 3:
				{
					System.out.println("ENTER AMOUNT TO WITHDRAW: ");
					amount=scanner.nextDouble();
					if(balance>=amount)
					{
						balance=balance-amount;
						System.out.println("\nProcessing..............\n\nTranscation Completed :)");
						System.out.println("\nYOUR NEW BALANCE IS: "+balance);
					}
					else
						System.out.println("\n INSUFFICIENT BALANCE");
					break;
				}
			case 4:
				{
					System.out.println("\n--------------------------THANK YOU FOR CHOSSING THE ATM----------------------------------");
					System.out.println("\n\t\tGOOD BYE");
					break;
				}
			default:
				System.out.println("\n\n\t+++++++++++++++++++++++++ Wrong Input.+++++++++++++++++++++++++++++\n\t\t PLEASE SELECT CORRECT OPTION\n");
				break;
			}
		}while(choice!=4);
	}

}
