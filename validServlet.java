package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class validServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public validServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		PrintWriter out=response.getWriter();
		if(uname.equalsIgnoreCase("Saurabh") && upass.equalsIgnoreCase("Abc123") ) {
			out.print("<body>");
			out.print("<b>Welcome to the login page"+uname+"<b>");
			out.print("</body>");
		}
		else {
			out.print("<body>");
			out.print("<b>Invalid! user name or password <b>");
			out.print("</body>");
			}
		}
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
