<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="Css/cssadm.css" type="text/css">
</head>
<div class="contenedor">
	<div class="botona" onclick="consultar_inventario()">Consultar inventario</div>
	<div class="botona" onclick="crear_despachador()">Crear despachador</div>
	<div class="botona" onclick="crear_mesero()">Crear mesero</div>
	<div class="botona" onclick="consultar_clientes()">Consultar Clientes</div>
	<div class="botona" onclick="consultar_totalVentas()">Total ventas</div>
	<div class="botona" onclick="productos_masvendidos()">Productos más Vendidos</div>
	<form action="http://localhost:8080/Meerkat_0.0/administrador" method="post">
		<button type="submit" value="Pagar" class="botona">Pagar</button> 
		<input type="hidden" value="Pagarm" name="entrar">
	</form>
</div>
</body>
</html>