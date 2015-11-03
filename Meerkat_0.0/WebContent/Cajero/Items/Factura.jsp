<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="Negocio.cliente.*" %>
<%@ page import="java.util.*" %>

<%ArrayList<Factura> facturas = (ArrayList<Factura>) session.getAttribute("Factura"); %>
<%Cliente cliente = (Cliente) session.getAttribute("Cliente"); %>
<%int preciototal=0;%>
<table style="color: white; ">
	<tr><td>Factura:</td><td><%for(Factura factura: facturas) {out.print(factura.id);preciototal+=factura.pedido.precio_total;}%></td></tr>
	<tr><td>Mesero:</td><td><%out.println(facturas.get(0).mesero);%></td></tr>
	<tr><td>Precio:</td><td><%out.println(preciototal);%></td></tr>
	<tr><td>
		<table style="color: white;">
			<tr><td>Nombre: </td><td>Cantidad: </td></tr>
			<%for(Factura factura: facturas){
				for(Producto producto: factura.pedido.cuerpo){
			 		%><tr><td><%out.println(producto.nombre);%></td><td align="right"><%out.println(factura.pedido.cantidades.get(producto));%></td></tr>
			 	<%}
			 }%>
		</table>
	</td></tr>
	<tr><td>IVA:</td><td><%out.println((preciototal*0.16));%></td></tr>
	<tr><td>Propina:</td><td><%out.println("0");%></td></tr>
	<tr><td>Cajero:</td><td><%out.println(facturas.get(0).cajero);%></td></tr>
	<tr><td>Cliente:</td><td><%out.println(cliente.nombre);%></td></tr>
	<tr><td>Puntos:</td><td><%out.println(cliente.puntos);%></td></tr>
	<tr><td>Cliente:</td><td><%out.println(cliente.id);%></td></tr>
</table>
