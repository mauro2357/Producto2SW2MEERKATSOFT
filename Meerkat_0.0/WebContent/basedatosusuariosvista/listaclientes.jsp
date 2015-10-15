<%@ page import="java.util.ArrayList"%>
<%@ page import="Negocio.cliente.*"%>
<div align="center">
	Clientes: <br>
	<table>
		<tr>
			<td>
				<%
				@SuppressWarnings("unchecked") 		
				ArrayList<Cliente> y1 = (ArrayList<Cliente>) session.getAttribute("todos-los-clientes");
				for(Cliente cliente: y1){
					out.println(cliente.getNombre() + " " + cliente.apellido + ".  Telefono: " + cliente.getTelefono());
					out.println("<br />");
				}%>
			</td>
		</tr>
	</table>
</div>	
	

