package project1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

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
		try {
			File xmlDoc = new File(filename);
			DocumentBuilderFactory dbFact = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuild = dbFact.newDocumentBuilder();
			Document doc = dBuild.parse(xmlDoc);		
			
			//read array of photo nodes
			NodeList nList = doc.getElementsByTagName("photo");
			System.out.println(nList.getLength() + " photos found");

			System.out.print("search here: ");
			//Scanner scanner = new Scanner(System.in);
			String search = "";
			char s = (char) System.in.read();
			search += s;
			
			System.out.println(search);
			
			for(int i=0; i<nList.getLength(); i++) {
				Node node = nList.item(i);
				
				if(node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					//NodeList keywords = doc.getElementsByTagName("keyword");
					
					System.out.println(element.getElementsByTagName("name").item(0).getTextContent());
					System.out.println(element.getElementsByTagName("keywords").item(0).getTextContent());
					System.out.println("------------------------------------");
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
		}
	}
}
