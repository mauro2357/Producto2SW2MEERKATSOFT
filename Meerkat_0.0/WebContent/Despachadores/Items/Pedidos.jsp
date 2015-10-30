
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="java.util.*" %>
<head>

</head>
<body>
<% @SuppressWarnings("unchecked")
   ArrayList<Factura> x = (ArrayList<Factura>) session.getAttribute("pedidos_en_cola"); %>
<div id="tabla" title="<%out.print(x.size());%>">
<table id="tablahtml"  style="background: rgba(255, 255, 255, 0.8); padding: 20px" border="1"> 
	<tr><td>Id</td><td>Mesa</td><td>Mesero</td><td>Cliente</td><td>Cajero</td><td>Productos</td><td></td><td></td></tr>
	<% 
			
			int i=1;
			if(x == null || x.size()==0) out.println("<h1>No hay facturas para despachar</h1>");
			else{
				for(Factura factura: x){
					%> <tr> 
					<td><%out.println(factura.getId());%> </td> 
					<td><%out.println(factura.getMesa().getId());%> </td> 
					<td><%out.println(factura.getMesero());%> </td> 
					<td><%out.println(factura.getCliente());%> </td> 
					<td><%out.println(factura.getCajero());%> </td> 
					<td>
						<table >
						<%
						for(Producto producto: factura.getPedido().getCuerpo()){%>
							<tr style="font-size: 30"><td><%out.println(factura.getPedido().getCantidades().get(producto));%></td><td><%out.println(producto.getNombre());%></td></tr><%
						}%>
						</table>
					</td>
					<td>
					<input size="auto" name="despachar" type="submit" value="Despachar" onclick="despacharpedido(<%out.print(factura.getId());%>)"></td>
					<td>
					<input size="auto" name="cancelar" type="submit" value="Cancelar" onclick="cancelarpedido(<%out.print(factura.getId());%>)"></td>
					</tr><%
				}
			}
		%>
</table>
</div>		
</body>