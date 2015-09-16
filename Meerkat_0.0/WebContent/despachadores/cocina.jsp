<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="java.util.*" %>
	
	<div id="logo" align="center">
		<a href="http://localhost:8080/Meerkat_0.0/index.jsp"><img src="../logo.png" style="max-width: 100%; height: auto;"></a>
	</div>
	<div id="cuerpo" align="center">
	<table border="1">
	<% 
		@SuppressWarnings("unchecked")
		ArrayList<Factura> x = (ArrayList<Factura>) session.getAttribute("pedidos_en_cola");
		System.out.println(x);
		int i=1;
		if(x.size()==0) out.println("No hay facturas");
		else{
			for(Factura factura: x){
				%> <tr> <td>Id: <%
				out.println(factura.getId());
				%> </td> <td>Mesa: <%
				out.println(factura.getMesa());
				%> </td> <td>Mesero: <%
				out.println(factura.getMesero());
				%> </td> <td>Cliente: <%
				out.println(factura.getCliente());
				%> </td> <td>Cajero: <%
				out.println(factura.getCajero());
				%> </td> <td>Productos: 
				</td>
				<td>
					<table>
					<%
					for(Producto producto: factura.getPedido().getCuerpo()){%>
						<tr><td><%out.println(producto.getNombre());%></td></tr><%
					}%>
					</table>
				</td>
				<td><input size="auto" name="despachar" type="submit"
				value="Despachar"></td>
				</tr><%
			}
		}
	%>
	</table>
	</div>