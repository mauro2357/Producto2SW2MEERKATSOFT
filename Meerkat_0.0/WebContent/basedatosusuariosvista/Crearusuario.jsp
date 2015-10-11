<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<link rel="stylesheet" href="Css/estilosregistro.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body background="fondo1.JPG">
<br>
	<div align="center">
	
		<form name="nuevo_usuario" method= "post" action="http://localhost:8080/Meerkat_0.0/mesero">
			<input type="hidden" name="entrar" value="datos_usuario">
			<input type="text" name="id" placeholder="Cedula"><br>
			<input type="text" name="nombre" placeholder="Nombre"><br>
			<input type="text" name="apellido"placeholder="Apellido"><br>
			<input type="text" name="sexo"placeholder="Sexo"><br>
			<input type="text" name="puntos"placeholder="Puntos"><br>
			<input type="text" name="musica"placeholder="Gusto Musical"><br>
			<input type="text" name="email"placeholder="Email"><br>
			<input type="text" name="telefono"placeholder="Telefono"><br>
			<button type="submit" name="registrar" value="Registrar">Registrar</button>
		</form>
	</div>
	<br>
</body>
</html>