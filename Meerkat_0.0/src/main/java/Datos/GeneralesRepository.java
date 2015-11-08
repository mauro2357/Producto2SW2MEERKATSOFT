package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.pedido.Producto;

public class GeneralesRepository {

	public String Consultar_totalVentas () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "select sum(Valor) Valors from (select sum(Dtv_cantidad)*Pro_valor Valor from producto natural join detalles_venta natural join venta where venta.Ven_estado = 'Finalizado' group by Pro_nombre order by Dtv_cantidad asc) as A;";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    String a = null;
	    while (rs.next())a = rs.getString("Valors");	    
	    st.close();
	    return ("El total de las ventas es:"+" " + a); 
	}

	public ArrayList<Producto> Consultarproductos_masvendidos () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "select Pro_nombre, sum(Dtv_cantidad) b from producto natural join detalles_venta natural join venta group by Pro_nombre order by b desc;";
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
	
	public Double Consultar_Iva() throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "select sum(Valor) Valors from (select sum(Dtv_cantidad)*Pro_valor Valor from producto natural join detalles_venta natural join venta where venta.Ven_estado = 'Finalizado' group by Pro_nombre order by Dtv_cantidad asc) as A;";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    String a = null;
	    double ans=0;
	    while (rs.next())a = rs.getString("Valors");	    
	    st.close();
	    ans=Double.parseDouble(a)*0.16;
	    System.out.println("El iva recaudado es:");
 	    return ans; 
}

	public String Consultar_ventas() throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "select distinct count(Ven_id) valors from venta;";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    String a = null;
	    while (rs.next())a = rs.getString("Valors");	    
	    st.close();
	    return ("el numero de ventas es :"+" "+ a); 
		
		
	}
	
	public String Consultar_mejormesero() throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "select  Mesero from (select sum(Pro_valor) Valor, Me_nombre Mesero from factura natural join mesero where Ven_estado='Finalizado' group by Me_id) as T;";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    String a = null;
	    while (rs.next())a = rs.getString("Mesero");	    
	    st.close();
	    return ("Mejor Mesero(a):"+" "+ a); 
		
		
	}

	public String Consultarproductomasvendido() throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "select (Pro_nombre),sum(Dtv_cantidad)cantidad from venta natural join producto natural join detalles_venta where Ven_estado ='finalizado'group by Pro_nombre having sum(Dtv_cantidad) =(select max(x.maximo)from (select Pro_nombre, sum(Dtv_cantidad)maximo from producto natural join detalles_venta natural join venta where Ven_estado ='finalizado'group by Pro_nombre)x);";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    String a = null;
	    while (rs.next())a = rs.getString("Pro_nombre");	    
	    st.close();
	    return ("el Producto mas vendido es :"+" "+ a); 
		// TODO Auto-generated method stub
		
	}
}	


