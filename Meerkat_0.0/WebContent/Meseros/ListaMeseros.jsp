<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="java.util.*" %>
<body>
	<%
	@SuppressWarnings("unchecked")
	ArrayList<Mesero> listameseros = (ArrayList<Mesero>) session.getAttribute("todos-los-meseros");
	for(Mesero mesero: listameseros){
		%><div class="boton" onclick="definirmesero(<%out.print(mesero.id);%>);">
				<img src="images/mes.png" width="40%">
				<font size="90" color="white"><%out.print(mesero.nombre);%></font>
		</div>
		<%
	}%>
</body>
