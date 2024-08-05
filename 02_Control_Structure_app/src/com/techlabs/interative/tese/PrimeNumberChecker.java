package com.techlabs.interative.tese;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER : ");
		int number=sc.nextInt();
		int i=2;
		if(number==2||number==3||number==5||number==7)
			System.out.println("Prime");
		else
		{
		while(i<10)
		{
			if(number%i==0)
			{
			System.out.println("Not Prime");
//			counter=1;
			return;
			}
			i++;
		}
//	if(counter==0)
		System.out.println("Prime");
		}
	}

}
