package com.techlabs.Decorator.test;

import com.techlabs.Decorator.model.GoldenHat;
import com.techlabs.Decorator.model.IHat;
import com.techlabs.Decorator.model.PremiumHat;
import com.techlabs.Decorator.model.RibbonedHat;
import com.techlabs.Decorator.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {

		IHat hat = new StandardHat();
		hat.getName();
		hat.getPrice();
		hat.getDescription();
		System.out.println("STANDARD HAT WITH NO FEATURE:\n"+hat);
		
		IHat standardGoldHat = new GoldenHat(hat);
		standardGoldHat.getDescription();
		standardGoldHat.getName();
		standardGoldHat.getPrice();
		System.out.println("\nSTANDARD HAT WITH GOLDEN:\n"+standardGoldHat);
		
		IHat standardRibbonedHat = new RibbonedHat(hat);
		standardRibbonedHat.getDescription();
		standardRibbonedHat.getName();
		standardRibbonedHat.getPrice();
		System.out.println("\nSTANDARD HAT WITH GOLDEN:\n"+standardRibbonedHat);
		
		IHat hat1 = new PremiumHat();
		hat1.getName();
		hat1.getPrice();
		hat1.getDescription();
		System.out.println("\n\nPREMIUM HAT WITH NO FEATURE:\n"+hat1);
		
		IHat premiumGoldHat = new GoldenHat(hat1);
		premiumGoldHat.getDescription();
		premiumGoldHat.getName();
		premiumGoldHat.getPrice();
		System.out.println("\nPREMIUM HAT WITH GOLDEN:\n"+premiumGoldHat);
		
		IHat premiumRibbonedHat = new RibbonedHat(hat1);
		premiumRibbonedHat.getDescription();
		premiumRibbonedHat.getName();
		premiumRibbonedHat.getPrice();
		System.out.println("\nPREMIUM HAT WITH GOLDEN:\n"+premiumRibbonedHat);
		
	}

}
