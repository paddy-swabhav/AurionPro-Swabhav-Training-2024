package com.techlabs.selection.test;
import java.util.*;
public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        switch(choice)
        {
        case 1:{
        	temperature=(9/5)*temperature + 32;
        	System.out.println("The temperature is: "+temperature+" Fahrenheit");
        	break;
        	}
        case 2:{
        	temperature=(temperature-32) * (5/9);
        	System.out.println("The temperature is: "+temperature+" Celsius");
        	break;
        	}
        case 3:{
        	temperature=temperature + 273.15;
        	System.out.println("The temperature is: "+temperature+" kelvin");
        	break;
        	}
        case 4:{
        	temperature=temperature - 273.15;
        	System.out.println("The temperature is: "+temperature+" Celsius");
        	break;
        	}
        case 5:{
        	temperature=(temperature- 2)*(5/9) + 273.15;
        	System.out.println("The temperature is: "+temperature+" Kelvin");
        	break;
        	}
        case 6:{
        	temperature= (temperature-273.15)*(9/5) + 32;
        	System.out.println("The temperature is: "+temperature+" Fah");
        	break;
        	}
        default:
        	System.out.println("Wrong choice");
        	break; 	

	}
        scanner.close();
    }

}
