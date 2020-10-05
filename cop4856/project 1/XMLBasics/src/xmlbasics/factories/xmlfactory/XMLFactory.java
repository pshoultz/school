package xmlbasics.factories.xmlfactory;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import xmlbasics.dom.build.DOMBuilder;

public abstract class XMLFactory {
	
	public final Object buildFromFile(String fileName)
			throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {

		Document doc = DOMBuilder.buildFromFile(fileName);
		Element root = doc.getDocumentElement();
		return buildFromElement((Element) root, doc);
	}

	public final Object buildFromNode(Node rootN) throws XPathExpressionException {
		if (rootN.getNodeType() != Node.ELEMENT_NODE) {
			throw new IllegalArgumentException("Root node is not Element");
		}
		return buildFromElement((Element) rootN, rootN.getOwnerDocument());
	}

	public abstract Object buildFromElement(Element root, Document doc) throws XPathExpressionException ;
}
