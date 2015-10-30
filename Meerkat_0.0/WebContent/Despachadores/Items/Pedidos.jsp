
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="java.util.*" %>
<head>

</head>
<body>
<% @SuppressWarnings("unchecked")
   ArrayList<Factura> lista_facturas = (ArrayList<Factura>) session.getAttribute("pedidos_en_cola"); %>
<div id="tabla" title="<%out.print(lista_facturas.size());%>">
<table id="tablahtml"  style="background: rgba(255, 255, 255, 0.8); padding: 20px" border="1"> 
	<tr><td>Id</td><td>Mesa</td><td>Mesero</td><td>Cliente</td><td>Productos</td><td></td><td></td></tr>
	<% 
			int i=1;
			if(lista_facturas == null || lista_facturas.size()==0) out.println("<h1>No hay facturas para despachar</h1>");
			else{
				for(Factura factura: lista_facturas){
					%> <tr> 
					<td><%out.println(factura.id);%> </td> 
					<td><%out.println(factura.mesa.id);%> </td> 
					<td><%out.println(factura.mesero);%> </td> 
					<td><%out.println(factura.cliente);%> </td> 
					<td>
						<table >
						<%
						for(Producto producto: factura.pedido.cuerpo){%>
							<tr style="font-size: 30"><td><%out.println(factura.pedido.cantidades.get(producto));%></td><td><%out.println(producto.nombre);%></td></tr><%
						}%>
						</table>
					</td>
					<td>
					<input size="auto" name="despachar" type="submit" value="Despachar" onclick="despacharpedido(<%out.print(factura.id);%>)"></td>
					<td>
					<input size="auto" name="cancelar" type="submit" value="Cancelar" onclick="cancelarpedido(<%out.print(factura.id);%>)"></td>
					</tr><%
				}
			}
		%>
</table>
</div>		
</body>