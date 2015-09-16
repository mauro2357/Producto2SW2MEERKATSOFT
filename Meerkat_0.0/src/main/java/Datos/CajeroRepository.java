package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.factura.*;

public class CajeroRepository {
	
	public ArrayList<Cajero> main() throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM cajero";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Cajero> a = new ArrayList<Cajero>();
	    while (rs.next()){
	      String id = rs.getString("Caj_id");
	      String nombre = rs.getString("Caj_nombre");
	      String apellido = rs.getString("Caj_apellido");
	      String clave = rs.getString("Caj_clave");
	      String telefono = rs.getString("Caj_telefono");
	      Cajero p = new Cajero(id, nombre, apellido, clave, telefono);
	      a.add(p);     
	    }
	    st.close();
	    return a; 
	}
	
}
