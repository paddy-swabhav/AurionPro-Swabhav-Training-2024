package com.techlabs.selection.test;
import java.util.*;

public class CurrencyDenominationApp {
	public static void main(String[] args) {
		int two_thousand,five_hundered,two_hundered,hundered;
		Scanner scanner= new Scanner(System.in);
		System.out.println("ENTER THE AMOUNT: ");
		int amount=scanner.nextInt();
		if(amount>50000)
			System.out.println("The amount should not be greater than 50000");
		else if(amount%100!=0)
			System.out.println("The amount should be multiple of 100");
		else 
		{
			System.out.println("THE DENOMINATIONS FOR "+amount+" :");
			if(amount%2000==0)
			{
				two_thousand=amount/2000;
				System.out.println("Two Thousand(2000): "+two_thousand);
			}
			else
			{
				two_thousand=amount/2000;
				if(two_thousand!=0)
				System.out.println("Two Thousand(2000) : "+two_thousand);
				amount=amount%2000;
				if(amount%500==0)
				{
					five_hundered=amount/500;
					System.out.println("Five Hundered(500) : "+five_hundered);
				}	
				else
				{
					five_hundered=amount/500;
					if(five_hundered!=0)
					System.out.println("Five Hundered(500) : "+five_hundered);
					amount=amount%500;
					if(amount%200==0)
					{
					two_hundered=amount/200;
					System.out.println("Two Hundered(200) : "+two_hundered);
					}
					else
					{
						two_hundered=amount/200;
						if(two_hundered!=0)
							System.out.println("Two Hundered(200) : "+two_hundered);
						amount=amount%200;
						hundered=amount/100;
						System.out.println("Hundred(100) : "+hundered);
					}
					
				}
							
			}
		}
		}
}
