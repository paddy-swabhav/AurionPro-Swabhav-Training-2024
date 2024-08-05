package com.Aurionpro.model;

import java.util.Scanner;

public class Swapper {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int number1=sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int number2=sc.nextInt();
		int temp;
		
		System.out.println("Numbers before Swapping");
		System.out.println("Number 1 : "+number1+"\t Number 2: "+number2);
		
		temp=number1;
		number1=number2;
		number2=temp;
		
		System.out.println("\n Numbers After Swapping");
		System.out.println("Number 1 : "+number1+"\t Number 2: "+number2);

	}

}
