package com.pl.adam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public FirstServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter writer = response.getWriter();
		
		HttpSession session = request.getSession();
		ServletContext context = session.getServletContext();
		
		
		String name = request.getParameter("name");
		
		
		if(name !=null && !name.equals(""))
		{
			session.setAttribute("name", name);
			context.setAttribute("name", name);
		}
		
		writer.println("<h1>Witaj " 
		+ session.getAttribute("name") +" "
		+ context.getAttribute("name")
		+"</h1>");
		
	}

}
