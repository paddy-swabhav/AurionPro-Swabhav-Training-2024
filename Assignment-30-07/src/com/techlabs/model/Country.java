package com.techlabs.model;

public class Country {
	
	private String country_code;
	private String country;
	private int region;
	
	public Country(String country_code, String country, int region) {
		super();
		this.country_code = country_code;
		this.country = country;
		this.region = region;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getRegion() {
		return region;
	}

	public void setRegion(int region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Country [country_code=" + country_code + ", Country=" + country + ", region=" + region + "]";
	}
	
	

}
