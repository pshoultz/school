package model;

import entities.Photo;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.JsonbBuilder;

public class Library {

    private List<Photo> photos;

    public Library() {
        photos = new ArrayList<>();
    }

    public void add(Photo p) {
        photos.add(p);
    }

    //NOTE: only returns all
    public String toString() {
        return JsonbBuilder.create().toJson(photos);
    }
    
    public List<Photo> Find(String keyword) {
    	//iterate over list<photo>
        List<Photo> sortedPhotos = new ArrayList<>();

    	for(Photo p: photos) {
    		if(p.getKeywords().contains(keyword)) {
    			sortedPhotos.add(p);
    		}
    	}
    	
    	return sortedPhotos;
    }
}