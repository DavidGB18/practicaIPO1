package lecturaEscritura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import dominio.Actividad;
import dominio.Bungalow;
import dominio.Configuracion;
import dominio.Monitor;
import dominio.Parcela;
import dominio.Reserva;
import dominio.Ruta;
import dominio.Usuario;

public class Writer {
	
	public static void escribirListaUsuarios(ArrayList<Usuario> list) {
		File myObj = new File("src/datos/Usuarios.txt");
		FileWriter w;
		try {
			w = new FileWriter(myObj);
			BufferedWriter myWriter = new BufferedWriter(w);
			for(int i=0; i<list.size(); i++) {
				myWriter.write(list.get(i).toString());
				myWriter.newLine();
			}
			
		    myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void escribirConfiguracion(ArrayList<Configuracion> list) {
		File myObj = new File("src/datos/Configuracion.txt");
		FileWriter w;
		try {
			w = new FileWriter(myObj);
			BufferedWriter myWriter = new BufferedWriter(w);
			for(int i=0; i<list.size(); i++) {
				myWriter.write(list.get(i).toString());
				myWriter.newLine();
			}
			
		    myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void escribirListaMonitores(ArrayList<Monitor> list) {
		File myObj = new File("src/datos/Monitores.txt");
		FileWriter w;
		try {
			w = new FileWriter(myObj);
			BufferedWriter myWriter = new BufferedWriter(w);
			for(int i=0; i<list.size(); i++) {
				myWriter.write(list.get(i).toString());
				myWriter.newLine();
			}
			
		    myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void escribirListaActividades(ArrayList<Actividad> list) {
		File myObj = new File("src/datos/Actividades.txt");
		FileWriter w;
		try {
			w = new FileWriter(myObj);
			BufferedWriter myWriter = new BufferedWriter(w);
			for(int i=0; i<list.size(); i++) {
				myWriter.write(list.get(i).toString());
				myWriter.newLine();
			}
			
		    myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void escribirListaRutas(ArrayList<Ruta> list) {
		File myObj = new File("src/datos/Rutas.txt");
		FileWriter w;
		try {
			w = new FileWriter(myObj);
			BufferedWriter myWriter = new BufferedWriter(w);
			for(int i=0; i<list.size(); i++) {
				myWriter.write(list.get(i).toString());
				myWriter.newLine();
			}
			
		    myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void escribirListaReservas(ArrayList<Reserva> list) {
		File myObj = new File("src/datos/Reservas.txt");
		FileWriter w;
		try {
			w = new FileWriter(myObj);
			BufferedWriter myWriter = new BufferedWriter(w);
			for(int i=0; i<list.size(); i++) {
				myWriter.write(list.get(i).toString());
				myWriter.newLine();
			}
			
		    myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void escribirListaParcelas(ArrayList<Parcela> list) {
		File myObj = new File("src/datos/Parcelas.txt");
		FileWriter w;
		try {
			w = new FileWriter(myObj);
			BufferedWriter myWriter = new BufferedWriter(w);
			for(int i=0; i<list.size(); i++) {
				myWriter.write(list.get(i).toString());
				myWriter.newLine();
			}
			
		    myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void escribirListaBungalows(ArrayList<Bungalow> list) {
		File myObj = new File("src/datos/Bungalows.txt");
		FileWriter w;
		try {
			w = new FileWriter(myObj);
			BufferedWriter myWriter = new BufferedWriter(w);
			for(int i=0; i<list.size(); i++) {
				myWriter.write(list.get(i).toString());
				myWriter.newLine();
			}
			
		    myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
