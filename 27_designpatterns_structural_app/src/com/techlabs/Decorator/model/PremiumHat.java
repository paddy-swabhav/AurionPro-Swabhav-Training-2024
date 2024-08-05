package com.techlabs.Decorator.model;

public class PremiumHat implements IHat{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Straw Hat";
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "2000";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Premium";
	}

	@Override
	public String toString() {
		return "StandardHat [getName()=" + getName() + ", getPrice()=" + getPrice() + ", getDescription()="
				+ getDescription() + "]";
	}
}
