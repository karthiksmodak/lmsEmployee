<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Employees</title>
</head>
<body>
	<h2>List All Employees</h2>
	<table>
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<tr>
			<c:forEach var="employee" items="${employee}">
				<tr>
					<td>${employee.name}</td>
					<td>${employee.email}</td>
					<td>${employee.mobile}</td>
					<td><a href="updateEmp?id=${employee.id}">Update</a></td>
					<td><a href="deleteEmp?id=${employee.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tr>
	</table>
	${msg}
</body>
</html>