Feature: Como mesero quiero definirme como el mesero actual.
		
		Scenario: El mesero solicita la lista de meseros.
		Given El mesero solicita la lista de meseros.
		When No hay meseros contratados.
		Then Notificar que no hay meseros contratados.
		
		Scenario: El mesero solicita la lista de meseros.
		Given El mesero solicita la lista de meseros.
		When Hay meseros contratados
		Then Listar meseros contratados.
		
		Scenario: El mesero se define como mesero actual.
		Given El mesero se define como mesero actual.
		When El mesero no se encuentra en la lista de meseros contratados.
		Then Notificar que el mesero no se encuentra en la lista de meseros contratados.
		
		Scenario: El mesero se define como mesero actual.
		Given El mesero se define como mesero actual.
		When El mesero se encuentra en la lista de meseros contratados.
		Then Definir mesero como mesero actual.
		
		
		
		
	
