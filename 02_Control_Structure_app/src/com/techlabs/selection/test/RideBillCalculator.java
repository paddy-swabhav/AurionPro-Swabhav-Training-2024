package com.techlabs.selection.test;
import java.util.*;

public class RideBillCalculator {
	Scanner scanner= new Scanner(System.in);
	double height;
	int age, bill;
	String photos;
	
	public String photocheck()
	{
		System.out.println("IF YOU WANT PHOTOS, ENTER: YES\n IF YOU DONT WANT, ENTER: ");
		photos=scanner.next();
		return photos;
	}
	
	public void ridebill()
	{
		
		System.out.println("ENTER YOUR HEIGHT IN CENTIMETERS(CM): ");
		height=scanner.nextDouble();
		
		if(height<120)
		System.out.println("YOU CANNOT RIDE, YOUR HEIGHT IS SHORT");
		else
		{
			System.out.println("\n\n ENTER YOUR AGE PLEASE: ");
			age=scanner.nextInt();
			
			if(age<12)
			{
				
				bill=5;
				String photo=photocheck();
				if(photo.equalsIgnoreCase("yes"))
					bill +=3;
				System.out.println("YOUR TOTAL BILL IS: "+bill+" $");
				
			}
			else if(age>12 && age<18)
				{
					bill=7;
					String photo=photocheck();
					if(photo.equalsIgnoreCase("yes"))
						bill +=3;
					System.out.println("YOUR TOTAL BILL IS: "+bill+" $");
				}
			else if(age>=18 && age<45)
				{
					bill=12;
					String photo=photocheck();
					if(photo.equalsIgnoreCase("yes"))
						bill +=3;
					System.out.println("YOUR TOTAL BILL IS: "+bill+" $");
				}
			else if(age>=45 && age<=55)
				{
					bill=0;
					String photo=photocheck();
					if(photo.equalsIgnoreCase("yes"))
						bill +=3;
					System.out.println("YOUR TOTAL BILL IS: "+bill+" $");
				}
			else
				//Assuming younger than 12 and older than 55 are not allowed
				System.out.println("YOU CANNOT RIDE, YOUR AGE DOESNT STATISFY OUR CONDITIONS");
			
		}
	}
	
	public static void main(String[] args) {
		RideBillCalculator ride=new RideBillCalculator();
		ride.ridebill();
	}

}
