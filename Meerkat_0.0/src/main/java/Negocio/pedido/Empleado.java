package Negocio.pedido;

public abstract class Empleado {
	public String id;
	public String nombre;
	public String apellido;
	public abstract void pagar() throws Exception;
	public abstract void bonificacacion();
	
	public String get_id(){
		return this.id;
	}
}
