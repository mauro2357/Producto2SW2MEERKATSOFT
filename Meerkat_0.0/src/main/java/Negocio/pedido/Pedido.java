package Negocio.pedido;

import java.util.ArrayList;
import Controlador.*;

public class Pedido {
	
	public ArrayList<Producto> cuerpo;
	public String cliente;
	public String estado;
	public Mesero mesero;
	public String mesa;
	public String cajero;
	public String fecha;
	
	public Pedido() {}
	
	public Pedido(ArrayList<Producto> lista_productos, String cliente, String mesa, String cajero, String fecha) {
		this.mesero = MeseroControllador.consultarmeserosFacade.mesero;
		this.cliente = cliente;
		this.estado = "En espera";
		this.cuerpo = lista_productos;
		this.mesa = mesa;
		this.cajero = cajero;
		this.fecha = fecha;
	}

	public void Adicionarproducto(Producto x){
		this.cuerpo.add(x); //Recibo el producto, lo agregamos al cuerpo del pedido.
	}
	
	public ArrayList<Producto> getCuerpo() {
		return this.cuerpo;
	}
	
	public void setCuerpo(ArrayList<Producto> cuerpo) {
		this.cuerpo = cuerpo;
	}
	
}
