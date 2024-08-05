package com.techlabs.test;

import java.util.Scanner;

public class NumberExistenceChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array SIze");
		int size=sc.nextInt(),sum=0;
		int arr[]=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++)
		arr[i]=sc.nextInt();
		System.out.println("INPUT NUMBER TO BE SEARCHED");
		int number=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			if(number==arr[i])
				System.out.println("NUMBER FOUND AT: "+i+" INDEX");
		}
	}

}
