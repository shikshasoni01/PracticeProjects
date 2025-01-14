<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cyber</title>
</head>
<body>
	<h2 align="center">Working with JSP</h2>
	
	<% 
		int a =100 , b=200;
		int sum =a+b;
		//a = a* 10;
		out.println("<h6>The final multiplied value is : "+a+"</h6><br>");
		String str ="<b><h2 style='color:green'>Yaha se JSP ka start hai!</h2></b>";
		out.println(str);
	%>
	
	<mark><center><%= str.toLowerCase() %></center></mark>
	<p>The sum of the two numbers are : <%= sum %></p>																															
</body>
</html>