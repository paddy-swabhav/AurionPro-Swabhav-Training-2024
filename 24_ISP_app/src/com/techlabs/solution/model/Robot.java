package com.techlabs.solution.model;

public class Robot implements IWorker{
	
	@Override
	public void startWork() {
		System.out.println("ROBOT START");
	}

	@Override
	public void stopWork() {
		System.out.println("ROBOT STOP");		
	}
	

}
