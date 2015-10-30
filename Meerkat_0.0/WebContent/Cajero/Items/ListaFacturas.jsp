<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="Negocio.cliente.*" %>
<%@ page import="java.util.*" %>
<% @SuppressWarnings("unchecked")
ArrayList<Factura> lista_factura = (ArrayList<Factura>) session.getAttribute("lista_facturas_realizadas");
for(Factura factura: lista_factura){
	%>
	<div onclick="abrircerrarfactura(<%out.print(factura.getId() + "0000");%>)"><%out.println(factura.id);%>
		<div id="<%out.print(factura.getId() + "0000");%>">
			<table style="color: white; ">
				<tr><td>Factura:</td><td><%out.println(factura.id);%></td></tr>
				<tr><td>Mesero:</td><td><%out.println(factura.mesero);%></td></tr>
				<tr><td>Precio:</td><td><%out.println(factura.pedido.precio_total);%></td></tr>
				<tr><td>
					<table style="color: white;">
						<tr><td>Nombre: </td><td>Cantidad: </td></tr>
						<%for(Producto producto: factura.pedido.cuerpo){
						 	%><tr><td><%out.println(producto.nombre);%></td><td align="right"><%out.println(factura.pedido.cantidades.get(producto));%></td></tr>
						 <%}%>
					</table>
				</td></tr>
				<tr><td>IVA:</td><td><%out.println((factura.pedido.precio_total*0.16));%></td></tr>
				<tr><td>Propina:</td><td><%out.println("0");%></td></tr>
				<tr><td>Mesero:</td><td><%out.println(factura.mesero);%></td></tr>
				<tr><td>Cajero:</td><td><%out.println(factura.cajero);%></td></tr>
			</table>
		</div>
	</div><%
}
%>
