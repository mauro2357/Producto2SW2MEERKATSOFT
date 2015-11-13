Feature: Como mesero agrego un producto al pedido.
		
		Scenario: El mesero agrega un producto al pedido.
		Given El mesero agregua un producto al pedido.
		When No hay pedido.
		Then Se crea el pedido.
		
		Scenario: El mesero agrega un producto al pedido.
		Given El mesero agregua un producto al pedido.
		When Hay pedido.
		Then Agregar producto al pedido.
		
		Scenario: El mesero agrega un producto al pedido.
		Given El mesero agregua un producto al pedido.
		When Hay productos en el pedido.
		Then Agregar producto al pedido.
		
		Scenario: El mesero agrega un producto al pedido.
		Given El mesero agregua un producto al pedido.
		When No hay productos en el pedido.
		Then Agregar producto al pedido.
		
		
		
		
	
