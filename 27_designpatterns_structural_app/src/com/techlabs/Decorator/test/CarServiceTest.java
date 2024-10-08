package com.techlabs.Decorator.test;

import com.techlabs.Decorator.model.CarInspection;
import com.techlabs.Decorator.model.IcarService;
import com.techlabs.Decorator.model.OilChange;
import com.techlabs.Decorator.model.WheelAlign;

public class CarServiceTest {

	public static void main(String[] args) {
		IcarService car= new CarInspection();
		
		System.out.println(car.getCost());
		
		IcarService oilchangecar= new OilChange(car);
		System.out.println("\n"+oilchangecar.getCost());
		
		IcarService wheelaligncar= new WheelAlign(car);
		System.out.println("\n"+wheelaligncar.getCost());
		

	}

}
