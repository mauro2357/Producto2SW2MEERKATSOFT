
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="js/codigo.js"></script>
<script type="text/javascript">
	function quitar_producto(x){
    	var Entrar = "quitarproducto";
		$.post("/Meerkat_0.0/mesero", {
			entrar : Entrar,
			idp : x.title
		}, function(responseText) {
			$('#table1').html(responseText);
		});
	}
	
</script>
</head>
<body>
	<br>
	<div style="max-width: 100%; height:70%; font-size: 40px; color: white;">
		<table id="tablapedidos" border="1" cellpadding="1" cellspacing="0" style="background: rgba(300, 300, 300, 0.5);">
			<tr><td>Producto</td><td>Cantidad</td><td>Precio</td><td></td></tr>
		<%	@SuppressWarnings("unchecked")
			ArrayList<Producto> productos_pedido = (ArrayList<Producto>) session.getAttribute("productos-pedido");
			if(productos_pedido==null) productos_pedido = new ArrayList<Producto>();
			ArrayList<String> visitados = new ArrayList<String>();
			int total=0;
			int totalindividual=0;
			for(Producto producto: productos_pedido){
				if(visitados.contains(producto.codigo)) continue;
				int aux=0;
				for(Producto auxproducto: productos_pedido){
					if(producto.codigo.equalsIgnoreCase(auxproducto.codigo)){
						visitados.add(auxproducto.codigo);
						aux++;
					}
					totalindividual = producto.valor * aux;
				}
				total += producto.valor * aux;
				%>
				<tr><td><%out.print(producto.nombre);%></td><td align="right"><%out.print(aux);%></td><td><%out.print(totalindividual);%></td><td><div class="cancelar" id="<%out.print(producto.codigo);%>" onclick="quitar_producto(<%out.print(producto.codigo);%>)" title="<%out.print(producto.codigo);%>" style="cursor:pointer;">Quitar</div></td></tr>
			<%}%>
			<tr><td colspan="2"><%out.print("Total"); %></td><td><%out.print(total); %></td></tr>
		</table>
	</div>
</body>
</html>