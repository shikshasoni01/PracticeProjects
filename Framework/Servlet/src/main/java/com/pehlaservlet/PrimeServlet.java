package com.pehlaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


public class PrimeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("number"));
		String str = " ";
		int count = 0;
		for(int i =1; i<=num;i++) 
		{
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			str = "The number is prime";
		}
		else
		{
			str = "Not Prime";
		}
		PrintWriter out = response.getWriter();
		out.println(num+" "+str);
	}

}
