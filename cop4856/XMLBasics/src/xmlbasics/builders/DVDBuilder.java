package xmlbasics.builders;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import xmlbasics.pojos.DVD;

public class DVDBuilder {
	public static Element buildDVD(Document doc, DVD d) {
		Element e = doc.createElement("dvd");
		e.setAttribute("id",String.valueOf(d.getId()));
		e.appendChild(createTextElement(doc, "title", d.getTitle()));
		e.appendChild(createTextElement(doc, "format", d.getFormat()));
		e.appendChild(createTextElement(doc, "genre", d.getGenre()));
		return e;
	}

	private static Element createTextElement(Document doc, String name, String text) {
		Text t = doc.createTextNode(text);
		Element e = doc.createElement(name);
		e.appendChild(t);
		return e;
	}
}
