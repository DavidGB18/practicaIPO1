package dominio;

public class Bungalow extends Casa{

	private String descripcion;
	private String[] pathFotos;
	private String equipamiento;
	private int capacidadMaxima;
	private int estanciaMinima;
	
	public Bungalow (int tamaño, double precioNoche, boolean disponibilidad, String descripcion, String[] pathFotos, 
			String equipamiento, int capacidadMaxima, int estanciaMinima) {
		super(tamaño, precioNoche, disponibilidad);
		this.descripcion = descripcion;
		this.pathFotos = pathFotos;
		this.equipamiento = equipamiento;
		this.capacidadMaxima = capacidadMaxima;
		this.estanciaMinima = estanciaMinima;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String[] getPathFotos() {
		return pathFotos;
	}

	public void setPathFotos(String[] pathFotos) {
		this.pathFotos = pathFotos;
	}

	public String getEquipamiento() {
		return equipamiento;
	}

	public void setEquipamiento(String equipamiento) {
		this.equipamiento = equipamiento;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getEstanciaMinima() {
		return estanciaMinima;
	}

	public void setEstanciaMinima(int estanciaMinima) {
		this.estanciaMinima = estanciaMinima;
	}
}
