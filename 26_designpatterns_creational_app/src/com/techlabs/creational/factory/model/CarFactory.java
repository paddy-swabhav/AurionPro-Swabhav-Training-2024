package com.techlabs.creational.factory.model;

public class CarFactory {
	
	public static Icar makeCar(CarName carName)
	{
		Icar car = null;
		
		if(carName.equals(CarName.Maruti))
			car = new Maruti();
		if(carName.equals(CarName.Tata))
			car = new Tata();
		if(carName.equals(CarName.Mahindra))
			car = new Mahindra();
		
		return car;
	
	}
}
