package com.techlabs.list.model;

public class Car {
	private int car_id;
	private String Company;
	private long price;
	private int mileage;
	
	public Car(int car_id, String company, long price, int mileage) {
		super();
		this.car_id = car_id;
		Company = company;
		this.price = price;
		this.mileage = mileage;
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [car_id=" + car_id + ", Company=" + Company + ", price=" + price + ", mileage=" + mileage + "]";
	}
	
}
