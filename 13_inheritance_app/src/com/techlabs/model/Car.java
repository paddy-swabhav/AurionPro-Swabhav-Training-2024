package com.techlabs.model;

public class Car extends FourWheeler{
	private float price;
	public Car(float price,int milegae, String company_name) {
		super(milegae, company_name);
		this.price=price;
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "Car \nprice(In Lakhs)=" + price + "lakhs Rs,\n Company Name=" + getCompany_name() + ",\n Mileage ="+getMileage();
	}
	
	


	
}
