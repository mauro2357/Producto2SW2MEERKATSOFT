package Negocio.cliente;

public class Cliente {
	public String id;
	public String nombre;
	public String apellido;
	public String sexo;
	public int puntos;
	public String musica;
	public String email;
	public String telefono;
	
	public Cliente(String id, String nombre, String apellido, String sexo, int puntos, String musica, String email, String telefono){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.puntos = puntos;
		this.musica = musica;
		this.email = email;
		this.telefono = telefono;
	}
}
