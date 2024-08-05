package com.techlabs.test;

import java.util.Scanner;

public class FactorialChecker {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int number=scanner.nextInt();
		
		int factorial=calculateFactorial(number);
		if(factorial==-1)
		{
			System.out.println("FACTORIAL CANNOT BE CALCULATED");
			return;
		}
		
		System.out.println("FACTORIAL: "+factorial);
	}
	
	private static int calculateFactorial(int number)
	{
		if(number==0)
			return 1;
		if(number<0)
			return -1;
		int fact=1;
		for(int i=1;i<=number;i++)
			fact=fact*i;
		
		return fact;
	}

}
