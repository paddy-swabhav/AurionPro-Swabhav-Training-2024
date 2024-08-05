package com.techlabs.selection.test;

import java.util.Scanner;

public class MaximumOfThreeNoChecker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int number1=scanner.nextInt();
		System.out.println("Enter the Second number : ");
		int number2=scanner.nextInt();
		System.out.println("Enter the Third number : ");
		int number3=scanner.nextInt();
		
		
		if(number1>number2 && number1>number3)
			System.out.println("Number1 : "+number1+" is greater");
		else if(number2>number3)
			System.out.println("Number2 : "+number2+" is greater");
		else
			System.out.println("Number3 : "+number3+" is greater");
	}

}
