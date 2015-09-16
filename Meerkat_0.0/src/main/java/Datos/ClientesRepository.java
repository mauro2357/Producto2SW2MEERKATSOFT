package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.cliente.Cliente;

public class ClientesRepository {

	public ArrayList<Cliente> Consultar_Cliente () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM cliente";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Cliente> a = new ArrayList<Cliente>();
	    while (rs.next()){
	      String id = rs.getString("Cli_id");
	      String nombre = rs.getString("Cli_nombre");
	      String apellido = rs.getString("Cli_apellido");
	      String sexo = rs.getString("Cli_sexo");
	      int puntos = rs.getInt("Cli_puntos");
	      String musica = rs.getString("Cli_musica");
	      String email = rs.getString("Cli_email");
	      String telefono = rs.getString("Cli_telefono");
	      Cliente c = new Cliente(id, nombre, apellido, sexo, puntos, musica, email, telefono);
	      a.add(c);     
	    }
	    st.close();
	    return a; 
	}
	
	public void Registrar_usuario (String id, String nombre, String apellido, String sexo, int puntos, String musica, String email, String telefono) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "INSERT INTO `future`.`cliente` (`Cli_id`, `Cli_nombre`, `Cli_apellido`, `Cli_sexo`, `Cli_puntos`, `Cli_musica`, `Cli_email`, `Cli_telefono`) VALUES ('"+id+"', '"+nombre+"', '"+apellido+"', '"+sexo+"', '"+puntos+"', '"+musica+"', '"+email+"', '"+apellido+"');";
	    Statement st = con.createStatement();
	    st.executeUpdate(query);
	    st.close();
	}
	
}
