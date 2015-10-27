package Datos;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import Negocio.factura.Cajero;
import Negocio.inventario.Administrador;
import Negocio.pedido.Despachador;
import Negocio.pedido.Empleado;
import Negocio.pedido.Mesero;

public class EmpleadosRepository {
	
	
	
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
		System.out.println("ingreso consultar todos los empleados");
		ArrayList<Empleado> ans = new ArrayList<Empleado>();
		ArrayList<Mesero> meseros;
		ArrayList<Despachador> despachadores;
		MeseroRepository mr = new MeseroRepository();
		DespachadorRepository dr = new DespachadorRepository();
		meseros = mr.Consultar_mesero();
		despachadores = dr.Consultar_despachador();
		for(Mesero mesero: meseros){
			System.out.println("id del mesero en empleadosrepository: " + mesero.id);
			ans.add(mesero);
		}
		for(Despachador despachador: despachadores){
			ans.add(despachador);
		}
		System.out.println("consulto perfectamente todos los empleados");
		return ans;
	}

	public void Pagar(Empleado empleado, String id, String saldo) throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
		String query = null;
		Calendar x = Calendar.getInstance();
    	String fecha = x.get(Calendar.YEAR)+"-"+Integer.toString(x.get(Calendar.MONTH)+1)+"-"+x.get(Calendar.DATE);
    	if(empleado instanceof Mesero){
    		System.out.println("ES MESERO");
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
		System.out.println("query: " + query);
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

