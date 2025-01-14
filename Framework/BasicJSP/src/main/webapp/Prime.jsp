<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prime</title>
</head>
<body>
	<h2>Welcome all!</h2>
	
	<%
		int num = Integer.parseInt(request.getParameter("num"));
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
		out.println(num+" "+str);
		
		%>

</body>
</html>