<%@ page import="java.util.ArrayList"%>
<%@ page import="Negocio.pedido.*"%>
<div align="center">
	Inventario: <br>
	<table>
		<%  @SuppressWarnings("unchecked")
			ArrayList<Producto> lista_insumos = (ArrayList<Producto>) session.getAttribute("todos-los-insumos");
			for(Producto producto: lista_insumos){ %>
			<tr><td><%out.println(producto.nombre);%></td></tr><%	
			}%>
	</table>
</div>	