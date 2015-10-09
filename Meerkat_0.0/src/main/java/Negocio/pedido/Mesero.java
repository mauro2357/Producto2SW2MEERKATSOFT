package Negocio.pedido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Datos.FacturaRepository;
import Datos.ProductoRepository;

public class Mesero extends Empleado {
	
	public String id;
	public String nombre;
	public String apellido;
	public String telefono;
	public ArrayList<Producto> productos;
	public Pedido pedido_sin_asignar;
	public Map<Mesa, Pedido> coladepedidos;
	
	ProductoRepository productorepository = new ProductoRepository();
	
	public Mesero(String id, String nombre, String apellido, String telefono) throws Exception {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.productos = productorepository.Consultar_producto();
	}

	public Mesero() throws Exception { 
		this.productos = productorepository.Consultar_producto();
	}

	public void setId(String id) {this.id = id;}
	public String getId() {return id;}
	public String getNombre() {return nombre;}
	public String getApellido() {return apellido;}
	public String getTelefono() {return telefono;}
	public Map<Mesa, Pedido> getColadepedidos() {return coladepedidos;}
	public void setColadepedidos(Map<Mesa, Pedido> coladepedidos) {this.coladepedidos = coladepedidos;}

	public String getMensaje() throws Exception {
		ArrayList<Producto> x = productorepository.Consultar_producto();
		if(!(x.size()==0)) return "No hay productos";
		return "Hay productos";
	}
	
	public String enviar_pedido(Pedido pedido) throws Exception{
		if(pedido==null) return "No hay productos.";
		FacturaRepository facturarepository = new FacturaRepository();
		facturarepository.Ingresar_pedido(pedido);
		return "Pedido enviado";
	}
	
	public Producto consultarproductoinvididual(String idu) throws Exception{
		for(Producto producto: productos){ //Revisamos todos los productos
			if(producto.getCodigo().equalsIgnoreCase(idu)) return producto; //Cuando encontremos el producto en memoria que consida con la id que estamos buscando, retorna el producto
		}
		System.out.println("retornó null");
		return null;
	}

	public void adicionarproducto(String id2) throws Exception {
		if(pedido_sin_asignar==null) pedido_sin_asignar = new Pedido(); //Si no hay pedido, se crea
		if(pedido_sin_asignar.getCuerpo() == null) pedido_sin_asignar.cuerpo = new ArrayList<Producto>(); //Si el pedido no tiene productos, se crea el vector
		Producto encontrado = consultarproductoinvididual(id2); //Le decimos al mesero que nos busque la ubicacion en memoria del producto
		pedido_sin_asignar.Adicionarproducto(encontrado); //Ya encontrado el producto, lo adicionamos al pedido
	}

	public void finiquitarpedido(Pedido pedido, String cliente, String mesero, Mesa mesa, String cajero, String fecha) throws Exception {
		ArrayList<Producto> lista_productos = pedido.getCuerpo();
		Pedido pedido_a_finiquitar = new Pedido(lista_productos, cliente, mesa, cajero, fecha);
		if(coladepedidos == null) coladepedidos = new HashMap<Mesa, Pedido>();
		coladepedidos.put(mesa,pedido_a_finiquitar);
		mesa.setEstado("Despachado");
		enviar_pedido(pedido_a_finiquitar);
	}
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public void pagar() {
		System.out.println("Se le debe pagar 20");
	}

}
