package xmlbasics.builders.demo;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import xmlbasics.builders.DVDBuilder;
import xmlbasics.dom.serialize.Serializer;
import xmlbasics.pojos.DVD;

public class DVDBuilderDemo {
	public static void main(String[] args) throws ParserConfigurationException {
		
	     DocumentBuilderFactory factory 
         		= DocumentBuilderFactory.newInstance();
	     DocumentBuilder builder = factory.newDocumentBuilder();
	     Document doc = builder.newDocument();

	     DVD d = new DVD(12,"Harry Potter", "Movie", "Fantasy");

	     Element root = DVDBuilder.buildDVD(doc, d);
	     doc.appendChild(root);
	     System.out.println(Serializer.serialize(doc));
	}
}
