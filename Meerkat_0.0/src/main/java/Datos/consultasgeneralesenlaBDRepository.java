package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.tomaynotificacionpedidos.Producto;

public class consultasgeneralesenlaBDRepository {

		public String Consultar_totalVentas () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "select  sum(Pro_valor) from producto natural join Detalles_venta natural join venta;";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    String a = null;
	    while (rs.next()){
		      a = rs.getString("sum(Pro_valor)");
  
		    }	    
	    System.out.println("ingreso al repository: ");
	    System.out.println(a);
	    st.close();
	    return a; 
	}
	
		public ArrayList<Producto> Productos_masvendidos () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "select Pro_nombre, count(*) b from producto natural join Detalles_venta natural join venta group by Pro_nombre having b >= 2 order by b asc;";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Producto> a = new ArrayList<Producto>();
	    System.out.println("ingreso al repository: ");
	    while (rs.next()){
	      String nombre = rs.getString("Pro_nombre");
	      String tventas = rs.getString("b");
	      
	      Producto p = new Producto(nombre, tventas);
	      a.add(p);     
	    }
	    st.close();
	    return a; 
	}
	
}
