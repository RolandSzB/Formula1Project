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
<h1>Create car</h1>
<form:form method="post" action="${pageContext.request.contextPath}/cars/create" 
modelAttribute="cars">

	<label for="title">Team Name</label>
	<form:input path="teamName"/>
<br/>
    <label for="title">Wins</label>
	<form:input type="number" path="wins"/>
<br/>
    <label for="title">Engine</label>
	<form:input  path="engine"/>
<br/>
	<label for="title">Year</label>
	<form:input type="date" path="year"/>
<br/>
	
	<input type="submit" value="Save"/>
</form:form>
</body>
</html>