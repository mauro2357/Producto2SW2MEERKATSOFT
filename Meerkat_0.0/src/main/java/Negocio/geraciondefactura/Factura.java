package Negocio.geraciondefactura;

import Negocio.tomaynotificacionpedidos.Pedido;

public class Factura {
	
	public String id;
	public String mesero;
	public String cajero;
	public String mesa;
	public String cliente;
	public Pedido pedido;

	public Factura(String id, String mesero,String cajero,String mesa,Pedido pedido,String cliente){	
		this.id = id;
		this.mesero=mesero;
		this.cajero=cajero;
		this.mesa=mesa;
		this.cliente=cliente;
		this.pedido=pedido;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMesero() {
		return mesero;
	}

	public void setMesero(String mesero) {
		this.mesero = mesero;
	}

	public String getCajero() {
		return cajero;
	}

	public void setCajero(String cajero) {
		this.cajero = cajero;
	}

	public String getMesa() {
		return mesa;
	}

	public void setMesa(String mesa) {
		this.mesa = mesa;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	
}

