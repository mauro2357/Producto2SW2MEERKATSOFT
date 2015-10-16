package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.pedido.Producto;

public class GeneralesRepository {

	public String Consultar_totalVentas () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "select sum(Valor) Valors from (select sum(Dtv_cantidad)*Pro_valor Valor from producto natural join Detalles_venta natural join venta where venta.Ven_estado = 'Finalizado' group by Pro_nombre order by Dtv_cantidad asc) as A;";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    String a = null;
	    while (rs.next())a = rs.getString("Valors");	    
	    st.close();
	    return a; 
	}

	public ArrayList<Producto> Consultarproductos_masvendidos () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "select Pro_nombre, sum(Dtv_cantidad) b from producto natural join Detalles_venta natural join venta group by Pro_nombre order by b desc;";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Producto> a = new ArrayList<Producto>();
	    while (rs.next()){
	    	String nombre = rs.getString("Pro_nombre");
	    	String tventas = rs.getString("b");
	    	Producto p = new Producto(nombre, tventas);
	    	a.add(p);     
	    }
	    st.close();
	    return a; 
	}
}
