package dominio;

public class Parcela{

	private int tamaño;
	private double precioNoche;
	private boolean disponibilidad;
	private String ubicacion;
	private String[] arrayServicios;
	private Categoria categoria;
	
	public Parcela(int tamaño, double precioNoche, boolean disponibilidad, String ubicacion, String[] arrayServicios, Categoria categoria) {
		this.tamaño = tamaño;
		this.precioNoche = precioNoche;
		this.disponibilidad = disponibilidad;
		this.ubicacion = ubicacion;
		this.arrayServicios = arrayServicios;
		this.categoria = categoria;
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
	
	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String[] getArrayServicios() {
		return arrayServicios;
	}

	public void setArrayServicios(String[] arrayServicios) {
		this.arrayServicios = arrayServicios;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
