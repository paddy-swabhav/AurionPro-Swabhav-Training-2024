package com.techlabs.selection.test;

import java.util.Scanner;

public class PositiveNegativeChecker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=scanner.nextInt();
		if(number<0)
		{
			System.out.println("NEGATIVE");
		}
		else
			System.out.println("POSITIVE");

	}

}
