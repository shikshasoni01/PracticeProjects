<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome</h2>
	<% 
		String username = request.getParameter("user");
		String password = request.getParameter("pass");
		
		if(username.length()>0 && password.length() >=8) {
			out.println("Login Successfull");
		}
		else {
			out.println("Check your details");
		}
		%>
</body>
</html>