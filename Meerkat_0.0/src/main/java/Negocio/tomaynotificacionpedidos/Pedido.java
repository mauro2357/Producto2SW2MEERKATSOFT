package Negocio.tomaynotificacionpedidos;

import java.util.ArrayList;

public class Pedido {
	
	public ArrayList<Producto> cuerpo;
	
	public Pedido() {}
	
	public void adicionarproducto(Producto x){
		this.cuerpo.add(x); //Recibo el producto, lo agregamos al cuerpo del pedido.
	}
	
	public ArrayList<Producto> getCuerpo() {
		return this.cuerpo;
	}
	
	public void setCuerpo(ArrayList<Producto> cuerpo) {
		this.cuerpo = cuerpo;
	}
	
}
