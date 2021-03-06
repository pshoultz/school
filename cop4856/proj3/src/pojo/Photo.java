package pojo;

import javax.json.bind.JsonbBuilder;

public class Photo {
	private String title = null;
	private String type = null;
	private String creator = null;
	private String mimeType = null;
	private String location = null;
	private String[] keywords = null;
	
	public Photo() {
		
	}
	
	public Photo(String title) {
		super();
		this.title = title;
	}
	
	@Override
	public String toString() {
		return JsonbBuilder.create().toJson(this);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getKeywords() {
		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}
	
	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

}
