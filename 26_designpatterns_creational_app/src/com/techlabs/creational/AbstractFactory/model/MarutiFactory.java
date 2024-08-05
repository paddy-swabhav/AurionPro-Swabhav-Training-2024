package com.techlabs.creational.AbstractFactory.model;

public class MarutiFactory implements IcarFactory{

	@Override
	public Icar makeCar() {

		return new Maruti();
		
	}

}
