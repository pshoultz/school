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
		Boolean found = false;
		
		try {
			File xmlDoc = new File(filename);
			DocumentBuilderFactory dbFact = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuild = dbFact.newDocumentBuilder();
			Document doc = dBuild.parse(xmlDoc);		
			
			//read array of photo nodes
			NodeList nList = doc.getElementsByTagName("photo");
			System.out.println(nList.getLength() + " photos found");

			System.out.print("search here: ");
			Scanner scanner = new Scanner(System.in);
			String search = scanner.next();
			
			
			//System.out.println(search);
			
			for(int i=0; i<nList.getLength(); i++) {
				Node node = nList.item(i);
				
				if(node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					//NodeList keywords = doc.getElementsByTagName("keyword");
					String keywords = element.getElementsByTagName("keywords").item(0).getTextContent().toLowerCase();
					
					if(keywords.contains(search)) {
						found = true;
						System.out.println("\ntitle: " + element.getElementsByTagName("title").item(0).getTextContent());
						System.out.println("name: " + element.getElementsByTagName("name").item(0).getTextContent());
						System.out.println("url: " + element.getElementsByTagName("url").item(0).getTextContent());
						System.out.println("location: " + element.getElementsByTagName("location").item(0).getTextContent());
						System.out.println("mimetype: " + element.getElementsByTagName("mimetype").item(0).getTextContent());
						
						System.out.print("keywords: ");
						String[] keywordsArr = keywords.trim().split("\n\t");
						for(int j=0; j < keywordsArr.length; j++) {
							System.out.print(keywordsArr[j].trim());
							
							if(j != keywordsArr.length - 1) {
								System.out.print(", ");
							}
						}
						
						System.out.println("\n------------------------------------");
					}
					
				
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
		}finally {
			if(!found) {
				System.out.println("no entries found");
				System.out.println("program exiting...");
			}
		}
	}
}
