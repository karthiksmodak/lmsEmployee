<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee Details</title>
</head>
<body>
	<h2>Update Employee</h2>
	<form action="updateEmployee" method="post">
		<pre>
			<input type="hidden" name="id" value="${employee.id}">		
			Name<input type="text" name="name" value="${employee.name}">
			Email<input type="text" name="email" value="${employee.email}">
			Mobile<input type="text" name="mobile" value="${employee.mobile}">
			<input type="submit" value="save">
		</pre>
	</form>
	${msg}
</body>
</html>