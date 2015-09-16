<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="java.util.*" %>


<option>Mesa</option>
<%
	@SuppressWarnings("unchecked")
	ArrayList<Mesa> lista_mesas = (ArrayList<Mesa>) session.getAttribute("lista-mesas");
	if(lista_mesas==null) out.print("No hay mesas");
	else
	{
		for(Mesa mesa: lista_mesas){
			%><option><%out.print(mesa.getId());%></option><%
		}
	}
%>