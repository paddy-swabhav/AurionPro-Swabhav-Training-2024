package com.techlabs.interative.tese;

public class SumOfEvenNUmbers {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<101)
		{
			if(i%2==0)
			sum=sum+i;
			i++;
		}
		System.out.println("SUM OF FIRST HUNDERED NUMBERS: "+sum);
	}

}
