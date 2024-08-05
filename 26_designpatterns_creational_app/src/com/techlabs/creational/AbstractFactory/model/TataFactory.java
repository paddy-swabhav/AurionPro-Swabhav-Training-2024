package com.techlabs.creational.AbstractFactory.model;

public class TataFactory implements IcarFactory{

	@Override
	public Icar makeCar() {
		// TODO Auto-generated method stub
		return new Tata();
	}
	

}
