	
	function definirmesero(x){
		var Entrar = "definirmesero";
		$.post("/Meerkat_0.0/mesero", {
			entrar : Entrar,
			meseroi : x
		}, function(responseText){
			$('#cuerpo').html(responseText)});
		$('#titulo').text("Productos");
		$('#menu').hide();
	}
	
	function despacharpedido(x){
		var Entrar = "despachar_pedido";
		$.post("/Meerkat_0.0/despachador", {
			entrar : Entrar,
			pedido : x
		}, function(responseText){
			$('#cuerpo').html(responseText)});
	}
	
	function ir_administrador(){
		$('#cuerpodos').hide();
		var Entrar = "ir_administrador";
		var Pass = $('#pass').val();
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
			pass : Pass 
		},
		function(responseText) {
				if(responseText!=""){
				$('#cuerpo').html(responseText);}
				else{alert("contrasena incorrecta");}
			});
		$('#titulo').text("Administrador")
		$('#menu').hide();
	}
	
	function ir_despachador(){
		var Entrar = "ir_despachador";
		$.post("/Meerkat_0.0/despachador", {
			entrar : Entrar,
		}, function(responseText){
			$('#cuerpo').html(responseText)});
	}
	
	function crear_usuario(){
		var Entrar = "crear_usuario";
		$.post("/Meerkat_0.0/mesero", {
			entrar : Entrar,
		}, function(responseText){
			$('#cuerpo').html(responseText)
		});
	}
	
	function ingresarproducto(x){
		var Entrar = "ingresarproducto";
		y = document.getElementById(x);
		x = y.name;
		$.post("/Meerkat_0.0/mesero", {
			entrar : Entrar,
			idp : x
		}, function(responseText) {
			$('#table1').html(responseText);
		});
	}
	
	function ejecutar(){
		alert("Se ha recibido un pedido");
	}
	
	function consultar_inventario(){
		$("#cuerpodos").toggle();
		var Entrar = "consultar_inventario";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,			
			}, function(responseText) {
				$('#cuerpodos').html(responseText);
			});	
	}
	
	function crear_despachador(){
		$("#cuerpodos").toggle();
		var Entrar = "crear_despachador";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,			
			}, function(responseText){
				$('#cuerpodos').html(responseText)
			});
	}

	
	function consultar_clientes(){
		$("#cuerpodos").toggle();
		var Entrar = "consultar_clientes";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
			}, function(responseText) {
				$('#cuerpodos').html(responseText);
			});	
	}
	
	function consultar_totalVentas(){
		$("#cuerpodos").toggle();
		var Entrar = "consultar_totalVentas";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
			}, function(responseText) {
				$('#cuerpodos').html(responseText);
			});	
	}
	
	function productos_masvendidos(){
		$("#cuerpodos").toggle();
		var Entrar = "productos_masvendidos";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
			}, function(responseText) {
				$('#cuerpodos').html(responseText);
			});	
	}