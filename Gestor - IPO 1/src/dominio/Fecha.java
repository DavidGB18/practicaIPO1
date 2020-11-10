package dominio;
import java.util.StringTokenizer;

public class Fecha {

	private int dia;
	private int mes;
	private int a�o;

	public Fecha(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	public Fecha(String cadFecha) {
		StringTokenizer st = new StringTokenizer(cadFecha, "/");
		dia = Integer.parseInt(st.nextToken());
		mes = Integer.parseInt(st.nextToken());
		a�o = Integer.parseInt(st.nextToken());
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String toString() {
		String fecha = ("dia:" + dia + " mes:" + mes + " a�o:" + a�o);
		return fecha;
	}
}
