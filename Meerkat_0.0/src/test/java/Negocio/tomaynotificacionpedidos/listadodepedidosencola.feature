Feature: Como despachador quiero tener un mensaje que me permita ver los pedidos que estan en cola.
	
		Scenario: El mesero envia un pedido. 
		Given El mesero envia un pedido al despachador. 
		When Hay productos en el pedido.
		Then Agregar el pedido a la cola de pedidos.
		
		Scenario: El mesero envia un pedido.
		Given El mesero envia un pedido al despachador.
		When No hay productos en el pedido.
		Then Notificar que no hay productos en el pedido.
		
		Scenario: El mesero envia un pedido.
		Given El mesero envia un pedido al despachador.
		When Hay despachador.
		Then Agregar el pedido a la cola de pedidos.
		
		Scenario: El mesero envia un pedido.
		Given El mesero envia un pedido al despachador.
		When No hay despachador.
		Then Notificar que no hay despachador.
		
		Scenario: El cliente selecciona un producto
		Given El ciente presiona un producto
		When El producto está en la bd.
		Then Agrega al pedido.
		
		Scenario: El cliente selecciona un producto.
		Given El cliente presiona un producto
		When El producto no está en la bd.
		Then Avisa mediante un mensaje que éste no se encuentra.
		
		Scenario: El cliente quiere adicionar un producto a su pedido.
		Given El cliente selecciona otro producto.
		When La lista del pedido está vacía.
		Then Se crea un nuevo pedido y se agrega el producto.
		
		Scenario: El cliente quiere adicionar un producto a su pedido.
		Given El cliente selecciona otro producto.
		When El producto ya se encuentra en la lista del pedido.
		Then Agrega el producto al pedido.
		
		Scenario: El cliente finiquita el pedido.
		Given El cliente presiona el botón comprar.
		When El pedido tiene productos.
		Then Se envía el pedido.
		
		Scenario: El cliente finiquita el pedido.
		Given El cliente presiona el botón comprar.
		When El pedido no tiene productos.
		Then Avisar al cliente mediante un mensaje que no hay productos seleccionados.
		
