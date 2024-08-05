package com.techlabs.test;

import java.util.Scanner;

public class SumOfMultiDimensionalArrayCalculator {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
		
		System.out.println("ENTER NUMBER OF ROWS");
		int row=scanner.nextInt();
		
		System.out.println("ENTER NUMBER OF Columns");
		int column=scanner.nextInt();
		
		int matrix[][] = new int[row][column];
		
		System.out.println("ENTER YOUR MATRIX ELEMENTS :");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix[i][j]=scanner.nextInt();
			}
		}
		int sum=0;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				sum=sum+matrix[i][j];
			}
		}
		
		System.out.println("THE SUM OF THE MULTI-DIMENSIONAL ARRAY IS : "+sum);
		
	}

}
