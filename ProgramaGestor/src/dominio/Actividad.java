package dominio;

public class Actividad {

	private String monitor;
	private int horaComienzo;
	private int horaFin;
	private int cupoMaximo;
	private String destinatario;	
	private int precio;
	private String descripcion;
	
	public Actividad() {
		
	}
	
	public Actividad(String monitor, int horaComienzo, int horaFin, int cupoMaximo, String destinatario, int precio, String descripcion) {
		this.monitor = monitor;
		this.horaComienzo = horaComienzo;
		this.horaFin = horaFin;
		this.cupoMaximo = cupoMaximo;
		this.destinatario = destinatario;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
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

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return monitor + " " + horaComienzo + " " + horaFin + " " + cupoMaximo + " " + destinatario + " " + precio + " '" + descripcion + "'";
	}
	
}
