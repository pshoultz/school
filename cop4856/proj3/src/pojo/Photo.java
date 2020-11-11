package pojo;

import javax.json.bind.JsonbBuilder;

public class Photo {
	private String title;
	private String stock;
	private Object creator;
	private String mimeType;
	private String location;
	private String[] keywords;
	
	public Photo(String title) {
		super();
		this.title = title;
	}
	
	
	@Override
	public String toString() {
		return JsonbBuilder.create().toJson(this);
	}

	/*private String name;
	private int age;
	public Photo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return JsonbBuilder.create().toJson(this);
	}*/
}
