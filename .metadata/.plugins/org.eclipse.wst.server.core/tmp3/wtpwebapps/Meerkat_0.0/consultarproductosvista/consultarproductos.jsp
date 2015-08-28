<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.tomaynotificacionpedidos.*" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript">	
	function ingresarproducto(x){
		var Entrar = "ingresarproducto";
		y = document.getElementById(x);
		x = y.name;
		$.post("/Meerkat_0.0/mesero", {
			entrar : Entrar,
			idp : x
		}, function(responseText) {
			$('#table1').html(responseText);
		});
	}
	
	$(function() {
			var Entrar = "botones"; 
			$.post("/Meerkat_0.0/mesero", {
				entrar : Entrar,
			}, function(responseText) {
				$('#boton1').html(responseText);
			});
			Entrar = "listarpedidoactual";
			$.post("/Meerkat_0.0/mesero", {
				entrar : Entrar,
			}, function(responseText) {
				$('#table1').html(responseText);
			});
		});
	
</script>
<title>Productos</title>
</head>
<body background="fondo.jpg">
	<div id="boton1" align="center">
	</div>
	<div id="table1" align="center">
	</div>
	<form method="post" action="http://localhost:8080/Meerkat_0.0/mesero">
	      	<input name="entrar" type="submit" value="Terminar"/>
	      	<input name="estado" type="hidden" value="En espera">
	      	<input name="cliente" type="text" value="Cliente #1001 - #1003">
	      	<input name="mesero" type="hidden" value="<%out.print(request.getParameter("id")); %>">
			<input name="mesa" type="text" value="Mesa #1-10">
	      	<input name="cajero" type="text" value="Cajero #null">
	      	<input name="entrar" type="submit" value="Enviar pedido">
	</form>
</body>
</html>