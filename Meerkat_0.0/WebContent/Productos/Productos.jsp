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
	var num,aux=-1;
	
	$(function() {
		ajax();
		if(aux!=num) aux=num; 
	});
	
	function ajax() {
		var Entrar = "botones"; 
		$.post("/Meerkat_0.0/mesero", {
			entrar : Entrar,
		}, function(responseText) {
			$('#cuerpo1').html(responseText);
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
		ajaxx();
	}
	
	function ajaxx(){
		var Entrar = "listarpedidoactual";
		$.post("/Meerkat_0.0/mesero", {
			entrar : Entrar,
		}, function(responseText) {
			$('#table1').html(responseText);
		});
		Entrar = "listar_mis_pedidos";
		$.post("/Meerkat_0.0/mesero", {
			entrar : Entrar,
		}, function(responseText) {
			$('#cuerpo3').html(responseText);
		});
		num = document.getElementById("numerodedespachados").title;
		if(aux==-1) aux=num;
	}
		
	function mensaje(){
		if(num>aux){
			alert("Nuevo pedido listo para entregar!");
			aux=num;
		}
	}
	
</script>
<body>
	<div id="cuerpo1" class="contenedor" align="center">
	</div>
	<div id="table1" align="center">
	</div>
	<div align="right">
		<form method="post" action="/Meerkat_0.0/mesero" onsubmit="ValidarFormProductos()" >
	      	<button name="entrar" type="submit" value="Cancelar">Cancelar</button>
	      	<input name="estado" type="hidden" value="En espera">
	      	<select name="cliente" id="selectclientes"></select>
	      	<input name="mesero" type="hidden" value="<%out.print(request.getParameter("id")); %>">
	      	<select name="mesa" id="selectmesas"></select>
	      	<button name="entrar" type="submit" value="Enviar pedido">Enviar</button>
		</form>
	</div>
	<div id="cuerpo3" class="Contenedor" align="center" style="border-color: white;"><h1>Mis pedidos. [<%out.print(0);%>]</h1></div>
</body>
</html>