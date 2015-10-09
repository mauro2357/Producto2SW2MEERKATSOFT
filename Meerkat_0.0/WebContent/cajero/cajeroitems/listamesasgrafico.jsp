<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="java.util.*" %>
<link rel="stylesheet" href="cssproducto.css">
<head>
<script type="text/javascript">
function esconderhijo(){
	$(this).next('div').fadeToggle("fast", function () {
    });
}
</script>

</head>
<% 
	@SuppressWarnings("unchecked")
	Map<Mesa,Factura> x = (Map<Mesa,Factura>) session.getAttribute("mesas-facturas");
	if(x.size()==0 || x == null) out.println("No hay mesas con facturas");
	else{
		for(Map.Entry<Mesa, Factura> entry : x.entrySet()) {
    		%><div id="<%out.print(entry.getKey().getId());%>" onclick="esconderhijo()" ><% out.print("Mesa " + entry.getKey().getId());
	    		%><div id="productos"><%
	    		out.print("Productos = ");
	    		for(Producto producto: entry.getValue().getPedido().getCuerpo()){
	    			out.print(producto.getNombre() + entry.getValue().getPedido().cantidades.get(producto));
	    		}
	    		%></div><%
    		%></div><%
		}
	}
%>