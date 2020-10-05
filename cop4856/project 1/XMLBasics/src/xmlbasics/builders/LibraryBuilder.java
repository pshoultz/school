package xmlbasics.builders;

import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import xmlbasics.pojos.DVD;
import xmlbasics.pojos.Library;

public class LibraryBuilder {
	public static Element buildLibrary(Document doc, Library l) {
		Element e = doc.createElement("library");
		List<DVD> dvds = l.getDvds();
		for (DVD d : dvds) {
			Element dvdE = DVDBuilder.buildDVD(doc, d);
			e.appendChild(dvdE);
		}
		return e;
	}
}
