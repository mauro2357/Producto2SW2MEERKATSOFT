Feature:Como administrador quiero agregar un nuevo mesero

	Scenario: El administrador agrega un mesero
	Given El administrador agrega un mesero.
	When no hay meseros
	Then agregar un despachador 
	
	Scenario: El administrador agrega un mesero
	Given El administrador agrega un mesero.
	When el mesero ya existe 
	Then Notificar que no se puede agregar
	
	