Feature: Como administrador quiero consultar el total de las ventas.

Scenario: El administrador quiere consultar el total de las ventas
	Given El administrador consulta el total de las ventas
	When Hay ventas registradas en la BD
	Then Mostrar el total de las ventas

