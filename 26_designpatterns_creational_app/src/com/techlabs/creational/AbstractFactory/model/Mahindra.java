package com.techlabs.creational.AbstractFactory.model;

public class Mahindra implements Icar{
	
	@Override
	public void start() {
		System.out.println("MAHINDRA START");
	}

	@Override
	public void stop() {
		System.out.println("MAHINDRA STOPS");
	}


}
