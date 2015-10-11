<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<table align="center">
		<%
		@SuppressWarnings("unchecked")
		ArrayList<Mesero> y1 = (ArrayList<Mesero>) session.getAttribute("todos-los-meseros");
		%><tr><%
		for(Mesero mesero: y1){
			%>
				<td align="center" style="background: rgba(300, 300, 300, 0.3);">
					<font face=meerkat size="90" color ="white"><br><%out.print(mesero.getNombre());%></font>
					<input size="15" maxlength="20" name="nombre_boton" type="image" src="images/mes.png" width="50%" onclick="definirmesero(<%out.print(mesero.getId());%>);">
				</td>
			<%
		}%></tr><%%>
	</table>
</body>
</html>