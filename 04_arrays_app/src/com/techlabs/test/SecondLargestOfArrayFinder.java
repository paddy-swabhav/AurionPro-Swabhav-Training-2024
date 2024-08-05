package com.techlabs.test;

import java.util.Scanner;

public class SecondLargestOfArrayFinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array SIze");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++)
		array[i]=sc.nextInt();

		for (int i = 0; i < array.length; i++)   
		{  
		for (int j = i + 1; j < array.length; j++)   
		{  
		int tmp = 0;  
		if (array[i] < array[j])   
		{  
		tmp = array[i];  
		array[i] = array[j];  
		array[j] = tmp;  
		}  
		} 
		} 
		
		System.out.println("\n THE SECOND LARGEST NUMBER: \t"+ array[1]);

	}
}
