//package com.techlabs.test;
//
//import java.util.Scanner;
//
//import com.techlabs.model.BankAccount;
//
//public class BankAccountTest2 {
//
//	public static void main(String[] args) {
//		Scanner scanner= new Scanner(System.in);
//		
//		int choice,amount,flag=0,flag1=0,user1=0,user2=0;
//		
//		//USER 1
//		BankAccount account1= new BankAccount();
//		account1.setaccountNumber(account1.account_number_generator());
//				
//		//USER 
//		BankAccount account2= new BankAccount();
//		account2.setaccountNumber(account2.account_number_generator());
//		
//
////		while(flag1!=3)
////		{
////			flag=0;
////			System.out.println("CHOOSE THE USER: \n 1. USER 1 ("+account1.getaccountNumber()+").\n 2. USER 2 ("+account2.getaccountNumber()+").\n 3. EXIT");
////			choice=scanner.nextInt();
////			switch(choice)
////			{
////			case 1:
////			{
////					if(user1==0)
////					{
////						System.out.println("ENTER NAME: ");
////						account1.setName(scanner.next());
////						System.out.println("Enter Balance");
////						account1.setbalance(scanner.nextInt());	
////						user1=1;
////					}
////					
////					while(flag!=1)
////					{
////						System.out.println("\n\nSELECT YOUR OPTION: \n1. Account Details(Balance) \n2. Withdraw Amount \n3. Desposit Amount \n4. Go back to Main Menu");
////						int choice1=scanner.nextInt();
////						switch(choice1)
////						{
////						case 1:
////							System.out.println("\nACCOUNT NUMBER :"+account1.getaccountNumber());
////							System.out.println("NAME: "+account1.getName());
////							System.out.println("YOU CURRENT BALANCE: "+account1.getbalance()+" Rs.");
////							break;
////						case 2:
////							System.out.println("ENTER THE AMOUNT TO WITHDRAW");
////							amount=scanner.nextInt();
////							System.out.println("YOUR CURRENT BALANCE IS : "+account1.DebitAmount(amount));
////							break;
////						case 3:
////							System.out.println("ENTER THE AMOUNT TO CREDIT");
////							amount=scanner.nextInt();
////							System.out.println("YOUR CURRENT BALANCE IS : "+account1.creditAmount(amount));
////							break;
////						case 4:
////							flag=1;
////							break;
////						default:
////						break;
////						}
////				}
//////				choice=3;
////				break;
////			}
////			case 2:
////
////				if(user2==0)
////				{
////					System.out.println("ENTER NAME: ");
////					account2.setName(scanner.next());
////					System.out.println("Enter Balance");
////					account2.setbalance(scanner.nextInt());	
////					user2=1;
////				}
////				while(flag!=1)
////				{
////					System.out.println("\n\nSELECT YOUR OPTION: \n1. Account Details(Balance) \n2. Withdraw Amount \n3. Desposit Amount \n4. Go back to Main Menu");
////					choice=scanner.nextInt();
////					switch(choice)
////					{
////					case 1:
////						System.out.println("\nACCOUNT NUMBER :"+account2.getaccountNumber());
////						System.out.println("NAME: "+account2.getName());
////						System.out.println("YOU CURRENT BALANCE: "+account2.getbalance()+" Rs.");
////						break;
////					case 2:
////						System.out.println("ENTER THE AMOUNT TO WITHDRAW");
////						amount=scanner.nextInt();
////						System.out.println("YOUR CURRENT BALANCE IS : "+account2.DebitAmount(amount));
////						break;
////					case 3:
////						System.out.println("ENTER THE AMOUNT TO CREDIT");
////						amount=scanner.nextInt();
////						System.out.println("YOUR CURRENT BALANCE IS : "+account2.creditAmount(amount));
////						break;
////					case 4:
////						flag=1;
////						break;
////					default:
////						System.out.println("PLEASE CHOOSE CORRECT OPTION");
////						break;
////					}
////			}
////			choice=3;
////			break;
////			case 3:
////				System.out.println("THANK YOU,EXITED SUCCESSFULLY........................");
////				flag1=3;
////				break;
////			default:
////				System.out.println("PLEASE CHOOSE CORRECT OPTION");
////				break;
////			}
////		}
//		
//		
//		
//	}
//
//}
