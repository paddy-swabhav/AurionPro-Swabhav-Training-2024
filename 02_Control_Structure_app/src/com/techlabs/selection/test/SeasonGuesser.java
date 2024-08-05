package com.techlabs.selection.test;

import java.util.Scanner;

public class SeasonGuesser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a month's Number (1-12): ");
		int month= sc.nextInt();
		switch(month)
		{
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Summer Season");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("Monsoon Season");
				break;
			case 10:
			case 11:
			case 12:
			case 1:
				System.out.println("WInter Season");
				break;
			default:
				System.out.println("Wrong Number Entered");
				break;
		}

	}

}
