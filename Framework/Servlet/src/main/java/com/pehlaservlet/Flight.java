package com.pehlaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Flight extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		int age = Integer.parseInt(request.getParameter("age"));
		
		PrintWriter out = response.getWriter();
		
		out.println("Welcome to flight Booking center");
		out.println("Name = "+name);
		out.println("From = "+ from);
		out.println("To = " + to);
		out.println("Age = "+ age);
		
		out.println("Thank you visit again");
	}

}
