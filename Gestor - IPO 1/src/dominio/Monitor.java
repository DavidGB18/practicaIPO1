package dominio;

public class Monitor {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private long telefono;
	private String correoElectronico;
	private String[] idiomas;
	private String formacion;
	private String[] arrayRestricciones;
	
	public Monitor(String nombre, String apellido1, String apellido2, long telefono, String correoElectronico,
			String[] idiomas, String formacion, String[] arrayRestricciones) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		this.idiomas = idiomas;
		this.formacion = formacion;
		this.arrayRestricciones = arrayRestricciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String[] getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String[] idiomas) {
		this.idiomas = idiomas;
	}

	public String getFormacion() {
		return formacion;
	}

	public void setFormacion(String formacion) {
		this.formacion = formacion;
	}

	public String[] getArrayRestricciones() {
		return arrayRestricciones;
	}

	public void setArrayRestricciones(String[] arrayRestricciones) {
		this.arrayRestricciones = arrayRestricciones;
	}
}
