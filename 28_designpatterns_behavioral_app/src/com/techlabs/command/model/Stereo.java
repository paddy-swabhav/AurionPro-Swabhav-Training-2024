package com.techlabs.command.model;

public class Stereo implements IDevice{

	 @Override
	    public void turnOn() {
	        System.out.println("Stereo is now on");
	    }
	 
	    @Override
	    public void turnOff() {
	        System.out.println("Stereo is now off");
	    }
	 
	    public void adjustVolume() {
	        System.out.println("Volume adjusted");
	    }
}
