package com.techlabs.creational.AbstractFactory.model;

public class MahindraFactory implements IcarFactory{

	@Override
	public Icar makeCar() {
		// TODO Auto-generated method stub
		return new Mahindra();
	}

}
