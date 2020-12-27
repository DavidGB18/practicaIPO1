package lecturaEscritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import dominio.*;

public class Reader {

	public static ArrayList<Actividad> listActividades;
	public static ArrayList<Bungalow> listBungalows;
	public static ArrayList<Monitor> listMonitores;
	public static ArrayList<Parcela> listParcelas;
	public static ArrayList<Usuario> listUsuarios;
	public static ArrayList<Ruta> listRutas;
	public static ArrayList<Reserva> listReservas;
	public static ArrayList<Configuracion> listConfiguracion;

	public static void leerFicheros() {

		listConfiguracion = new ArrayList<>();
		listActividades = new ArrayList<>();
		listBungalows = new ArrayList<>();
		listMonitores = new ArrayList<>();
		listParcelas = new ArrayList<>();
		listUsuarios = new ArrayList<>();
		listReservas = new ArrayList<>();
		listRutas = new ArrayList<>();

		leerUsuarios();
		leerRutas();
		leerActividades();
		leerMonitores();
		leerConfiguracion();
	}

	public static void leerConfiguracion() {
		try {
			File myObj = new File("src/datos/Configuracion.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {

				String idioma = myReader.next();
				String apariencia = myReader.next();
				String tipoLetra = myReader.next();
				int tamLetra = Integer.parseInt(myReader.next());

				Configuracion c = new Configuracion(idioma, apariencia, tipoLetra, tamLetra);
				listConfiguracion.add(c);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void leerActividades() {
		try {
			File myObj = new File("src/datos/Actividades.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String monitor = myReader.next();
				int horaComienzo = Integer.parseInt(myReader.next());
				int horaFin = Integer.parseInt(myReader.next());
				int cupoMaximo = Integer.parseInt(myReader.next());
				String destinatario = myReader.next();
				;
				int precio = Integer.parseInt(myReader.next());
				String descripcion = myReader.nextLine();

				Actividad a = new Actividad(monitor, horaComienzo, horaFin, cupoMaximo, destinatario, precio,
						descripcion);
				listActividades.add(a);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void leerBungalows() {
		try {
			File myObj = new File("src/datos/Bungalows.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				int tam = Integer.parseInt(myReader.next());
				double precioNoche = Double.parseDouble(myReader.next());
				boolean disponibilidad = Boolean.parseBoolean(myReader.next());
				String pathFotos = myReader.next();
				String equipamiento = myReader.next();
				int capacidadMaxima = Integer.parseInt(myReader.next());
				int estanciaMinima = Integer.parseInt(myReader.next());
				String descripcion = myReader.nextLine();

				Bungalow b = new Bungalow(tam, precioNoche, disponibilidad, descripcion, pathFotos, equipamiento,
						capacidadMaxima, estanciaMinima);
				listBungalows.add(b);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void leerMonitores() {
		try {
			File myObj = new File("src/datos/Monitores.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String nombre = myReader.next();
				String apellido1 = myReader.next();
				String apellido2 = myReader.next();
				String dni = myReader.next();
				long telefono = Long.parseLong(myReader.next());
				String correoElectronico = myReader.next();
				String formacion = myReader.next();
				String rutaFotoMonitor = myReader.next();
				String idiomas = myReader.nextLine();

				Monitor m = new Monitor(nombre, apellido1, apellido2, dni, telefono, correoElectronico, formacion,
						rutaFotoMonitor, idiomas);
				listMonitores.add(m);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void leerParcelas() {
		try {
			File myObj = new File("src/datos/Parcelas.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				int tam = Integer.parseInt(myReader.next());
				double precioNoche = Double.parseDouble(myReader.next());
				boolean disponibilidad = Boolean.parseBoolean(myReader.next());
				Categoria categoria = Categoria.valueOf(myReader.next());
				String servicios = myReader.next();
				String ubicacion = myReader.nextLine();

				Parcela p = new Parcela(tam, precioNoche, disponibilidad, ubicacion, servicios, categoria);
				listParcelas.add(p);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void leerRutas() {
		try {
			File myObj = new File("src/datos/Rutas.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String nombre = myReader.next();
				Fecha fecha = new Fecha(myReader.next());
				int horaInicio = Integer.parseInt(myReader.next());
				int horaFinal = Integer.parseInt(myReader.next());
				String monitor = myReader.next();
				String puntoEncuentro = myReader.next();
				int numeroMinimoPersonas = Integer.parseInt(myReader.next());
				int numeroMaximoPersonas = Integer.parseInt(myReader.next());
				Dificultad gradoDificultad = Dificultad.valueOf(myReader.next());
				String pathImagenRuta = myReader.next();
				String descripcion = myReader.nextLine();

				Ruta r = new Ruta(nombre, fecha, horaInicio, horaFinal, monitor, puntoEncuentro, numeroMinimoPersonas,
						numeroMaximoPersonas, gradoDificultad, descripcion, pathImagenRuta);

				listRutas.add(r);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void leerUsuarios() {
		try {
			File myObj = new File("src/datos/Usuarios.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String nombre = myReader.next();
				String pass = myReader.next();
				String foto = myReader.next();

				Usuario u = new Usuario(nombre, pass, foto);
				listUsuarios.add(u);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void leerReservas() {
		try {
			File myObj = new File("src/datos/Reservas.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {

				int idReserva = Integer.parseInt(myReader.next());
				Fecha fechaEntrada = new Fecha(myReader.next());
				Fecha fechaSalida = new Fecha(myReader.next());
				String dni = myReader.next();
				String correoElectronico = myReader.next();
				long telefono = Long.parseLong(myReader.next());
				int ocupantes = Integer.parseInt(myReader.next());
				String solicitudesEspeciales = myReader.next();
				int horaEntrada = Integer.parseInt(myReader.next());
				int horaSalida = Integer.parseInt(myReader.next());

				Reserva r = new Reserva(idReserva, fechaEntrada, fechaSalida, dni, correoElectronico, telefono,
						ocupantes, solicitudesEspeciales, horaEntrada, horaSalida);
				listReservas.add(r);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static ArrayList<Actividad> getListActividades() {
		return listActividades;
	}

	public static void setListActividades(ArrayList<Actividad> listActividades) {
		Reader.listActividades = listActividades;
	}

	public static ArrayList<Bungalow> getListBungalows() {
		return listBungalows;
	}

	public static void setListBungalows(ArrayList<Bungalow> listBungalows) {
		Reader.listBungalows = listBungalows;
	}

	public static ArrayList<Monitor> getListMonitores() {
		return listMonitores;
	}

	public static void setListMonitores(ArrayList<Monitor> listMonitores) {
		Reader.listMonitores = listMonitores;
	}

	public static ArrayList<Parcela> getListParcelas() {
		return listParcelas;
	}

	public static void setListParcelas(ArrayList<Parcela> listParcelas) {
		Reader.listParcelas = listParcelas;
	}

	public static ArrayList<Usuario> getListUsuarios() {
		return listUsuarios;
	}

	public static void setListUsuarios(ArrayList<Usuario> listUsuarios) {
		Reader.listUsuarios = listUsuarios;
	}

	public static ArrayList<Ruta> getListRutas() {
		return listRutas;
	}

	public static void setListRutas(ArrayList<Ruta> listRutas) {
		Reader.listRutas = listRutas;
	}

	public static ArrayList<Reserva> getListReservas() {
		return listReservas;
	}

	public static void setListReservas(ArrayList<Reserva> listReservas) {
		Reader.listReservas = listReservas;
	}

	public static ArrayList<Configuracion> getListConfiguracion() {
		return listConfiguracion;
	}

	public static void setListConfiguracion(ArrayList<Configuracion> listConfiguracion) {
		Reader.listConfiguracion = listConfiguracion;
	}
	
	
}
