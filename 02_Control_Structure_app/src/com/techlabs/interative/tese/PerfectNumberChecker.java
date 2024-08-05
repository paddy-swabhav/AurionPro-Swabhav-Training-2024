package com.techlabs.interative.tese;

import java.util.Scanner;

public class PerfectNumberChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER : ");
		int number=sc.nextInt();
		int i=1,sum=0;
		while(i<(number/2))
		{
			if(number%i==0)
				sum=sum+i;
			i++;
		}
		if(number==sum)
			System.out.println("NUMBER IS Perfect");
		else
			System.out.println("NUMBER IS NOT PERFECT");
	}

}
