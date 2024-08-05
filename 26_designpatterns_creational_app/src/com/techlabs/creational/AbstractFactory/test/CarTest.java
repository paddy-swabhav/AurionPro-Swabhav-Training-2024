package com.techlabs.creational.AbstractFactory.test;

import com.techlabs.creational.AbstractFactory.model.Icar;
import com.techlabs.creational.AbstractFactory.model.IcarFactory;
import com.techlabs.creational.AbstractFactory.model.MahindraFactory;
import com.techlabs.creational.AbstractFactory.model.MarutiFactory;
import com.techlabs.creational.AbstractFactory.model.TataFactory;


public class CarTest {

	public static void main(String[] args) {

		
		Icar car;
		
		IcarFactory marutiFactory = new MarutiFactory();
		car= marutiFactory.makeCar();
		car.start();
		car.stop();
		
		IcarFactory TataFactory = new TataFactory();
		car= TataFactory.makeCar();
		car.start();
		car.stop();
		
		IcarFactory mahindraFactory = new MahindraFactory();
		car= mahindraFactory.makeCar();
		car.start();
		car.stop();
	}

}
