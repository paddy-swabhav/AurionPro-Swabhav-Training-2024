package com.techlabs.test;

import java.util.Scanner;

public class ArraySorter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array SIze");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++)
		arr[i]=sc.nextInt();

		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		} 
		} 
		
		System.out.println("\n SORTED ARRAY IS: \t");
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);

	}

}
