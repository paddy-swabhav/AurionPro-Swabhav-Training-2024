package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.CricketPlayer;

public class CricketPlayerTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		CricketPlayer players[]= new CricketPlayer[11];
		
		for(int i=0;i<players.length;i++)
		{
		System.out.println("ENTER PLAYER DETAILS, FOR PLAYER "+(i+1));
		System.out.println("ENTER ID: ");
		int id= scanner.nextInt();
		System.out.println("ENTER NAME: ");
		String name=scanner.next();
		System.out.println("ENTER RUNS: ");
		int run=scanner.nextInt();
		System.out.println("ENTER NUMBER OF MATCHES: ");
		int numberOfMatches=scanner.nextInt();
		System.out.println("ENTER NUMBER OF WICKETS: ");
		int numberOfWickets=scanner.nextInt();
		
		players[i]=new CricketPlayer(id,name,numberOfMatches,run,numberOfWickets);
		//CricketPlayer cricketplayer= new CricketPlayer(id,name,numberOfMatches,run,numberOfWickets);
		}
//		cricketplayer.display();
//		System.out.println("AVERAGE: "+cricketplayer.CalculateAverage());
		for(int i=0;i<players.length;i++)
		{
			System.out.println("/n/nFOR PLAYER "+(i+1));
			players[i].display();
			System.out.println("AVERAGE: "+players[i].CalculateAverage());
		}
		
	}

}
