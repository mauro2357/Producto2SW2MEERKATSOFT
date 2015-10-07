	
	function definirmesero(x){
		var Entrar = "definirmesero";
		$.post("/Meerkat_0.0/mesero", {
			entrar : Entrar,
			meseroi : x
		}, function(responseText){
			$('#body').html(responseText)});
	}
	
	function ir_administrador(){
		var Entrar = "ir_administrador";
		var Pass = $('#pass').val();
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
			pass : Pass 
		},
		function(responseText) {
				if(responseText!=""){
				$('#body').html(responseText);}
				else{alert("contrasena incorrecta");}
			});
	}
	
	function ir_despachador(){
		var Entrar = "ir_despachador";
		$.post("/Meerkat_0.0/despachador", {
			entrar : Entrar,
		}, function(responseText){
			$('#body').html(responseText)});
	}
	
	function crear_usuario(){
		var Entrar = "crear_usuario";
		$.post("/Meerkat_0.0/mesero", {
			entrar : Entrar,
		}, function(responseText){
			$('#body').html(responseText)});
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
		var Entrar = "consultar_inventario";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,			
			}, function(responseText) {
				$('#cuerpo').html(responseText);
			});	
	}
	
	function crear_despachador(){
		var Entrar = "crear_despachador";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,			
			}, function(responseText){
				$('#body').html(responseText)});
	}

	
	function consultar_clientes(){
		var Entrar = "consultar_clientes";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
			}, function(responseText) {
				$('#cuerpo').html(responseText);
			});	
	}
	
	function consultar_totalVentas(){
		var Entrar = "consultar_totalVentas";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
			}, function(responseText) {
				$('#cuerpo').html(responseText);
			});	
	}
	
	function productos_masvendidos(){
		var Entrar = "productos_masvendidos";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
			}, function(responseText) {
				$('#cuerpo').html(responseText);
			});	
	}