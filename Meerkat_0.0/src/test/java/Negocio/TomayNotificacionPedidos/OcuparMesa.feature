Feature: Como mesero ocupar una mesa.
		
		Scenario: El mesero ocupara una mesa.
		Given El mesero ocupara una mesa.
		When La mesa existe.
		Then Ocuparla.
		
		Scenario: El mesero ocupara una mesa.
		Given El mesero ocupara una mesa.
		When La mesa no existe.
		Then Notificar que no existe la mesa.
		
		Scenario: El mesero ocupara una mesa.
		Given El mesero ocupara una mesa.
		When No hay productos en el pedido.
		Then Notificar que el pedido no tiene productos.
		
		Scenario: El mesero ocupara una mesa.
		Given El mesero ocupara una mesa.
		When Hay productos en el pedido.
		Then Ocuparla.
		
		
		
		
	
