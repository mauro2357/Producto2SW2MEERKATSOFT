<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="java.util.*" %>
<head>
<script type="text/javascript">
$(document).ready(function(){
    $('.button').click(function() {
    $(this).children('.toggle:first').slideToggle();
    }, function () {
        $(this).children('.toggle:first').slideToggle();
    });
 });
</script>
</head>
<% 
	@SuppressWarnings("unchecked")
	Map<Mesa,Factura> lista_mesas = (Map<Mesa,Factura>) session.getAttribute("mesas-facturas");
	if(lista_mesas.size()==0 || lista_mesas == null) out.println("<h1>No hay mesas con facturas</h1>");
	else{
		for(Map.Entry<Mesa, Factura> entry : lista_mesas.entrySet()) {
    		%>
    		<div class="button" align="center" id="<%out.print(entry.getKey().id);%>"><% out.print("Mesa " + entry.getKey().id);
	    		%><div class="toggle" id="productos" style="display: none;">
		    		<table border="1"><%
		    		for(Producto producto: entry.getValue().pedido.cuerpo){
		    			%><tr><%out.println("<td>" +producto.nombre + "</td><td>" + entry.getValue().pedido.cantidades.get(producto) + "</td><td>" + producto.valor*entry.getValue().pedido.cantidades.get(producto) + "</td>");%></tr><%
		    		}
		    		%>
		    		<tr><td colspan="2">Total:</td><td><%out.println(entry.getValue().pedido.precio_total);%></td></tr>
		    		</table>
	    		<div class="boton" style="border-color: black;" onclick="devolverprecio_mesa(<%out.print(entry.getValue().id);%>,<%out.print(entry.getKey().id);%>)">Pagar</div>
	    		</div><%
    		%></div>
    		<% 
			}
		}
%>