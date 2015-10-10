<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="java.util.*" %>
<link rel="stylesheet" href="../cssproducto.css">
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
<table>
<tr>
<% 
	@SuppressWarnings("unchecked")
	Map<Mesa,Factura> x = (Map<Mesa,Factura>) session.getAttribute("mesas-facturas");
	int i=0;
	if(x.size()==0 || x == null) out.println("No hay mesas con facturas");
	else{
		for(Map.Entry<Mesa, Factura> entry : x.entrySet()) {
    		%>
    		<td>
    		<div class="button" align="center" id="<%out.print(entry.getKey().getId());%>" onclick="esconderhijo()" ><% out.print("Mesa " + entry.getKey().getId());
	    		%><div class="toggle" id="productos" style="display: none;">
	    		<table><%
	    		for(Producto producto: entry.getValue().getPedido().getCuerpo()){
	    			%><tr><%out.println(producto.getNombre() + "-" + entry.getValue().getPedido().cantidades.get(producto));%></tr><%
	    		}
	    		%></table>
	    		<form action="http://localhost:8080/Meerkat_0.0/caja" method="post">
	    			<input type="submit" name="entrar" value="Cobrar">
	    			<input type="hidden" name="id" value="<%out.print(entry.getValue().getId());%>">
	    		</form>
	    		</div><%
    		%></div>
    		</td>
    		<% if(i%4==0){ %> </tr> <tr></tr>
    		<%
    			}
    		i++;
			}
		}
%>
</table>