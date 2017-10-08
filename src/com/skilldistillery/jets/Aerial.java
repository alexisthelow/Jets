package com.skilldistillery.jets;

public abstract class Aerial {
	private String model;
	private String nickname;
	private int speedInKPH;
	private int rangeInKM;
	private int price;
	private Pilot pilot;
	
	
	public Aerial() {
		super();
	}

	public Aerial(String model, String nickname, int speedInKPH, int rangeinKM, int price, Pilot pilot) {
		super();
		this.model = model;
		this.nickname = nickname;
		this.speedInKPH = speedInKPH;
		this.rangeInKM = rangeinKM;
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

	public int getSpeedInKPH() {
		return speedInKPH;
	}
	
	public int getSpeedInMach() {
		return (int) (this.getSpeedInKPH() * 0.0008163);
	}

	public int getRangeInKM() {
		return rangeInKM;
	}

	public Pilot getPilot() {
		return pilot;
	}
	
	
	
	
}
