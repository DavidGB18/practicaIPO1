package dominio;

public class Actividad {

	private Monitor[] monitores;
	private int horaComienzo;
	private int horaFin;
	private int cupoMinimo;
	private int cupoMaximo;
	private Destinatarios[] destinatarios;	
	private int precio;
	private String ubicacion;
	private String descripcion;
	private String[] materiales;
	
	public Actividad(Monitor[] monitores, int horaComienzo, int horaFin, int cupoMinimo, int cupoMaximo,
			Destinatarios[] destinatarios, int precio, String ubicacion, String descripcion, String[] materiales) {
		super();
		this.monitores = monitores;
		this.horaComienzo = horaComienzo;
		this.horaFin = horaFin;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.destinatarios = destinatarios;
		this.precio = precio;
		this.ubicacion = ubicacion;
		this.descripcion = descripcion;
		this.materiales = materiales;
	}

	public Monitor[] getMonitores() {
		return monitores;
	}

	public void setMonitores(Monitor[] monitores) {
		this.monitores = monitores;
	}

	public int getHoraComienzo() {
		return horaComienzo;
	}

	public void setHoraComienzo(int horaComienzo) {
		this.horaComienzo = horaComienzo;
	}

	public int getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public void setCupoMinimo(int cupoMinimo) {
		this.cupoMinimo = cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}

	public Destinatarios[] getDestinatarios() {
		return destinatarios;
	}

	public void setDestinatarios(Destinatarios[] destinatarios) {
		this.destinatarios = destinatarios;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String[] getMateriales() {
		return materiales;
	}

	public void setMateriales(String[] materiales) {
		this.materiales = materiales;
	}
	
}
