<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="java.util.*" %>
<head>
	<link rel="stylesheet" href="Css/cssproducto.css">
</head>
<body>
<% 
	@SuppressWarnings("unchecked")
	ArrayList<Producto> listaproductos = (ArrayList<Producto>) session.getAttribute("todos-los-productos");
	if(listaproductos.size()==0 || listaproductos == null) out.println("No hay productos");
	else{
		int i=0;
		for(Producto producto: listaproductos){
			%>
			<div class="boton" style="background-color: rgba(0,0,0,0.5)">
				<div class='jdg-container'>
					<div class='jdg-item'>
						<a href="javascript:ingresarproducto(<%out.print(i-1);%>);" id="<%out.print(i-1);%>" title="<%out.print(producto.codigo);%>">
							<img src="images/<%out.print(producto.imagen);%>"/>
				     	</a>
				     <p><%out.println(producto.nombre);%>   $<%out.println(producto.valor);%></p>
					</div>
				</div>
			</div>
			<% 
			i++;
		}
	}
%>
</body>



