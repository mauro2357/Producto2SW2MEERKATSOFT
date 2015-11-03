package Negocio.pedido;

import java.util.*;

import Datos.*;
import Negocio.cliente.Cliente;
import Negocio.factura.Factura;

public class Mesero extends Empleado {
	
	public ArrayList<Producto> productos;
	public ArrayList<Mesa> mesas;
	public ArrayList<Mesa> mesas_libres;
	public Pedido pedido_sin_asignar;
	public ArrayList<Factura> coladefacturas;
	public ArrayList<Cliente> clientes;
	
	ProductoRepository productoRepository = new ProductoRepository();
	MesaRepository mesaRepository = new MesaRepository();
	ClientesRepository clienteRepository = new ClientesRepository();
	EmpleadosRepository empleadosRepository = new EmpleadosRepository();
	FacturaRepository facturaRepository = new FacturaRepository();
		
	public Mesero(String id, String nombre, String apellido, String telefono) throws Exception{
		super(id, nombre, apellido, telefono);
		this.productos = productoRepository.Consultar_producto();
		this.mesas = mesaRepository.Consultar_mesas(null);
		this.mesas_libres = mesaRepository.Consultar_mesas("ninguna");
		this.clientes = clienteRepository.Consultar_Clientes();
		this.pedido_sin_asignar = facturaRepository.Pedido_temporal(id);
		this.coladefacturas = Actualizar_Mis_Pedidos();
		
	}

	public Mesero() throws Exception { 
		super();
		this.productos = productoRepository.Consultar_producto();
		this.mesas = mesaRepository.Consultar_mesas(null);
		this.mesas_libres = mesaRepository.Consultar_mesas("Despachado");
		this.clientes = clienteRepository.Consultar_Clientes();
		this.pedido_sin_asignar = null;
	}
	
	public ArrayList<Factura> Actualizar_Mis_Pedidos() throws Exception{
		this.coladefacturas = new ArrayList<Factura>();
		for(Factura factura: facturaRepository.Generar_factura(null)){
			if(factura.mesero.equalsIgnoreCase(this.id)) coladefacturas.add(factura);
		}
		return this.coladefacturas;
	}
	
	public Mesa Definir_Mesa(String mesa){
		Mesa mesae = null;
		for(Mesa mesam: mesas){
			if(mesa.equalsIgnoreCase(mesam.id)){
				mesae=mesam;
				break;
			}
		}
		return mesae;
	}
	
	public void Ocupar_Mesa(Mesa mesa) throws Exception{mesaRepository.Ocupar_Desocupar_Mesa(mesa.id, "ocupada");}
	
	public void Registrar_Cliente(String id, String nombre, String apellido, String sexo, int puntos, String musica, String email, String telefono) throws Exception{
		clienteRepository.Registrar_usuario(id, nombre, apellido, sexo, puntos, musica, email, telefono);
	}
	
	public String enviar_pedido(Pedido pedido) throws Exception{
		if(pedido==null) return "No hay productos.";
		facturaRepository.Ingresar_pedido(pedido, this.id);
		return "Pedido enviado";
	}
	
	public Producto consultarproductoinvididual(String idu) throws Exception{
		for(Producto producto: productos){ //Revisamos todos los productos
			if(producto.codigo.equalsIgnoreCase(idu)) return producto; //Cuando encontremos el producto en memoria que consida con la id que estamos buscando, retorna el producto
		}
		return null;
	}

	public void adicionarproducto(String id2) throws Exception {
		if(pedido_sin_asignar==null) pedido_sin_asignar = new Pedido(); //Si no hay pedido, se crea
		if(pedido_sin_asignar.cuerpo == null) pedido_sin_asignar.cuerpo = new ArrayList<Producto>(); //Si el pedido no tiene productos, se crea el vector
		facturaRepository.Adicionar_Producto_a_Pedido_Temporal(id2,this.id);
		pedido_sin_asignar = facturaRepository.Pedido_temporal(this.id);
	}
	
	public void quitarproducto(String id2) throws Exception {
		if(pedido_sin_asignar.cuerpo.size()==0) pedido_sin_asignar.cuerpo = null;
		facturaRepository.Quitar_Producto_a_Pedido_Temporal(id2, this.id, pedido_sin_asignar);
		pedido_sin_asignar = facturaRepository.Pedido_temporal(this.id);
	}

	public String finiquitarpedido(Pedido pedido, String cliente, String mesero, Mesa mesa, String cajero, String fecha) throws Exception {
		ArrayList<Producto> lista_productos = pedido.cuerpo;
		if(lista_productos == null || lista_productos.size()<0) return "No hay productos.";
		Pedido pedido_a_finiquitar = new Pedido(lista_productos, cliente, mesa, cajero, fecha, this);
		mesa.estado = "Despachado";
		enviar_pedido(pedido_a_finiquitar);
		return "Pedido enviado";
	}
	
	public void Limpiar_pedido_temporal(Mesero mesero) throws Exception{
		facturaRepository.Limpiar_pedido_temporal(mesero.id);
	}
	
	public Pedido Generar_pedido_temporal(Mesero mesero) throws Exception{
		this.pedido_sin_asignar = facturaRepository.Pedido_temporal(id);
		return this.pedido_sin_asignar;
	}
	
	@Override
	public void pagar() throws Exception {
		String saldo = "35000";
		empleadosRepository.Pagar(this,this.id,saldo);
	}

	@Override
	public void bonificacacion() {
		// TODO Auto-generated method stub
		
	}
}
