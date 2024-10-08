package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exceptions.AgeNotValidException;
import com.techlabs.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		Voter voter=null;
		try
		{
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER VOTER ID: ");
		int voter_id=scanner.nextInt();
		System.out.println("ENTER FIRST NAME: ");
		String first_name= scanner.next();
		System.out.println("ENTER LAST NAME:");
		String last_name=scanner.next();
		System.out.println("ENTER AGE: ");
		int age=scanner.nextInt();
		
		voter = new Voter(voter_id,first_name,last_name,age);
		
		System.out.println(voter);
		}
		catch(AgeNotValidException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(voter);
	}

}
