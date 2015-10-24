package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Negocio.factura.Factura;
import Negocio.pedido.Mesa;
import Negocio.pedido.Pedido;
import Negocio.pedido.Producto;

public class FacturaRepository {
	
	public void Ingresar_pedido(Pedido x, String mesero) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
		String query = "INSERT INTO `future`.`venta` (`Ven_fecha`, `Ven_estado`, `Cli_id`, `Me_id`, `Mesa_id`) VALUES ('"+x.fecha+"', '"+x.estado+"', '"+x.cliente+"', '"+x.mesero.getId()+"', '"+x.mesa.getId()+"');";
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
		query = "delete from pedidos_temporales where Me_id = "+mesero+";";
		st.executeUpdate(query);
	    st.close();
	}
	
	public ArrayList<Factura> Generar_factura(String aignorar) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM factura";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Factura> f = new ArrayList<Factura>();
	    ProductoRepository productoRepository = new ProductoRepository();
	    MesaRepository mesaRepository = new MesaRepository();
	    ArrayList<Producto> tproductos = productoRepository.Consultar_producto(); //sI HAY ERROR ES AQUÍ
	    ArrayList<Producto> x = null;
	    int preciot=0;
	    Pedido y = null;
	    Map<Producto, Integer> z = null;
	    String auxid = null;
	    String mesero=null, cajero=null, mesa=null, cliente=null,id=null, estado=null;
	    Mesa mesam = null;
	    while (rs.next()){
	    	id=rs.getString("Ven_id");
	    	estado = rs.getString("Ven_estado");
	    	if(estado.equalsIgnoreCase(aignorar) || estado.equalsIgnoreCase("Finalizado")) continue;
	    	if(auxid==null) auxid=id;
	    	if(!auxid.equalsIgnoreCase(id)){
	    		if(y==null){
		    		  y = new Pedido();
		    		  y.cuerpo = x;
		    		  y.cantidades = z;
		    		  y.precio_total = preciot;
		    		  mesam = mesaRepository.Buscar_Mesa(mesa);
		    		  Factura fi = new Factura(auxid,mesero,cajero,mesam,y,cliente);
				      f.add(fi);
		    	}
	    		preciot = 0;
		    	x = null;
		    	z = null;
		    	y = null;
		    	auxid=id;
	    	}
	    	if(auxid.equalsIgnoreCase(id)){ 
		    	  if(x==null){ x = new ArrayList<Producto>(); preciot=0; z = new HashMap<Producto, Integer>(); }
	 	    	  mesero = rs.getString("Me_id"); 
	 		      cajero = rs.getString("Caj_id"); 
	 		      mesa = rs.getString("Mesa_id");
	 		      cliente = rs.getString("Cli_id");
	 		      for(Producto producto: tproductos){ 
	 		    	  if(producto.getCodigo().equalsIgnoreCase(rs.getString("Pro_id"))){ x.add(producto); preciot+=(producto.getValor()*Integer.parseInt(rs.getString("Dtv_cantidad"))); z.put(producto, Integer.parseInt(rs.getString("Dtv_cantidad"))); break;} 
	 		      }
	 		      auxid = id; 
	 		      continue; 
		     } 

	    }
	    y = new Pedido();
	    y.precio_total = preciot;
	    y.cuerpo = x;
	    y.cantidades = z;
	    ingresar_puntos(cliente, preciot); // METODO PARA INGRESAR PUNTOS AL CLIENTE
	    if(mesa == null) return f;
	    mesam = mesaRepository.Buscar_Mesa(mesa);
	    Factura fi = new Factura(auxid,mesero, cajero,mesam,y,cliente);
		f.add(fi);
	    st.close();
	    return f;
	}

	public void Cobrar(String id, String mesa) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
		String query = "UPDATE `future`.`venta` SET `Ven_estado`='Finalizado' WHERE `Ven_id`='"+id+"';";
		MesaRepository mesaRepository = new MesaRepository();
		mesaRepository.Ocupar_Desocupar_Mesa(mesa, "disponible");
		Statement st = con.createStatement();
		st.executeUpdate(query);
		st.close();
	}
	
	public Pedido Pedido_temporal(String mesero) throws Exception{
		Connection con = new ConexionMySql().ObtenerConexion();
		String query = "select * from pedidos_temporales where Me_id="+mesero+";";
		Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    Map<Producto,Integer> cantidades = new HashMap<Producto,Integer>();
	    while(rs.next()){
	    	String Pro_id = rs.getString("Pro_id");
	    	ProductoRepository pR = new ProductoRepository();
	    	Producto productoen = null;
	    	for(Producto producto: pR.Consultar_producto()){
	    		if(producto.getCodigo().equalsIgnoreCase(Pro_id)){
	    			productoen = producto;
	    			break;
	    		}
	    	}
	    	if(!cantidades.containsKey(Pro_id)) cantidades.put(productoen, 1);
	    	else cantidades.replace(productoen, cantidades.get(Pro_id)+1);
	    }
		Pedido pedido_temporal = new Pedido();
		pedido_temporal.setCantidades(cantidades);
		ArrayList<Producto> cuerpo = new ArrayList<Producto>();
		cuerpo.addAll(cantidades.keySet());
		pedido_temporal.setCuerpo(cuerpo);
		st.close();
		return pedido_temporal;
	}

	public void Adicionar_Producto_a_Pedido_Temporal(String producto, String mesero) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
		String query = "INSERT INTO `future`.`pedidos_temporales` (`Me_id`, `Pro_id`) VALUES ('"+mesero+"', '"+producto+"');";
		Statement st = con.createStatement();
		st.executeUpdate(query);
		st.close();
	}

	public void Quitar_Producto_a_Pedido_Temporal(String producto, String mesero, Pedido pedido_sin_asignar) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
    	String query = "select * from pedidos_temporales where Me_id="+mesero+" and Pro_id = '"+producto+"';";
		Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    while(rs.next()){
	    	query = "delete from pedidos_temporales where Pt_id = "+rs.getString("Pt_id") +";";
	    	System.out.println(query);
			st.executeUpdate(query);
			st.close();
	    	break;
	    }
	}

	public void Limpiar_pedido_temporal(String id) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
		String query = "delete from pedidos_temporales where Me_id=" +id+";";
		System.out.println(query);
		Statement st = con.createStatement();
		st.executeUpdate(query);
		st.close();
	}
	
	public void ingresar_puntos(String cli_id, int pro_valor ) throws Exception{
		int puntos = pro_valor/1000;
		int puntos_actual = 0;
		Connection con = new ConexionMySql().ObtenerConexion();
		String query_cliente = "select cli_puntos from cliente where cli_id = '"+cli_id+"'";
		Statement st = con.createStatement();
		puntos_actual = st.executeUpdate(query_cliente);
		puntos += puntos_actual;
		String query = "UPDATE `future`.`cliente` SET `Cli_puntos`='"+puntos+"' WHERE `Cli_id`='"+cli_id+"';";
		st.executeUpdate(query);
		st.close();
	}
	
}
