package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.tomaynotificacionpedidos.Producto;

public class InventarioRepository {

		public ArrayList<Producto> ConsultarInsumos () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM insumos";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Producto> a = new ArrayList<Producto>();
	    System.out.println("ingreso al repository: ");
	    while (rs.next()){
	      String codigo = rs.getString("Ins_id");
	      String nombre = rs.getString("Ins_nombre");
	      int valor = rs.getInt("Ins_valor");
	      
	      Producto p = new Producto(codigo, nombre, valor);
	      a.add(p);     
	    }
	    st.close();
	    return a; 
	}
	
	
}
