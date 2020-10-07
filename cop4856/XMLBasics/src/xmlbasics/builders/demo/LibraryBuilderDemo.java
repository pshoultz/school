package xmlbasics.builders.demo;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import xmlbasics.builders.LibraryBuilder;
import xmlbasics.dom.serialize.Serializer;
import xmlbasics.pojos.DVD;
import xmlbasics.pojos.Library;

public class LibraryBuilderDemo {
	public static void main(String[] args) throws ParserConfigurationException {
		
	     DocumentBuilderFactory factory 
         		= DocumentBuilderFactory.newInstance();
	     DocumentBuilder builder = factory.newDocumentBuilder();
	     Document doc = builder.newDocument();

	     Library l = new Library();
	     DVD d11 = new DVD(11,"Kill Bill", "Movie", "Action");
	     DVD d12 = new DVD(12,"Harry Potter", "Movie", "Fantasy");
	     l.addDVD(d11);
	     l.addDVD(d12);
	     Element root = LibraryBuilder.buildLibrary(doc, l);
	     doc.appendChild(root);
	     System.out.println(Serializer.serialize(doc));
	}
}
