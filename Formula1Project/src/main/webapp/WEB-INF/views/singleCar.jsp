<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Car Details</h1>
	<p>ID: ${car.id} </p>
	<p>Team: ${car.teamName} </p>
	<p>Wins: ${car.wins} </p>
	<p>Engine: ${car.engine} </p>
	<p>Racing Year: ${car.year} </p>
</body>
</html>