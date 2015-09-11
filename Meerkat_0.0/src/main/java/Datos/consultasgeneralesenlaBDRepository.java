package Datos;

import java.sql.Connection;
import java.sql.Statement;


public class consultasgeneralesenlaBDRepository {

		public String Consultar_totalVentas () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "select  sum(Pro_valor) from producto natural join Detalles_venta natural join venta;";
	    Statement st = con.createStatement();
	    String a = null;
	    a = query;	    
	    System.out.println("ingreso al repository: ");
	    st.close();
	    return a; 
	}
	
	
}
