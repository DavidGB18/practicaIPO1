package dominio;

public class Parcela extends Casa{

	private String ubicacion;
	private String[] arrayServicios;
	private Categoria categoria;
	
	public Parcela(int tamaño, double precioNoche, boolean disponibilidad, String ubicacion, String[] arrayServicios, Categoria categoria) {
		super(tamaño, precioNoche, disponibilidad);
		this.ubicacion = ubicacion;
		this.arrayServicios = arrayServicios;
		this.categoria = categoria;
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
