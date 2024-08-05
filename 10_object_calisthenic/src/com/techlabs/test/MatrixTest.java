package com.techlabs.test;

import java.util.Scanner;

public class MatrixTest {
	

	private static void createRow(int matrix[][], Scanner scanner)
	{	
		for(int i=0;i<3;i++)
		{
			readRow(matrix,scanner,i);
		}
	}
		
	private static void readRow(int matrix[][], Scanner scanner, int i)
	{
		for(int j=0;j<3;j++)
		{
			matrix[i][j]=scanner.nextInt();
		}
	}
	
	private static void displayMatrix(int matrix[][])
	{
		for(int i=0;i<3;i++)
		{
			displayRow(matrix, i);
			System.out.println("");
		} 
	}
	private static void displayRow(int matrix[][], int i)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(matrix[i][j]+"\t");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int matrix[][]= new int[3][3];
		
		System.out.println("ENTER THE MATRIX ELEMENTS: ");
		createRow(matrix,scanner);
		
		System.out.println("THE MATRIX IS: \n");
		displayMatrix(matrix);

	}

}
