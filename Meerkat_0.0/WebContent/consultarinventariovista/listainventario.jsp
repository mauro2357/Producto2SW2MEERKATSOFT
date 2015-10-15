<%@ page import="java.util.ArrayList"%>
<%@ page import="Negocio.pedido.*"%>
<div align="center">
	Inventario: <br>
	<table>
		<tr>
			<td>
				<%
				@SuppressWarnings("unchecked")
				ArrayList<Producto> y1 = (ArrayList<Producto>) session.getAttribute("todos-los-insumos");
				for(Producto producto: y1){
					out.println(producto.getNombre());
					out.println("<br />");
				}%>
			</td>
		</tr>
	</table>
</div>	