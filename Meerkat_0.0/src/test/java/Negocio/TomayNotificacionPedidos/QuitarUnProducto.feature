Feature: Como mesero quita un producto al pedido.
		
		Scenario: El mesero quita un producto al pedido.
		Given El mesero quita un producto al pedido.
		When No hay pedido.
		Then Notifica que no hay pedido.
		
		Scenario: El mesero quita un producto al pedido.
		Given El mesero quita un producto al pedido.
		When Hay pedido.
		Then Quitar producto al pedido.
		
		Scenario: El mesero quita un producto al pedido.
		Given El mesero quita un producto al pedido.
		When Hay productos en el pedido.
		Then Quitar producto al pedido.
		
		Scenario: El mesero quita un producto al pedido.
		Given El mesero quita un producto al pedido.
		When No hay productos en el pedido.
		Then Notifica que no hay pedido.
		
		
		
		
	
