package Negocio.pedido;

public abstract class Empleado {
	public String id;
	public String nombre;
	public String apellido;
	public String telefono;
	
	public Empleado(String id, String nombre, String apellido, String telefono){
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}
	
	public Empleado(String id, String nombre, String apellido){
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Empleado(){
		super();
	}
	
	public abstract void pagar() throws Exception;
	public abstract void bonificacacion();
	
	public String get_id(){
		return this.id;
	}
}
