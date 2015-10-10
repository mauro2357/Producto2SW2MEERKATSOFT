package Negocio.inventario;

import java.util.ArrayList;

import Negocio.pedido.*;
import Presentacion.InventarioFacade;

public class Administrador extends Empleado {
	
	ArrayList<Mesero> nominademeseros = new ArrayList<Mesero>();
	//Lista de meseros.
	ArrayList<Despachador> nominadedespachadores = new ArrayList<Despachador>();
	//Lista de despachadores.
	
	public ArrayList<Producto> Consultar_inventario() throws Exception {
		InventarioFacade y = new InventarioFacade();
		ArrayList<Producto> z = new ArrayList<Producto>();
		z = y.Consultar_insumos();
		return z;
	}
	
	public void contratar_mesero() throws Exception{  //Se contrata un mesero y se mete en la lista de meseros contratados.
		Mesero mesero = new Mesero();
		nominademeseros.add(mesero);
	}
	
	public void contratar_despachador(){
		//Despachador despachador = new Despachador();
		//nominadedespachadores.add(despachador);
	}
	
	public boolean consultar_mesero(){
		return true; //if(objeto mesero existe en el array) return true
	}
	
	public boolean Consultar_despachador(){
		return true; //if(objeto despachador existe en el array) return true
	}
	
	public String getMessageHayMesero(){
		return "No hay mesero.";
	}
	
	public String getMessageHayDespachador(){
		return "No hay despachador.";
	}
	
	
	public boolean Adicionar_alinventario(){
		return true;
	}
	
	public boolean Verificar_productoinventario(){
		return true;
	}
	
	public boolean verificar_conexion_bd(){
		return true ;
	}
	
	public String notificar_conexion_bd(){
		return "Error en la conexion con la base de datos.";
	}

	public String getConexionAInternet() {
		return "No hay conexion a internet.";
	}

	@Override
	public void pagar() {
		System.out.println("Se le debe pagar al administrador un millon de pesos");	
	}

	@Override
	public void bonificacacion() {
		// TODO Auto-generated method stub
		
	}
}
