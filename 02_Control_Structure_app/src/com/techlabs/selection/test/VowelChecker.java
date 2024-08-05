package com.techlabs.selection.test;
import java.util.*;
public class VowelChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		 case 'a':
		 case 'e':
		 case 'i':
		 case 'o':
		 case 'u':
		 default:
			 System.out.println("Not a Vowel");
		 	
		}
	
	}

}
