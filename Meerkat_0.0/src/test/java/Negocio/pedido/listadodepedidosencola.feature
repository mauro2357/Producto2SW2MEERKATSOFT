Feature: Como despachador quiero tener un mensaje que me permita ver los pedidos que estan en cola.
		
		Scenario: El mesero construye el pedido temporalmente.
		Given El mesero construye el pedido temporalmente.
		When No hay pedidos en cola y el pedido contiene productos.
		Then Agregar el pedido a la cola.
		
		Scenario: El mesero construye el pedido temporalmente.
		Given El mesero construye el pedido temporalmente.
		When No hay pedidos en cola y el pedido no contiene productos.
		Then Notificar que el nuevo pedido no contiene productos.
		
		Scenario: El mesero construye el pedido temporalmente.
		Given El mesero construye el pedido temporalmente.
		When La mesa seleccionada ya tiene un pedido.
		Then Combinar productos entre los dos pedidos.
		
		Scenario: El mesero envia un pedido.
		Given El mesero envia un pedido al despachador.
		When Hay pedido en la mesa seleccionada.
		Then Enviar pedido.
		
		Scenario: El mesero envia un pedido.
		Given El mesero envia un pedido al despachador.
		When No hay pedido en la mesa seleccionada.
		Then Notificar que no hay despachador.
		
	
