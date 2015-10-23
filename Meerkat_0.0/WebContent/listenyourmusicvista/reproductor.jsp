<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%ArrayList<String> canciones = (ArrayList<String>) session.getAttribute("canciones");
ArrayList<String> ubicacion = (ArrayList<String>) session.getAttribute("ubicacion");
for(int i=0;i<canciones.size();++i){
	out.println(canciones.get(i)+"-"+ubicacion.get(i)+",");
}%>