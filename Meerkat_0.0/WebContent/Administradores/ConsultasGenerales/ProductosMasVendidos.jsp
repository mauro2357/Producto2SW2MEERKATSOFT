<%@ page import="java.util.ArrayList"%>
<%@ page import="Negocio.pedido.*"%>
<div align="center">
	Productos más vendidos: <br>
	<table>
		<%  @SuppressWarnings("unchecked")
			ArrayList<Producto> lista_productos = (ArrayList<Producto>) session.getAttribute("productos-masvendidos");
			for(Producto producto: lista_productos){%>
			<tr><td><%out.println(producto.nombre + ".  Vendido: " + producto.nventas + " veces.");%></td></tr>
			<%}%>
	</table>
</div>	
