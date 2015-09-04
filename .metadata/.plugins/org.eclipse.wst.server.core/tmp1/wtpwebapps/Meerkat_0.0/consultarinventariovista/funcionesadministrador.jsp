<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<input type="button" value="Consultar inventario" onclick="genera_tabla()">

<script type="text/javascript">

<<<<<<< HEAD
	function consultar_insumos(){
		var Entrar = "consultar_inventario";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
		},  window.location.replace("consultarproductosvista/consultarproductos.jsp")); // Está pendiente por organizarse hacia donde me redirige 
	}
=======
function loadXMLDoc()
{
var xmlhttp;
if (window.XMLHttpRequest)
  {
  xmlhttp=new XMLHttpRequest();
  }
else
  {
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
    }
}
xmlhttp.open("POST","listainventario.jsp",true);
xmlhttp.send();
} //Este ajax debe de redirigir al controllador para asignar un administrador nuevo, por eso en la jsp te dice lo del error.

>>>>>>> origin/master
</script>

<button type="button" onclick="loadXMLDoc()">Consultar Inventario</button>
<div id="myDiv"></div>
</body>
</html>