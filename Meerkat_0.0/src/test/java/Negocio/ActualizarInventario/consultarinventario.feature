Feature: Como administrador quiero consultar los productos que hay en el inventario.

Scenario: El administrador quiere consultar los insumos que hay en el inventario.
	Given El administrador consulta los insumos que hay en el inventario.
	When Hay productos en el inventario.
	Then Mostrar la lista de insumos.
	
Scenario: El administrador quiere consultar los insumos que hay en el inventario.
	Given El administrador consulta los insumos que hay en el inventario.
	When No hay productos en el inventario.
	Then Informar que no hay productos en el inventario.

