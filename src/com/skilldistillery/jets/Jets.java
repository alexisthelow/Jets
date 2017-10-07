package com.skilldistillery.jets;

public class Jets {
	
	private static Pilots pilots = new Pilots();
	
	private static Aerial[] jets = { //five jets in fleet, ten spaces to add more
		new Jet("F-16 Fighting Falcon", "\"Stardust\"", 2120, 4220, 14600000, pilots.getPilot()),
		new Jet("A-10 Thunderbolt II", "\"Carbon\"", 833, 4150, 18800000, pilots.getPilot()),
		new Jet("F-15E Strike Eagle", "\"Woodstock\"", 3017, 3900, 31100000, pilots.getPilot()),
		new Jet("F-22 Raptor", "\"Child of God\"", 2410, 3220, 150000000, pilots.getPilot()),
		new Jet("F/A-18F Super Hornet", "\"Devil's Bargain\"", 1915, 3330, 70500000, pilots.getPilot()),
		null, null, null, null, null, null, null, null, null, null
	};
	
	public static void listJets() {
		for (Aerial j : jets) {
			System.out.print(j.getModel());
		}
	}
	
	public static boolean addJet(Jet jet) {
		
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = jet;
				break;
			}
		}
		return false;
	}
	
	

}

class Jet extends Aerial {

	public Jet(String model, String nickname, int speedInMPH, int rangeinMI, int price, Pilot pilot) {
		super(model, nickname, speedInMPH, rangeinMI, price, pilot);
	}

	
	
	

}