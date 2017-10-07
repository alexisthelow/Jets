package com.skilldistillery.jets;

public class Fleet {
	private static Pilots pilots;
	private static Aerial[] jets = {
			new Jet("F-16 Fighting Falcon", "Stardust", 2120, 4220, 14600000, pilots.getPilot()),
			new Jet("A-10 Thunderbolt II", "Carbon", 833, 4150, 18800000, pilots.getPilot()),
			new Jet("F-15E Strike Eagle", "Woodstock", 3017, 3900, 31100000, pilots.getPilot()),
			new Jet("F-22 Raptor", "Child of God", 2410, 3220, 150000000, pilots.getPilot()),
			new Jet("F/A-18F Super Hornet", "Devil's Bargain", 1915, 3330, 70500000, pilots.getPilot())
	};
	private static boolean garden = false;
	private static boolean quit = false;
	
	public static void main(String[] args) {
		do {
			if (garden) {
				System.out.println("~~~~~Butterfly Sanctuary Alpha~~~~~");
				System.out.println("  1) Look at pretty butterflies    ");
				System.out.println("  2) Which one is fastest?         ");
				System.out.println("  3) Which one can fly farthest?   ");
				System.out.println("  4) Rescue a butterfly            ");
				System.out.println("  5) Hire a butterfly pilot        ");
				System.out.println("  6) Quit                          ");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			else {
				System.out.println("+---------------------------------+");
				System.out.println("|      SUPER JET KEEPER 9000      |");
				System.out.println("+--------------MENU---------------+"); //35 long
				System.out.println("| 1) LIST YOUR AWESOME FLEET      |");
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
