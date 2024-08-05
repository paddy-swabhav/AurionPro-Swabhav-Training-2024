package com.techlabs.state.model;

public class Shipped implements IPacketState{

	@Override
	public void next(Packet packet) {
		packet.setState(new Delivered());
		System.out.println("PACKET MOVED TO DELIVERED STATE");
		
	}

	@Override
	public void previous(Packet packet) {
		packet.setState(new Ordered());
		System.out.println("PACKET MOVED TO Ordered STATE");
		
	}

	@Override
	public void current(Packet packet) {
		
		System.out.println("YOUR PACKET IS IN SHIPPED STATE");
	}

}
