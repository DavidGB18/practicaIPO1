package dominio;

public class Usuario {
	
	private String nombre;
	private String pass;
	private String foto;
	
	public Usuario() {
	}
	
	public Usuario(String nombre, String pass, String foto) {
		this.nombre = nombre;
		this.pass = pass;
		this.foto = foto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return nombre + " " + pass + " " + foto;
	}
	
}
