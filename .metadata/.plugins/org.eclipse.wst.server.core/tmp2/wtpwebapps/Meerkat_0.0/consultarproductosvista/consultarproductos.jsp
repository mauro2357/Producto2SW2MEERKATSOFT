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
        var url = '/Meerkat_0.0/consultarproductosvista/tablapedidos/tablapedidos.jsp?id='+x;
        alert(url);
        $("#table1").load(url);
	}
</script>
<title>Consultar productos</title>
<% ArrayList<Producto> pedido = new ArrayList<Producto>();
ArrayList<Producto> y = new ArrayList<Producto>(); 
Pedido z = new Pedido(pedido);%>
</head>
<body>
	<div id="boton1">
		<% consultarproductosFacade x = new consultarproductosFacade(); 
		y = x.main();
		for(Producto producto: y){
			%><input size="15" maxlength="15" name="producto-<%out.print(producto.getCodigo());%>" type="submit"
			value="<%out.println(producto.getNombre());%>" onclick="ingresarproducto(<%out.println(producto.getCodigo());%>);"><%
			out.println(producto.getValor()); 
			}
		%>
	</div>
	<div id="table1">
	</div>
</body>
</html>