<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.tomaynotificacionpedidos.*" %>
<%@ page import="java.util.*" %>




<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Meerkat_0.0</title>
</head>
<body>
	Meseros:
	<form method="get" action="consultarproductosvista/consultarproductos.jsp">
		<% consultarmeserosFacade x1 = new consultarmeserosFacade(); 
		ArrayList<Mesero> y1 = x1.main();
		for(Mesero mesero: y1){
			%><input size="15" maxlength="20" name="mesero-<%out.println(mesero.getId());%>" type="submit" value="<%out.println(mesero.getNombre());%>"><%
		}%>
	</form>
	
		
</body>
</html>