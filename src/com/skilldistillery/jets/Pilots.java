package com.skilldistillery.jets;

import java.util.Random;

public class Pilots {
	static Random random = new Random();
	
	private Pilot[] pilots = {
			new Pilot("Joan Baez", "Action is the antidote to despair.", false),
			new Pilot("David Crosby","I don't like greed, ignorance, or anger... but I love love.", false),
			new Pilot("Carlos Santana", "If you carry joy in your heart, you can heal any moment.", false),
			new Pilot("Joe Cocker", "In my soul, I'm gentle.", false),
			new Pilot("Arlo Guthrie", "The death of what's dead is the birth of what's living.", false),
			new Pilot("Grace Slick", "No matter how big or soft or warm your bed is, you still have to get out of it.", false),
			new Pilot("Janis Joplin", "We don't forgive people because they deserve it. We forgive them because they need it--because we need it.", false),
			new Pilot("Jerry Garcia", "Constantly choosing the lesser of two evils is still choosing evil.", false),
			new Pilot("James \"Jimi\" Hendrix", "Knowledge speaks, but wisdom listens.", false),
			new Pilot("Joni Mitchell", "Maybe it's the time of year... maybe it's the time of man.", false),
	};
	
	

	public Pilot getPilot() {
		int randomSeed;
		boolean pickedFlag = false;
		Pilot p;
		do {
			
			randomSeed = random.nextInt(pilots.length);	//get a random number within range of pilots array
			p = pilots[randomSeed]; 	//get a random pilot out of the array w/ seed
			
			if (p.isPicked()) { //if they've been picked
				pickedFlag = true; //set repeat flag to true
			}
			else {
				pilots[randomSeed].setPicked(true);	//otherwise set picked to true
				pickedFlag = false;	//and set repeat flag to false
			}
			
		} while(pickedFlag);
		
		return p;
	}

	public Pilot[] getPilots() {
		return pilots;
	}
	
}

class Pilot {
	
	private String name;
	private String quote;
	private boolean picked;
	
	public Pilot(String name, String quote, boolean picked) {
		this.name = name;
		this.quote = quote;
		this.picked = picked;
	}

	public boolean isPicked() {
		return picked;
	}

	public void setPicked(boolean picked) {
		this.picked = picked;
	}

	public String getName() {
		return name;
	}

	public String getQuote() {
		return quote;
	}
	
	
	
}