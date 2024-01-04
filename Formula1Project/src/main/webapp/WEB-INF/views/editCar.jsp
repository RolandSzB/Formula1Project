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
<h1>Edit car</h1>
<form:form method="post" action="${pageContext.request.contextPath}/cars/edit/${cars.id}" modelAttribute="cars">
    <label for="id">ID</label>
    <form:input path="id"/>
    <label for="teamName">Team Name</label>
    <form:input path="teamName"/>
    <label for="wins">Wins</label>
    <form:input type="number" path="wins"/>
    <label for="engine">Engine</label>
    <form:input path="engine"/>
    <label for="year">Year</label>
    <form:input type="date" path="year"/>

    <input type="submit" value="Submit"/><br/>
</form:form>

</body>
</html>