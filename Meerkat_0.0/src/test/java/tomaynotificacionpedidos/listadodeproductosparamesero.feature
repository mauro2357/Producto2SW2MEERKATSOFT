Feature: Como mesero quiero tener un listado de productos para ofrecerlos a mis clientes.
	
	Scenario: El mesero consulta productos y no hay.
		Given El mesero va a consultar los productos.
		When No hay productos.
		Then Notificar que no hay productos para vender.
		
	