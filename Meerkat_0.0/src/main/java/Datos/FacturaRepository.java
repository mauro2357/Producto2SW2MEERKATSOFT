package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.geraciondefactura.Factura;
import Negocio.tomaynotificacionpedidos.Producto;
import Presentacion.consultarproductosFacade;
public class FacturaRepository {
	public void ingresarPedido(String id, ArrayList<Producto> x, String fecha,String estado, String mesa, String mesero, String cliente, String caja) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "INSERT INTO `future`.`venta` (`Ven_id`, `Ven_fecha`, `Ven_estado`, `Cli_id`, `Me_id`, `Mesa_id`, `Caj_id`) VALUES ('"+id+"', '"+fecha+"', '"+estado+"', '"+cliente+"', '"+mesero+"', '"+mesa+"', '"+caja+"');";
	    Statement st = con.createStatement();
	    //st.executeUpdate(query);
		ArrayList<Producto> visitados = new ArrayList<Producto>();
		for(Producto producto: x){
			if(visitados.contains(producto)) continue;
			int aux=0;
			for(Producto auxproducto: x){
				if(producto==auxproducto){
					aux++;
					visitados.add(auxproducto);
				}
			}
			query = "INSERT INTO detalles_venta (`Pro_id`, `Ven_id`, `Dtv_cantidad`) VALUES ('"+producto.getCodigo()+"','"+id+"','"+aux+"');";
			st.executeUpdate(query);
		}
	    st.close();
	}
	
	public ArrayList<Factura> generarfactura() throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM new_view";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Factura> f = new ArrayList<Factura>();
	    while (rs.next()){
	      String id = rs.getString("Ven_id");
	      String meser = rs.getString("Me_nombre");
	      String cajer = rs.getString("Caj_nombre");
	      String mesa = rs.getString("Mesa_id");
	      String producto=rs.getString("Pro_id"+""+"Pro_nombre"+"Pro_valor");
	      Factura fi = new Factura(id,meser, cajer,mesa,producto);
	      f.add(fi);
	    }
	    st.close();
	    return f;
	}
	
	public ArrayList<Producto> generarpedido(int idu) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM new_view";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Producto> f = new ArrayList<Producto>();
	    consultarproductosFacade x = new consultarproductosFacade();
	    ArrayList<Producto> y = x.main();
	    while (rs.next()){
	      String id = rs.getString("Ven_id");
	      if(Integer.parseInt(id)==idu){
	    	  String idp = rs.getString("Pro_id");
	    	  for(Producto producto: y){
	    		  if(producto.getCodigo()==idp){
	    			  f.add(producto);
	    		  }
	    	  }  
	      }
	    }
	    st.close();
	    return f;
	}
}