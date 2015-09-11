Feature:Como administrador quiero conocer el total de las ventas

	Scenario: El administrador agrega un mesero
	Given El administrador consulta
	When no hay ventas
	Then notificar que no hay ventas

	Scenario: El administrador agrega un mesero
	Given El administrador consulta
	When hay ventas
	Then listar ventas
	
	