package Negocio.inventario;

import java.util.ArrayList;

import Datos.ClientesRepository;
import Datos.EmpleadosRepository;
import Datos.GeneralesRepository;
import Datos.InventarioRepository;
import Negocio.cliente.Cliente;
import Negocio.pedido.Empleado;
import Negocio.pedido.Producto;

public class Administrador extends Empleado {
	
	public String id;
	public String nombre;
	public String apellido;
	public String telefono;
	public String clave;
	public ArrayList<Producto> lista_insumos;
	public ArrayList<Cliente> lista_clientes;
	public ArrayList<Producto> productos_mas_vendidos;
	public String total_ventas;
	
	InventarioRepository inventarioRepository = new InventarioRepository();
	ClientesRepository clientesRepository = new ClientesRepository();
	GeneralesRepository generalesRepository = new GeneralesRepository();
	EmpleadosRepository empleadosRepository = new EmpleadosRepository();
	
	public Administrador(String id, String nombre, String apellido, String telefono, String clave) throws Exception{
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.clave = clave;
		this.lista_insumos = inventarioRepository.Consultar_insumos();
		this.lista_clientes = clientesRepository.Consultar_Clientes();
		this.total_ventas = generalesRepository.Consultar_totalVentas();
		this.productos_mas_vendidos = generalesRepository.Consultarproductos_masvendidos();
	}
	
	public void AgregarProducto() throws Exception{ 
		
	}
	
	public void Contratar_Mesero(String id, String nombre, String apellido, String telefono) throws Exception{ 
		empleadosRepository.Registrar_mesero(id, nombre, apellido, telefono);
	}
	
	public void Contratar_Despachador(String id, String nombre, String apellido, String telefono) throws Exception{ 
		empleadosRepository.Registrar_despachador(id, nombre, apellido, telefono);
	}
	
	public void Agregar_insumo(String id, String nombre, int valor) throws Exception{ 
		inventarioRepository.Registrar_insumo(id, nombre, valor);
	}
	
	public String getMensaje() throws Exception {
		 return "No hay Insumos";
	}

	@Override
	public void pagar() throws Exception {
		String saldo = "100000";
		empleadosRepository.Pagar(this,this.getId(),saldo);	
	}

	@Override
	public void bonificacacion() {
		
	}

	public ArrayList<Producto> getLista_insumos() {
		return lista_insumos;
	}

	public void setLista_insumos(ArrayList<Producto> lista_insumos) {
		this.lista_insumos = lista_insumos;
	}

	public ArrayList<Cliente> getLista_clientes() {
		return lista_clientes;
	}

	public void setLista_clientes(ArrayList<Cliente> lista_clientes) {
		this.lista_clientes = lista_clientes;
	}

	public String getTotal_ventas() {
		return total_ventas;
	}

	public void setTotal_ventas(String total_ventas) {
		this.total_ventas = total_ventas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public ArrayList<Producto> getProductos_mas_vendidos() {
		return productos_mas_vendidos;
	}

	public void setProductos_mas_vendidos(ArrayList<Producto> productos_mas_vendidos) {
		this.productos_mas_vendidos = productos_mas_vendidos;
	}

	public void Consultar_inventario() {
		
	}


		
		
		
	

	public boolean Consultar_despachador() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getMessageHayDespachador() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean Consultar_mesero() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean getMessageHayMesero() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean getConexionAInternet() {
		// TODO Auto-generated method stub
		return true;
		
	}

	public Object getMessageHayconexion() {
		// TODO Auto-generated method stub
		return null;
			
	}

	
	
}
