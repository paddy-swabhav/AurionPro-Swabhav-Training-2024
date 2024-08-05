//Design a function that takes a sorted array of numbers as input. 
//The function should produce an array containing the squares of all elements 
//from the input array, ensuring that the output array is also sorted.
//The function should have a time complexity of O(n) and handle al
//possible input scannerenarios effectively.

package com.techlabs.test;
import java.util.*;
public class ArraySquareAndSorterApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Array SIze");
		int size=scanner.nextInt();
		int input_array[]=new int[size];
	//TAKING SORTED ARRAY AS INPUT
		System.out.println("Enter Sorted Array Elements");
		for(int i=0;i<size;i++)
		input_array[i]=scanner.nextInt();
		
		int result_array[]=new int[size];
		
		int left = 0;
		int right = size-1;
		int position= size-1;
	//SQUARE CALCULATING
		while(left<=right)
		{
			if(Math.abs(input_array[left])>Math.abs(input_array[right]))
			{
				result_array[position]=input_array[left]*input_array[left];
				left++;
			}
			else 
			{
				result_array[position]=input_array[right]*input_array[right];
					right--;
			}
			position--;
		}
		System.out.println("\n SORTED ARRAY: ");
		for(int i=0;i<size;i++)
			System.out.print("\t"+result_array[i]);
	}
}
