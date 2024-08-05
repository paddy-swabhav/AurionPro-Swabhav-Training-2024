package com.techlabs.Decorator.model;

public class RibbonedHat extends HatDecorator{

	public RibbonedHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName();
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		int price = Integer.parseInt(hat.getPrice())+1000;
		return Integer.toString(price);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getDescription()+"--RibbonedHat";
	}

	@Override
	public String toString() {
		return "StandardHat [getName()=" + getName() + ", getPrice()=" + getPrice() + ", getDescription()="
				+ getDescription() + "]";
	}
}
