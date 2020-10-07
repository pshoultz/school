package proj1;


import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Parser {
	
	Parser(){
		
	}
	
	public void parse(String filename) {
		System.out.print("parsing...");
		
		/*DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(filename);
			NodeList nodes = doc.getElementsByTagName("photo");
			
			for(int i=0; i < nodes.getLength(); i++) {
				if(nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
					Node n = nodes.item(i);
					Element photo = (Element) n;
					System.out.print(photo);
					//String type = photo.getAttribute("type");
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}
