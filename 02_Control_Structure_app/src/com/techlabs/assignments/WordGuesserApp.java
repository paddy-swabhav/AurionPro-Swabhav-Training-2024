package com.techlabs.assignments;	
import java.util.*;

public class WordGuesserApp {

	public static void main(String[] args) {
		System.out.println("WORD GUESSER APP");
		String arr[] = { "geeks",   "for",   "car", "air",    "portal",
                "to",      "learn", "can",   "better",   "computer",
                "science", "zoom",  "yup",   "fire", "inject",
                "be",      "data",  "get" };
		
		Scanner sc=new Scanner(System.in);
		
		Random generator = new Random();
		int randomIndex = generator.nextInt(arr.length);
		String word= arr[randomIndex];
		System.out.println(word);
		
		int length=word.length();
		int life=length*3;
		System.out.println("\nYOU HAVE ONLY :"+life+" Lifes");
		//System.out.println(length);
		char result_arr[] = new char[length];
		char word_arr[] = new char[length];
		for(int i=0;i<length;i++)
			word_arr[i]=word.charAt(i);
		
		for(int i=0;i<length;i++)
			result_arr[i]='_';
		
		int flag=0,flag1=1;
		do
		{
			for(int i=0;i<length;i++)
			{
				if(result_arr[i]=='_') 
				{
					for(int j=0;j<length;j++)
						System.out.print(" "+result_arr[j]);
						
						System.out.println("\n\nGUESS THE WORD");
						char input=sc.next().charAt(0);
						for(int j=0;j<length;j++)
						{
							if(input==word_arr[j])
								result_arr[j]=input;
						}
						life--;
				}
				else
				{
					System.out.println("YOU WON");
					for(int j=0;j<length;j++)
						System.out.print(" "+result_arr[j]);
					flag=1;
					break;
				}	
			}
		if(flag==1)
			break;
		if(life<=0)
			flag1=1;

		}while(life>0);
		
		if(flag1==1)
		System.out.println("\n\nGAME OVER, OUT OF LIFES :(");
	}
}
