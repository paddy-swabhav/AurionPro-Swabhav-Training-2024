package com.techlabs.solution.model;

public class Labour implements ILabour{

	@Override
	public void startWork() {
		System.out.println("LABOUR START");
	}

	@Override
	public void stopWork() {
		System.out.println("LABOUR STOP");		
	}

	@Override
	public void eat() {
		System.out.println("LABOUR EAT");
	}

	@Override
	public void drink() {
		System.out.println("LABOUR DRINK");
	}
	
}
