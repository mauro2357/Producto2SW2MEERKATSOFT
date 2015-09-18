Feature: Como administrador quiero consultar los clientes registrados

		Scenario: El administrador va a consultar los clientes
		Given El administrador quiere colsultar los clientes de la BD  
		When Hay clientes registrados en la BD
		Then Mostrar un listado con todos los clientes.
