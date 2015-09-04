<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<input type="button" value="Consultar inventario" onclick="genera_tabla()">

<script type="text/javascript">

	function consultar_insumos(){
		var Entrar = "consultar_inventario";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
		},  window.location.replace("consultarinventariovista/listainventario.jsp")); // Está pendiente por organizarse hacia donde me redirige 
	}
</script>

<button type="button" onclick="consultar_insumos">Consultar Inventario</button>
<div id="myDiv"></div>
</body>
</html>