package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.tomaynotificacionpedidos.Mesero;

public class MeseroRepository {
	public ArrayList<Mesero> ConsultarMesero () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM Mesero";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Mesero> a = new ArrayList<Mesero>();
	    while (rs.next()){
	      String id = rs.getString("Me_id");
	      String nombre = rs.getString("Me_Nombre");
	      String apellido = rs.getString("Me_apellido");
	      String telefono = rs.getString("Me_telefono");
	      Mesero p = new Mesero(id, nombre, apellido, telefono);
	      a.add(p);     
	    }
	    st.close();
	    return a; 
	}
}
