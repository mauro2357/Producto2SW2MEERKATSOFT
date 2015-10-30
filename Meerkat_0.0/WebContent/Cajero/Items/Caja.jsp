<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Negocio.pedido.*" %>
<%@ page import="Negocio.factura.*" %>
<%@ page import="Negocio.cliente.*" %>
<%@ page import="java.util.*" %>

<%Factura factura = (Factura) session.getAttribute("Factura"); %>
<%Cliente cliente = (Cliente) session.getAttribute("Cliente"); %>
<script src="../js/codigo.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){
		$('#Dinero').change(function(){
			var numberString = $('#Costo').text();
			var Costo = Number(numberString.replace(/[^0-9\.]+/g,""));
			var respuesta = (Costo-$('#Dinero').val());
			if(respuesta<=0){
				$('#Relativo').html("<h1>" + "Sobra:" + "</h1>");
			}else{
				$('#Relativo').html("<h1>" + "Falta:" + "</h1>");
			}
			respuesta = Math.abs(respuesta);
			$("#Cambio").html("<h1>" + respuesta + "</h1>");
		});
	});
</script>

<form>
	<table>
		<tr style="visibility: hidden;"> <td> <h1>Costo:</h1> </td> <td> <div id="CostoGlobal"><%out.print("<h1>"+factura.pedido.precio_total+"</h1>");%></div> </td> </tr>
		<tr> <td> <h1>Costo:</h1> </td> <td> <div id="Costo"><%out.print("<h1>"+factura.pedido.precio_total+"</h1>");%></div> </td> </tr>
		<tr> <td> <h1>Entrega:</h1> </td> <td> <input type="text" id="Dinero" placeholder="0"> </td> </tr>
		<tr> <td> <div id="Relativo"><h1>Cambio:</h1></div> </td> <td> <div id="Cambio"><h1>0</h1></div> </td> </tr>
		<tr> <td> <h1>Propina:</h1> </td> <td> <input type="text" id="Propina" placeholder="0"> </td> </tr>
		<tr> <td colspan="2" align="center"> <div class="button	" onclick="pagar_mesa(<%out.print(factura.id);%>,<%out.print(factura.mesa.id);%>)">Pagar</div> </td> </tr>
		<tr> <td colspan="2" align="center"> <div class="button	" onclick="redimirpuntos(<%out.print(cliente.id);%>,<%out.print(cliente.puntos);%>,<%out.print("'"+cliente.nombre+"'");%>)">Pagar</div> </td> </tr>
	</table>
</form>