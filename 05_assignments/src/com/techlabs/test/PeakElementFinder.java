package com.techlabs.test;

import java.util.Scanner;

public class PeakElementFinder {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter arrayay SIze");
		int size=scanner.nextInt();
		int input_array[]=new int[size];
		int output_array[]=new int[size];
	//TAKING SORTED arrayAY AS INPUT
		System.out.println("Enter Sorted arrayay Elements");
		for(int i=0;i<size;i++)
		{
			input_array[i]=scanner.nextInt();
		}
		
		int k=0;
		for(int i=0;i<size;i++)
		{
			if(i==0)
			{
				if(input_array[i]>input_array[i+1])
				{
					output_array[k]=input_array[i];
					k++;
				}
			}
			else if(i==size-1)
			{
				if(input_array[i]>input_array[i-1])
				{
					output_array[k]=input_array[i];
					k++;
				}	
			}
			else if(input_array[i]>input_array[i-1] && input_array[i]>input_array[i+1])
			{
				output_array[k]=input_array[i];
				k++;
			}
		}
		
		System.out.println("\n THE PEAK ELEMENTS ARE");
		for(int i=0;i<size;i++)
		{
			if(output_array[i]!=0)
			System.out.print("\t"+output_array[i]);
		}
		
	}

}
