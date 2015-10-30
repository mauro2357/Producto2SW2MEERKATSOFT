<%@ page import="java.util.ArrayList"%>
<%@ page import="Negocio.cliente.*"%>
<div align="center">
	Clientes: <br>
	<table>
		<%  @SuppressWarnings("unchecked") 		
			ArrayList<Cliente> lista_clientes = (ArrayList<Cliente>) session.getAttribute("todos-los-clientes");
			for(Cliente cliente: lista_clientes){%>
			<tr><td><%out.print(cliente.nombre + " " + cliente.apellido);%></td><td><%out.print("Puntos Acumulados: " + cliente.puntos);%></td></tr>
			<%}%>
	</table>
</div>	
	

