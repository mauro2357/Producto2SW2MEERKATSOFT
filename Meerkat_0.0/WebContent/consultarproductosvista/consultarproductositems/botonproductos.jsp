<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="java.util.*" %>
<link rel="stylesheet" href="../cssproducto.css">
<script src="../js/codigo.js"></script>
<table>
<tr> 
<% 
	@SuppressWarnings("unchecked")
	ArrayList<Producto> x = (ArrayList<Producto>) session.getAttribute("todos-los-productos");
	int i=1;
	if(x.size()==0 || x == null) out.println("No hay productos");
	else{
		for(Producto producto: x){
			%>
			<td>
			<div class='jdg-container'>
				<div class='jdg-item'>
					<a href="javascript:ingresarproducto(<%out.print(i-1);%>);" id="<%out.print(i-1);%>" name="<%out.print(producto.getCodigo());%>">
						<img src="../images/<%out.print(producto.getImagen());%>"/>
			     	</a>
			     <p><%out.println(producto.getNombre());%> <%out.println(producto.getValor());%></p>
				</div>
			</div>
			</td>
			<% if(i%4==0){ %> </tr> <tr></tr> 	
			<%
			}
			i++;
		}
	}
%>

</table>


