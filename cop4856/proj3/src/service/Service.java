package service;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.Person;
import pojo.Photo;

/**
 * Servlet implementation class Service
 */
@WebServlet("/Service")
public class Service extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Service() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	public void init() throws ServletException {
	   System.out.println("start");
	   super.init(); // important
	   ServletContext context = getServletContext();
	   ArrayList<Photo> gallery;
	try {
	      String realPath = context.getRealPath("/gallery.json");
	      InputStream is = new FileInputStream(realPath);
	      System.out.println("is: " + is.toString());
	      Jsonb jsonb = JsonbBuilder.create();
	      gallery = jsonb.fromJson(is,new ArrayList<Photo>(){}.getClass().getGenericSuperclass());
	      
	      //gallery = jsonb.fromJson(new FileReader(realPath), new ArrayList<Photo>(){}.getClass().getGenericSuperclass());

	      System.out.println("gallery: " + gallery.toString());
	      
	   } catch (IOException e) {
	      gallery = null;
	      //System.out.println("null hit");
	   }
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Person p = new Person("Hugo", 42);
		Photo photo = new Photo("pic");
        response.setContentType("application/json");
		response.getWriter().append(p.toString());
		response.getWriter().append(photo.toString());
	     //System.out.println("test test");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
