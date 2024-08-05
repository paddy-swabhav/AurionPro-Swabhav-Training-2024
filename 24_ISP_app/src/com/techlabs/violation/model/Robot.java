package com.techlabs.violation.model;

public class Robot implements IWorker{
	
	@Override
	public void startWork() {
		System.out.println("ROBOT START");
	}

	@Override
	public void stopWork() {
		System.out.println("ROBOT STOP");		
	}

	@Override
	public void eat() {
		System.out.println("ROBOT EAT");
	}

	@Override
	public void drink() {
		System.out.println("ROBOT DRINK");
	}
	

}
