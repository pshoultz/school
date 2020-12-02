package model;

import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import entities.Photo;
import entities.DAO;

public class Model {
    private final Library library;
    private int length = 0;

    public Model() {
        library = new Library();

        for (Photo p : new DAO().findAll()) {
        	length++;
            library.add(p);
        }
    }

    @Override
    public String toString() {
        return library.toString();
    }
    
    public int GetLength() {
    	return this.length;
    }
}
