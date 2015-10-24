package Datos;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMySql {
	  
	private static Connection con;
	
	public  Connection ObtenerConexion() throws Exception {
		    if(con!=null) return con;
			String driver = "com.mysql.jdbc.Driver";//Conexion Base de datos
//		    String connection = "jdbc:mysql://localhost:3306/future";
//		    String user = "root";
//		    String password = "root";
			
			String connection = "jdbc:mysql://mysql6339-meerkat999.j.facilcloud.com/future";
		    String user = "root";
		    String password = "IHFmnn16021";
		    Class.forName(driver);
		    con = DriverManager.getConnection(connection, user, password);
		    return con;
	  }
}