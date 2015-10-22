Feature: Como administrador quiero poder pagarle a la nomina.

		Scenario: El administrador va a pagarle a la nomina
		Given El administrador quiere pagarle a todos los empleados
		When Hay empleados en la BD
		Then Ejecutar el metodo de pagar nomina
