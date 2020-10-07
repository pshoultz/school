package xmlbasics.dom.serialize;

import org.w3c.dom.Document;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

public class Serializer {
	
	public static String serialize(Document root) {
	    DOMImplementationLS domImplementation = (DOMImplementationLS) root.getImplementation();
	    LSSerializer lsSerializer = domImplementation.createLSSerializer();
	    return lsSerializer.writeToString(root);
	}
}