package pl.edu.agh.mwo;

import java.util.ArrayList;

public class Trip {
	
	private ArrayList<Photo> photos = new ArrayList<Photo>();

	public void addPhoto(Photo photo) {
		this.photos.add(photo);		
	}

	public ArrayList<Photo> getPhotos() {
		return photos;
	}

}
