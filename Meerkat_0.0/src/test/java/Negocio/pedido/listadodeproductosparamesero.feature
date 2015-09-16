Feature: Como mesero quiero tener un listado de productos para ofrecerlos a mis clientes.
	
		Scenario: El mesero consulta productos y no hay.
		Given El mesero va a consultar los productos.
		When No hay productos.
		Then Notificar que no hay productos para vender.
		
		Scenario: El mesero consulta productos y hay.
		Given El mesero va a consultar los productos.
		When Hay productos.
		Then Notificar que productos hay para vender.
		
		Scenario: El mesero consulta un producto en especifico.
		Given El mesero va a consultar un producto.
		When Existe el producto.
		Then Notificar el producto.
		
		Scenario: El mesero consulta un producto en especifico.
		Given El mesero va a consultar un producto.
		When No existe el producto.
		Then Notificar que no existe el producto.
		
		Scenario: El mesero consultara los productos.
		Given El mesero va a consultar los productos.
		When Existe un error en la base de datos.
		Then Notificar error en la base de datos.
		 
		
	