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
<h1>Create Driver</h1>
<form:form method="post" action="${pageContext.request.contextPath}/drivers/create" 
modelAttribute="drivers">

	<label for="title">Driver Name</label>
	<form:input path="driverName"/>
<br/>
    <label for="title">Team</label>
	<form:input  path="team"/>
<br/>
    <label for="title">Age</label>
	<form:input type="number" path="age"/>
<br/>
	
	
	<input type="submit" value="Save"/>
</form:form>
</body>
</html>