package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.PlayerApp;

public class PlayerAppTest {
	
	public static PlayerApp getMaximumAveragePlayer(PlayerApp[] players)
	{
		if (players.length == 0) {
            return null;
        }
        PlayerApp maxAveragePlayer = players[0];
        for (int i = 1; i < players.length; i++) {
            if (players[i].getAverage() > maxAveragePlayer.getAverage()) {
                maxAveragePlayer = players[i];
            }
        }
        return maxAveragePlayer;
	}

	public static void displayPlayers(PlayerApp[] players) {
        // Sort players using bubble sort based on average
        for (int i = 0; i < players.length - 1; i++) {
            for (int j = 0; j < players.length - i - 1; j++) {
                if (players[j].getAverage() > players[j + 1].getAverage()) {
                    PlayerApp temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
        // Display sorted players
        for (int i=0;i<players.length;i++) {
            System.out.println("Player ID: " + players[i].getPlayerId());
            System.out.println("Name: " + players[i].getname());
            System.out.println("Matches: " + players[i].getNumberOfMatches());
            System.out.println("Runs: " + players[i].getRun());
            System.out.println("Wickets: " + players[i].getNumberOfWickets());
            System.out.println("Average: " + players[i].getAverage());
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		PlayerApp players[]= new PlayerApp[3];
		
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

		
		players[i]=new PlayerApp(id,name,numberOfMatches,run,numberOfWickets);
		}
		
		for(int i=0;i<players.length;i++)
		players[i].setAverage(players[i].CalculateAverage());
		
		PlayerApp maxAveragePlayer = getMaximumAveragePlayer(players);
        if (maxAveragePlayer != null) {
            System.out.println("\n\n PLAYER WITH MAXIMUM AVERGAE : ");
            System.out.println("\nPlayer ID: " + maxAveragePlayer.getPlayerId());
            System.out.println("Name: " + maxAveragePlayer.getname());
            System.out.println("Runs: " + maxAveragePlayer.getAverage());
            System.out.println("Matches: " + maxAveragePlayer.getNumberOfMatches());
            System.out.println("Wickets: " + maxAveragePlayer.getNumberOfWickets());
            System.out.println("Average: " + maxAveragePlayer.getAverage());
        } else {
            System.out.println("No accounts found.");
        }
        
        System.out.println("\n\nPLAYER DETAILS BY THE ASCENDING ORDER OF AVERGAE: \n");
        displayPlayers(players);
        
		scanner.close();
	}

}
