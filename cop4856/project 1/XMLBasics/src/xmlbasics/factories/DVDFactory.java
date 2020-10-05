package xmlbasics.factories;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import xmlbasics.factories.xmlfactory.XMLFactory;
import xmlbasics.pojos.DVD;

public class DVDFactory extends XMLFactory {

	public DVD createDVD(String fileName) {
		try {
			return (DVD)buildFromFile(fileName);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}

	public DVD createDVD(Node n) {
		try {
			return (DVD)buildFromNode(n);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Object buildFromElement(Element root, Document doc) 
			throws XPathExpressionException {
		DVD d = new DVD();
		
		XPathFactory xpfactory = XPathFactory.newInstance();
		XPath path = xpfactory.newXPath();

		d.setId(Integer.parseInt(root.getAttribute("id")));

		d.setTitle(path.evaluate("title", root));
		d.setFormat(path.evaluate("format", root));
		d.setGenre(path.evaluate("genre", root));
		
		return d;
	}

	public static void main(String[] args) {
		DVD d = (new DVDFactory()).createDVD("dvd.xml");
		System.out.println(d);
	}
}
