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
	Map<Mesa,Factura> x = (Map<Mesa,Factura>) session.getAttribute("mesas-facturas");
	if(x.size()==0 || x == null) out.println("<h1>No hay mesas con facturas</h1>");
	else{
		for(Map.Entry<Mesa, Factura> entry : x.entrySet()) {
    		%>
    		<div class="button" align="center" id="<%out.print(entry.getKey().getId());%>"><% out.print("Mesa " + entry.getKey().getId());
	    		%><div class="toggle" id="productos" style="display: none;">
		    		<table border="1"><%
		    		for(Producto producto: entry.getValue().getPedido().getCuerpo()){
		    			%><tr><%out.println("<td>" +producto.getNombre() + "</td><td>" + entry.getValue().getPedido().cantidades.get(producto) + "</td><td>" + producto.getValor()*entry.getValue().getPedido().cantidades.get(producto) + "</td>");%></tr><%
		    		}
		    		%>
		    		<tr><td colspan="2">Total:</td><td><%out.println(entry.getValue().getPedido().getPrecio_total());%></td></tr>
		    		</table>
	    		<div class="boton" style="border-color: black;" onclick="devolverprecio_mesa(<%out.print(entry.getValue().getId());%>,<%out.print(entry.getKey().getId());%>)">Pagar</div>
	    		</div><%
    		%></div>
    		<% 
			}
		}
%>