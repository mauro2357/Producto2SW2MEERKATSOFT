package Presentacion;

import java.util.ArrayList;

import Datos.AdministradorRepository;
import Negocio.inventario.Administrador;

public class AdministradoresFacade {
	
	public Administrador administrador;
	public ArrayList<Administrador> lista_administradores;
	public static AdministradorRepository administradorRepository = new AdministradorRepository();
	
	public ArrayList<Administrador> Consultar_Administradores() throws Exception{
		this.lista_administradores = administradorRepository.Consultar_Administradores();
		this.administrador = this.lista_administradores.get(0);
		return lista_administradores;
	}
}
