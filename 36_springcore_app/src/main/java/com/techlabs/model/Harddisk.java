package com.techlabs.model;

public class Harddisk {

	private int capacity;

	public Harddisk()
	{
		System.out.println("INSIDE CONSTRUCTOR");
	}
	
	public Harddisk(int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		System.out.println("INSIDE SETTER");
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Harddisk [capacity=" + capacity + "]";
	}
	
	
	
}
