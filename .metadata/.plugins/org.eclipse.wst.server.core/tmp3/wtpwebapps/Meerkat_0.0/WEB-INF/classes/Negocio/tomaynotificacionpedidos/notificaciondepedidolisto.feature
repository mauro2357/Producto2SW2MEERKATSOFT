Feature: Como despachador quiero notificar al mesero que el pedido esta listo.

		Scenario: El despachador notifica que esta listo el pedido.
		Given El despachador notifica que esta listo el pedido.
		When Hay un pedido en cola.
		Then Notificar al mesero que el esta listo el pedido.
		
		Scenario: El despachador notifica que esta listo el pedido.
		Given El despachador notifica que esta listo el pedido.
		When No hay pedido en cola.
		Then Notificar al despachador que no hay pedido en cola.
		
		Scenario: El despachador notifica que esta listo el pedido.
		Given El despachador notifica que esta listo el pedido.
		When No hay mesero.
		Then Notificar al despachador que no hay mesero.
		
		Scenario: El despachador notifica que esta listo el pedido.
		Given El despachador notifica que esta listo el pedido.
		When Hay mesero.
		Then Notificar al mesero que el esta listo el pedido.
		
		Scenario: El despachador notifica que esta listo el pedido.
		Given El despachador notifica que esta listo el pedido.
		When No hay conexion a internet.
		Then Notificar que no hay conexion a internet.
		
		Scenario: El despachador notifica que esta listo el pedido.
		Given El despachador notifica que esta listo el pedido.
		When Hay conexion a internet.
		Then Notificar al mesero que el esta listo el pedido.
		
		