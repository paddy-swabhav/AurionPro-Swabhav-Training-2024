package com.techlabs.facade.model;

public class MovieFacade {
	
	
	public void watchMovie()
	{
	DvdPlayer dvdPlayer = new DvdPlayer();
	dvdPlayer.on();
	
	
	SoundSystem soundSystem = new SoundSystem();
	soundSystem.on();
	
	
	Projector projector = new Projector();
	projector.on();
	
	dvdPlayer.setMovie("Taar Zameen Par");
	
	soundSystem.setVolume(50);
	}

}
