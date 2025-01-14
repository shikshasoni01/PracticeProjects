<%@ page language ="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset ="ISO-8859-1">
<title>Login Again</title>
</head>
<body style="background-color:grey ">
<h2 style="color:green ;font-size:40px ">May be user name or password is wrong </h2>
<jsp:include page="login.jsp"></jsp:include>
<%-- jsp-include is action tag  --%>
<a href="index.jsp">Back to Index page!</a>
</body>
</html>