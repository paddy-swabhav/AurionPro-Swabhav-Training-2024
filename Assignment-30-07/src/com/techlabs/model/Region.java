package com.techlabs.model;

public class Region {
	
	private int region_id;
	private String region;
	
	public Region(int key, String region) {
		super();
		this.region_id = key;
		this.region = region;
	}

	public int getRegionId() {
		return region_id;
	}

	public void setRegionId(int key) {
		this.region_id = key;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Region [key=" + region_id + ", region=" + region + "]";
	}
	
	
	
}
