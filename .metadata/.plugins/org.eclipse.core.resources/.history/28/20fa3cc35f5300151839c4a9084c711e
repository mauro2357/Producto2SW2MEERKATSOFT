package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Controlador.meseroControllador;
import Negocio.geraciondefactura.Factura;
import Negocio.tomaynotificacionpedidos.Mesero;
import Negocio.tomaynotificacionpedidos.Pedido;
import Negocio.tomaynotificacionpedidos.Producto;

public class FacturaRepository {
	public void ingresarPedido(Pedido x) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "INSERT INTO `future`.`venta` (`Ven_fecha`, `Ven_estado`, `Cli_id`, `Me_id`, `Mesa_id`, `Caj_id`) VALUES ('"+x.fecha+"', '"+x.estado+"', '"+x.cliente+"', '"+x.mesero.getId()+"', '"+x.mesa+"', '"+x.cajero+"');";
	    Statement st = con.createStatement();
	    st.executeUpdate(query);
	    query = "Select * from venta order by ven_id desc limit 1";
	    st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    rs.first();
	    String ven_id = rs.getString("Ven_id");
		ArrayList<String> visitados = new ArrayList<String>();
		for(Producto producto: x.getCuerpo()){
			if(visitados.contains(producto.getCodigo())) continue;
			int aux=0;
			for(Producto auxproducto: x.getCuerpo()){
				if(producto.getCodigo().equalsIgnoreCase(auxproducto.getCodigo())){
					visitados.add(auxproducto.getCodigo());
					aux++;
				}
			}
			query = "INSERT INTO detalles_venta (`Pro_id`, `Ven_id`, `Dtv_cantidad`) VALUES ('"+producto.getCodigo()+"','"+ven_id+"','"+aux+"');";
			st.executeUpdate(query);
		}
	    st.close();
	}
	
	public ArrayList<Factura> generarfactura() throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM factura";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Factura> f = new ArrayList<Factura>();
	    Mesero meseroa = new Mesero();
	    ArrayList<Producto> tproductos = meseroa.consultarproductos();
	    ArrayList<Producto> x = null;
	    Pedido y = null;
	    String auxid = null;
	    while (rs.next()){
	      String id = rs.getString("Ven_id");
	      String mesero=null, cajero=null, mesa=null, cliente=null;
	      System.out.println(id);
	      if(auxid==null) auxid=id;
	      if(id.equalsIgnoreCase(auxid)){
	    	  System.out.println("entró");
	    	  if(x==null) x = new ArrayList<Producto>();
	    	  mesero = rs.getString("Me_id");
		      cajero = rs.getString("Caj_id");
		      mesa = rs.getString("Mesa_id");
		      cliente = rs.getString("Cli_id");
		      for(Producto producto: tproductos){
		    	  if(producto.getCodigo().equalsIgnoreCase(rs.getString("Pro_id"))) x.add(producto);
		      }
		      System.out.println(x);
		      auxid = id;
		      continue;
	      }else{
	    	  y = new Pedido();
	    	  y.cuerpo = x;
	    	  x = null;
	    	  auxid = null;
	      }
	      Factura fi = new Factura(id,mesero, cajero,mesa,y,cliente);
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
	    ArrayList<Producto> f = meseroControllador.consultarmeserosFacade.mesero.productos;
	    while (rs.next()){
	      String id = rs.getString("Ven_id");
	      if(Integer.parseInt(id)==idu){
	    	  String idp = rs.getString("Pro_id");
	    	  for(Producto producto: f){
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
