package com.techlabs.state.model;

public class Delivered implements IPacketState {

	@Override
	public void next(Packet packet) {
		System.out.println("PACKET IS ALREADY DELIVERED");
		
	}

	@Override
	public void previous(Packet packet) {
		packet.setState(new Shipped());
		System.out.println("PACKET MOVED TO SHIPPED STATE");
		
	}

	@Override
	public void current(Packet packet) {
		
		System.out.println("YOUR PACKET IS IN DELIVERED STATE");
	}

}
