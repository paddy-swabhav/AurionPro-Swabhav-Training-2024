package com.Aurionpro.model;

import java.util.Scanner;

public class Swapper2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int number1=sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int number2=sc.nextInt();
		
		System.out.println("numbers before Swapping");
		System.out.println("number 1 : "+number1+"\t number 2: "+number2);
		
		number1 = number1+number2;
		number2 = number1-number2;
		number1= number1-number2;
		
		System.out.println("\nnumbers After Swapping");
		System.out.println("number 1 : "+number1+"\t number 2: "+number2);
	}

}
