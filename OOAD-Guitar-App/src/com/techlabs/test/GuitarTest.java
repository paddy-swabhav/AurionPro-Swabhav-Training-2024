package com.techlabs.test;

import java.util.List;

import com.aurionpro.model.Builder;
import com.aurionpro.model.Guitar;
import com.aurionpro.model.GuitarSpec;
import com.aurionpro.model.Inventory;
import com.aurionpro.model.Type;
import com.aurionpro.model.Wood;

public class GuitarTest {

	public static void main(String[] args) {
		// Set up Rick's guitar inventory
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatErinLikes = 
		    new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,
		                   Wood.ALDER, Wood.ALDER, "12");

		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Guitar guitar : matchingGuitars) {
				GuitarSpec spec = guitar.getSpec();
				System.out.println("  We have a " +
				    spec.getBuilder() + " " + spec.getModel() + " " +
				    spec.getType() + " guitar:\n     " +
				    spec.getBackWood() + " back and sides,\n     " +
				    spec.getTopWod() + " top.\n  You can have it for only $" +
				    guitar.getPrice() + "!\n  ----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95, Builder.COLLINGS, "CJ", Type.ACOUSTIC,
		                   Wood.INDIAN_ROSEWOOD, Wood.SITKA, "6");
		inventory.addGuitar("V95693", 1499.95,Builder.FENDER, "Stratocastor", Type.ELECTRIC,
		                   Wood.ALDER, Wood.ALDER, "12");
		inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
		                   Wood.ALDER, Wood.ALDER, "12");
		inventory.addGuitar("122784", 5495.95,Builder.MARTIN, "D-18", Type.ACOUSTIC,
		                   Wood.MAHOGANY, Wood.ADIRONDACK, "6");
		
		
		inventory.addGuitar("566-62", 8999.95, 
			    new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC,
			                   Wood.COCOBOLO, Wood.CEDAR, "12"));
	}
}
