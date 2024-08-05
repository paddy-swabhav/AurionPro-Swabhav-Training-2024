package com.techlabs.selection.test;
import java.util.*;

public class TreasureIslandFindingTreasure {


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("WELCOME TO TREASURE ISLAND\nYOUR MISSION IS TO FIND FIND THE TREASURE \n\n");
		System.out.println("Choose 'RIGHT' or 'LEFT'");
		String decision=scanner.next();
		if(decision.equalsIgnoreCase("right"))
		{
			System.out.println("Choose 'SWIM' or 'WAIT'");
			decision=scanner.next();
			if(decision.equalsIgnoreCase("WAIT"))
			{
				System.out.println("Choose a door: 'RED' or 'BLUE' or 'YELLOW'");
				decision=scanner.next();
				if(decision.equalsIgnoreCase("red"))
					System.out.println("BURNED BY FIRE\n\t$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\tGAME OVER\t$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				else if(decision.equalsIgnoreCase("blue"))
					System.out.println("EATEN BY BEASTS\n\t$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\tGAME OVER\t$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				else if(decision.equalsIgnoreCase("yellow"))
					System.out.println("\n\t-------------------------------\tYOU WON\t--------------------------------");
				else
					System.out.println("\n\t$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\tGAME OVER\t$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					
			}
			else
				System.out.println("ATTACKED BY TROUT\n\t$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\tGAME OVER\t$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		}
		else 
			System.out.println("YOU FELL INTO A HOLE\n\t$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\tGAME OVER\t$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

	}

}
