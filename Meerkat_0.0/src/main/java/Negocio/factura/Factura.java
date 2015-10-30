package Negocio.factura;


import Negocio.pedido.Mesa;
import Negocio.pedido.Pedido;

public class Factura {
	
	public String id;
	public String mesero;
	public String cajero;
	public Mesa mesa;
	public String cliente;
	public Pedido pedido;

	public Factura(String id, String mesero,String cajero,Mesa mesa,Pedido pedido,String cliente){	
		this.id = id;
		this.mesero=mesero;
		this.cajero=cajero;
		this.mesa=mesa;
		this.cliente=cliente;
		this.pedido=pedido;
	}
	
}

