package com.techlabs.Decorator.model;

public class OilChange extends CarServiceDecorator{

	public OilChange(IcarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost()+500;
	}

	
}
