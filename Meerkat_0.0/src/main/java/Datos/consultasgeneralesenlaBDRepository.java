package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
	
	
}
