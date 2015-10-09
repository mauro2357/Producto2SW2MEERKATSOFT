<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<link rel="stylesheet" href="estilosregistro.css" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<div align="center">
		<form name="nuevo_usuario" method= "post" action="http://localhost:8080/Meerkat_0.0/mesero">
			<input type="hidden" name="entrar" value="datos_usuario">
			<input type="text" name="id" placeholder="CEDULA"><br>
			<input type="text" name="nombre" placeholder="NOMBRE"><br>
			<input type="text" name="apellido"placeholder="APELLIDO"><br>
			<input type="text" name="sexo"placeholder="SEXO"><br>
			<input type="text" name="puntos"placeholder="PUNTOS"><br>
			<input type="text" name="musica"placeholder="GUSTO MUSICAL"><br>
			<input type="text" name="email"placeholder="EMAIL"><br>
			<input type="text" name="telefono"placeholder="TELEFONO"><br>
			<input type="submit" name="registrar" value="Registrar Usuario">
		</form>
	</div>
</body>
</html>