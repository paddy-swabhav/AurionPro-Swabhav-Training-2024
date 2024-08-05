package com.techlabs.solution.model;

public class DBLogger implements ILogger{

	public void log(String err)
	{
		System.out.println("LOGGED TO DATABASE "+err);
	}
}
