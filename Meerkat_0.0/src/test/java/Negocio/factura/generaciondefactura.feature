Feature: Como cajero quiero generar una factura de cobro.

	Scenario: El cajero generara una factura de cobro.
	Given El cajero generara una factura de cobro.
	When Hay pedido.
	Then Generar factura de cobro.
	
	Scenario: El cajero generara una factura de cobro.
	Given El cajero generara una factura de cobro.
	When No hay pedido.
	Then Notificar que no hay pedido.
	