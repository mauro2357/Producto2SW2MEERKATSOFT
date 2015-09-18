Feature: Como administrador quiero agregar un nuevo despachador.

		Scenario: El administrador va a agregar un nuevo despachador
		Given El administrador quiere agregar un nuevo despachador  
		When Presiona el boton nuevo despachador
		Then Redirigir a una nueva jsp para llenar todos los datos y finalmente registrarlo.
