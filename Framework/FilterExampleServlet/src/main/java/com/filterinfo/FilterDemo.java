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


public class FilterDemo extends HttpFilter implements Filter {

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		PrintWriter out = response.getWriter();
		//this will execute before excecuting the servlet
		out.println("Kaidi ko maharaj ki taraf lejete hue!");
		
		chain.doFilter(request, response);
		
		
		//this will execute after servlet execution
		out.println("Kaidi dand ke baad yamraj ke taraf jate hue! ");
	}

	

}
