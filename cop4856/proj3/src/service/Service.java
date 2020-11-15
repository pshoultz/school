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
	ArrayList<Photo> gallery;

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
		try {
			String realPath = context.getRealPath("/gallery.json");
			InputStream is = new FileInputStream(realPath);
			Jsonb jsonb = JsonbBuilder.create();
			gallery = jsonb.fromJson(is, new ArrayList<Photo>() {
			}.getClass().getGenericSuperclass());

		} catch (IOException e) {
			gallery = null;
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String keyword = request.getParameter("keyword");
		Person p = new Person("Hugo", 42);
		
		System.out.println("keyword:" + keyword);

		//NOTE: this works, just remove when I turn in
		if(request.getHeader("Accept") != null) {
			String header = request.getHeader("Accept");
			
			if(header.indexOf("application/json") == -1) {
		        response.sendError(415, "Bad ACCEPT");
			}
		}

		if (keyword == null || keyword=="") {
	        response.sendError(400, "Bad data");
		} else {
			
			for(int i=0; i < gallery.size(); i++) {
				for(int j=0; j < gallery.get(i).getKeywords().length; j++) {
					if(gallery.get(i).getKeywords()[j].contains(keyword)){
						System.out.println(request.getHeader("ACCEPT"));
						response.setStatus(200, "ok");
						response.setContentType("application/json");
						response.getWriter().append(gallery.get(i).toString());
					}else {
						Photo photo = new Photo();
						response.setContentType("application/json");
						response.getWriter().append(photo.toString());
					}
				}
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
