package com.techlabs.test;

import java.util.Scanner;

public class SumOfArrayCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array SIze");
		int size=sc.nextInt(),sum=0;
		int arr[]=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++)
		arr[i]=sc.nextInt();
		System.out.println("YOUR ENTERED ARRAY IS :");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+"\t");
		
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("\nTHE SUM OF ARRAY IS: "+sum);
		
	}

}
