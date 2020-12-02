package pojo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class Reader {
	public static void main(String[] args) throws FileNotFoundException {
		String realPath = "WebContent/gallery.json";
		InputStream is = new FileInputStream(realPath);
		Jsonb jsonb = JsonbBuilder.create();
	    ArrayList<Photo> gallery = jsonb.fromJson(is,new ArrayList<Photo>(){}.getClass().getGenericSuperclass());
	    System.out.println(gallery);
	}
}
