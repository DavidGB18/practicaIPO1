package dominio;

public class Parcela{

	private int tam;
	private double precioNoche;
	private boolean disponibilidad;
	private String ubicacion;
	private String arrayServicios;
	private Categoria categoria;
	
	public Parcela(int tam, double precioNoche, boolean disponibilidad, String ubicacion, String arrayServicios, Categoria categoria) {
		this.tam = tam;
		this.precioNoche = precioNoche;
		this.disponibilidad = disponibilidad;
		this.ubicacion = ubicacion;
		this.arrayServicios = arrayServicios;
		this.categoria = categoria;
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
	
	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getArrayServicios() {
		return arrayServicios;
	}

	public void setArrayServicios(String arrayServicios) {
		this.arrayServicios = arrayServicios;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return tam + " " + precioNoche + " " + disponibilidad
				+ " " + ubicacion + " " + arrayServicios + " " + categoria;
	}
	
	
}
