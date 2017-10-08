package com.skilldistillery.jets;

import java.util.Scanner;

public class Jets {
	
//	private static Pilots pilots = new Pilots();
	
	public Jets() {
		super();
	}
	
	private static Aerial[] jets = { //five jets in fleet, ten spaces to add more
		new Jet("F-16 Fighting Falcon", "\"Stardust\"", 2120, 4220, 14600000, Pilots.getPilot()),
		new Jet("A-10 Thunderbolt II", "\"Carbon\"", 833, 4150, 18800000, Pilots.getPilot()),
		new Jet("F-15E Strike Eagle", "\"Woodstock\"", 3017, 3900, 31100000, Pilots.getPilot()),
		new Jet("F-22 Raptor", "\"Child of God\"", 2410, 3220, 150000000, Pilots.getPilot()),
		new Jet("F/A-18F Super Hornet", "\"Devil's Bargain\"", 1915, 3330, 70500000, Pilots.getPilot()),
		null, null, null, null, null, null, null, null, null, null
	};
	

	public void listJets() {
		for (Aerial j : jets) {
			if (j != null) {
				System.out.println(j.toString());
			}			
		}
	}
	
	public void fastestJet() {	//prints out fastest jet
		Aerial fastest = new Jet();
		for (Aerial j : jets) {		//for each aerial in jets
			if (j != null && (j.getSpeedInKPH() > fastest.getSpeedInKPH())) {		//if it's faster than -1
				fastest = j;		//replace reference
			}
		}
		System.out.println("\nTHE FASTEST JET IN YOUR FLEET IS: ");		
		System.out.println(fastest.toString());	//print it out
	}

	public void longestRangeJet() {	//prints out jet w/ longest range
		Aerial longestRange = new Jet();		//make a new default jet and stick it in the variable
		for (Aerial j : jets) {		//for each aerial in jets
			if (j != null && (j.getRangeInKM() > longestRange.getRangeInKM())) {		//if it has a longer range than -1
				longestRange = j;	//put it in the variable
			}
		}
		System.out.println("\nTHE FASTEST JET IN YOUR FLEET IS: ");		//print it out
		System.out.println(longestRange.toString());
	}
	
	public void newJet() {

		//check for empty space in fleet, can't continue if not
		if (jets[jets.length-1] != null) {	//last space in array is full, can't continue
			System.out.println("YOU HAVE NO SPACE IN YOUR FLEET FOR ANOTHER AWESOME JET!!!");
			return;
		}
		
		Scanner scannerJets = new Scanner(System.in);
		System.out.println("ADD A SWEET NEW JET TO YOUR AWESOME FLEET!");
		
		System.out.print("ENTER THE MODEL OF YOUR NEW JET: ");
		String model = scannerJets.nextLine();
		
		System.out.print("ENTER THE NICKNAME OF YOUR NEW JET: ");
		String nickname = scannerJets.nextLine();
		
		//now we gotta make sure that input is valid (> 0) for the next three inputs, i really wanna do this w/o repeating code
		int speed = -1;
		
		boolean inputFlag = true;
		while (inputFlag) {		//while input flag is true
			System.out.print("ENTER THE TOP SPEED OF YOUR NEW JET: ");	//get speed
			if (scannerJets.hasNextInt()) {		//if input is an int
				int input = scannerJets.nextInt();	//save it
				scannerJets.nextLine();	//clear line
				if (input < 0) {		//if it's less than zero, fail state
					System.out.println("YOUR INPUT IS INVALID! TRY AGAIN!!!");	//tell em
				}
				else {	
					speed = input;
					inputFlag = false;	//set flag to exit loop
				}
			}
			else {
				System.out.println("YOUR INPUT IS INVALID! TRY AGAIN!!!");	//tell em
				scannerJets.nextLine();
			}
		}
		
		int range = -1;
		inputFlag = true;
		while (inputFlag) {		//while input flag is true
			System.out.print("ENTER THE FERRY RANGE OF YOUR NEW JET: ");	//get range
			if (scannerJets.hasNextInt()) {		//if input is an int
				int input = scannerJets.nextInt();	//save it
				scannerJets.nextLine();	//clear line
				if (input < 0) {		//if it's less than zero, fail state
					System.out.println("YOUR INPUT IS INVALID! TRY AGAIN!!!");	//tell em
				}
				else {	
					range = input;
					inputFlag = false;	//set flag to exit loop
				}
			}
			else {
				System.out.println("YOUR INPUT IS INVALID! TRY AGAIN!!!");	//tell em
				scannerJets.nextLine();
			}
		}
		
		int price = -1;
		inputFlag = true;
		while (inputFlag) {		//while input flag is true
			System.out.print("ENTER THE PRICE OF YOUR NEW JET: ");	//get price
			if (scannerJets.hasNextInt()) {		//if input is an int
				int input = scannerJets.nextInt();	//save it
				scannerJets.nextLine();	//clear line
				if (input < 0) {		//if it's less than zero, fail state
					System.out.println("YOUR INPUT IS INVALID! TRY AGAIN!!!");	//tell em
				}
				else {	
					price = input;
					inputFlag = false;	//set flag to exit loop
				}
			}
			else {
				System.out.println("YOUR INPUT IS INVALID! TRY AGAIN!!!");	//tell em
				scannerJets.nextLine();
			}
		}
		
		//ask if they wanna add a pilot
		
		Pilot newPilot = null;
		
		inputFlag = true;	//outer loop flag
		while(inputFlag) {	//loop will continue until successful input received
			System.out.print("DO YOU WISH TO HIRE A PILOT FOR THIS JET? (Y/N): ");
			
			String input = scannerJets.nextLine();	//get response and save
			if (input.length() == 1) {	//length of response should be one, else not valid
				
				switch(input.charAt(0)) {	//look at the char at 0
					case 'Y':case 'y':			//if yes, they want a pilot. new, or available?

						boolean inputFlag2 = true;	//inner loop flag
						while(inputFlag2) {	//loop will continue until successful input received
							System.out.print("ENTER 1 TO SELECT AN AVAILABLE PILOT. ENTER 2 TO CREATE A NEW PILOT. ENTER 3 TO CANCEL.:");		//ask next question
							if (scannerJets.hasNextInt()) {		//if next input is an int
							
								int input2 = scannerJets.nextInt();									//get and save it
								scannerJets.nextLine();
								switch(input2) {													//switch on it
									case 1:															//if 1, they want an available pilot
																									//TODO select available pilot 
									inputFlag = false;												//set flag to exit outer loop
									inputFlag2 = false;												//set flag to exit inner loop
									continue;															//and break
								case 2:															//if 2, they want a new pilot
									System.out.print("ENTER THE PILOT'S NAME: ");
									String name = scannerJets.nextLine();
									newPilot = Pilots.addPilot(name);									//make new pilot and save
									inputFlag = false;												//set flag to exit outer loop
									inputFlag2 = false;												//set flag to exit inner loop
									continue;															//and break
								case 3:															//if 3, they wanna cancel (not add a pilot), so newPilot var remains null
									inputFlag = false;												//set flag to exit outer loop
									inputFlag2 = false;												//set flag to exit inner loop
									continue;															//and break
								default:															//if neither 1 or 2, they want a pilot but input was invalid
									System.out.println("YOUR INPUT IS INVALID(not 1 or 2 at available or new switch)! TRY AGAIN!!!");		//tell em
									continue;															//repeat
								}
							}
							else {																//if scanner didn't have an int, fail state
								System.out.println("YOUR INPUT IS INVALID(not an int at available or new switch)! TRY AGAIN!!!");			//tell em
								scannerJets.nextLine(); 													//clear scanner and repeat
							}
						
						}
					
					break;	//end of case y
				case 'N':case 'n':			//if no, they don't want to hire a pilot, so we can just make the jet now
					inputFlag = false;		//set flag to exit loop
					break;					//and break
					
				default:						//if neither, bad input
					System.out.println("YOUR INPUT IS INVALID(not a y or n at choose pilot switch)! TRY AGAIN!!!");	//tell em
				}
				
			}
			else {	//input was too long, so invalid
				System.out.println("YOUR INPUT IS INVALID(too long at choose pilot ! TRY AGAIN!!!");		//tell em
			}

		}	//now we know whether we have selected a pilot or not, and the var has been assigned appropriately
		addJet(model, nickname, speed, range, price, newPilot);
		System.out.println("NEW JET CREATED! CHECK YOUR FLEET!!!");
	}
			
	
	
	
	public int getValidIntJetInput() {		//should get input, make sure it's > 0, return it
		Scanner scanner = new Scanner(System.in);
		
		boolean inputFlag = true;
		while (inputFlag) {		//while input flag is true
			scanner.hasNext();
			if (scanner.hasNextInt()) {		//if input is an int
				int input = scanner.nextInt();	//save it
				if (input < 0) {		//if it's less than zero, fail state
					System.out.println("YOUR INPUT IS INVALID (less than zero)! TRY AGAIN!!!");	//tell em
					scanner.nextLine();
				}
				else {	
					inputFlag = false;	//set flag to exit loop
					scanner.nextLine();
					scanner.close();		//close scanner
					return input;		//return input
				}
			}
			else if (!scanner.hasNextInt()) {
				System.out.println("YOUR INPUT IS INVALID(not an int)! TRY AGAIN!!!");	//tell em
				scanner.nextLine();	//clear scanner line
				
			}
		}
		scanner.close();
		return 0;	//this will never happen, hopefully
		
	}
	
	public boolean addJet(String model, String nickname, int speedInKM, int rangeInKM, int price) {
		Jet jet = new Jet(model, nickname, speedInKM, rangeInKM, price, null);
		
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = jet;
				return true;
			}
			
		}
		return false;
	}

	public boolean addJet(String model, String nickname, int speedInKM, int rangeInKM, int price, Pilot pilot) {
		Jet jet = new Jet(model, nickname, speedInKM, rangeInKM, price, pilot);
		
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = jet;
				return true;
			}
			
		}
		return false;
	}

	public Aerial[] getJets() {
		return jets;
	}
	
//	public static Pilots getPilots() {
//		return pilots;
//
//	}

}

class Jet extends Aerial {	//define jet class

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