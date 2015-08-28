package Negocio.geraciondefactura;

import Negocio.tomaynotificacionpedidos.Pedido;

public class Factura {
	
	public String id;
	public String meser;
	public String cajer;
	public String mesa;
	public Pedido pedido;

	public Factura(String id, String x,String y,String z,Pedido pedido){	
		this.id = id;
		this.meser=x;
		this.cajer=y;
		this.mesa=z;
		this.pedido=pedido;
	}
}

