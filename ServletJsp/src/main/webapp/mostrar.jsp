<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,servlet.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mostrar</title>
</head>
<body>

<form method="post" action="Servlet3">	
		<input type="submit"  value="Mostrar">
		<input type="button" onclick="window.location.href='datos.jsp'"  value="Volver">
</form>	
<br>
<br>
<table border="1">
		<thead>
			<tr>
				<td>Nombre</td>
				<td>Curso</td>
				<td>Edad</td>
				<td>Borrar</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user1" items="${listAllUsers}">
				<tr>
					<td><c:out value="${user1.nombre}"/> </td>
					<td><c:out value="${user1.age}"/> </td>
					<td><c:out value="${user1.course}"/> </td>
					<td><a name="user" href="Hola?user=${user1.nombre}">Borrar</a></td>
		    	</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>