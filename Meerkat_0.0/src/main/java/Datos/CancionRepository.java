package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.musica.Cancion;


public class CancionRepository {
	public static ArrayList<Cancion> Consultar_Canciones() throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM cancion";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Cancion> a = new ArrayList<Cancion>();
	    while (rs.next()){
	      String nombre = rs.getString("Cancion_nombre");
	      String ruta = rs.getString("Cancion_ruta");
	      Cancion c = new Cancion(nombre,ruta);
	      a.add(c);     
	    }
	    st.close();
	    return a; 
	}
}