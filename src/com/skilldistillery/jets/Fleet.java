package com.skilldistillery.jets;

public class Fleet {
	private static Pilots pilots;
	
	private static boolean garden = false;
	private static boolean quit = false;
	
	public static void main(String[] args) {
		do {
			if (garden) {
				System.out.println("~~~~~Butterfly Sanctuary Alpha~~~~~");
				System.out.println("  1) Look at pretty butterflies    ");
				System.out.println("  2) Which one is fastest?         ");
				System.out.println("  3) Which one can fly farthest?   ");
				System.out.println("  4) Quit                          ");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			else {
				System.out.println("+---------------------------------+");
				System.out.println("|      SUPER JET KEEPER 9000      |");
				System.out.println("+--------------MENU---------------+"); //35 long
				System.out.println("| 1) LIST YOUR AWESOME FLEET!!!   |");
				System.out.println("| 2) VIEW FASTEST JET             |");
				System.out.println("| 3) VIEW LONGEST RANGE JET       |");
				System.out.println("| 4) ADD AN AWESOME JET TO FLEET  |");
				System.out.println("| 5) HIRE A COOL PILOT            |");
				System.out.println("| 6) QUIT                         |");
				System.out.println("| 7) get back to the garden       |");
				System.out.println("+---------------------------------+");
			}
		} while(!quit);
		
	}
	
	public void butterflyWatcher() {
		//functionality for butterfly watcher
	}
	
	public void jetKeeper() {
		//functionality for jet keeper
	}
}
