package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.tomaynotificacionpedidos.Mesa;

public class MesaRepository {
	public ArrayList<Mesa> main() throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM mesa";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Mesa> a = new ArrayList<Mesa>();
	    while (rs.next()){
	      String id = rs.getString("Mesa_id");
	      String estado = rs.getString("Mesa_estado");
	      Mesa p = new Mesa(id, estado);
	      a.add(p);     
	    }
	    st.close();
	    return a; 
	}
}