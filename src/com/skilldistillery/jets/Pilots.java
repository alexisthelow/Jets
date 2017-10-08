package com.skilldistillery.jets;

import java.util.Random;

public final class Pilots {
	static Random random = new Random();
	
	private static Pilot[] pilots = { 	//array of pilots
			new Pilot("Joan Baez", "\"Action is the antidote to despair.\"", false),
			new Pilot("David Crosby","\"I don't like greed, ignorance, or anger... but I love love.\"", false),
			new Pilot("Carlos Santana", "\"If you carry joy in your heart, you can heal any moment.\"", false),
			new Pilot("Joe Cocker", "\"In my soul, I'm gentle.\"", false),
			new Pilot("Arlo Guthrie", "\"The death of what's dead is the birth of what's living.\"", false),
			new Pilot("Grace Slick", "\"No matter how big or soft or warm your bed is, you still have to get out of it.\"", false),
			new Pilot("Janis Joplin", "\"We don't forgive people because they deserve it. We forgive them because they need it--because we need it.\"", false),
			new Pilot("Jerry Garcia", "\"Constantly choosing the lesser of two evils is still choosing evil.\"", false),
			new Pilot("James \"Jimi\" Hendrix", "\"Knowledge speaks, but wisdom listens.\"", false),
			new Pilot("Joni Mitchell", "\"Maybe it's the time of year... maybe it's the time of man.\"", false),
			null, null, null, null, null, null, null, null, null, null //ten empty indices
	};
	
	
	
	public static Pilot addPilot(String name) { //adds a pilot to pilots array and returns it
		String[] quotes = { //user doesn't get to pick a quote
				"Can I walk beside you?",
				"I feel like I'm a cog in something turning...",
				"Tell me, where are you going?",
				"Gotta get back to the land, set my soul free...",
				"We've got to get ourselves back to the Garden.",
				"I don't know who I am, but life is for learning."
		};
		int randomSeed = random.nextInt(quotes.length); // generate random seed 
		
		Pilot pilot = new Pilot(name, quotes[randomSeed], true); //make a pilot with user-spec name, random quote, set picked to false
		for (int i = 0; i < pilots.length; i++) { //iterate over pilots array
			if (pilots[i] == null) {		//when an empty one is found
				pilots[i] = pilot;	//stick the pilot in there
				break;
			}
			else {
				//TODO array has no empty spaces here, creates infinite loop
			}
		}
		System.out.println();
		return pilot;
	}
	
	public static Pilot getPilot() {	//gets a random pilot out of array
		int randomSeed;
		boolean pickedFlag = false;
		Pilot p;
		do {
			
			randomSeed = random.nextInt(pilots.length);	//get a random number within range of pilots array
			p = pilots[randomSeed]; 	//get a random pilot out of the array w/ seed
			
			if (p == null || p.isPicked()) { //if they've been picked
				pickedFlag = true; //set repeat flag to true
			}
			else {
				pilots[randomSeed].setPicked(true);	//otherwise set picked to true
				pickedFlag = false;	//and set repeat flag to false
			}
			
		} while(pickedFlag);
		
		return p;
	}

	public static Pilot[] getPilots() {	//returns the pilot array (for testing i guess)
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
	
	
	
}	//i can say anything i want in these comments lol