package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.IFactorial;

public class IFactorialTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER NUMBER FOR FACTORIAL: ");
		int input=scanner.nextInt();
		
		IFactorial factorial=(int number)->{
			
			int fact=1;
			for(int i=1;i<=number;i++)
			fact=fact*i;
			return fact;
		};
		
		System.out.println("THE FACTORIAL OF "+input+" IS: "+factorial.factorial(input));
	}

}
