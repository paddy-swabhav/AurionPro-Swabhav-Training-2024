package com.techlabs.test;

import java.util.Scanner;

public class ArrayAdditionCalculator {
	static Scanner scanner=new Scanner(System.in);
	
	
	private static int[][] readMatrix(int row,int column)
	{
		
		int matrix[][] = new int[row][column];
		
		System.out.println("ENTER YOUR MATRIX ELEMENTS :");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("\nTHE ENTERED MATRIX IS : ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("");
		} 
		
		return matrix;	
	}
	
	public static void main(String[] args) {
		System.out.println("ENTER NUMBER OF ROWS FOR 1st MATRIX");
		int row1=scanner.nextInt();
		System.out.println("ENTER NUMBER OF Columns FOR 1st MATRIX");
		int column1=scanner.nextInt();
		
		System.out.println("ENTER NUMBER OF ROWS FOR 2nd MATRIX");
		int row2=scanner.nextInt();
		System.out.println("ENTER NUMBER OF Columns FOR 2nd MATRIX");
		int column2=scanner.nextInt();
		
		if(row1!=row2 || column1!=column2)
		{
			System.out.println("ADDTION CANNOT BE PERFORMED NUMBER OF ROWS AND COLUMN SHOULD BE SAME");
		}
		else
		{
			System.out.println("\nFOR FIRST MATRIX: ");
			int matrix1[][] = readMatrix(row1,column1);
			
			System.out.println("\nFOR Second MATRIX: ");
			int matrix2[][] = readMatrix(row2,column2);
			
			int matrix_result[][]= new int[row1][column1];
			
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<column1;j++)
				{
					matrix_result[i][j]=matrix1[i][j]+matrix2[i][j];
				}
			}
			
			System.out.println("\n\nTHE ADDITION OF TWO MATRIX IS: ");
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<column1;j++)
				{
					System.out.print("\t"+matrix_result[i][j]);
				}
				System.out.println("\n");
			}
		}
	}
}
