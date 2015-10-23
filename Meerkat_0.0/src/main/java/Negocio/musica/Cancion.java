package Negocio.musica;

	public class Cancion {
		public String nombre;
		public String ruta;


	public Cancion(String nombre, String ruta){
		this.nombre = nombre;
		this.ruta=ruta;
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setId(String nombre) {
		this.nombre = nombre;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
}
