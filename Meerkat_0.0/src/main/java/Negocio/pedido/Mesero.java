package Negocio.pedido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Datos.*;
import Negocio.cliente.Cliente;

public class Mesero extends Empleado {
	
	public String id;
	public String nombre;
	public String apellido;
	public String telefono;
	public ArrayList<Producto> productos;
	public ArrayList<Mesa> mesas;
	public ArrayList<Mesa> mesas_libres;
	public Pedido pedido_sin_asignar;

	public Map<Mesa, Pedido> coladepedidos;
	public ArrayList<Cliente> clientes;
	
	ProductoRepository productoRepository = new ProductoRepository();
	MesaRepository mesaRepository = new MesaRepository();
	ClientesRepository clienteRepository = new ClientesRepository();
	EmpleadosRepository empleadosRepository = new EmpleadosRepository();
	FacturaRepository facturaRepository = new FacturaRepository();
	
	public Mesero(String id, String nombre, String apellido, String telefono) throws Exception {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.productos = productoRepository.Consultar_producto();
		this.mesas = mesaRepository.Consultar_mesas(null);
		this.mesas_libres = mesaRepository.Consultar_mesas("ocupada");
		this.clientes = clienteRepository.Consultar_Clientes();
		this.pedido_sin_asignar = facturaRepository.Pedido_temporal(id);
	}

	public Mesero() throws Exception { 
		this.productos = productoRepository.Consultar_producto();
		this.mesas = mesaRepository.Consultar_mesas(null);
		this.mesas_libres = mesaRepository.Consultar_mesas("Despachado");
		this.clientes = clienteRepository.Consultar_Clientes();
		this.pedido_sin_asignar = null;
	}

	public void setId(String id) {this.id = id;}
	public String getId() {return id;}
	public String getNombre() {return nombre;}
	public String getApellido() {return apellido;}
	public String getTelefono() {return telefono;}
	public Map<Mesa, Pedido> getColadepedidos() {return coladepedidos;}
	public void setColadepedidos(Map<Mesa, Pedido> coladepedidos) {this.coladepedidos = coladepedidos;}
	public ArrayList<Producto> getProductos() {return productos;}
	public void setProductos(ArrayList<Producto> productos) {this.productos = productos;}
	
	public Mesa Definir_Mesa(String mesa){
		Mesa mesae = null;
		for(Mesa mesam: mesas){
			if(mesa.equalsIgnoreCase(mesam.getId())){
				mesae=mesam;
				break;
			}
		}
		return mesae;
	}
	
	public void Ocupar_Mesa(Mesa mesa) throws Exception{mesaRepository.Ocupar_Desocupar_Mesa(mesa.getId(), "ocupada");}
	
	public void Registrar_Cliente(String id, String nombre, String apellido, String sexo, int puntos, String musica, String email, String telefono) throws Exception{
		clienteRepository.Registrar_usuario(id, nombre, apellido, sexo, puntos, musica, email, telefono);
	}
	
	public String getMensaje() throws Exception {
		if(this.getProductos().size()<0) return "No hay productos";
		return "Hay productos";
	}
	
	public String enviar_pedido(Pedido pedido) throws Exception{
		if(pedido==null) return "No hay productos.";
		FacturaRepository facturarepository = new FacturaRepository();
		facturarepository.Ingresar_pedido(pedido, this.getId());
		return "Pedido enviado";
	}
	
	public Producto consultarproductoinvididual(String idu) throws Exception{
		for(Producto producto: productos){ //Revisamos todos los productos
			if(producto.getCodigo().equalsIgnoreCase(idu)) return producto; //Cuando encontremos el producto en memoria que consida con la id que estamos buscando, retorna el producto
		}
		return null;
	}

	public void adicionarproducto(String id2) throws Exception {
		if(pedido_sin_asignar==null) pedido_sin_asignar = new Pedido(); //Si no hay pedido, se crea
		if(pedido_sin_asignar.getCuerpo() == null) pedido_sin_asignar.cuerpo = new ArrayList<Producto>(); //Si el pedido no tiene productos, se crea el vector
		facturaRepository.Adicionar_Producto_a_Pedido_Temporal(id2,this.getId());
		pedido_sin_asignar = facturaRepository.Pedido_temporal(this.getId());
	}
	
	public void quitarproducto(String id2) throws Exception {
		if(pedido_sin_asignar.getCuerpo().size()==0) pedido_sin_asignar.setCuerpo(null);
		facturaRepository.Quitar_Producto_a_Pedido_Temporal(id2, this.getId(), pedido_sin_asignar);
		pedido_sin_asignar = facturaRepository.Pedido_temporal(this.getId());
	}

	public String finiquitarpedido(Pedido pedido, String cliente, String mesero, Mesa mesa, String cajero, String fecha) throws Exception {
		ArrayList<Producto> lista_productos = pedido.getCuerpo();
		if(lista_productos == null || lista_productos.size()<0) return "No hay productos.";
		Pedido pedido_a_finiquitar = new Pedido(lista_productos, cliente, mesa, cajero, fecha, this);
		if(coladepedidos == null) coladepedidos = new HashMap<Mesa, Pedido>();
		coladepedidos.put(mesa,pedido_a_finiquitar);
		mesa.setEstado("Despachado");
		enviar_pedido(pedido_a_finiquitar);
		return "Pedido enviado";
	}
	
	public void Limpiar_pedido_temporal(Mesero mesero) throws Exception{
		facturaRepository.Limpiar_pedido_temporal(mesero.id);
	}
	
	@Override
	public void pagar() throws Exception {
		String saldo = "35000";
		empleadosRepository.Pagar(this,this.getId(),saldo);
	}

	@Override
	public void bonificacacion() {
		// TODO Auto-generated method stub
		
	}

	public String Agregar_Pedido_a_la_cola_de_pedidos(Mesa mesam, Pedido pedido) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(ArrayList<Mesa> mesas) {
		this.mesas = mesas;
	}

	public ArrayList<Mesa> getMesas_libres() {
		return mesas_libres;
	}

	public void setMesas_libres(ArrayList<Mesa> mesas_libres) {
		this.mesas_libres = mesas_libres;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public Pedido getPedido_sin_asignar() {
		return pedido_sin_asignar;
	}

	public void setPedido_sin_asignar(Pedido pedido_sin_asignar) {
		this.pedido_sin_asignar = pedido_sin_asignar;
	}

	

}
