
	function ValidarFormProductos(){
		var cliente = document.getElementById("selectclientes").selectedIndex;
		var mesa = document.getElementById("selectmesas").selectedIndex;
		var pedido = document.getElementById("tablapedidos").rows.length;
		if(cliente==0 || mesa==0 || pedido==2){
			alert("Por favor, no deje de seleccionar el cliente, la mesa, o de escoger productos.")
			return false;
		}
		return true;
	}
	function redimirpuntos(x,y,z){
		var PuntosString = prompt("Señor@ "+z+" usted tiene: "+y+" puntos. ¿Cuántos desea redimir?", 0);
		var numberString = $('#Costo').text();
		var Costo = Number(numberString.replace(/[^0-9\.]+/g,""));
		var Puntos = Number(PuntosString.replace(/[^0-9\.]+/g,""));
		var diferencia = Costo - Puntos;
		$('#Costo').html("<h1>" + diferencia + "</h1>");
	}

	function cambiarlista(){
        	var y = document.getElementById("lista1");
			var x = y.innerHTML;
			var rs  = x.split(", ");
        }
	
	function actualizarlista(){
		var Entrar = "Entrar_musica";
		$.post("/Meerkat_0.0/Musica", {
			entrar : Entrar,
		}, function(responseText){
			$('#lista1').html(responseText)});
		var y = document.getElementById("lista1");
		var x = y.innerHTML;
		if(x != "aqui") cambiarlista();
		else alert("Se cargaron las canciones");
	}

	function pagar_mesa(y){
		var numberString = $('#Costo').text();
		var Costo = Number(numberString.replace(/[^0-9\.]+/g,""));
		var numberString2 = $('#CostoGlobal').text();
		var CostoGlobal = Number(numberString2.replace(/[^0-9\.]+/g,""));
		var Puntosusados = CostoGlobal - Costo;
		var respuesta = (Costo-$('#Dinero').val());
		if(respuesta<=0){
			alert("Gracias por su compra!");
			var Entrar = "pagar_mesa";
			$.post("/Meerkat_0.0/caja", {
				entrar : Entrar,
				mesa : y,
				puntosusados : Puntosusados
			}, function(responseText){
				$('#cuerpotres').html(responseText)});
			if( ($("#cuerpo").is(':visible')) ){
				$("#cuerpo").toggle();
			}
			if( ($("#cuerpodos").is(':visible')) ){
				$("#cuerpodos").toggle();
			}
		}else{
			alert("Atención! Falta dinero para completar la compra.")
		}
	}
	
	function devolverprecio_mesa(y){
		if((!$("#cuerpodos").is(':visible')) ){
			$("#cuerpodos").toggle();
		}
		var Entrar = "devolver_precio_mesa";
		$.post("/Meerkat_0.0/caja", {
			entrar : Entrar,
			mesa : y
		}, function(responseText){
			$('#cuerpodos').html(responseText)});
	}

	function abrircerrarcuerpodos(){
		if( !($("#cuerpodos").is(':visible')) ){
			$("#cuerpodos").toggle();
		}
	}
	
	function abrircerrarfactura(x){
		if(document.getElementById(x).style.display=="none"){
			document.getElementById(x).style.display="inline";
		}else{
			document.getElementById(x).style.display="none";
		}
	}
	
	var lista = 0;
	
	function lista_facturas_realizadas(){
		if(lista==0){
			var Entrar = "lista_facturas_realizadas";
			$.post("/Meerkat_0.0/caja", {
				entrar : Entrar
			}, function(responseText){
				$('#cuerpotres').html(responseText)});
			lista++;
		}
	}	

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
	
	function cancelarpedido(x){
		var Entrar = "cancelar_pedido";
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
				$('#cuerpo').html(responseText);
				$('#titulo').text("Administrador");
				$('#menu').hide();}
				else{$('#cuerpo').html(responseText);}
			});
		
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
		$('#titulo').text("Crear Usuario");
	}
	
	function ingresarproducto(x){
		var Entrar = "ingresarproducto";
		y = document.getElementById(x);
		x = y.title;
		$.post("/Meerkat_0.0/mesero", {
			entrar : Entrar,
			idp : x
		}, function(responseText) {
			$('#table1').html(responseText);
		});
	}
	
	function consultar_inventario(){
		abrircerrarcuerpodos();
		var Entrar = "consultar_inventario";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,			
			}, function(responseText) {
				$('#cuerpodos').html(responseText);
			});	
	}
	
	function ingresar_insumo(){
		abrircerrarcuerpodos();
		var Entrar = "ingresar_insumo";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,			
			}, function(responseText) {
				$('#cuerpodos').html(responseText);
			});
	}
	
	function crear_despachador(){
		abrircerrarcuerpodos();
		var Entrar = "crear_despachador";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,			
			}, function(responseText) {
				$('#cuerpodos').html(responseText);
			});
	}

	function crear_mesero(){
		abrircerrarcuerpodos();
		var Entrar = "crear_mesero";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,			
			}, function(responseText) {
				$('#cuerpodos').html(responseText);
			});
	}
	
	function eliminar_empleado(){
		abrircerrarcuerpodos();
		var Entrar = "eliminar_empleado";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,			
			}, function(responseText) {
				$('#cuerpodos').html(responseText);
			});
	}	
	
	function consultar_clientes(){
		abrircerrarcuerpodos();
		var Entrar = "consultar_clientes";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
			}, function(responseText) {
				$('#cuerpodos').html(responseText);
			});	
	}
	
	function consultar_totalVentas(){
		abrircerrarcuerpodos();
		var Entrar = "consultar_totalVentas";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
			}, function(responseText) {
				$('#cuerpodos').html(responseText);
			});	
	}
	
	function productos_masvendidos(){
		abrircerrarcuerpodos();
		var Entrar = "productos_masvendidos";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
			}, function(responseText) {
				$('#cuerpodos').html(responseText);
			});	
	}