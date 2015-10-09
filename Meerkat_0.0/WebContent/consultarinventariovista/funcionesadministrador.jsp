<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="consultarinventariovista/cssadm.css" type="text/css">
<link rel="stylesheet" href="cssindex.css" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
</head>
<div class="f" align="center">
<button type="button" onclick="consultar_inventario()">Consultar inventario</button>
<br>
<button type="button" onclick="crear_despachador()">Crear despachador</button>
<br>
<button type="button" onclick="crear_mesero()">Crear mesero</button>
<br>
<button type="button" onclick="consultar_clientes()">Consultar Clientes</button>
<br>
<button type="button" onclick="consultar_totalVentas()">Total ventas</button>
<br>
<button type="button" onclick="productos_masvendidos()">Productos más Vendidos</button>
<br>
<form action="http://localhost:8080/Meerkat_0.0/administrador" method="post">
	<input type="submit" value="Pagar" >
	<input type="hidden" value="Pagarm" name="entrar">
</form>

</div>
</body>
</html>