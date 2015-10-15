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
		this.cuerpo.add(x); //Recibo el producto, lo agregamos al cuerpo del pedido.
	}
	
	public ArrayList<Producto> getCuerpo() {
		return this.cuerpo;
	}
	
	public void setCuerpo(ArrayList<Producto> cuerpo) {
		this.cuerpo = cuerpo;
	}

	public Map<Producto, Integer> getCantidades() {
		return cantidades;
	}

	public void setCantidades(Map<Producto, Integer> cantidades) {
		this.cantidades = cantidades;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Mesero getMesero() {
		return mesero;
	}

	public void setMesero(Mesero mesero) {
		this.mesero = mesero;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public String getCajero() {
		return cajero;
	}

	public void setCajero(String cajero) {
		this.cajero = cajero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
}
