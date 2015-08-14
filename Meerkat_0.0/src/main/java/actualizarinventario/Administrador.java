package actualizarinventario;

import java.util.ArrayList;
import tomaynotificacionpedidos.*;

public class Administrador {
	
	ArrayList<Mesero> nominademeseros = new ArrayList<Mesero>();
	//Lista de meseros.
	ArrayList<Despachador> nominadedespachadores = new ArrayList<Despachador>();
	//Lista de despachadores.
	
	public void contratar_mesero(){  //Se contrata un mesero y se mete en la lista de meseros contratados.
		Mesero mesero = new Mesero();
		nominademeseros.add(mesero);
	}
	
	public void contratar_despachador(){
		Despachador despachador = new Despachador();
		nominadedespachadores.add(despachador);
	}
	
	public boolean consultar_mesero(){
		return true; //if(objeto mesero existe en el array) return true
	}
	
	public boolean consultar_despachador(){
		return true; //if(objeto despachador existe en el array) return true
	}
	
	public String getMessageHayMesero(){
		return "No hay mesero.";
	}
	
	public String getMessageHayDespachador(){
		return "No hay despachador.";
	}
	
	public void consultar_inventario(){
		
	}
	
	public boolean agregar_producto_a_inventario(){
		return true;
	}
	
	public boolean adicinar_producto_al_inventario(){
		return true;
	}
	
	public boolean verificar_el_producto_esta_en_el_inventario(){
		return false;
	}
	
	public boolean verificar_conexion_bd(){
		return true;
	}
	
	public String notificar_conexion_bd(){
		return "Error en la conexion BD.";
	}
}
