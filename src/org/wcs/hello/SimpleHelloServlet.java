package org.wcs.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleHelloServlet
 */
@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello"})
public class SimpleHelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleHelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter(); 
		out.print("Simple hello!");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
	        
	        String name = request.getParameter("name");
	        String surname = request.getParameter("surname");
	        String hour =request.getParameter("hour");
	        int stringHour = Integer.parseInt((hour));
	        if (stringHour<0||stringHour>24) {
	        request.setAttribute("messages", "l'heure n'est pas bonne");	
	        }else if (stringHour>=0&&stringHour<12) {
			request.setAttribute("messages", "bonjour "+ surname + " "+name);
	        }else if (stringHour>=12&&stringHour<24) {
	        	request.setAttribute("messages", "bonsoir "+ surname + " "+name);	
	        }
	        
	        request.getRequestDispatcher("/WEB-INF/custom-Hello.jsp").forward(request, response);
	     
	        
	        //request.getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
	    }
	}

