package com.techlabs.state.model;

public class Packet {
	IPacketState state;
	
	
	
	public IPacketState getState() {
		return state;
	}

	public void setState(IPacketState state) {
		this.state = state;
	}

	public Packet(IPacketState state) {
		super();
		this.state = state;
	}

	public void nextState()
	{
		state.next(this);
	}
	
	public void previousState()
	{
		state.previous(this);;
	}
	
	public void printStatus()
	{
		state.current(this);;
	}

}
