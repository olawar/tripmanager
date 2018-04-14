package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void addTrip() {	
		TripManager tm = new TripManager();
		Trip trip = new Trip("Majowka", "wyjazd rodzinny");
		assertEquals(0, tm.getTrips().size());	
		tm.addTrip(trip);
		assertEquals(1, tm.getTrips().size());	
	}
	
	@Test
	public void removeTrip() {	
		TripManager tm = new TripManager();
		Trip trip = new Trip("Majowka", "wyjazd rodzinny");
		tm.addTrip(trip);
		assertEquals(1, tm.getTrips().size());	
		tm.removeTrip(trip);
		assertEquals(0, tm.getTrips().size());	
	}

	
}
