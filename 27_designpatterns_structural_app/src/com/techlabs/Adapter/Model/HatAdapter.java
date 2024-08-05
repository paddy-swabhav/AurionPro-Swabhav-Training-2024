package com.techlabs.Adapter.Model;

public class HatAdapter implements IItems{	
	Hat hat;
	
	public HatAdapter(Hat hat) {
		this.hat=hat;
	}

	@Override
	public String getItemName() {
		return this.hat.getShortName()+" "+this.hat.getLongName();
	}

	@Override
	public double getItemPrice() {
		return (this.hat.getBasePrice()+this.hat.getTax());
		
	}

	@Override
	public String toString() {
		return "HatAdapter [hat=" + hat + "]";
	}
	
	
}
