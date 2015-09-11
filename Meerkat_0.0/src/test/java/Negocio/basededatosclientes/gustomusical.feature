Feature:Como administrador quiero agregar un nuevo despachadorconocer el gusto musical de los clientes

	Scenario: El administrador consulta el gusto musical
	Given El administrador El administrador consulta el gusto musical
	When no hay registros
	Then agregar gusto musical
	
	Scenario: El administrador consulta el gusto musical
	Given El administrador El administrador consulta el gusto musical
	When hay registros
	Then listar registros
	
	