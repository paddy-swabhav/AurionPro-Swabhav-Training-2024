package com.aurionpro.model;

public class GuitarSpec {
	
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWod;
	private String numString;
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWod, String numString) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWod = topWod;
		this.numString=numString;
	}
	public String getNumString() {
		return numString;
	}
	public void setNumString(String numString) {
		this.numString = numString;
	}
	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	public Wood getTopWod() {
		return topWod;
	}
	public void setTopWod(Wood topWod) {
		this.topWod = topWod;
	}
	
	

}
