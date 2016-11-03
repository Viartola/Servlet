<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Fin</title>
</head>
<body>
	<h1>Bienvenido: ${nom}</h1>
	<br>
	<h1> ${ed}</h1>
	<br>
	<h1> Tu curso es: ${cur} de grado superior</h1>
	<br>
	<input type="button" onclick="window.location.href='datos.jsp'"  value="Volver">
	<br>
	<form method="post" action="Hola">
		<input type="hidden" value="${nom}" name="user">
		<br>
		<input type="submit"  value="Borrar">
	</form>	
</body>
</html>