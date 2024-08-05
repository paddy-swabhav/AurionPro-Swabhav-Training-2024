package com.techlabs.assignments;
import java.util.*;

public class PigGame {
	public static int diceRoll()
	{
		int rand;
		while(true) 
		{
			rand=(int) (Math.random()*7);
			if(rand!=0)
				break;
		}
			return rand;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int dice,total_score=0,score=0,turn=1;
		char choice;
		while(total_score<20)
		{
			System.out.println("--------------------- -- TURN "+turn+" ---------------------- ");
			System.out.println("Roll or hold ?(r/h): ");
			choice=scanner.next().charAt(0);
			
			if(choice=='r')
			{
				dice=diceRoll();
				System.out.println(dice);
			
				if(dice==1)
				{
					score=0;
					turn++;
					System.out.println("TURN OVER, NO SCORE");
					break;
				}
				else
				{
					
					score=score+dice;
					System.out.println("SCORE: "+score);
					total_score=score;
					
				}
			}
			else if(choice=='h')
			{
				turn++;
				System.out.println("SCORE FOR TURN "+turn+" : "+score);
				System.out.println("TOTAL SCORE : "+total_score);
			}

		}
		
		System.out.println("\n\nYOU FINISHED IN "+turn+" TURNS.\nTOTAL SCORE : "+total_score);
		System.out.println("=====================================YOU WON ============================================");
		scanner.close();
	}

}
