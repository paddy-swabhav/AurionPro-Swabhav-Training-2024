package com.techlabs.test;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int flag = 0;
		String arr[][] = new String[3][3];
		
		//INITIALIZING THE ARRAY with ' '
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=" ";
			}
		}
		
		//PRINTING THE ARRAY IN GAME FORMAT
		printArray(arr);
		
		
		
		
		
		//LOOP FOR ACCEPTING VALUE FROM PLAYER
		while (true) {
            inputForX(scanner, arr);
            printArray(arr);
            if (checkWin(arr, "X")) {
                System.out.println("\nPlayer 'X' wins!");
                break;
            }
            if (isBoardFull(arr)) {
                System.out.println("\n **********************IT'S A TIE*******************");
                break;
            }
            
            inputFor0(scanner, arr);
            printArray(arr);
            if (checkWin(arr, "0")) {
                System.out.println("\nPlayer '0' wins!");
                break;
            }
        }
		
		

	}
	//PRINTING THE ARRAY IN GAME FORMAT
	public static void printArray(String[][] arr)
	{
		for(int i=0;i<3;i++)
		{
			if(i==1)
			System.out.println("\n-----------------");

			for(int j=0;j<3;j++)
			{
				if(j==1)
					System.out.print("  |");
				System.out.print("  "+arr[i][j]);
				if(j==1)
					System.out.print("  |");
			}
			if(i==1)
			System.out.println("\n-----------------");
		}	
	}
	
	//ACCEPT INPUT FOR X
	public static void inputForX(Scanner scanner,String[][] arr)
	{
		int row,column,flag=0;
		while(flag!=1)
		{
			System.out.println("\n\nPlayer 'X', enter your move (row[1-3] column[1-3]): ");
			row= scanner.nextInt();
			column=scanner.nextInt();
			if(arr[row-1][column-1]==" ")
			{
			arr[row-1][column-1]="X";
			break;
			}
			System.out.println("This move at ("+row+","+column+") is not valid. Try again...");
		}
	}
	
	
	//ACCEPT INPUT FOR 0
	public static void inputFor0(Scanner scanner,String[][] arr)
	{
		int row,column,flag=0;
		while(flag!=1)
		{				
			System.out.println("\n\nPlayer '0', enter your move (row[1-3] column[1-3]): ");
			row= scanner.nextInt();
			column=scanner.nextInt();
			if(arr[row-1][column-1]==" ")
			{
			arr[row-1][column-1]="0";
			break;
			}
			System.out.println("This move at ("+row+","+column+") is not valid. Try again...");
		}
	}
	
	// CHECK IF BOARD IS FULL
    public static boolean isBoardFull(String[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(" ")) {
                    return false; // There's at least one empty space
                }
            }
        }
        return true; // No empty spaces found
    }
    
    public static boolean checkWin(String[][] arr,String player)
    {
    	 for (int i = 0; i < 3; i++) {
             if (arr[i][0].equals(player) && arr[i][1].equals(player) && arr[i][2].equals(player)) {
                 return true;
             }
         }
         
         // Check columns
         for (int j = 0; j < 3; j++) {
             if (arr[0][j].equals(player) && arr[1][j].equals(player) && arr[2][j].equals(player)) {
                 return true;
             }
         }
         
         // Check diagonals
         if (arr[0][0].equals(player) && arr[1][1].equals(player) && arr[2][2].equals(player)) {
             return true;
         }
         if (arr[0][2].equals(player) && arr[1][1].equals(player) && arr[2][0].equals(player)) {
             return true;
         }
         
         return false;
    }
		
}
