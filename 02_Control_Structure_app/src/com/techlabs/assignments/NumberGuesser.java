package com.techlabs.assignments;
import java.util.*;

public class NumberGuesser {
	public static int randomNumber()
	{
		int rand;
		while(true) 
		{
			rand=(int) (Math.random()*100);
			if(rand!=0)
				break;
		}
			return rand;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int input=0,number=randomNumber(),attempt=1;
		System.out.println(number);
		while(attempt<6)
		{
			System.out.println("\nGUESS A NUMBER BETWEEN 1-100");
			input=scanner.nextInt();
			if(input==number)
			{
				System.out.println("\n\nYOU WON IN "+attempt+" ATTEMPTS :)");
				break;
			}
			else if(input<number)
			{
				attempt++;
				System.out.println("Sorry too low");
			}
			else if(input>number)
			{
				attempt++;
				System.out.println("Sorry too high");
			}	
		}
		if(attempt>=6)
			System.out.println("\n\n\n GAME OVER   \nSORRY YOU LOST.  NUMBER OF ATTEMPTS EXCEDED");
	scanner.close();	
	}
}
