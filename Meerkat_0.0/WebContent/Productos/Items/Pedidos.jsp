<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="java.util.*" %>
<table style="color: white;">
<%
	@SuppressWarnings("unchecked")
	ArrayList<Factura> mis_pedidos = (ArrayList<Factura>) session.getAttribute("mis_pedidos");
	int des = 0;
	if(mis_pedidos==null) out.print("<h1>No tienes pedidos en cola</h1>");
	else
	{
		for(Factura factura: mis_pedidos){
			%><tr bgcolor="<%if(factura.pedido.estado.equalsIgnoreCase("Despachado")){out.print("green");des++;}else{out.print("red");}%>"><td> ID: <%out.print(factura.id);%></td><td> Mesa: <%out.print(factura.mesa.id);%></td><td> Estado: <%out.print(factura.pedido.estado);%></td></tr><%
		}
	}
%>
</table>
<div id="numerodedespachados" title="<%out.print(des);%>"></div>