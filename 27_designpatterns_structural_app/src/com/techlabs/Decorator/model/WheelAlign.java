package com.techlabs.Decorator.model;

public class WheelAlign extends CarServiceDecorator{

	public WheelAlign(IcarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost()+600;
	}

}
