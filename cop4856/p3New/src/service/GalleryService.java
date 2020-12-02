package service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jose4j.json.internal.json_simple.JSONArray;
import org.jose4j.json.internal.json_simple.JSONObject;

import model.Model;
// import pojo.Photo;
import pojo.Photo;

/**
 * Servlet implementation class GalleryService
 */
@WebServlet("/GalleryService")
public class GalleryService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Photo> gallery;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GalleryService() {
        super();
        // TODO Auto-generated constructor stub
    }
    

    @Override
	/*public void init() throws ServletException {
		super.init(); // important
		ServletContext context = getServletContext();
		try {
			String realPath = context.getRealPath("/gallery.json");
			InputStream is = new FileInputStream(realPath);
			Jsonb jsonb = JsonbBuilder.create();
	        gallery = jsonb.fromJson(is,new ArrayList<Photo>(){}.getClass().getGenericSuperclass());
	        System.out.println(gallery.toString());
		} catch (IOException e) {
			gallery = null;
		}
	}*/
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //NOTE: use DAO here for get method
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*if (!request.getHeader("Accept").toLowerCase().equals("application/json")) {
			response.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE);
			return;
		}*/
		
		
		Model m = new Model();
        PrintWriter out = response.getWriter();
        switch (request.getHeader("Accept").toLowerCase()) {
            case "application/json":
                response.setContentType("application/json");
                String keyword = request.getParameter("keyword");
        		if (keyword == null || keyword == "") {
        			//response.sendError(HttpServletResponse.SC_BAD_REQUEST);
                    out.println(m.toString());
        		}else {
        			out.println(m.GetLength());
        			//NOTE: itterate over json object here
        		}
                break;
            default:
                response.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE); // 415
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}