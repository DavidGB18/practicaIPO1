package dominio;

public class Ruta {
	
	private Fecha fecha;
	private int horaInicio;
	private int horaFinal;
	private Monitor[] monitores;
	private String puntoEncuentro;
	private int numeroMinimoPersonas;
	private int numeroMaximoPersonas;
	private Dificultad gradoDificultad;
	private String descripcion;
	private String pathImagenRuta;
	
	public Ruta(Fecha fecha, int horaInicio, int horaFinal, Monitor[] monitores, String puntoEncuentro,
			int numeroMinimoPersonas, int numeroMaximoPersonas, Dificultad gradoDificultad, String descripcion,
			String pathImagenRuta) {
		super();
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
		this.monitores = monitores;
		this.puntoEncuentro = puntoEncuentro;
		this.numeroMinimoPersonas = numeroMinimoPersonas;
		this.numeroMaximoPersonas = numeroMaximoPersonas;
		this.gradoDificultad = gradoDificultad;
		this.descripcion = descripcion;
		this.pathImagenRuta = pathImagenRuta;
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

	public Monitor[] getMonitores() {
		return monitores;
	}

	public void setMonitores(Monitor[] monitores) {
		this.monitores = monitores;
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
}
