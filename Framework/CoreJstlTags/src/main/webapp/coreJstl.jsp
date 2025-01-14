<%@ page import ="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>
	<h2 align ="center"><c:out value ="Welcome to Jungle of JSTL"></c:out></h2>
	<c:set var="fname" value="Rutuja"></c:set>
	<c:set var ="lname" value="Doiphode"></c:set>
	
	<p align ="center" style='color:green'><c:out value="Welcome Miss ${fname} ${lname}"></c:out></p>
	
	<c:set var="abso" value="-50"></c:set>
	<c:if test="${abso<0}">
	<p>The Absolute Value is : <i><c:out value="${abso*-1 }"></c:out></i>
	</c:if>
	
	<c:set var="percentage" value="75"></c:set>
	<h4>This is the review of your child!</h4>
	<c:choose>
		<c:when test="${percentage<40}">
			<p>Your child has failed the exam!</p>
		</c:when>
		<c:when test="${percentage>40 && percentage<60}">
			<p>Your child has passed the exam but should work on himself!</p>
		</c:when>
		<c:when test="${percentage>60 && percentage<80}">
			<p>Your child has passed with good marks but should pay attention in class more than extra activities</p>
		</c:when>
		<c:when test="${percentage>80 && percentage<90}">
			<p>Your child has passed the exam but if studied more would get distinction</p>
		</c:when>
		<c:otherwise>
		<p>Well-done are efforts came to use!!</p>
		</c:otherwise>
	
	</c:choose>
	
	<hr style='color:purple'>
		<h4 align="center">Looping in JSTL</h4>
		<c:forEach var="i" begin ="1" end="10">
			<c:choose>
			<c:when test="${i%2==0}">
				<p style='color:green'><c:out value="${i}"></c:out></p>
			</c:when>
			<c:otherwise>
			<p style ='color:red'><c:out value="${i}"></c:out></p>
			</c:otherwise>
			</c:choose>
		</c:forEach>
		
		<hr>
		<br>
		 <h4>Using Request Attribute</h4>
		
		<% 
			ArrayList<String> khana = new ArrayList<String>();
			khana.add("Pav Bhaji");
			khana.add("Hyderabadi Dum Biryani");
			khana.add("Masala Dosa");
			khana.add("Vada Pav");
			khana.add("Misal Pav");
			khana.add("Pani Puri");
			khana.add("Noodles");
			khana.add("Puran Polli");
			khana.add("Momo");
			khana.add("Burger");
		
			request.setAttribute("menu", khana);
		%>
		<h5>FOOD MENU IS:</h5>
		<ol>
			<c:forEach var="food" items="${menu}">
				<li><c:out value="${food}"></c:out></li>
			</c:forEach>
		</ol>
</body>
</html>