package Negocio.tomaynotificacionpedidos;

import java.util.ArrayList;

import Presentacion.*;

public class Mesero {
	
	public String id;
	public String nombre;
	public String apellido;
	public String telefono;
	public ArrayList<Producto> x;
	
	public Mesero(String id, String nombre, String apellido, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public Mesero() {
		// TODO Auto-generated constructor stub
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public String getMensaje() throws Exception {
		ArrayList<Producto> x = consultarproductos();
		if(!(x.size()==0)) return "No hay productos";
		return "Hay productos";
	}
	
	public ArrayList<Producto> consultarproductos() throws Exception {
		consultarproductosFacade y = new consultarproductosFacade();
		ArrayList<Producto> x = new ArrayList<Producto>();
		x = y.main();
		return x;
	}
	
	//c�digo obsoleto
	public void realizar_pedido(ArrayList<Producto> lista, String mesa, String cliente, String meser, String caja, String fecha, String estado, String id) throws Exception{
		this.x = lista;
		consultarpedidosFacade r = new consultarpedidosFacade();
		//r.main(lista,mesa,cliente,meser,caja,fecha,estado,id);
		r.main(Integer.parseInt(id));
	}
	//fin c�digo obsoleto
	
	public String enviar_pedido(Pedido pedido, String estado, String mesa, String mesero, String cliente, String cajero, String fecha) throws Exception{
		if(pedido.getCuerpo().size()==0) return "No hay productos.";
		generaciondepedidoFacade pedidosFacade = new generaciondepedidoFacade(); 
		pedidosFacade.enviar_pedido(pedido, estado, mesa, mesero, cliente, cajero, fecha);
		return "Pedido enviado";
	}
	
	public Producto consultarproductoinvididual(String idu) throws Exception{
		consultarproductosFacade productosFacade = new consultarproductosFacade();
		Producto x = productosFacade.consultarproductoindividual(idu);
		return x;
	}
	

}
