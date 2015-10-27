package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.pedido.Mesero;

public class MeseroRepository {
	
	public ArrayList<Mesero> Consultar_mesero () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM mesero";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Mesero> a = new ArrayList<Mesero>();
	    while (rs.next()){
	      String id = rs.getString("Me_id");
	      System.out.println("id de la base de datos: " + id);
	      String nombre = rs.getString("Me_Nombre");
	      String apellido = rs.getString("Me_apellido");
	      Mesero p = new Mesero(id, nombre, apellido);
	      a.add(p);     
	    }
	    
	    st.close();
	    return a; 
	}
	
}
