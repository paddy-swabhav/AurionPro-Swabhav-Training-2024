package com.techlabs.model;

public class PlayerApp {
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int numberOfWickets;
	private float average;
	
	public PlayerApp()
	{
		playerId=01;
		name="Ganguli";
		numberOfMatches=10;
		runs=500;
		numberOfWickets=7;
		average=50;
	}
	
	public PlayerApp(int playerId,String name,int numberOfMatches,int runs,int numberOfWickets)
	{
		this.playerId=playerId;
		this.name=name;
		this.numberOfMatches=numberOfMatches;
		this.runs=runs;
		this.numberOfWickets=numberOfWickets;
		this.average=average;
	}
	
	public void setPlayerId(int playerId)
	{
		this.playerId=playerId;
	}
	public int getPlayerId()
	{
		return playerId;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	
	public void setNumberOfMatches(int numberOfMatches)
	{
		this.numberOfMatches=numberOfMatches;
	}
	public int getNumberOfMatches()
	{
		return numberOfMatches;
	}
	
	public void setNumberOfWickets(int numberOfWickets)
	{
		this.numberOfWickets=numberOfWickets;
	}
	public int getNumberOfWickets()
	{
		return numberOfWickets;
	}
	
	public void setRun(int runs)
	{
		this.runs=runs;
	}
	public int getRun()
	{
		return runs;
	}
	
	public void setAverage(float average)
	{
		this.average=average;
	}
	public float getAverage()
	{
		return average;
	}
	
	public void display()
	{
		System.out.println("  PLAYER DETAILS");
		System.out.println("  ID: "+playerId);

		System.out.println("  NAME: "+name);
		
		System.out.println("  RUNS: "+runs);

		System.out.println("  NUMBER OF MATCHES: "+numberOfMatches);

		System.out.println("  NUMBER OF WICKETS: "+numberOfWickets);
	}
	
	public float CalculateAverage()
	{
		float average=runs/numberOfMatches;
		return average;
		
	}
}
