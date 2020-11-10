package dominio;
import java.util.StringTokenizer;

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public Fecha(String cadFecha) {
		StringTokenizer st = new StringTokenizer(cadFecha, "/");
		dia = Integer.parseInt(st.nextToken());
		mes = Integer.parseInt(st.nextToken());
		año = Integer.parseInt(st.nextToken());
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String toString() {
		String fecha = ("dia:" + dia + " mes:" + mes + " año:" + año);
		return fecha;
	}
}
