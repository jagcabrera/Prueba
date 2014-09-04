<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Subsistema de Gestión de Temas</title>
</head>
<body>
	<a href="./index.jsp">Volver</a>
	<br/>
	<h3>Temas existentes</h3>
	<table border="1">
		<thead>
			<tr>
				<td>ID</td>
				<td>Nombre</td>
				<td>Apto para todos los públicos</td>
		</thead>
		<!-- DATOS -->
	</table>
	
	<h3>Detalle</h3>
	<form action="./temas">
		Nombre: <input name="nombre" />
		<br/>
		Apto para todos los públicos
		<input type="checkbox" name="apto" />
		<br/>
		<input type="submit" name="op" value="actualizar" />
		<input type="submit" name="op" value="eliminar" />
	</form>
	
	
</body>
</html>