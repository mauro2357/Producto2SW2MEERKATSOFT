<%@ page import="java.util.ArrayList"%>
<%@ page import="Negocio.pedido.*"%>

PRODUCTOS MAS VENDIDOS: <br>
	<%
	@SuppressWarnings("unchecked")
	ArrayList<Producto> y1 = (ArrayList<Producto>) session.getAttribute("productos-masvendidos");
	for(Producto producto: y1){
		out.println(producto.getNombre() + ".  Vendido: " + producto.getnventas() + " veces.");
		out.println("<br />");
	}%>
