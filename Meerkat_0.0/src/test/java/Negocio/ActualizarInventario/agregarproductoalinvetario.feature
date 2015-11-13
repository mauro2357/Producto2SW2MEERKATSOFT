Feature: Como administrador quiero agregar al inventario nuevos productos.

	Scenario: El administrador administrador quiero agregar al inventario nuevos productos.
		Given El administrador agrega los insumos al inventario.
		When El insumo existe.
		Then Suma.
		
	Scenario: El administrador administrador quiero agregar al inventario nuevos productos.
		Given El administrador agrega los insumos al inventario.
		When El insumo no existe.
		Then Crea.



		

		
