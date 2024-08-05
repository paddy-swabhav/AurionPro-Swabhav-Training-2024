package com.techlabs.creational.factory.model;

public class Tata implements Icar{
	
	@Override
	public void start() {
		System.out.println("TATA START");
	}

	@Override
	public void stop() {
		System.out.println("TATA STOPS");
	}


}
