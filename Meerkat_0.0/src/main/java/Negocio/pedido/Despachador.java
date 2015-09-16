package Negocio.pedido;

public class Despachador {
	public String id;
	public String nombre;
	public String apellido;
	public String telefono;
	
	public Despachador(String id, String nombre, String apellido, String telefono){
		this.id = id;
		this.nombre  = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public Despachador() {
	}

	public boolean recibir_pedido(){
		
		return true;
	}
	
	public String notificar_pedido(){
		return "Pedido despachado.";
	}
	
}
