<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="java.util.*" %>
<link rel="stylesheet" href="cssproducto.css">
<table>
<% 
	@SuppressWarnings("unchecked")
	Map<Mesa,Factura> x = (Map<Mesa,Factura>) session.getAttribute("mesas-facturas");
	if(x.size()==0 || x == null) out.println("No hay mesas con facturas");
	else{
		for (Map.Entry<Mesa, Factura> entry : x.entrySet()) {
    		out.println("Key = " + entry.getKey().getId() + ", Value = " + entry.getValue().getPedido().getCuerpo());
		}
	}
%>
</table>