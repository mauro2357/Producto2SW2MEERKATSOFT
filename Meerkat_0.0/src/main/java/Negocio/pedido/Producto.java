package Negocio.pedido;

public class Producto {

	public String nombre;
	public int valor;
	public String codigo;
	public String descripcion;
	public String tipo;
	public String imagen;
	public String nventas;
	public int cantidad;
	
	public Producto(String codigo, String nombre, int valor2, String descripcion, String tipo, String imagen) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.valor = valor2;
		this.descripcion = descripcion;	
		this.tipo = tipo;
		this.imagen = imagen;
	}

	public Producto(String codigo, String nombre, int valor2, int cantidad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.valor = valor2;
		this.cantidad = cantidad;
	}
	
	public Producto(String nombre, String nventas){
		this.nombre = nombre;
		this.nventas = nventas;
	}
}
