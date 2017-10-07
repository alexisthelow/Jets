package com.skilldistillery.jets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PilotsTest {
	
	private Pilots pilots;

	@Before
	public void setUp() throws Exception {
		pilots = new Pilots();
	}

	@After
	public void tearDown() throws Exception {
		pilots = null;
	}

	@Test
	public void test_getPilot() {
		for(int i = 0; i < pilots.getPilots().length; i++) {
			Pilot p = pilots.getPilot();
			assertTrue(p.getName() instanceof String);
			assertTrue(p.getQuote() instanceof String);
		}
		for(int i = 0; i < pilots.getPilots().length; i++) {
			Pilot p = pilots.getPilot();
			assertFalse(p.isPicked());
		}
	}

}
