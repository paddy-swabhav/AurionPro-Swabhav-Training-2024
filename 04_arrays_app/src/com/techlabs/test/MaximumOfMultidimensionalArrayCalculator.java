package com.techlabs.test;

import java.util.Scanner;

public class MaximumOfMultidimensionalArrayCalculator {

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
		
		int max=matrix[0][0];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(max<matrix[i][j])
				{
					max=matrix[i][j];
				}
			}
		}
		System.out.println("THE MAXIMUM ELEMNET IS: "+max);
	}

}
