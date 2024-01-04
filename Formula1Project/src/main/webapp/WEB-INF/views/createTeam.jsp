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
<h1>Create Team</h1>
<form:form method="post" action="${pageContext.request.contextPath}/teams/create" 
modelAttribute="teams">

	<label for="title">Team Name</label>
	<form:input path="teamName"/>
<br/>
    <label for="title">Team Principal</label>
	<form:input  path="teamPrincipal"/>
<br/>
    <label for="title">Joined</label>
	<form:input type="date" path="joiningYear"/>
<br/>
	
	
	<input type="submit" value="Save"/>
</form:form>
</body>
</html>