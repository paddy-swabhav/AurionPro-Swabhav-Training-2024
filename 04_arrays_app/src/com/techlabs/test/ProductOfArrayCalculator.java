package com.techlabs.test;

import java.util.Scanner;

public class ProductOfArrayCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();
		
		int array[] = new int[size];
		
		arrayInput(array,scanner);
		
		System.out.println("\n\nARRAY BEFORE PRODUCT: ");
		displayArray(array);
		 productOfArray(array);
		 
		 System.out.println("\nOutput:-");
		 
		 displayArray(array);
	}
	
	 private static void displayArray(int[] array) {
		 System.out.print("[");
	    	for(int i=0;i<array.length;i++) 
	    	{	
				System.out.print(" "+array[i]);	
			}
	    	System.out.print("]");
		}

	private static void arrayInput(int[] array, Scanner scanner) {
	    	System.out.println("Enter Values of Array: ");
			for(int i=0;i<array.length;i++) {
				System.out.println("Enter Element "+(i+1)+": ");
				array[i]=scanner.nextInt();
			}	
	}

	private static void productOfArray(int[] array) 
	{	
		int zeroCounter=0;
	    int product=1;
	    
	    for(int number : array) 
	    {
	    	if(number==0) {
	    		zeroCounter++;
	    		continue;
	    	}
	    	product*=number;
	    }
	    
	    for(int i=0;i<array.length;i++) {
	    	
	    	if((array[i]==0 && (zeroCounter-1)!=0)||(array[i]!=0 && zeroCounter!=0)){
	    		array[i]=0;
	    		continue;
	    	}
	    	if(array[i]==0 && (zeroCounter-1)==0) {
	    		array[i]=product;
	    		continue;
	    	}
	    	array[i]=product/array[i];
	    }
		
	}

}
