package com.techlabs.model;

public class Computer {

	private String name;
	private Harddisk harddisk;
	
	public Computer()
	{
		System.out.println("In comp cons");
	}
	
	public Computer(String name, Harddisk harddisk) {
		super();
		this.name = name;
		this.harddisk = harddisk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name sett");
		this.name = name;
	}

	public Harddisk getHarddisk() {
		return harddisk;
	}

	public void setHarddisk(Harddisk harddisk) {
		System.out.println("harddisk settt");
		this.harddisk = harddisk;
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", harddisk=" + harddisk + "]";
	}
	
	
	
}
