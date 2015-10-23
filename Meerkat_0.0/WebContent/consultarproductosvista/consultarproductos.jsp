<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.cliente.*" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">	
	$(function() {
			var Entrar = "botones"; 
			$.post("/Meerkat_0.0/mesero", {
				entrar : Entrar,
			}, function(responseText) {
				$('#cuerpo1').html(responseText);
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
<body>
	<div id="cuerpo1" class="contenedor" align="center">
	</div>
	<div id="table1" align="center">
	</div>
	<div align="right">
		<form method="post" action="/Meerkat_0.0/mesero" >
		      	<button name="entrar" type="submit" value="Cancelar">Cancelar</button>
		      	<input name="estado" type="hidden" value="En espera">
		      	<select name="cliente" id="selectclientes"></select>
		      	<input name="mesero" type="hidden" value="<%out.print(request.getParameter("id")); %>">
		      	<select name="mesa" id="selectmesas"></select>
		      	<button name="entrar" type="submit" value="Enviar pedido" onclick="ejecutar()">Enviar</button>
		</form>
	</div>
</body>
</html>