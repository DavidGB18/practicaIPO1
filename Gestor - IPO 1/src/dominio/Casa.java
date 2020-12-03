package dominio;

public class Casa {

	private int tama�o;
	private double precioNoche;
	private boolean disponibilidad;
	
	public Casa(int tama�o, double precioNoche, boolean disponibilidad) {
		this.tama�o = tama�o;
		this.precioNoche = precioNoche;
		this.disponibilidad = disponibilidad;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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
