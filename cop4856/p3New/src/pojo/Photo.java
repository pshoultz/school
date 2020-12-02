package pojo;

import java.util.ArrayList;

import javax.json.bind.JsonbBuilder;

public class Photo {
	private int id;
	private String title;
	private String cName;
	private String cURL;
	private String location;
	private String mime;
	private ArrayList<String> keywords;

	public Photo(int id, String title, String cName, String cURL, String location, String mime,
			ArrayList<String> keywords) {
		this.setId(id);
		this.setTitle(title);
		this.setcName(cName);
		this.setcURL(cURL);
		this.setLocation(location);
		this.setMime(mime);
		this.setKeywords(keywords);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcURL() {
		return cURL;
	}

	public void setcURL(String cURL) {
		this.cURL = cURL;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public ArrayList<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(ArrayList<String> keywords) {
		this.keywords = keywords;
	}

	public void setKeyword(String keyword) {
		this.keywords.add(keyword);
	}

	@Override
	public String toString() {
		return JsonbBuilder.create().toJson(this);
	}
}