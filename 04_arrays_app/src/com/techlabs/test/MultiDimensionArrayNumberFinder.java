package com.techlabs.test;

import java.util.Scanner;

public class MultiDimensionArrayNumberFinder {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("ENTER NUMBER OF ROWS");
		int row=scanner.nextInt();
		
		System.out.println("ENTER NUMBER OF Columns");
		int column=scanner.nextInt();
		
		System.out.println("ENTER NUMBER: ");
		int number=scanner.nextInt();
		
		int matrix[][] = new int[row][column];
		
		System.out.println("ENTER YOUR MATRIX ELEMENTS :");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix[i][j]=scanner.nextInt();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(number==matrix[i][j])
					System.out.println("NUMBER FOUND AT "+i+"th row and "+j+"th column");
			}
		}
		
		
	}

}
