package com.filterinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

public class FilterForm extends HttpFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		
		//this will execute before excecuting the servlet
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.length()>0 && password.length() >=8) {
			//towards servlet
			chain.doFilter(request, response);
		}
		else {
			out.println("Check your details");
		}
		
		
	}

	

}
