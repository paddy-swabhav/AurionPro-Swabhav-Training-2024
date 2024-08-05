package com.techlabs.Decorator.model;

public abstract class  CarServiceDecorator implements IcarService{
	
	private IcarService carObj;

	public CarServiceDecorator(IcarService carObj) {
		super();
		this.carObj = carObj;
	}
	
	public double getCost()
	{
		return carObj.getCost();
	}

}
