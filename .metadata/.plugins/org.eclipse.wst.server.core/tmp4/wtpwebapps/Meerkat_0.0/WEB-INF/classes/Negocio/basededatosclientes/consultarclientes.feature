Feature:Como administrador listar los clientes

	Scenario: El administrador lista clientes
	Given El administrador lista clientes
	When hay registros
	Then listar clientes
	
	Scenario: El administrador lista clientes
	Given El administrador lista clientes
	When no hay registros
	then notificar que la lista esta vacia
	
	