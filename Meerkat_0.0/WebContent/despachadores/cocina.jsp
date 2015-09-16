<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="java.util.*" %>
	<div id="cuerpo">
	<% 
		@SuppressWarnings("unchecked")
		ArrayList<Factura> x = (ArrayList<Factura>) session.getAttribute("pedidos_en_cola");
		System.out.println(x);
		int i=1;
		if(x.size()==0) out.println("No hay facturas");
		else{
			for(Factura factura: x){
				%> Id: <br> <%
				out.println(factura.getId());
				%> Mesa: <br> <%
				out.println(factura.getMesa());
				%> Mesero: <br> <%
				out.println(factura.getMesero());
				%> Cliente: <br> <%
				out.println(factura.getCliente());
				%> Cajero: <br> <%
				out.println(factura.getCajero());
				%> Productos: <br> <%
				for(Producto producto: factura.getPedido().getCuerpo()){
					out.println(producto.getNombre());
					%> <br> <%
				}
				%> <br> <%
			}
		}
	%>
	</div>