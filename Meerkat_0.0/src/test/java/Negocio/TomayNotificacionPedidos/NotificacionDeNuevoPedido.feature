Feature: Como mesero quiero notificar al despachador que hay un nuevo pedido.

		Scenario: El mesero crea un nuevo pedido.
		Given El mesero crea un nuevo pedido.
		When Hay productos en el pedido.
		Then Enviar pedido al despachador.
		
		Scenario: El mesero crea un nuevo pedido.
		Given El mesero crea un nuevo pedido.
		When No hay productos en el pedido.
		Then Notificar al mesero que no hay productos en el pedido.
		
		Scenario: El mesero crea un nuevo pedido.
		Given El mesero crea un nuevo pedido.
		When No hay despachador.
		Then Notificar al mesero que no hay despachador.
		
		Scenario: El mesero crea un nuevo pedido.
		Given El mesero crea un nuevo pedido.
		When La mesa existe.
		Then Enviar pedido al despachador.
		
		Scenario: El mesero crea un nuevo pedido.
		Given El mesero crea un nuevo pedido.
		When La mesa no existe.
		Then Notificar al mesero que la mesa no existe.
		
		Scenario: El mesero crea un nuevo pedido.
		Given El mesero crea un nuevo pedido.
		When El cliente existe.
		Then Enviar pedido al despachador.
		
		Scenario: El mesero crea un nuevo pedido.
		Given El mesero crea un nuevo pedido.
		When El cliente no existe.
		Then Enviar pedido al despachador como cliente Publico.
		
		
		