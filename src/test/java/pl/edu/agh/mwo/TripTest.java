package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripTest {
	
	@Test
	public void createTrip() {	
		Trip trip = new Trip("Majowka", "wyjazd rodzinny");
		assertEquals("Majowka", trip.name);	
		assertEquals("wyjazd rodzinny", trip.description);	
	}
	
	@Test
	public void addPhoto() {	
		Trip trip = new Trip("Majowka", "wyjazd rodzinny");
		Photo photo = new Photo("z rodzina");
		assertEquals(0, trip.getPhotos().size());	
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());	
	}

}
