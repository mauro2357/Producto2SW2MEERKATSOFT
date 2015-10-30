package Negocio.pedido;

import java.util.ArrayList;
import java.util.Map;

public class Pedido {
	
	public ArrayList<Producto> cuerpo;
	public Map<Producto, Integer> cantidades;
	public String cliente;
	public String estado;
	public Mesero mesero;
	public Mesa mesa;
	public String cajero;
	public String fecha;
	public int precio_total;
	
	public Pedido(){}
	
	public Pedido(ArrayList<Producto> lista_productos, String cliente, Mesa mesa, String cajero, String fecha, Map<Producto, Integer> cantidades, Mesero mesero) {
		this.cantidades = cantidades;
		this.mesero = mesero;
		this.cliente = cliente;
		this.estado = "En espera";
		this.cuerpo = lista_productos;
		this.mesa = mesa;
		this.cajero = cajero;
		this.fecha = fecha;
	}
	
	public Pedido(ArrayList<Producto> lista_productos, String cliente, Mesa mesa, String cajero, String fecha, Mesero mesero) {
		this.mesero = mesero;
		this.cliente = cliente;
		this.estado = "En espera";
		this.cuerpo = lista_productos;
		this.mesa = mesa;
		this.cajero = cajero;
		this.fecha = fecha;
	}
	
	public void Adicionarproducto(Producto x){
		this.cuerpo.add(x);
		this.precio_total += x.valor;
	}
	
}
