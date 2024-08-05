package com.techlabs.selection.test;

import java.util.Scanner;

public class MaximumOfTwoNoChecker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int number1=scanner.nextInt();
		System.out.println("Enter the Second number : ");
		int number2=scanner.nextInt();
		
		if(number1>number2)
			System.out.println("Print Number1 : "+number1+" is greater");
		else
			System.out.println("Print Number2 : "+number2+" is greater");
	}

}
