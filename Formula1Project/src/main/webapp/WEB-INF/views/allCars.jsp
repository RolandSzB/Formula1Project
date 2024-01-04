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
<h1>All Cars</h1>
<table border=1>
	<tr>
		<th>ID</th>
		<th>TEAM</th>
		<th>WINS</th>
		<th>ENGINE</th>
		<th>YEAR</th>
		<th colspan=3>ACTIONS</th>
	</tr>
	<c:forEach var="car" items="${cars}" varStatus="idx" >
<tr ${idx.index%2==0? "style='background-color:indianred;color:white'":"style='background-color:lightgreen'" }>
		
			<td> <c:out value="${car.id}"/></td>
			<td> <c:out value="${car.teamName}"/></td>
			<td> <c:out value="${car.wins}"/></td>
			<td> <c:out value="${car.engine}"/></td>
			<td> <c:out value="${car.year}"/></td>
			<td> <a href="<c:url value="/cars/${car.id}"/>">Detalii </a></td>
			<td> <a href="<c:url value="/cars/delete/${car.id}"/>">Delete </a></td>
			<td> <a href="<c:url value="/cars/edit/${car.id}"/>">Edit</a></td>
		</tr>
	</c:forEach>
	
</table>
<a href="<c:url value="/cars/create"/>">Create Car</a><br>
<a href="<c:url value="/drivers/all"/>">All Drivers </a> <br>
<a href="<c:url value="/teams/all"/>">All Teams </a>
</body>
</html>