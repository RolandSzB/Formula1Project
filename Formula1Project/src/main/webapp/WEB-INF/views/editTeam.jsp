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
<h1>Edit teamr</h1>
<form:form method="post" action="${pageContext.request.contextPath}/teams/edit/${teams.id}" modelAttribute="teams">
    <label for="id">ID</label>
    <form:input path="id"/>
    <label for="teamName">Team</label>
    <form:input path="teamName"/>
    <label for="teamPrincipal">Principal</label>
    <form:input  path="teamPrincipal"/>
    <label for="joiningYear">Joined</label>
    <form:input type="date" path="joiningYear"/>

    <input type="submit" value="Submit"/><br/>
</form:form>

</body>
</html>