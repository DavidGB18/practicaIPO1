package dominio;

public class Bungalow{

	private int tam;
	private double precioNoche;
	private boolean disponibilidad;
	private String descripcion;
	private String pathFotos;
	private String equipamiento;
	private int capacidadMaxima;
	private int estanciaMinima;
	
	public Bungalow (int tam, double precioNoche, boolean disponibilidad, String descripcion, String pathFotos, 
			String equipamiento, int capacidadMaxima, int estanciaMinima) {
		this.tam = tam;
		this.precioNoche = precioNoche;
		this.disponibilidad = disponibilidad;
		this.descripcion = descripcion;
		this.pathFotos = pathFotos;
		this.equipamiento = equipamiento;
		this.capacidadMaxima = capacidadMaxima;
		this.estanciaMinima = estanciaMinima;
	}
	
	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public double getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(double precioNoche) {
		this.precioNoche = precioNoche;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPathFotos() {
		return pathFotos;
	}

	public void setPathFotos(String pathFotos) {
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

	@Override
	public String toString() {
		return "Bungalow [tam=" + tam + ", precioNoche=" + precioNoche + ", disponibilidad=" + disponibilidad
				+ ", descripcion=" + descripcion + ", pathFotos=" + pathFotos + ", equipamiento=" + equipamiento
				+ ", capacidadMaxima=" + capacidadMaxima + ", estanciaMinima=" + estanciaMinima + "]";
	}
	
	
}
