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
	
	@Test
	public void findTripByDescription() {	
		TripManager tm = new TripManager();
		Trip trip = new Trip("Majowka", "wyjazd rodzinny");
		tm.addTrip(trip);
		Trip trip1 = new Trip("Wakacje", "Grecja");
		tm.addTrip(trip1);
		Trip trip2 = new Trip("Swieta", "Skandynawia");
		tm.addTrip(trip2);
		assertEquals(trip2, tm.findTrip("Skandynawia"));	
	}
	
	@Test
	public void findTripByName() {	
		TripManager tm = new TripManager();
		Trip trip = new Trip("Majowka", "wyjazd rodzinny");
		tm.addTrip(trip);
		Trip trip1 = new Trip("Wakacje", "Grecja");
		tm.addTrip(trip1);
		Trip trip2 = new Trip("Swieta", "Skandynawia");
		tm.addTrip(trip2);
		assertEquals(trip1, tm.findTrip("Wakacje"));	
	}
	
	@Test
	public void tripNotFound() {	
		TripManager tm = new TripManager();
		Trip trip = new Trip("Majowka", "wyjazd rodzinny");
		tm.addTrip(trip);
		Trip trip1 = new Trip("Wakacje", "Grecja");
		tm.addTrip(trip1);
		Trip trip2 = new Trip("Swieta", "Skandynawia");
		tm.addTrip(trip2);
		assertEquals(null, tm.findTrip("USA"));	
	}	
	
	@Test
	public void findTripByPhoto() {	
		TripManager tm = new TripManager();
		Trip trip = new Trip("Majowka", "wyjazd rodzinny");
		Photo photo = new Photo("z rodzina");
		trip.addPhoto(photo);
		tm.addTrip(trip);
		Trip trip1 = new Trip("Wakacje", "Grecja");
		Photo photo1 = new Photo("Ateny");
		Photo photo2 = new Photo("Tesaloniki");
		trip1.addPhoto(photo1);
		trip1.addPhoto(photo2);
		tm.addTrip(trip1);
		Trip trip2 = new Trip("Swieta", "Skandynawia");
		tm.addTrip(trip2);
		assertEquals(trip1, tm.findTrip("Tesaloniki"));	
	}	
	
}
