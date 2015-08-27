<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.tomaynotificacionpedidos.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%	String datoUno = request.getParameter("idp");
		consultarproductosFacade x = new consultarproductosFacade();
		ArrayList<Producto> y = x.main();
		consultarpedidosFacade x1 = new consultarpedidosFacade();
		ArrayList<Producto> z = x1.main(2);
		Pedido pedido = null;
		if(z.size()==0){
			out.print("entró if");
			pedido = new Pedido(z);
		}
		for(Producto producto: y){
			if(producto.getCodigo().equals(datoUno)){ 
				z.add(producto);
				};
		}
		pedido.setCuerpo(z);
		ArrayList<Producto> visitados = new ArrayList<Producto>();
		for(Producto producto: pedido.getCuerpo()){
			if(visitados.contains(producto)) continue;
			int aux=0;
			for(Producto auxproducto: pedido.getCuerpo()){
				if(producto==auxproducto){
					aux++;
					visitados.add(auxproducto);
				}
			}
			out.print(producto.getNombre());
			out.print(" " + aux);
		}
	%>
</body>
</html>