package com.aurionpro.model;

public class Guitar {
	
	private String serialNumber;
	private double price;
	private GuitarSpec spec;
	public Guitar(String serialNumber, double price,Builder builder, String model, Type type, Wood backWood, Wood topWod,String numString) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = new GuitarSpec( builder,  model,  type,  backWood,  topWod,numString);
	}
	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public GuitarSpec getSpec() {
		return spec;
	}
	public void setSpec(GuitarSpec spec) {
		this.spec = spec;
	}
	
	
	
	

}
