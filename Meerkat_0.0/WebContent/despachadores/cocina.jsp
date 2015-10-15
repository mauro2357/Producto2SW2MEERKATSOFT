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
<script type="text/javascript">
	$(function() {
		var Entrar = "imprimir_pedidos_despachador"; 
		$.post("/Meerkat_0.0/despachador", {
			entrar : Entrar,
		}, function(responseText) {
			$('#cuerpo').html(responseText);
		});			
	});
</script>
</head>
<body background="../fondo1.JPG" id="body">
	<div id="logo" align="center">
		<a href="http://localhost:8080/Meerkat_0.0/index.jsp"><img src="../images/logo.jpg" style="max-width: 100%; height: auto;"></a>
	</div>
	<div id="cuerpo" align="center"></div>
</body>