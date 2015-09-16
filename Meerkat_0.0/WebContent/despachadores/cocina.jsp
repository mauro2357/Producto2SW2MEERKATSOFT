<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="cuerpo">
	<% 
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
</body>
</html>