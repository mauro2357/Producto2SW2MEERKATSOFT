<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.tomaynotificacionpedidos.*" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Meerkat_0.0</title>

<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript">
	
	$(function() {
			var Entrar = "imprimirmeseros"; 
			$.post("/Meerkat_0.0/mesero", {
				entrar : Entrar,
			}, function(responseText) {
				$('#cuerpo').html(responseText);
			});			
			
		});
	function definirmesero(x){
		var Entrar = "definirmesero";
		$.post("/Meerkat_0.0/mesero", {
			entrar : Entrar,
			meseroi : x
		}, window.location.replace("consultarproductosvista/consultarproductos.jsp"));
	}
	
	
	
	// Aquí debería ir una funcion para ingresar como administrador.
	// me remite a una funcionesadministrador.jsp para las acciones que puede hacer el administrador.
	
	
</script>
</head>

<body background="fondo1.JPG">
	<center><h1><font color ="white">Administrador:</font></h1></center>
	<center><a href="consultarinventariovista/funcionesadministrador.jsp"><img src="admin.png" width="300px" height="300px"> </center>
	<center><h1><font color ="white">Meseros:</font></h1></center>
	<div id="cuerpo"></div>
	
</body >
</html>