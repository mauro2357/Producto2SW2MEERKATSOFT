Feature: Como administrador quiero agregar un nuevo mesero.

		Scenario: El administrador va a agregar un nuevo mesero
		Given El administrador quiere agregar un nuevo mesero 
		When Presiona el boton nuevo mesero
		Then Redirigir a una nueva jsp para llenar todos los datos y finalmente registrar al mesero.
