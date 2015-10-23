package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.pedido.Producto;

public class InventarioRepository {

	public ArrayList<Producto> Consultar_insumos () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM insumos";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Producto> a = new ArrayList<Producto>();
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
	
	public void Registrar_insumo (String codigo, String nombre, int valor) throws Exception {
		System.out.println("Ingreso inventario repository antes de ejecutar el query");
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "INSERT INTO `future`.`insumos` (`Ins_id`, `Ins_nombre`, `Ins_valor`) VALUES ('"+codigo+"', '"+nombre+"', '"+valor+"');";
	    Statement st = con.createStatement();
	    st.executeUpdate(query);
	    st.close();
	}
}
