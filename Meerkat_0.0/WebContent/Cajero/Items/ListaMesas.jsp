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
	Map<String,ArrayList<Factura>> lista_mesas = (Map<String,ArrayList<Factura>>) session.getAttribute("mesas-facturas");
	if(lista_mesas.size()==0 || lista_mesas == null) out.println("<h1>No hay mesas con facturas</h1>");
	else{
		for(Map.Entry<String, ArrayList<Factura>> entry : lista_mesas.entrySet()) {
    		%>
    		<div class="button" align="center" id="<%out.print(entry.getKey());%>"><% out.print("Mesa " + entry.getKey());
	    		%><div class="toggle" id="productos" style="display: none;">
		    		<table border="1"><%
		    		int preciototal=0;
		    		for(Factura factura: entry.getValue()){
			    		preciototal+=factura.pedido.precio_total;
			    		for(Producto producto: factura.pedido.cuerpo){
			    			%><tr><%out.println("<td>" +producto.nombre + "</td><td>" + factura.pedido.cantidades.get(producto) + "</td><td>" + producto.valor*factura.pedido.cantidades.get(producto) + "</td>");%></tr><%
			    		}
		    		}%>
		    		<tr><td colspan="2">Total:</td><td><%out.println(preciototal);%></td></tr>
		    		</table>
	    		<div class="boton" style="border-color: black;" onclick="devolverprecio_mesa(<%out.print(entry.getKey());%>)">Pagar</div>
	    		</div><%
    		%></div>
    		<% 
			}
		}
%>