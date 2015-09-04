<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="Negocio.tomaynotificacionpedidos.*" %>
<%@ page import="Negocio.geraciondefactura.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="cuerpo">
	cuerpo
	<% 
		ArrayList<Factura> x = (ArrayList<Factura>) session.getAttribute("pedidos_en_cola");
		int i=1;
		if(x == null) out.println("No hay facturas");
		else{
			for(Factura factura: x){
				out.println(factura.getId());
				out.println(factura.getMesa());
				out.println(factura.getMesero());
				out.println(factura.getCliente());
				out.println(factura.getCajero());
				for(Producto producto: factura.getPedido().getCuerpo()){
					out.println(producto.getNombre());
				}
			}
		}
	%>
	</div>
</body>
</html>