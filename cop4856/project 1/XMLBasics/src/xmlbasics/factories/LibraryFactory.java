package xmlbasics.factories;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import xmlbasics.factories.xmlfactory.XMLFactory;
import xmlbasics.pojos.Library;

public class LibraryFactory extends XMLFactory {

	private DVDFactory df = new DVDFactory();
	
	public Library createLibrary(String fileName) {
		try {
			return (Library) buildFromFile(fileName);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Library createLibrary(Node n) {
		try {
			return (Library)buildFromNode(n);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public Object buildFromElement(Element root, Document doc) 
			throws XPathExpressionException {
		Library l = new Library();

		XPathFactory xpfactory = XPathFactory.newInstance();
		XPath path = xpfactory.newXPath();

		int numDVDs = Integer.parseInt(path.evaluate("count(//dvd)", root));

		for (int i = 1; i <= numDVDs; i++) {
			Node dvdRoot = (Node) path.evaluate("//dvd[" + i + "]", root, XPathConstants.NODE);
			l.addDVD(df.createDVD(dvdRoot));
		}
		return l;
	}

	public static void main(String[] args) {
		Library l = (new LibraryFactory()).createLibrary("library.xml");
		System.out.println(l);
	}
}
