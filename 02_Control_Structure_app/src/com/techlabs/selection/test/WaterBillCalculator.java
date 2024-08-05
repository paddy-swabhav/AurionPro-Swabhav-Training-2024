////noofunits
//meter charged


package com.techlabs.selection.test;
import java.util.*;

public class WaterBillCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int meter_charge=75, units,charge;
		System.out.println("Enter Number of units consumed: ");
		units=sc.nextInt();
		
		if(units<=100)
		{
			charge=units*5;
		}
		else if(units<=250)
		{
			units=units-100;
			charge=(units*10)+(100*5);
		}
		else
		{
			units=units-250;
			charge=(units*20)+(100*5)+(150*10);
			
		}
		int water_bill=charge+meter_charge;
		System.out.println("\n The Water Bill is : "+water_bill+" Rs");
		sc.close();
	}

}
