package com.aurionpro.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	private List<Guitar> guitars;
	
	public Inventory() {
		guitars=new LinkedList<Guitar>();
	}
	
	public void addGuitar(String serialNumber, double price,Builder builder, String model, Type type, Wood backWood, Wood topWod,String numString) {
		
		guitars.add(new Guitar( serialNumber,  price, builder,  model,  type,  backWood,  topWod, numString));
	}
	
	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		guitars.add(new Guitar(serialNumber, price, spec));
	}

	
	public Guitar getGuitar(String serialNumber) {
		for(Guitar guitar : guitars) {
			if(guitar.getSerialNumber().toLowerCase().equals(serialNumber.toLowerCase())) {
				return guitar;
			}
		}
		
		return null;
	}
	
	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars = new LinkedList<>();
		for (Guitar guitar : guitars) {
			if (matches(searchSpec, guitar.getSpec())) {
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}

	public boolean matches(GuitarSpec searchSpec, GuitarSpec guitarSpec) {
		if (searchSpec.getBuilder() != guitarSpec.getBuilder())
			return false;
		if ((searchSpec.getModel() != null) && (!searchSpec.getModel().equals("")) &&
			(!searchSpec.getModel().toLowerCase().equals(guitarSpec.getModel().toLowerCase())))
			return false;
		if (searchSpec.getType() != guitarSpec.getType())
			return false;
		if (!searchSpec.getNumString().equals(guitarSpec.getNumString()))
			return false;
		if (searchSpec.getBackWood() != guitarSpec.getBackWood())
			return false;
		if (searchSpec.getTopWod() != guitarSpec.getTopWod())
			return false;
		return true;
	}
}
