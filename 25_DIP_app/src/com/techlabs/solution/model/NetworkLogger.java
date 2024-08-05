package com.techlabs.solution.model;

public class NetworkLogger implements ILogger{
	
	public void log(String err)
	{
		System.out.println("LOGGED TO NETWORK "+err);
	}
}
