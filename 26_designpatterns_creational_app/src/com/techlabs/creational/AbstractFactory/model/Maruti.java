package com.techlabs.creational.AbstractFactory.model;

public class Maruti implements Icar{

	@Override
	public void start() {
		System.out.println("MARUTI START");
	}

	@Override
	public void stop() {
		System.out.println("MARUTI STOPS");
	}

}
