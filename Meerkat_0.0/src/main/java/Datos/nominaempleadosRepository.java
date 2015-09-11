package Datos;

import java.sql.Connection;
import java.sql.Statement;

public class nominaempleadosRepository {
	
	public void registrarusuario (String id, String nombre, String apellido, String telefono) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "INSERT INTO `future`.`despachador` (`Des_id`, `Des_nombre`, `Des_apellido`, `Des_telefono`) VALUES ('"+id+"', '"+nombre+"', '"+apellido+"', '"+telefono+"');";
	    System.out.println("debio ingresar los datos");
	    Statement st = con.createStatement();
	    st.executeUpdate(query);
	    st.close();
	}
}
