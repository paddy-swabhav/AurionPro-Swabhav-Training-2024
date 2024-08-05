package com.techlabs.model;

public class BoxWeight extends Box{
	private int weight;
	
	public BoxWeight(int weight, int width,int depth, int height)
	{
		super(width,depth,height);
		this.weight=weight;
	}

	@Override
	public String toString() {
		return "BoxWeight [weight=" + weight + ", Width=" + getWidth() + ", Depth=" + getDepth()
				+ ", Height=" + getHeight()+ "]" ;
	}

	
}
