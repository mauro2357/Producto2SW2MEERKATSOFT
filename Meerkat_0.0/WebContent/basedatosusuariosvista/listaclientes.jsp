<%@ page import="java.util.ArrayList"%>
<%@ page import="Negocio.cliente.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
		Clientes: <br>
		<%
		@SuppressWarnings("unchecked") 		
		ArrayList<Cliente> y1 = (ArrayList<Cliente>) session.getAttribute("todos-los-clientes");
		for(Cliente cliente: y1){
			out.println(cliente.getNombre() + " " + cliente.apellido + ".  Telefono: " + cliente.getTelefono());
			out.println("<br />");
		}%>

</body>
</html>
