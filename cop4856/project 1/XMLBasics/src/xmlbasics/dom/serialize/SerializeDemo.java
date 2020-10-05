package xmlbasics.dom.serialize;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import xmlbasics.dom.build.DOMBuilder;

public class SerializeDemo {

	public static void main(String[] args) {
		Document d = null;
		try {
			d = DOMBuilder.buildFromFile("library.xml");
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		System.out.println(Serializer.serialize(d));
	}
}
