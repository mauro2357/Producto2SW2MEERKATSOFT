<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
			<%
			@SuppressWarnings("unchecked")
			ArrayList<Mesero> y1 = (ArrayList<Mesero>) session.getAttribute("todos-los-meseros");
			for(Mesero mesero: y1){
				%><div class="boton" onclick="definirmesero(<%out.print(mesero.getId());%>);">
						<img src="images/mes.png" width="40%">
						<font size="90" color="white"><%out.print(mesero.getNombre());%></font>
				</div>
				<%
			}%>
	
</body>
