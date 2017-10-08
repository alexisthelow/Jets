package com.skilldistillery.jets;

import java.util.Scanner;

public class SuperTurboJetKeeper {
	private static boolean garden = false;
	private static boolean quit = false;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Jets jets = new Jets();
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
						jets.listJets();
						break;
					case 2:	//get fastest jet
						jets.fastestJet();
						break;
					case 3:	//get longest range jet
						jets.longestRangeJet();
						break;
					case 4:	//add jet
						jets.newJet();
						break;
					case 5:	//hire pilot
						System.out.println("ENTER THE NEW PILOT'S NAME: ");
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
	
//	public static int getMenuInput() {
//		boolean choiceFlag = true;
//		int choice = -1;
//		Scanner scanner = new Scanner(System.in);
//
//		while(choiceFlag) {
//			if (garden) {
//				System.out.print("Please enter your selection: ");
//			}
//			else {
//				System.out.print("ENTER YOUR X-TREME SELECTION NOW: ");	//ask for input
//			}
//			if (scanner.hasNextInt()) {	//check to see if input is an int
//				choice = scanner.nextInt();	//if it is, save it
//				scanner.nextLine();	//clear scanner
//				if (garden) { //if garden has been activated
//					if (choice < 1 || choice > 4) {  //if the choice is out of range
//						System.out.println("I'm sorry. Your input is invalid. Please try again!");
//						choiceFlag = true;	//tell user, clear scanner, set flag to true
//					}
//					else { //choice is in range, everything is ok
//						return choice;
//					}
//				}
//				else { //garden hasn't been activated, so must be jets still
//					if (choice < 1 || choice > 7) {	//if the choice is out of range, gotta try again
//						System.out.println("YOUR INPUT IS INVALID at getMenuInput! TRY AGAIN!!!");	//tell user--maybe this is a lil rude idk
//					}
//					else {	//everything is ok
//						choiceFlag = false;
//						return choice;
//					}
//				}
//			}
//			else {	//input isn't an int, try again
//				choiceFlag = true;	//set flag
//				if (garden) {	//tell user
//					System.out.println("I'm sorry. Your input is invalid. Please try again!");				
//				}
//				else {
//					System.out.println("YOUR INPUT IS INVALID(not an int at get menu input)! TRY AGAIN!!!");
//				}
//			}
//		}
//		scanner.close();
//		return 0;
//	}

	
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

	
}
