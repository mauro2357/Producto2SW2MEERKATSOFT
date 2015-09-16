<%@ page import="java.util.ArrayList"%>
<%@ page import="Negocio.inventario.*"%>
<%@ page import="Negocio.pedido.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		PRODUCTOS MAS VENDIDOS: <br>
		<% 		
		ArrayList<Producto> y1 = (ArrayList<Producto>) session.getAttribute("productos-masvendidos");
		for(Producto producto: y1){
			out.println(producto.getNombre() + ".  Vendido: " + producto.getnventas() + " veces.");
			out.println("<br />");
		}%>



</body>
</html>
