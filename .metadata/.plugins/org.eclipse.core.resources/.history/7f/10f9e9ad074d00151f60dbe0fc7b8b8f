package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.tomaynotificacionpedidos.Producto;


public class ProductoRepository {
	public ArrayList<Producto> ConsultarProducto () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM producto";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Producto> a = new ArrayList<Producto>();
	    while (rs.next()){
	      String codigo = rs.getString("Pro_id");
	      String nombre = rs.getString("Pro_nombre");
	      Double valor = rs.getDouble("Pro_valor");
	      String descripcion = rs.getString("Pro_nombre");
	      Producto p = new Producto(codigo, nombre, valor, descripcion);
	      a.add(p);     
	    }
	    st.close();
	    return a; 
	}
}
