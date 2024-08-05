package com.techlabs.state.test;

import com.techlabs.state.model.Ordered;
import com.techlabs.state.model.Packet;

public class PacketTest {

	public static void main(String[] args) {
		
		Packet packet = new Packet(new Ordered());
		
		packet.printStatus();
		
		packet.nextState();
		packet.printStatus();
		
		packet.nextState();
		packet.printStatus();
		
		packet.nextState();
		
		packet.previousState();
		packet.previousState();
		packet.printStatus();
		packet.previousState();


	}

}
