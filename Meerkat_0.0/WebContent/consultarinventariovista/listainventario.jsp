<%@ page import="java.util.ArrayList"%>
<%@ page import="Negocio.pedido.*"%>

		INVENTARIO: <br>
		<%
		@SuppressWarnings("unchecked")
		ArrayList<Producto> y1 = (ArrayList<Producto>) session.getAttribute("todos-los-insumos");
		for(Producto producto: y1){
			out.println(producto.getNombre());
			out.println("<br />");
		}%>

