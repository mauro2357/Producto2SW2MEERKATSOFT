<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<link rel="stylesheet" href="Css/estilosregistro.css" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script>
	function ir_controlador(){
		var Entrar = "datos_insumo";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
		});
	}
</script>
</head>
<body>
	<div align="center">
		<form name="nuevo_insumo" method= "post" action="/Meerkat_0.0/administrador">
			<input type="text" name="id" placeholder="ID"><br>
			<input type="text" name="nombre" placeholder="NOMBRE"><br>
			<input type="text" name="valor" placeholder="VALOR"><br>
			<input type="text" name="cantidad" placeholder="CANTIDAD"><br>
			<input type="hidden" name="entrar" value="datos_insumo">
			<input type="submit" name="registrar" value="Registrar insumo">
		</form>
	</div>
</body>
</html>