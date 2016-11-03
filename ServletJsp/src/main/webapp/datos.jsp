<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Datos</title>
</head>
<body>
<form method="post" action="hello">
	<table width="40%" align="center">
		<tr>
			<td colspan="2" align="center"><h2>Escriba su nombre</h2><hr></td>
		</tr>
		<tr>
			<td><p>Nombre:</p></td>
			<td><input type="text" id="user" name="user" size="30"></td>
		</tr>
		<tr>
			<td><p>Fecha Nacimiento:</p></td>
			<td><input type="date" id="edad" name="edad" size="30"></td>
		</tr>
		<tr>
			<td><p>Curso:</p></td>
			<td>
				<select name="curso">
					<option value="Primero">Primero</option>
					<option value="Segundo">Segundo</option>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="right"><input type="submit" value="Enviar"></td>
		</tr>
		<tr>
			<td colspan="2" align="left"><input type="button" onclick="window.location.href='mostrar.jsp'"  value="Mostrar Usuarios"></td>
		</tr>
	</table>
</form>
</body>
</html>