package dominio;

public class Reserva {

	private int idReserva;
	private Fecha fechaEntrada;
	private Fecha fechaSalida;
	private String dni;
	private String correoElectronico;
	private long telefono;
	private int ocupantes;
	private String solicitudesEspeciales;
	private int horaEntrada;
	private int horaSalida;
	
	public Reserva(int idReserva, Fecha fechaEntrada, Fecha fechaSalida, String dni, String correoElectronico, long telefono,
			int ocupantes, String solicitudesEspeciales, int horaEntrada, int horaSalida) {
		this.idReserva = idReserva;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.dni = dni;
		this.correoElectronico = correoElectronico;
		this.telefono = telefono;
		this.ocupantes = ocupantes;
		this.solicitudesEspeciales = solicitudesEspeciales;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}
	
	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Fecha getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Fecha fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Fecha getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Fecha fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public int getOcupantes() {
		return ocupantes;
	}

	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}

	public String getSolicitudesEspeciales() {
		return solicitudesEspeciales;
	}

	public void setSolicitudesEspeciales(String solicitudesEspeciales) {
		this.solicitudesEspeciales = solicitudesEspeciales;
	}

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida
				+ ", dni=" + dni + ", correoElectronico=" + correoElectronico + ", telefono=" + telefono
				+ ", ocupantes=" + ocupantes + ", solicitudesEspeciales=" + solicitudesEspeciales
				+ ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + "]";
	}
	
	
}
