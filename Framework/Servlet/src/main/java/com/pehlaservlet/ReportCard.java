package com.pehlaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ReportCard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = (request.getParameter("address"));
		int mark = Integer.parseInt(request.getParameter("mark"));
		String remarks = (request.getParameter("remarks"));
		
		PrintWriter out = response.getWriter();
		
		out.println("Welcome Parents of the child");
		out.println("This is your report card");
		out.println("Name = "+name);
		out.println("Age = "+ age);
		out.println("Address = " + address);
		out.println("Mark = "+ mark);
		out.println("Remark =" + remarks);
		
		out.println("Thank you visit again");
		
	}

}
