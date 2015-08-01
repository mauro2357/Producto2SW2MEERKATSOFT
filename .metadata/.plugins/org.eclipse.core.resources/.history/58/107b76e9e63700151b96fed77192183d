Feature: Para Garantizar que se realicen los cobros al cliente
		 Como Director de proyectos
		 Quiero Poder presupuestar las facturas que voy a cobrar al cliente asociando la fecha de vencimiento
	
	Scenario: Presupuesto de cliente que no es del sector salud
		Given El cliente NO es del sector salud.
		When se presupueste la factura.
		Then se debe cobrar un 16% adicional por concepto de IVA.
		
	