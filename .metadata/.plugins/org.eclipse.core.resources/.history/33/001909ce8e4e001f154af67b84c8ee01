package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Country;
import com.techlabs.model.Region;

public class Tester {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		List<Region> regions= Arrays.asList(
										new Region(1, "Europe"),
										new Region(2, "Americas"),
										new Region(3, "Asia"),
										new Region(4, "Middle East and Africa")
										);
		
		List<Country> countries = Arrays.asList(
										new Country("IT", "Italy", 1),
										new Country("JP", "Japan", 3),
										new Country("US", "United States of America", 2),
										new Country("CA", "Canada", 2),
										new Country("CN", "China", 3),
										new Country("IN", "India", 3),
										new Country("AU", "Australia", 3),
										new Country("ZW", "Zimbabwe",4),
										new Country("SG", "Singapore", 3),
										new Country("UK", "United Kingdom", 1),
										new Country("FR", "France", 1),
										new Country("DE", "Germany", 1),
										new Country("ZM", "Zambia", 4),
										new Country("EG", "Egypt", 4),
										new Country("BR", "Brazil", 2),
										new Country("CH", "Switzerland", 1),
										new Country("NL", "Netherlands", 1),
										new Country("MX", "Mexico", 2),
										new Country("KW", "Kuwait", 4),
										new Country("IL", "Israel", 4),
										new Country("DK", "Denmark", 1),
										new Country("HK", "HongKong", 3),
										new Country("NG", "Nigeria", 4),
										new Country("AR", "Argentina", 2),
										new Country("BE", "Belgium", 1)
										);
		
		//GET NAME OF COUNTRY BY COUNTRY CODE
		getCountryFromCountryCode(countries,scanner);
		
		//Get all countries in a region by region id
		getCountriesInRegionByRegionId(countries, regions, scanner);
		
		//find count of countries in each region
		getCountOfCountriesInEachRegion(countries, regions);
		
		
										
										

	}


	public static void getCountryFromCountryCode(List<Country> countries, Scanner scanner)
	{
		System.out.println("************************* GET NAME OF COUNTRY BY COUNTRY CODE ************************ ");
		System.out.println("ENTER THE COUNTRY CODE: ");
		String country_code= scanner.next();
		countries.stream()
					.filter((country)->country.getCountry_code().equalsIgnoreCase(country_code))
					.forEach((country)->System.out.println(country));
	}
	
	
	private static void getCountriesInRegionByRegionId(List<Country> countries, List<Region> regions, Scanner scanner) 
	{
		System.out.println("\n************************* GET ALL COUNTRIES IN A REGION BY REGION ID ************************ ");
		System.out.println("ENTER THE REGION ID: ");
		int region_id = scanner.nextInt();
		regions.stream()
					.filter((region)->region.getRegionId()==region_id)
					.forEach((region)->System.out.println("Countries in Region "+region.getRegionId()+" "+region.getRegion()));
		countries.stream()
					.filter((country)->country.getRegion()==region_id)
					.forEach((country)->System.out.println(country));
	}
	
	private static void getCountOfCountriesInEachRegion(List<Country> countries, List<Region> regions) {
		System.out.println("************************** GET ALL COUNTRIES COUNT IN EACH REGION *************************");
		regions.stream()
				.forEach((region)->{
					System.out.println("\n\nCOUNT OF COUNTRIES IN REGION: "+region+"IS : ");
					int region_id = region.getRegionId();
					int count = (int) countries.stream()
								.filter((country)->country.getRegion()==region_id)
								.count();
					System.out.print(count);
				});
		
	}

}
