package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.ActualizarInventario.*;
import Negocio.inventario.Administrador;

public class AdministradorRepository {
	
	public ArrayList<Administrador> Consultar_Administradores() throws Exception{
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM administrador";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Administrador> a = new ArrayList<Administrador>();
	    while (rs.next()){
	      String id = rs.getString("Ad_id");
	      String nombre = rs.getString("Ad_nombre");
	      String apellido = rs.getString("Ad_apellido");
	      String telefono = rs.getString("Ad_telefono");
	      String clave = rs.getString("Ad_clave");
	      Administrador p = new Administrador(id, nombre, apellido, telefono, clave);
	      a.add(p);     
	    }
	    st.close();
	    return a; 
	}
	
}
