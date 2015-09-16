package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Controlador.MeseroControllador;
import Negocio.factura.Factura;
import Negocio.pedido.Pedido;
import Negocio.pedido.Producto;

public class FacturaRepository {
	
	public void Ingresar_pedido(Pedido x) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    System.out.println(x.cliente);
		String query = "INSERT INTO `future`.`venta` (`Ven_fecha`, `Ven_estado`, `Cli_id`, `Me_id`, `Mesa_id`) VALUES ('"+x.fecha+"', '"+x.estado+"', '"+x.cliente+"', '"+x.mesero.getId()+"', '"+x.mesa+"');";
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
	
	public ArrayList<Factura> Generar_factura() throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM factura";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Factura> f = new ArrayList<Factura>();
	    ProductoRepository prepository = new ProductoRepository();
	    ArrayList<Producto> tproductos = prepository.Consultar_producto();
	    ArrayList<Producto> x = null;
	    Pedido y = null;
	    String auxid = null;
	    String mesero=null, cajero=null, mesa=null, cliente=null,id=null;
	    while (rs.next()){
	    	id=rs.getString("Ven_id");
	    	if(auxid==null) auxid=id;
	    	if(!auxid.equalsIgnoreCase(id)){
	    	if(y!=null){
	    		  y.cuerpo = x;
	    		  Factura fi = new Factura(id,mesero, cajero,mesa,y,cliente);
			      f.add(fi);
	    	}
	    	y = new Pedido();
	    	x = null;
	    	auxid=id;
	      }
	      if(auxid.equalsIgnoreCase(id)){
	    	  if(x==null) x = new ArrayList<Producto>();
	    	  System.out.println("leer");
	    	  mesero = rs.getString("Me_id");
		      cajero = rs.getString("Caj_id");
		      mesa = rs.getString("Mesa_id");
		      cliente = rs.getString("Cli_id");
		      for(Producto producto: tproductos){
		    	  if(producto.getCodigo().equalsIgnoreCase(rs.getString("Pro_id"))){ x.add(producto); System.out.println(producto.getNombre()); break;}
		      }
		      auxid = id;
		      continue;
	      }
	      
	    }
	    y.cuerpo = x;
		Factura fi = new Factura(id,mesero, cajero,mesa,y,cliente);
	    f.add(fi);
	    st.close();
	    return f;
	}
	
	public ArrayList<Producto> Generar_pedido(int idu) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM new_view";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Producto> f = MeseroControllador.consultarmeserosFacade.mesero.productos;
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
