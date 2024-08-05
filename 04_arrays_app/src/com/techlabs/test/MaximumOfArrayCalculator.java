package com.techlabs.test;

import java.util.Scanner;

public class MaximumOfArrayCalculator {

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
		int max=arr[0];
		for(int i=1;i<size;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}	
		System.out.println("\n\nThe Maximum is:"+max);
		
	}

}
