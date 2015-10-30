package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import Negocio.factura.Cajero;
import Negocio.inventario.Administrador;
import Negocio.pedido.Despachador;
import Negocio.pedido.Empleado;
import Negocio.pedido.Mesero;

public class EmpleadosRepository {
	
	public ArrayList<Mesero> Consultar_mesero () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM mesero";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Mesero> a = new ArrayList<Mesero>();
	    while (rs.next()){
	      String id = rs.getString("Me_id");
	      String nombre = rs.getString("Me_Nombre");
	      String apellido = rs.getString("Me_apellido");
	      String telefono = rs.getString("Me_telefono");
	      Mesero p = new Mesero(id, nombre, apellido, telefono);
	      a.add(p);     
	    }
	    
	    st.close();
	    return a; 
	}
	
	public ArrayList<Despachador> Consultar_despachador() throws Exception { 
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
	
	public ArrayList<Administrador> Consultar_Administradores() throws Exception{
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM administrador";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Administrador> a = new ArrayList<Administrador>();
	    while (rs.next()){
	      String id = rs.getString("Ad_id");
	      String nombre = rs.getString("Ad_nombre");
	      String apellido = rs.getString("Ad_apellido");
	      String telefono = rs.getString("Ad_telefono");
	      String clave = rs.getString("Ad_clave");
	      Administrador p = new Administrador(id, nombre, apellido, telefono, clave);
	      a.add(p);     
	    }
	    st.close();
	    return a; 
	}
	
	public ArrayList<Cajero> Consultar_cajeros() throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM cajero";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Cajero> a = new ArrayList<Cajero>();
	    while (rs.next()){
	      String id = rs.getString("Caj_id");
	      String nombre = rs.getString("Caj_nombre");
	      String apellido = rs.getString("Caj_apellido");
	      String clave = rs.getString("Caj_clave");
	      String telefono = rs.getString("Caj_telefono");
	      Cajero p = new Cajero(id, nombre, apellido, clave, telefono);
	      a.add(p);     
	    }
	    st.close();
	    return a; 
	}
	
	public void Registrar_despachador (String id, String nombre, String apellido, String telefono) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "INSERT INTO `future`.`despachador` (`Des_id`, `Des_nombre`, `Des_apellido`, `Des_telefono`) VALUES ('"+id+"', '"+nombre+"', '"+apellido+"', '"+telefono+"');";
	    Statement st = con.createStatement();
	    st.executeUpdate(query);
	    st.close();
	}
	
	public void Registrar_mesero (String id, String nombre, String apellido, String telefono) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "INSERT INTO `future`.`mesero` (`Me_id`, `Me_nombre`, `Me_apellido`, `Me_telefono`) VALUES ('"+id+"', '"+nombre+"', '"+apellido+"', '"+telefono+"');";
	    Statement st = con.createStatement();
	    st.executeUpdate(query);
	    st.close();
	}

	public ArrayList<Empleado> Consultar_Empleados() throws Exception {
		ArrayList<Empleado> ans = new ArrayList<Empleado>();
		ArrayList<Mesero> meseros;
		ArrayList<Despachador> despachadores;
		meseros = Consultar_mesero();
		despachadores = Consultar_despachador();
		for(Mesero mesero: meseros) ans.add(mesero);
		for(Despachador despachador: despachadores) ans.add(despachador);
		return ans;
	}

	public void Pagar(Empleado empleado, String id, String saldo) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
		String query = null;
		Calendar x = Calendar.getInstance();
    	String fecha = x.get(Calendar.YEAR)+"-"+Integer.toString(x.get(Calendar.MONTH)+1)+"-"+x.get(Calendar.DATE);
    	if(empleado instanceof Mesero){
			query = "INSERT INTO `future`.`pago_nomina` (`Mesero_id`, `Empleado_fecha`, `Empleado_valor`) VALUES ('"+id+"','"+fecha+"', '"+saldo+"');";
		}
		if(empleado instanceof Administrador){
			query = "INSERT INTO `future`.`pago_nomina` (`Administrador_id`, `Empleado_fecha`, `Empleado_valor`) VALUES ('"+id+"', '"+fecha+"', '"+saldo+"');";		
		}
		if(empleado instanceof Despachador){
			query = "INSERT INTO `future`.`pago_nomina` (`Despachador_id`, `Empleado_fecha`, `Empleado_valor`) VALUES ('"+id+"', '"+fecha+"', '"+saldo+"');";
		}
		if(empleado instanceof Cajero){
			query = "INSERT INTO `future`.`pago_nomina` (`Cajero_id`, `Empleado_fecha`, `Empleado_valor`) VALUES ('"+id+"', '"+fecha+"', '"+saldo+"');";
		}
		Statement st = con.createStatement();
	    st.executeUpdate(query);
	    st.close();
	}
	
	public void eliminar_mesero(String id) throws Exception{
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "DELETE FROM `future`.`mesero` WHERE `Me_id`='"+id+"';";
	    Statement st = con.createStatement();
	    st.executeUpdate(query);
	    st.close();
	}
	
	public void eliminar_despachador(String id) throws Exception{
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "DELETE FROM `future`.`despachador` WHERE `Des_id`='"+id+"';";
	    Statement st = con.createStatement();
	    st.executeUpdate(query);
	    st.close();
	}
}

