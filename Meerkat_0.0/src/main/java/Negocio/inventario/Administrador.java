package Negocio.inventario;

import java.util.ArrayList;

import Datos.ClientesRepository;
import Datos.EmpleadosRepository;
import Datos.GeneralesRepository;
import Datos.InventarioRepository;
import Negocio.cliente.Cliente;
import Negocio.pedido.Despachador;
import Negocio.pedido.Empleado;
import Negocio.pedido.Mesero;
import Negocio.pedido.Producto;

public class Administrador extends Empleado {

	public String clave;
	public ArrayList<Producto> lista_insumos;
	public ArrayList<Cliente> lista_clientes;
	public ArrayList<Producto> productos_mas_vendidos;
	public ArrayList<Empleado> lista_empleados;
	public String total_ventas;
	
	InventarioRepository inventarioRepository = new InventarioRepository();
	ClientesRepository clientesRepository = new ClientesRepository();
	GeneralesRepository generalesRepository = new GeneralesRepository();
	EmpleadosRepository empleadosRepository = new EmpleadosRepository();
	
	public Administrador(String id, String nombre, String apellido, String telefono, String clave) throws Exception{
		super(id, nombre, apellido, telefono);
		this.clave = clave; 
	}
	
	public ArrayList<Producto> Productos_mas_vendidos() throws Exception{
		this.productos_mas_vendidos = generalesRepository.Consultarproductos_masvendidos();
		return this.productos_mas_vendidos;
	}
	
	public String Consultar_total_Ventas() throws Exception{
		this.total_ventas = generalesRepository.Consultar_totalVentas();
		return this.total_ventas;
	}
	
	public ArrayList<Producto> Consultar_Insumos() throws Exception{
		this.lista_insumos = inventarioRepository.Consultar_insumos();
		return this.lista_insumos;
	}
	
	public ArrayList<Cliente> Consultar_Clientes() throws Exception{
		this.lista_clientes = clientesRepository.Consultar_Clientes();
		return this.lista_clientes;
	}
	
	public void Contratar_Mesero(String id, String nombre, String apellido, String telefono) throws Exception{ 
		empleadosRepository.Registrar_mesero(id, nombre, apellido, telefono);
	}
	
	public void Contratar_Despachador(String id, String nombre, String apellido, String telefono) throws Exception{ 
		empleadosRepository.Registrar_despachador(id, nombre, apellido, telefono);
	}
	
	public void eliminar_empleado(String id) throws Exception{
		
		this.lista_empleados = empleadosRepository.Consultar_Empleados();
		System.out.println("ingreso a eliminar empleados en admin");
		for(Empleado empleado : this.lista_empleados){
			System.out.println("id del empleado: " + empleado.id);
			System.out.println("id a buscar: " + id );
			if(id.equalsIgnoreCase(empleado.id)){
				System.out.println("encontro la id: ");
		    	if(empleado instanceof Mesero){
		    		empleadosRepository.eliminar_mesero(id);
				}
				if(empleado instanceof Despachador){
					empleadosRepository.eliminar_despachador(id);
				}
				break;
			}
		}
	}
	
	public void Agregar_insumo(String id, String nombre, int valor) throws Exception{ 
		inventarioRepository.Registrar_insumo(id, nombre, valor);
	}

	@Override
	public void pagar() throws Exception {
		String saldo = "100000";
		empleadosRepository.Pagar(this,this.id,saldo);	
	}

	@Override
	public void bonificacacion() {
		
	}
}
