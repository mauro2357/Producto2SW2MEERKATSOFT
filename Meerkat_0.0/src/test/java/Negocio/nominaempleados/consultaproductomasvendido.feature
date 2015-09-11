Feature:Como administrador quiero conocer el producto mas vendido
	Scenario: El administrador consulta el producto
	Given El administrador consulta el producto
	When no hay productos
	Then notificar que no hay productos

	Scenario: El administrador consulta el producto
	Given El administrador consulta el producto
	When  hay productos
	Then mostrar el producto