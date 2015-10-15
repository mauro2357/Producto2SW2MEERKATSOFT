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
	if(x.size()==0 || x == null) out.println("No hay mesas con facturas");
	else{
		for(Map.Entry<Mesa, Factura> entry : x.entrySet()) {
    		%>
    		<div class="button" align="center" id="<%out.print(entry.getKey().getId());%>" onclick="esconderhijo()" ><% out.print("Mesa " + entry.getKey().getId());
	    		%><div class="toggle" id="productos" style="display: none;">
	    		<%
	    		for(Producto producto: entry.getValue().getPedido().getCuerpo()){
	    			%><%out.println(producto.getNombre() + "-" + entry.getValue().getPedido().cantidades.get(producto));%><%
	    		}
	    		%>
	    		<form action="http://localhost:8080/Meerkat_0.0/caja" method="post">
	    			<input type="submit" name="entrar" value="Cobrar">
	    			<input type="hidden" name="id" value="<%out.print(entry.getValue().getId());%>">
	    			<input type="hidden" name="mesa" value="<%out.print(entry.getKey().getId());%>">
	    		</form>
	    		</div><%
    		%></div>
    		<% 
			}
		}
%>