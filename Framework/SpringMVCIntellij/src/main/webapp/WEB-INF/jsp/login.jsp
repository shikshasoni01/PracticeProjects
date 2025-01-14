<%@ page language ="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
        <!DOCTYPE html>
<html>
<head>
    <meta charset ="ISO-8859-1">
    <title>Login Page</title>
</head>
<body style="background-color:grey ">
    <h1 style ="color:lightblue">Login Here!</h1>
    <%-- <a href="course">Click to see the Courses </a> --%>
    <form action ="course">
    Username:<input type="text" name ="UserName"><br>
    Password:<input type="password" name ="Password"><br>
    <input type="submit" value="Login">
    </form>

    <br>
    <br>
    <a href="index.jsp">Back to Index page!</a>
</body>
</html>