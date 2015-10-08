<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="java.util.*" %>
<%@ page import="Controlador.*" %>
<head>
<script src="../js/codigo.js"></script>
<script src="../js/jquery-1.11.3.js"></script>
<script src="../js/jquery-migrate-1.2.1.js"></script>
</head>

<br>
<table style="background: rgba(300, 300, 300,0.8); padding: 20px" > 
	<% 
			@SuppressWarnings("unchecked")
			ArrayList<Factura> x = (ArrayList<Factura>) session.getAttribute("pedidos_en_cola");
			int i=1;
			if(x == null || x.size()==0) out.println("No hay facturas");
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
							<tr><td><%out.println(producto.getNombre()); out.println(factura.getPedido().getCantidades().get(producto));%></td></tr><%
						}%>
						</table>
					</td>
					<td><input size="auto" name="despachar" type="submit" value="Despachar" onclick="despacharpedido(<%out.print(factura.getId());%>)"></td>
					</tr><%
				}
			}
		%>
</table>