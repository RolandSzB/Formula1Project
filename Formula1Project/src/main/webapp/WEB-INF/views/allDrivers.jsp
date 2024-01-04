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
<h1>All Drivers</h1>
<table border=1>
	<tr>
		<th>ID</th>
		<th>DRIVER</th>
		<th>TEAM</th>
		<th>AGE</th>
		<th colspan=3>ACTIONS</th>
			
	</tr>
	<c:forEach var="driver" items="${drivers}" varStatus="idx" >
<tr ${idx.index%2==0? "style='background-color:cyan'":"style='background-color:gainsboro'" }>
		
			<td> <c:out value="${driver.id}"/></td>
			<td> <c:out value="${driver.driverName}"/></td>
			<td> <c:out value="${driver.team}"/></td>
			<td> <c:out value="${driver.age}"/></td>
			<td> <a href="<c:url value="/drivers/${driver.id}"/>">Detalii </a></td>
			<td> <a href="<c:url value="/drivers/delete/${driver.id}"/>">Delete </a></td>
			<td> <a href="<c:url value="/drivers/edit/${driver.id}"/>">Edit</a></td>
		</tr>
	</c:forEach>
	
</table>
<a href="<c:url value="/drivers/create"/>">Create Driver</a><br>
<a href="<c:url value="/cars/all"/>">All Cars </a> <br>
<a href="<c:url value="/teams/all"/>">All Teams </a>
</body>
</html>