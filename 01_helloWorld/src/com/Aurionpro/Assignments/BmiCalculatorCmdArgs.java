//Write a program that calculates the Body 
//Mass Index (BMI) based on user input for weight (in kilograms) and height (in meters).

/*
Formula: weight (kg) / [height (m)]2
Example: Weight = 68 kg, Height = 165 cm (1.65 m)
Calculation: 68 ÷ (1.65)2 = 24.98 */

package com.Aurionpro.Assignments;

import java.util.*;

public class BmiCalculatorCmdArgs {
	public static void main(String[] args) {
		System.out.println("BODY MASS INDEX CALCULATOR");
		
		float weight=Float.parseFloat(args[0]);
		
		float height =Float.parseFloat(args[1]);
	
		float bmi= (float) (weight/(Math.pow(height, 2)));
		
		System.out.println("THEE BODY MASS INDEX IS: "+ String.format("%.2f", bmi));
	}
}
