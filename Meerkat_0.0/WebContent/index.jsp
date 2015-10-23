<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.pedido.*"   %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Meerkat_0.0</title>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="Css/cssindex.css" type="text/css">
<link rel="stylesheet" href="Css/cssmesero.css" type="text/css">
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script> 
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script> 
<script src="js/codigo.js"></script>
<script type="text/javascript">
	$(function() {
			var Entrar = "imprimirmeseros";
			$.post("/Meerkat_0.0/login", {
			});
			$.post("/Meerkat_0.0/mesero", {
				entrar : Entrar,
			}, function(responseText) {
				$('#cuerpo').html(responseText);
			});			
	});
	
</script>
</head>
<body background="fondo1.JPG" id="body">
	<div id="logo" align="center">
		<a href="/Meerkat_0.0/index.jsp"><img src="images/logo.jpg" style="max-width: 100%; height: auto;"></a>
	</div>
	<center><h1><div id="titulo"><font face=meerkat size="100" color ="white">Meseros</div></h1></center>
	<div id="cuerpo" class="contenedor"></div>
	<br>
	<div id="menu" class="contenedor">
		<div class='icon' align="center" id="menu">
			<button type="button" onclick="ir_administrador()"><font face="meerkat" size="5" color ="white">Administrador</font></button>
			<input name="pass" id="pass" type="password" value="meerkat">
			<button type="button" onclick="location='despachadores/cocina.jsp'"><font face="meerkat" size="5" color ="white">Despachador</button>
			<button type="button" onclick="crear_usuario()"><font face="meerkat" size="5" color ="white">Crear Usuario</button>
			<button type="button" onclick="location='cajero/cajero.jsp'"><font face="meerkat" size="5" color ="white">Entrar a caja</button>
			<button type="button" onclick="location='listenyourmusicvista/audioplayer.html'"><font face="meerkat" size="5" color ="white">Liste your music</button>
			
		</div>
	</div>
	<div id="cuerpodos" class="contenedor"></div>
</body>
</html>