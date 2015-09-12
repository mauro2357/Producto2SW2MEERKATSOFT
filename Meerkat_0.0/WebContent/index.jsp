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
	
	function ir_administrador(){
		var Entrar = "ir_administrador";
		var Pass = $('#pass').val();
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
			pass : Pass 
		},
		function(responseText) {
				if(responseText!=""){
				window.location.replace("consultarinventariovista/funcionesadministrador.jsp");}
				else{alert("contrasena incorrecta");}
			});
	}
	
	function ir_despachador(){
		var Entrar = "ir_despachador";
		$.post("/Meerkat_0.0/despachador", {
			entrar : Entrar,
		}, window.location.replace("despachadores/cocina.jsp"));
	}
	
	function crear_usuario(){
		var Entrar = "crear_usuario";
		$.post("/Meerkat_0.0/mesero", {
			entrar : Entrar,
		}, window.location.replace("basedatosusuariosvista/Crearusuario.jsp"));
	}
		
</script>
</head>

<body>
	<div id="cuerpo"></div>
	<br></br>
	<form action=""></form>
	<button type="button" onclick="ir_administrador()">Administrador</button>
	<input name="pass" id="pass" type="password">
	<button type="button" onclick="ir_despachador()">Despachador</button>
	<button type="button" onclick="crear_usuario()">Crear Usuario</button>	
</body>
</html>