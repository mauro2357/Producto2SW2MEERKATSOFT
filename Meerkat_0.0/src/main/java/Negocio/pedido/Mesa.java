package Negocio.pedido;

public class Mesa {
	
	public String id;
	public String estado;
	
	public Mesa(String id, String estado) {
		this.id = id;
		this.estado = estado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
