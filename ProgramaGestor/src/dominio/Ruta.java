package dominio;

public class Ruta {
	
	private String nombre;
	private Fecha fecha;
	private int horaInicio;
	private int horaFinal;
	private String monitor;
	private String puntoEncuentro;
	private int numeroMinimoPersonas;
	private int numeroMaximoPersonas;
	private Dificultad gradoDificultad;
	private String descripcion;
	private String pathImagenRuta;
	
	public Ruta(String nombre, Fecha fecha, int horaInicio, int horaFinal, String monitor, String puntoEncuentro,
			int numeroMinimoPersonas, int numeroMaximoPersonas, Dificultad gradoDificultad, String descripcion,
			String pathImagenRuta) {

		this.nombre = nombre;
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
		this.monitor = monitor;
		this.puntoEncuentro = puntoEncuentro;
		this.numeroMinimoPersonas = numeroMinimoPersonas;
		this.numeroMaximoPersonas = numeroMaximoPersonas;
		this.gradoDificultad = gradoDificultad;
		this.descripcion = descripcion;
		this.pathImagenRuta = pathImagenRuta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre)	{
		this.nombre = nombre;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(int horaFinal) {
		this.horaFinal = horaFinal;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitores(String monitor) {
		this.monitor = monitor;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}

	public int getNumeroMinimoPersonas() {
		return numeroMinimoPersonas;
	}

	public void setNumeroMinimoPersonas(int numeroMinimoPersonas) {
		this.numeroMinimoPersonas = numeroMinimoPersonas;
	}

	public int getNumeroMaximoPersonas() {
		return numeroMaximoPersonas;
	}

	public void setNumeroMaximoPersonas(int numeroMaximoPersonas) {
		this.numeroMaximoPersonas = numeroMaximoPersonas;
	}

	public Dificultad getGradoDificultad() {
		return gradoDificultad;
	}

	public void setGradoDificultad(Dificultad gradoDificultad) {
		this.gradoDificultad = gradoDificultad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPathImagenRuta() {
		return pathImagenRuta;
	}

	public void setPathImagenRuta(String pathImagenRuta) {
		this.pathImagenRuta = pathImagenRuta;
	}

	@Override
	public String toString() {
		return nombre + " " + fecha + " " + horaInicio + " " + horaFinal + " " + monitor + " " + puntoEncuentro + " "
				+ numeroMinimoPersonas + " " + numeroMaximoPersonas + " " + gradoDificultad + " " + pathImagenRuta + " " + descripcion;
	}
	
	
}
