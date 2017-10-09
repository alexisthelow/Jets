package com.skilldistillery.jets;

import java.util.Scanner;

public class SuperTurboJetKeeper {
	private static boolean garden = false;
	private static boolean quit = false;
	private static Aerial[] jets = { //five jets in fleet, ten spaces to add more
			new Jet("F-16 Fighting Falcon", "\"Stardust\"", 2120, 4220, 14600000, Pilots.getPilot()),
			new Jet("A-10 Thunderbolt II", "\"Carbon\"", 833, 4150, 18800000, Pilots.getPilot()),
			new Jet("F-15E Strike Eagle", "\"Woodstock\"", 3017, 3900, 31100000, Pilots.getPilot()),
			new Jet("F-22 Raptor", "\"Child of God\"", 2410, 3220, 150000000, Pilots.getPilot()),
			new Jet("F/A-18F Super Hornet", "\"Devil's Bargain\"", 1915, 3330, 70500000, Pilots.getPilot()),
			null, null, null, null, null, null, null, null, null, null
		};
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		do {
			if (garden) {
				butterflySanctuary();
				//get input
				//execute correct option
			}
			else {
				jetKeeper();
				boolean choiceFlag = true;
				int choice = -1;
				while(choiceFlag) {
					System.out.print("ENTER YOUR X-TREME SELECTION NOW: ");	//ask for input
					scanner.hasNextInt();
					if (scanner.hasNextInt()) {	//check to see if input is an int
						int tempChoice = scanner.nextInt();	//if it is, save it
						scanner.nextLine();	//clear scanner
						if (tempChoice < 1 || tempChoice > 7) {	//if the choice is out of range, gotta try again
							System.out.println("YOUR INPUT IS INVALID! TRY AGAIN!!!");	//tell user
						}
						else {	//everything is ok
							choiceFlag = false;
							choice = tempChoice;
						}
					}
					else {	//wasn't an int
						System.out.println("YOUR INPUT IS INVALID(not an int at get menu input)! TRY AGAIN!!!");
						scanner.nextLine();
					}
				}
				switch(choice) {
					case 1:	//list all jets
						listJets();
						break;
					case 2:	//get fastest jet
						fastestJet();
						break;
					case 3:	//get longest range jet
						longestRangeJet();
						break;
					case 4:	//add jet
						newJet();
						break;
					case 5:	//hire pilot
						System.out.println("HIRING A NEW PILOT INTO YOUR RADICAL ROSTER!!!");
						System.out.print("ENTER THE NEW PILOT'S NAME: ");
						String name = scanner.nextLine();
						Pilots.addPilot(name);
						break;
					case 6:	//quit
						System.out.println("I FEEL THE NEED... THE NEED FOR SPEED!!! ======\u2708");
						quit = true;
					case 7:	//garden
						//TODO implement garden change & mark flag
				}
				
			}
		} while(!quit);
		scanner.close();
	}
	
	public static void butterflySanctuary() {
		System.out.println("~~~~~Butterfly Sanctuary Alpha~~~~~");
		System.out.println("  1) Look at pretty butterflies    ");
		System.out.println("  2) Which one is fastest?         ");
		System.out.println("  3) Which one can fly farthest?   ");
		System.out.println("  4) Quit                          ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public static void jetKeeper() {
		System.out.println("+---------------------------------+");
		System.out.println("|      SUPER TURBO JET KEEPER     |");
		System.out.println("|      CRUISE CONTROL EDITION     |");
		System.out.println("+--------------MENU---------------+"); //35 long
		System.out.println("| 1) LIST YOUR AWESOME FLEET!!!   |");
		System.out.println("| 2) VIEW FASTEST JET             |");
		System.out.println("| 3) VIEW LONGEST RANGE JET       |");
		System.out.println("| 4) ADD AN AWESOME JET TO FLEET  |");
		System.out.println("| 5) HIRE A COOL PILOT            |");
		System.out.println("| 6) QUIT                         |");
		System.out.println("| 7) ??????????????????????       |");
		System.out.println("+---------------------------------+");
		
//		char[] planeLine = new char[35];
//		Arrays.fill(planeLine, '\u2708');	//these are the silliest lines i've ever written, really
//		planeLine[0] = '|';
//		planeLine[34] = '|';
//		System.out.println(new StringBuilder().append(planeLine));	//and i did it just to print a bunch of planes and i didn't even use any of this i'm just saving it here for future reference

	}

	public static void listJets() {
		for (Aerial j : jets) {
			if (j != null) {
				System.out.println(j.toString());
			}			
		}
	}
	
	public static void fastestJet() {	//prints out fastest jet
		Aerial fastest = new Jet();
		for (Aerial j : jets) {		//for each aerial in jets
			if (j != null && (j.getSpeedInKPH() > fastest.getSpeedInKPH())) {		//if it's faster than -1
				fastest = j;		//replace reference
			}
		}
		System.out.println("\nTHE FASTEST JET IN YOUR FLEET IS: ");		
		System.out.println(fastest.toString());	//print it out
	}

	public static void longestRangeJet() {	//prints out jet w/ longest range
		Aerial longestRange = new Jet();		//make a new default jet and stick it in the variable
		for (Aerial j : jets) {		//for each aerial in jets
			if (j != null && (j.getRangeInKM() > longestRange.getRangeInKM())) {		//if it has a longer range than -1
				longestRange = j;	//put it in the variable
			}
		}
		System.out.println("\nTHE FASTEST JET IN YOUR FLEET IS: ");		//print it out
		System.out.println(longestRange.toString());
	}
	
	private static void newJet() {

		//check for empty space in fleet, can't continue if not
		if (jets[jets.length-1] != null) {	//last space in array is full, can't continue
			System.out.println("YOU HAVE NO SPACE IN YOUR FLEET FOR ANOTHER AWESOME JET!!!");
			return;
		}
		
		System.out.println("ADD A SWEET NEW JET TO YOUR AWESOME FLEET!\n");
		
		System.out.print("ENTER THE MODEL OF YOUR NEW JET: ");
		String model = scanner.nextLine();
		
		System.out.print("ENTER THE NICKNAME OF YOUR NEW JET: ");
		String nickname = scanner.nextLine();
		
		//now we gotta make sure that input is valid (> 0) for the next three inputs, i really wanna do this w/o repeating code
		int speed = -1;
		
		boolean inputFlag = true;
		while (inputFlag) {		//while input flag is true
			System.out.print("ENTER THE TOP SPEED OF YOUR NEW JET: ");	//get speed
			if (scanner.hasNextInt()) {		//if input is an int
				int input = scanner.nextInt();	//save it
				scanner.nextLine();	//clear line
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
				scanner.nextLine();
			}
		}
		
		int range = -1;
		inputFlag = true;
		while (inputFlag) {		//while input flag is true
			System.out.print("ENTER THE FERRY RANGE OF YOUR NEW JET: ");	//get range
			if (scanner.hasNextInt()) {		//if input is an int
				int input = scanner.nextInt();	//save it
				scanner.nextLine();	//clear line
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
				scanner.nextLine();
			}
		}
		
		int price = -1;
		inputFlag = true;
		while (inputFlag) {		//while input flag is true
			System.out.print("ENTER THE PRICE OF YOUR NEW JET: ");	//get price
			if (scanner.hasNextInt()) {		//if input is an int
				int input = scanner.nextInt();	//save it
				scanner.nextLine();	//clear line
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
				scanner.nextLine();
			}
		}
		
		//ask if they wanna add a pilot
		
		Pilot newPilot = null;
		
		inputFlag = true;	//outer loop flag
		while(inputFlag) {	//loop will continue until successful input received
			System.out.print("DO YOU WISH TO HIRE A PILOT FOR THIS JET? (Y/N): ");
			
			String input = scanner.nextLine();	//get response and save
			if (input.length() == 1) {	//length of response should be one, else not valid
				
				switch(input.charAt(0)) {	//look at the char at 0
					case 'Y':case 'y':			//if yes, they want a pilot. new, or available?

						boolean inputFlag2 = true;	//inner loop flag
						while(inputFlag2) {	//loop will continue until successful input received
							System.out.print("ENTER 1 TO SELECT AN AVAILABLE PILOT. ENTER 2 TO CREATE A NEW PILOT. ENTER 3 TO CANCEL.:");		//ask next question
							if (scanner.hasNextInt()) {		//if next input is an int
							
								int input2 = scanner.nextInt();									//get and save it
								scanner.nextLine();
								switch(input2) {													//switch on it
									case 1:															//if 1, they want an available pilot
																									//TODO select available pilot 
									inputFlag = false;												//set flag to exit outer loop
									inputFlag2 = false;												//set flag to exit inner loop
									continue;															//and break
									case 2:															//if 2, they want a new pilot
										System.out.print("ENTER THE PILOT'S NAME: ");
										String name = scanner.nextLine();
										newPilot = Pilots.addPilot(name);									//make new pilot and save
										inputFlag = false;												//set flag to exit outer loop
										inputFlag2 = false;												//set flag to exit inner loop
										break;															//and break
									case 3:															//if 3, they wanna cancel (not add a pilot), so newPilot var remains null
										inputFlag = false;												//set flag to exit outer loop
										inputFlag2 = false;												//set flag to exit inner loop
										break;															//and break
									default:															//if neither 1 or 2, they want a pilot but input was invalid
										System.out.println("YOUR INPUT IS INVALID(not 1 or 2 at available or new switch)! TRY AGAIN!!!");		//tell em
										break;															//repeat
									}
								}
							else {																//if scanner didn't have an int, fail state
								System.out.println("YOUR INPUT IS INVALID(not an int at available or new switch)! TRY AGAIN!!!");			//tell em
								scanner.nextLine(); 													//clear scanner and repeat
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
	
//	private boolean addJet(String model, String nickname, int speedInKM, int rangeInKM, int price) {
//		Jet jet = new Jet(model, nickname, speedInKM, rangeInKM, price, null);
//		
//		for (int i = 0; i < jets.length; i++) {
//			if (jets[i] == null) {
//				jets[i] = jet;
//				return true;
//			}
//			
//		}
//		return false;
//	}

	private static boolean addJet(String model, String nickname, int speedInKM, int rangeInKM, int price, Pilot pilot) {
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
	
	
}
