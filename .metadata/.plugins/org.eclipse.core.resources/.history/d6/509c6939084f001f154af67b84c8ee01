package com.techlabs.creational.factory.test;

import com.techlabs.creational.factory.model.CarFactory;
import com.techlabs.creational.factory.model.CarName;
import com.techlabs.creational.factory.model.Icar;

public class CarTest {

	public static void main(String[] args) {

		Icar car;
		
		car= CarFactory.makeCar(CarName.Maruti);
		car.start();
		car.stop();
		
		car= CarFactory.makeCar(CarName.Tata);
		car.start();
		car.stop();
		
		car= CarFactory.makeCar(CarName.Mahindra);
		car.start();
		car.stop();
	}

}
