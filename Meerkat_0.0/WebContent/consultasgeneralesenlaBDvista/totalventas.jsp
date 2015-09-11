<%@ page import="java.util.ArrayList"%>
<%@ page import="Negocio.actualizarinventario.Administrador"%>
<%@ page import="Negocio.tomaynotificacionpedidos.Producto"%>

<%@ page import="Negocio.actualizarinventario.Administrador"%>
<%@ page import="Negocio.basedatosclientes.Cliente"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		Total ventas: <br>
		<% 		
		out.print(session.getAttribute("todas-ventas"));
			out.println("<br />");
		System.out.print(session.getAttribute("todas-ventas"));
		%>



</body>
</html>
