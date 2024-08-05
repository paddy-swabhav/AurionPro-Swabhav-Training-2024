package com.techlabs.state.model;

public class Ordered implements IPacketState{

	@Override
	public void next(Packet packet) {
		packet.setState(new Shipped());
		System.out.println("PACKET MOVED TO SHIPPED STATE");
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("YOUR PACKET IS ALREADY ORDERED");
	}

	@Override
	public void current(Packet packet) {
		
		System.out.println("PACKET IS IN ORDERED STATE");
		
	}

}
