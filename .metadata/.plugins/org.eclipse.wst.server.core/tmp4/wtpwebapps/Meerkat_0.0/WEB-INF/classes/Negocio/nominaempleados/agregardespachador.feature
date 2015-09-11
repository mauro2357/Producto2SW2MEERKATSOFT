Feature:Como administrador quiero agregar un nuevo despachador

	Scenario: El administrador agrega un despachador
	Given El administrador agrega un despachador.
	When no hay despachadar
	Then agregar un despachador 
	
	Scenario: El administrador agrega un despachador
	Given El administrador agrega un despachador.
	When el despachador ya existe 
	Then Notificar que no se puede agregar
	
	