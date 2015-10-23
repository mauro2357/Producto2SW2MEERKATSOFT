package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.pedido.Despachador;

public class DespachadorRepository {
	
	public ArrayList<Despachador> Consultar_despachador () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM despachador";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Despachador> a = new ArrayList<Despachador>();
	    while (rs.next()){
	      String id = rs.getString("Des_id");
	      String nombre = rs.getString("Des_nombre");
	      String apellido = rs.getString("Des_apellido");
	      String telefono = rs.getString("Des_telefono");
	      Despachador p = new Despachador(id, nombre, apellido, telefono);
	      a.add(p);     
	    }
	    st.close();
	    return a; 
	}
	
	public void Despachar_pedido(int id) throws Exception{
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "UPDATE venta SET `Ven_estado`='Despachado' WHERE `Ven_id`='"+ Integer.toString(id) +"';";
	    Statement st = con.createStatement();
	    st.executeUpdate(query);
	    st.close();
	}

	public void Cancelar_pedido(int parseInt) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
		Statement st = con.createStatement();
		String query = "Delete from detalles_venta where Ven_id =" + Integer.toString(parseInt) + ";";
		st.executeUpdate(query);
		query = "Delete from venta where Ven_id =" + Integer.toString(parseInt) + ";";
		st.executeUpdate(query);
		st.close();
	}
	
}
