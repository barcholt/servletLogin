package com.pl.adam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xml.internal.serialize.Printer;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
    	String passw = request.getParameter("passw");
    	PrintWriter out = response.getWriter();
    	UserService us = new UserService();
    	if (us.Authenticate(login, passw)) {
    		HttpSession session = request.getSession();
    		session.setAttribute("loggedUser", us.getUser(login));
    		response.sendRedirect("UserProfileView.jsp");
    	}
    	else {
    		out.print("beeee");
    	}
    	
    	
	}

}
