package com.skilldistillery.jets;


public class Jet extends Aerial {	//define jet class

	public Jet(String model, String nickname, int speedInKPH, int rangeinKM, int price, Pilot pilot) {		//constructor with pilot
		super(model, nickname, speedInKPH, rangeinKM, price, pilot);
	}

	public Jet() {	//empty constructor
		super("", "", -1, -1, -1, null);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(this.getModel()).append(" ").append(this.getNickname()).append("\n\n"); //first line
		sb.append("MAXIMUM SPEED (KM/H): ").append(this.getSpeedInKPH()).append("\n");//second line
		sb.append("MAXIMUM SPEED (MACH): ").append(this.getSpeedInMach()).append("\n"); //third line
		sb.append("MAXIMUM RANGE (KM): ").append(this.getRangeInKM()).append("\n"); //fourth line
		sb.append("PRICE PER UNIT: $").append(this.getPrice()).append(" (TOTALLY WORTH IT)\n\n"); //fifth line
		sb.append("CURRENT PILOT: "); //sixth line
		if (this.getPilot() != null) {
			sb.append(this.getPilot().getName()).append("\n"); //sixth line
			sb.append(this.getPilot().getQuote()).append("\n"); //seventh line					
		}
		else {
			sb.append("NONE\n");	//sixth line
		}
		return sb.toString();
	}

}
