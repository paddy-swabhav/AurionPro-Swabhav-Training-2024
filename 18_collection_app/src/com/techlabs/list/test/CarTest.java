package com.techlabs.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.list.model.Car;

public class CarTest {

	public static void main(String[] args) {

		List<Car> cars= new ArrayList<Car>();
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("ENTER NUMBER OF CARS YOU WANT: ");
		int no_of_cars= scanner.nextInt();
		
		readCars(scanner,cars,no_of_cars);
		displayCar(cars);
		
		System.out.println("\nCAR WITH MAXIMUM MILEAGE IS: \n");
		System.out.println(maximumMileageCar(cars));
	}

	private static void readCars(Scanner scanner,List<Car> cars,int no_of_cars)
	{
		System.out.println("ENTER CAR DETAILS");
		for(int i=0;i<no_of_cars;i++)
		{
			System.out.println("ENTER CAR ID: ");
			int carid=scanner.nextInt();
			System.out.println("ENTER COMPANY: ");
			String company=scanner.next();
			System.out.println("ENTER PRICE: ");
			long price=scanner.nextLong();
			System.out.println("ENTER MILEAGE: ");
			int mileage=scanner.nextInt();
			
			cars.add(new Car(carid,company,price,mileage));
		}
	}
	
	private static void displayCar(List<Car> cars)
	{
		System.out.println("THE LIST OF CARS IS");
		for(Car car:cars )
		{
			System.out.println(cars);
		}
	}
	
	private static Car maximumMileageCar(List<Car> cars)
	{
		Car maximum_mileage=cars.get(0);
		for(int i=0;i<cars.size();i++)
		{
			if(maximum_mileage.getMileage()<(cars.get(i).getMileage()))
				maximum_mileage=cars.get(i);
		}
		return maximum_mileage;
	}
}
