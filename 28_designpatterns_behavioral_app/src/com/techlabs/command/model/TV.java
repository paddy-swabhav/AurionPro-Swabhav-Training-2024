package com.techlabs.command.model;

public class TV implements IDevice{

	@Override
    public void turnOn() {
        System.out.println("TV is now on");
    }
 
    @Override
    public void turnOff() {
        System.out.println("TV is now off");
    }
 
    public void changeChannel() {
        System.out.println("Channel changed");
    }
}
