package dominio;

public class Casa {

	private int tamaño;
	private double precioNoche;
	private boolean disponibilidad;
	
	public Casa(int tamaño, double precioNoche, boolean disponibilidad) {
		this.tamaño = tamaño;
		this.precioNoche = precioNoche;
		this.disponibilidad = disponibilidad;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
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
	
	
}
