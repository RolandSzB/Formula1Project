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
<h1>Edit driver</h1>
<form:form method="post" action="${pageContext.request.contextPath}/drivers/edit/${drivers.id}" modelAttribute="drivers">
    <label for="id">ID</label>
    <form:input path="id"/>
    <label for="driverName">Driver Name</label>
    <form:input path="driverName"/>
    <label for="team">Team</label>
    <form:input  path="team"/>
    <label for="age">Age</label>
    <form:input type="number" path="age"/>

    <input type="submit" value="Submit"/><br/>
</form:form>

</body>
</html>