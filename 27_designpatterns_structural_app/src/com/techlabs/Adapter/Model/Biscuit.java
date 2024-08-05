package com.techlabs.Adapter.Model;

public class Biscuit implements IItems{

	private String name;
	private double price;
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Biscuit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getItemName() {
		return name;
	}

	@Override
	public double getItemPrice() {
		return price;
		
	}

	@Override
	public String toString() {
		return "Biscuit [name=" + name + ", price=" + price + "]";
	}
	
	
	

}
