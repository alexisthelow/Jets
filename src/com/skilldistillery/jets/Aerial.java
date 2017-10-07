package com.skilldistillery.jets;

public abstract class Aerial {
	private String model;
	private String nickname;
	private int speedInKMH;
	private int rangeInKM;
	private int price;
	private Pilot pilot;
	
	
	public Aerial() {
		super();
	}

	public Aerial(String model, String nickname, int speedInMPH, int rangeinMI, int price, Pilot pilot) {
		super();
		this.model = model;
		this.nickname = nickname;
		this.speedInKMH = speedInMPH;
		this.rangeInKM = rangeinMI;
		this.price = price;
		this.pilot = pilot;
	}


	//gets & sets
	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	public String getNickname() {
		return nickname;
	}

	public int getSpeedInKMH() {
		return speedInKMH;
	}

	public int getRangeInKM() {
		return rangeInKM;
	}

	public Pilot getPilot() {
		return pilot;
	}
	
	
	
	
}
