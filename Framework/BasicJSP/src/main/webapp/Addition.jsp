<%@ page import ="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h2>Welcome all!</h2>
		
		<%
		TreeSet<Integer> set =new TreeSet<Integer>();
		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));
		int num3 = Integer.parseInt(request.getParameter("number3"));
		int num4 = Integer.parseInt(request.getParameter("number4"));
		int num5 = Integer.parseInt(request.getParameter("number5"));
		
		set.add(num1);
		set.add(num2);
		set.add(num3);
		set.add(num4);
		set.add(num5);
		
		%>
		
		<p>The Sum of all the numbers are :<i> <%= num1+num2+num3+num4+num5 %></i></p>
		<p><b>The total number are: <i><%=set %></i></b></p>
</body>
</html>