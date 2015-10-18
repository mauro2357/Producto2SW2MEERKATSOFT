<%int precio = (Integer) session.getAttribute("precio"); %>
<%String id = (String) session.getAttribute("id"); %>
<%String mesa = (String) session.getAttribute("mesa"); %>
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
		<tr> <td> <h1>Costo:</h1> </td> <td> <div id="Costo"><%out.print("<h1>"+precio+"</h1>");%></div> </td> </tr>
		<tr> <td> <h1>Entrega:</h1> </td> <td> <input type="text" id="Dinero" placeholder="0"> </td> </tr>
		<tr> <td> <div id="Relativo"><h1>Cambio:</h1></div> </td> <td> <div id="Cambio"><h1>0</h1></div> </td> </tr>
		<tr> <td> <h1>Propina:</h1> </td> <td> <input type="text" id="Propina" placeholder="0"> </td> </tr>
		<tr> <td colspan="2" align="center"> <div class="button	" onclick="pagar_mesa()">Pagar</div> </td> </tr>
	</table>
	<input type="hidden" id="mesa" value="<%out.print(id);%>">
	<input type="hidden" id="id" value="<%out.print(mesa);%>">
</form>