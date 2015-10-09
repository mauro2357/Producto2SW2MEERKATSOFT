<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Meerkat_0.0</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="cssindex.css" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script> 
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script> 
<script src="../js/codigo.js"></script>
<script type="text/javascript">
	$(function() {
			var Entrar = "entrar_cajero"; 
			$.post("/Meerkat_0.0/caja", {
				entrar : Entrar,
			}, function(responseText) {
				$('#cuerpo').html(responseText);
			});			
	});
</script>
</head>
<body>
Cajero
<div id="cuerpo"></div>
</body>