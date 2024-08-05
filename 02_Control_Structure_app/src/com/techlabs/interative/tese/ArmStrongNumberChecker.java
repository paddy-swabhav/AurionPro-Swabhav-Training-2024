package com.techlabs.interative.tese;
import java.util.*;

public class ArmStrongNumberChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER : ");
		int number=sc.nextInt();
		int sum=0,pow=0;
		int temp=number;
		while(number>0)
		{
			pow++;
			number=number/10;
		}
		number=temp;
		while(number>0)
		{
			int rem=number%10;
			sum=sum+(int)(Math.pow(rem, pow));
			number=number/10;
		}
		if(sum==temp)
		{
			System.out.println("THE NUMBER IS ARMSTRONG: "+temp);
		}
		else
			System.out.println("NOT AN ARMSTRONG");
		
	}

}
