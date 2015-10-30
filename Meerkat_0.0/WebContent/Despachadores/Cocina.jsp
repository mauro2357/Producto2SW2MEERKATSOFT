<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="java.util.*" %>
<%@ page import="Controlador.*" %>
<head>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="../js/codigo.js"></script>
<link rel="stylesheet" href="../Css/cssindex.css" type="text/css">
<link rel="stylesheet" href="../Css/cssmesero.css" type="text/css">
<link rel="stylesheet" href="../Css/csspedido.css" type="text/css">
<link rel="stylesheet" href="../Css/estilosregistro.css" type="text/css">

<script type="text/javascript">
	
	var num,aux=-1;

	$(function() {
		ajaxx();
		if(aux!=num) aux=num; 
	});
	
	function ajaxx(){
		var Entrar = "imprimir_pedidos_despachador"; 
		$.post("/Meerkat_0.0/despachador", {
			entrar : Entrar,
		}, function(responseText) {
			$('#cuerpo').html(responseText);
		});
		num = document.getElementById("tabla").title;
		if(aux==-1) aux=num;
	}
	
	function mensaje(){
		if(num>aux){
			alert("Nuevo pedido recibido!");
			aux=num;
		}
	}
	
	setInterval(function(){
		ajaxx(),
		mensaje()
	}, 5000);
	
</script>
</head>
<body background="../fondo1.JPG" id="body">
	<div id="logo" align="center">
		<a href="/Meerkat_0.0/index.jsp"><img src="../images/logo.jpg" style="max-width: 100%; height: auto;"></a>
	</div>
	<div id="titulo"><h1><font face=meerkat size="100" color ="white">Despachador</font></h1></div>
	<br>
	<div id="cuerpo" align="center" class="contenedor"></div>
</body>