<%@ page language ="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset ="ISO-8859-1">
<title>Course Page</title>
</head>
<body style="background-color:pink ">
<h2 style="color:green ;font-size:40px ">Courses </h2>

<h2> May be ${User} how can i help you the courses</h2>
<%-- isELIgnored will not ignore the expression($User) and tell compiler to print value of expression --%>
<ul>
<li style="font-size:20px"><a href="javacourse" style=" color:black; text-decoration:none">Java Full Stack Development</a></li>
<li style="font-size:20px"><a href="datascience" style=" color:black; text-decoration:none">Data Science</li>
<li style=" font-size:20px"><a href="react" style=" color:black; text-decoration:none">React</li>
<li style=" font-size:20px"><a href="python" style=" color:black; text-decoration:none">Python Programming</li>
<li style="font-size:20px"><a href="testing" style=" color:black; text-decoration:none">Software Development</li>
</ul>
<br>
<br>

<a href="index.jsp">Back to Index page!</a>
</body>
</html>