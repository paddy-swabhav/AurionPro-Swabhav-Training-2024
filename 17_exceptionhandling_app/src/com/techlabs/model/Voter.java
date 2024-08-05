package com.techlabs.model;

import com.techlabs.exceptions.AgeNotValidException;

public class Voter {
	private int voter_id;
	private String first_name;
	private String lat_name;
	private int age;
	public Voter(int voter_id, String first_name, String lat_name, int age) {
		super();
		this.voter_id = voter_id;
		this.first_name = first_name;
		this.lat_name = lat_name;
			
		if(age<18)
			throw new AgeNotValidException(age);
		this.age = age;
		
	}
	public int getVoter_id() {
		return voter_id;
	}
	public void setVoter_id(int voter_id) {
		this.voter_id = voter_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLat_name() {
		return lat_name;
	}
	public void setLat_name(String lat_name) {
		this.lat_name = lat_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age<18)
			throw new AgeNotValidException(age);
		this.age = age;
	}
	@Override
	public String toString() {
		return "Voter [voter_id=" + voter_id + ", first_name=" + first_name + ", lat_name=" + lat_name + ", age=" + age
				+ "]";
	}
	
	
}
