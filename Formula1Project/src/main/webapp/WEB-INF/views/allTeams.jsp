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
<h1>All Teams</h1>
<table border=1>
	<tr>
		<th>ID</th>
		<th>TEAM</th>
		<th>PRINCIPAL</th>
		<th>JOINING</th>
		<th colspan=3>ACTIONS</th>
	
	</tr>
	<c:forEach var="team" items="${teams}" varStatus="idx" >
<tr ${idx.index%2==0? "style='background-color:dimgray;color:white'":"style='background-color:goldenrod'" }>
		
			<td> <c:out value="${team.id}"/></td>
			<td> <c:out value="${team.teamName}"/></td>
			<td> <c:out value="${team.teamPrincipal}"/></td>
			<td> <c:out value="${team.joiningYear}"/></td>
			<td> <a href="<c:url value="/teams/${team.id}"/>">Detalii </a></td>
			<td> <a href="<c:url value="/teams/delete/${team.id}"/>">Delete </a></td>
			<td> <a href="<c:url value="/teams/edit/${team.id}"/>">Edit</a></td>
		</tr>
	</c:forEach>
	
</table>
<a href="<c:url value="/teams/create"/>">Create Team </a> <br>
<a href="<c:url value="/cars/all"/>">All Cars </a> <br>
<a href="<c:url value="/drivers/all"/>">All Drivers </a>
</body>
</html>