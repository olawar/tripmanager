package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PhotoTest {

	@Test
	public void createPhoto() {	
		Photo photo = new Photo("Zamek Malbork");
		assertEquals("Zamek Malbork", photo.comment);	
	}
}
