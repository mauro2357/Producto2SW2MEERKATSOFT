<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.cliente.*" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href='https://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="../js/codigo.js"></script>
<script type="text/javascript">	
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
			Entrar = "listar_mesas";
			$.post("/Meerkat_0.0/mesero", {
				entrar : Entrar,
			}, function(responseText) {
				$('#selectmesas').html(responseText);
			});
			Entrar = "listar_clientes";
			$.post("/Meerkat_0.0/mesero", {
				entrar : Entrar,
			}, function(responseText) {
				$('#selectclientes').html(responseText);
			});
		});
	
</script>
<title>Productos</title>
</head>
<body background="fondo.jpg">
	<div id="logo" align="center">
		<a href="http://localhost:8080/Meerkat_0.0/index.jsp"><img src="../logo.jpg" style="max-width: 100%; height: auto;"></a>
	</div>
	<br>
	<br>
	<center><h1>PRODUCTOS</h1></center>
	<div id="boton1" align="center">
	</div>
	<div id="table1" align="center">
	</div>
	<div align="right">
		<form method="post" action="http://localhost:8080/Meerkat_0.0/mesero" >
		      	<input name="entrar" type="submit" value="Cancelar"/>
		      	<input name="estado" type="hidden" value="En espera">
		      	<select name="cliente" id="selectclientes"></select>
		      	<input name="mesero" type="hidden" value="<%out.print(request.getParameter("id")); %>">
		      	<select name="mesa" id="selectmesas"></select>
		      	<input name="entrar" type="submit" value="Enviar pedido" onclick="ejecutar()">
		</form>
	</div>
</body>
</html>