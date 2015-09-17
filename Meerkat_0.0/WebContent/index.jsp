<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="java.util.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Meerkat_0.0</title>
<link rel="stylesheet" href="cssproducto.css">
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="js/codigo.js"></script>
<script type="text/javascript">
	$(function() {
			var Entrar = "imprimirmeseros"; 
			$.post("/Meerkat_0.0/mesero", {
				entrar : Entrar,
			}, function(responseText) {
				$('#cuerpo').html(responseText);
			});			
	});
</script>
</head>
<body background="fondo1.JPG">
	<div id="logo" align="center">
		<a href="http://localhost:8080/Meerkat_0.0/index.jsp"><img src="logo.png" style="max-width: 100%; height: auto;"></a>
	</div>
	<div id="cuerpo"></div>
	<br>
	
	<div align="center">
		<button type="button" onclick="ir_administrador()">Administrador</button>
		<input name="pass" id="pass" type="password" value="meerkat">
		<button type="button" onclick="ir_despachador()">Despachador</button>
		<button type="button" onclick="crear_usuario()">Crear Usuario</button>
		<button type="button" onclick="entrar_a_caja()">Entrar a caja</button>
	</div>
</body>
</html>