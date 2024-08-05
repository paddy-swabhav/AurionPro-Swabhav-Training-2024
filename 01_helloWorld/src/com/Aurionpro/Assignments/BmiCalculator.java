//Write a program that calculates the Body 
//Mass Index (BMI) based on user input for weight (in kilograms) and height (in meters).
// USING SCANNEr
/*
Formula: weight (kg) / [height (m)]2

With the metric system, the formula for BMI is weight in kilograms divided by 
height in meters squared. Because height is commonly measured in centimeters, 
divide height in centimeters by 100 to obtain height in meters.

Example: Weight = 68 kg, Height = 165 cm (1.65 m)
Calculation: 68 ÷ (1.65)2 = 24.98 */

package com.Aurionpro.Assignments;
import java.util.*;


public class BmiCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("BODY MASS INDEX CALCULATOR");
		
		System.out.println("\n Enter your weight in kilograms(kg): ");
		float weight=sc.nextFloat();
		
		System.out.println("\n Enter your height in Meters(m): ");
		float height = sc.nextFloat();
	
		float bmi= (float) (weight/(Math.pow(height, 2)));
		
		System.out.println("THEE BODY MASS INDEX IS: "+ String.format("%.2f", bmi));
	}

}
