<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.tomaynotificacionpedidos.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		ArrayList<Producto> x = (ArrayList<Producto>) session.getAttribute("todos-los-productos");
		int i=0;
		for(Producto producto: x){
			%><input size="15" maxlength="15" name="<%out.print(producto.getCodigo());%>" id="<%out.print(i);%>" type="submit"
			value="<%out.println(producto.getNombre());%>" onclick="ingresarproducto(<%out.print(i);%>);"><%
			out.println(producto.getValor()); 
			i++;
			}
	%>
</body>
</html>