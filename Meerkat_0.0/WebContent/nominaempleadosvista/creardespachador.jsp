<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
	function ir_controlador(){
		var Entrar = "datos_despachador";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
		});
	}
</script>
</head>
<body>
<form name="nuevo_usuario" method= "post" action="http://localhost:8080/Meerkat_0.0/administrador">
	<input type="text" name="Id"><br>
	<input type="text" name="nombre"><br>
	<input type="text" name="apellido"><br>
	<input type="text" name="telefono"><br>
	<input type="hidden" name="entrar" value="datos_despachador">
	<input type="submit" name="registrar" value="Registrar despachador">
</form>
</body>
</html>