package com.techlabs.test;

import java.util.Scanner;


public class Main {

	private static int addition(int number1,int number2)
	{
		return number1+number2;
	}
	
	private static int subtraction(int number1,int number2)
	{
		return number1-number2;
	}
	
	private static int multiplication(int number1,int number2)
	{
		return number1+number2;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBERS: ");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int result=addition(number1,number2);
		System.out.println("The Addition of two numbers is: "+result);
		result=subtraction(number1,number2);
		System.out.println("The Subtraction of two numbers is: "+result);
		result=multiplication(number1,number2);
		System.out.println("The Multiplication of two numbers is: "+result);
		sc.close();
		
		
		
	}

}
