package com.pehlaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class State extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Tourism</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2 align='center'>Welcome All to Maharashtra !</h2>");
		out.println("<h4 align='center'>To get best of serenity go to Mahabaleshwar</h4>");
		out.println("</body>");
		out.println("</html>");
	}
}
