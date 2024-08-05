package com.techlabs.interative.tese;
import java.util.*;

public class SumOfDigitOfNumberCalculator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int sum=0;
		while(number>0)
		{
			sum=sum+number%10;
			number=number/10;
		}
		System.out.println("SUM OF THE NUMBER IS:\t"+sum);
	scanner.close();			
	}

}
