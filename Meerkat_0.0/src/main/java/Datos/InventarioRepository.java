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
	      int cantidad = rs.getInt("Ins_cantidad");
	      Producto p = new Producto(codigo, nombre, valor, cantidad);
	      a.add(p);     
	    }
	    st.close();
	    return a; 
	}	
	
	public void Registrar_insumo (String codigo, String nombre, int valor, int canti) throws Exception {
		ArrayList<Producto> productos = new ArrayList<Producto>();
		productos = Consultar_insumos();
		String cod = null;
		String query;
		Connection con = new ConexionMySql().ObtenerConexion();
		Statement st = con.createStatement();
		for(Producto prod : productos){
			if(prod.codigo.equalsIgnoreCase(codigo)) {
				int cantidad = prod.cantidad + canti;
				query = "UPDATE `future`.`insumos` SET `Ins_cantidad`='"+cantidad+"' WHERE `Ins_id`='"+codigo+"';";
				cod = "NADA";
			    st.executeUpdate(query);
			    st.close();
				break;
				
			}
		}
		if(cod == null){
		    query = "INSERT INTO `future`.`insumos` (`Ins_id`, `Ins_nombre`, `Ins_valor`, `Ins_cantidad`) VALUES ('"+codigo+"', '"+nombre+"', '"+valor+"', '"+canti+"');";
		    st.executeUpdate(query);
		    st.close();
		}
	}
		
}
