package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Fecha;
import dominio.Reserva;
import dominio.Ruta;
import lecturaEscritura.Reader;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.JFormattedTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class UI_Reservas extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3781716042905688011L;
	private JPanel contentPane;
	private JPanel panelReservas;
	private JPanel panelAnadirReserva;
	private JPanel panelBorrarReserva;
	private JPanel panelConsultarReservas;
	private JButton btnCancelar;
	private JButton btnBorrarReserva;
	private JLabel lblBorrarReserva;
	private JLabel lblIdReserva;
	private JComboBox<Integer> cbIdReserva;
	private JComboBox<Integer> cbReserva;
	private JLabel lblIdReservaConsulta;
	private JLabel lblFechaEntrada;
	private JLabel lblHoraEntrada;
	private JTextField txtHoraEntrada;
	private JLabel lblDniReserva;
	private JLabel lblTelefono;
	private JLabel lblCorreo;
	private JLabel lblConsideraciones;
	private JLabel lblFechaSalida;
	private JLabel lblHoraSalida;
	private JTextField txtHoraSalida;
	private JTextPane txtConsideraciones;
	private JButton btnCerrar;

	public static int elegirPanel;
	private JPanel panelPasos;
	private JPanel panelPaso1;
	private JPanel panelPaso2;
	private JPanel panelPaso3;
	private JPanel panelPaso4;
	private JPanel panelPaso5;
	private JPanel panelBarraProgreso;
	private JProgressBar progressBar;
	private JLabel lblIdNuevaReserva;
	private JTextField txtIdGenerado;
	private JLabel lblMensajeNuevaReserva;
	private JButton btnSiguienteP1;
	private JButton btnCancelarNuevaReserva;
	private JLabel lblFechaNuevaReserva;
	private JLabel lblFechaEntradaNuevaReserva;
	private JLabel lblFechaSalidaNuevaReserva;
	private JFormattedTextField formattedTextFieldFechaEntradaNuevaReserva;
	private JFormattedTextField formattedTextFieldFechaSalidaNuevaReserva;
	private JLabel lblHoraEntradaNuevaReserva;
	private JSpinner spinnerHoraEntrada;
	private JLabel lblHoraSalidaNuevaReserva;
	private JSpinner spinnerHoraSalida;
	private JButton btnSiguienteP2;
	private JButton btnAtrasP2;
	private JPanel panelBotones;
	private JPanel panelPasoInicial;
	private JPanel panelPasosIntermedios;
	private JPanel panelFinal;
	private JButton btnAnterior;
	private JButton btnFinalizar;
	private JPanel panelPasoExito;
	private JButton btnAceptar;
	private JLabel lblContacto;
	private JLabel lblDNI;
	private JFormattedTextField formattedTextFieldDNI;
	private JLabel lblTlf;
	private JFormattedTextField formattedTextFieldTelefonoNuevaReserva;
	private JLabel lblCorreoElectronico;
	private JTextField txtCorreoElectronico;
	private JLabel lblDatosReserva;
	private JLabel lblOcupantes;
	private JLabel lblSolicitudes;
	private JSpinner spinnerOcupantes;
	private JTextField txtSolicitudesNuevaReserva;
	private JLabel lblMensajeExito;
	private int numPanel = 0;
	private JTextField txtFechaEntrada;
	private JTextField txtFechaSalida;
	private JTextField txtDni;
	private JTextField txtTel;
	private JTextField txtCorreo;

	/**
	 * Create the frame.
	 */
	public UI_Reservas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_Reservas.class.getResource("/recursos/logo.png")));
		setResizable(false);
		addWindowListener(new ThisWindowListener());
		setTitle("Gestor Los Olivos - Reservas");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 534, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panelReservas = new JPanel();
			contentPane.add(panelReservas, BorderLayout.CENTER);
			panelReservas.setLayout(new CardLayout(0, 0));
			{
				panelAnadirReserva = new JPanel();
				panelReservas.add(panelAnadirReserva, "Añadir");
				panelAnadirReserva.setLayout(new BorderLayout(0, 0));
				{
					panelPasos = new JPanel();
					panelAnadirReserva.add(panelPasos, BorderLayout.CENTER);
					panelPasos.setLayout(new CardLayout(0, 0));
					{
						panelPaso1 = new JPanel();
						panelPasos.add(panelPaso1, "Paso1");
						GridBagLayout gbl_panelPaso1 = new GridBagLayout();
						gbl_panelPaso1.columnWidths = new int[] { 145, 85, 26, 96, 85, 0 };
						gbl_panelPaso1.rowHeights = new int[] { 71, 19, 43, 47, 0, 76, 21, 0 };
						gbl_panelPaso1.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
						gbl_panelPaso1.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0,
								Double.MIN_VALUE };
						panelPaso1.setLayout(gbl_panelPaso1);
						{
							lblIdNuevaReserva = new JLabel("ID Reserva:");
							GridBagConstraints gbc_lblIdNuevaReserva = new GridBagConstraints();
							gbc_lblIdNuevaReserva.anchor = GridBagConstraints.EAST;
							gbc_lblIdNuevaReserva.insets = new Insets(0, 0, 5, 5);
							gbc_lblIdNuevaReserva.gridx = 0;
							gbc_lblIdNuevaReserva.gridy = 1;
							panelPaso1.add(lblIdNuevaReserva, gbc_lblIdNuevaReserva);
						}
						{
							txtIdGenerado = new JTextField();
							txtIdGenerado.setEditable(false);
							GridBagConstraints gbc_txtIdGenerado = new GridBagConstraints();
							gbc_txtIdGenerado.fill = GridBagConstraints.BOTH;
							gbc_txtIdGenerado.gridwidth = 3;
							gbc_txtIdGenerado.insets = new Insets(0, 0, 5, 5);
							gbc_txtIdGenerado.gridx = 1;
							gbc_txtIdGenerado.gridy = 1;
							panelPaso1.add(txtIdGenerado, gbc_txtIdGenerado);
							txtIdGenerado.setColumns(10);
						}
						{
							lblMensajeNuevaReserva = new JLabel("Este ID se genera automaticamente");
							GridBagConstraints gbc_lblMensajeNuevaReserva = new GridBagConstraints();
							gbc_lblMensajeNuevaReserva.anchor = GridBagConstraints.NORTHWEST;
							gbc_lblMensajeNuevaReserva.insets = new Insets(0, 0, 5, 5);
							gbc_lblMensajeNuevaReserva.gridwidth = 3;
							gbc_lblMensajeNuevaReserva.gridx = 1;
							gbc_lblMensajeNuevaReserva.gridy = 3;
							panelPaso1.add(lblMensajeNuevaReserva, gbc_lblMensajeNuevaReserva);
						}
					}
					{
						panelPaso2 = new JPanel();
						panelPasos.add(panelPaso2, "Paso2");
						GridBagLayout gbl_panelPaso2 = new GridBagLayout();
						gbl_panelPaso2.columnWidths = new int[] { 36, 91, 41, 14, 30, 10, 54, 5, 78, 91, 0 };
						gbl_panelPaso2.rowHeights = new int[] { 81, 31, 31, 19, 34, 20, 0 };
						gbl_panelPaso2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
								Double.MIN_VALUE };
						gbl_panelPaso2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
						panelPaso2.setLayout(gbl_panelPaso2);
						{
							lblFechaNuevaReserva = new JLabel("Fecha y hora");
							lblFechaNuevaReserva.setFont(new Font("Tahoma", Font.PLAIN, 16));
							GridBagConstraints gbc_lblFechaNuevaReserva = new GridBagConstraints();
							gbc_lblFechaNuevaReserva.insets = new Insets(0, 0, 5, 5);
							gbc_lblFechaNuevaReserva.gridx = 1;
							gbc_lblFechaNuevaReserva.gridy = 1;
							panelPaso2.add(lblFechaNuevaReserva, gbc_lblFechaNuevaReserva);
						}
						{
							lblFechaEntradaNuevaReserva = new JLabel("Fecha Entrada:");
							GridBagConstraints gbc_lblFechaEntradaNuevaReserva = new GridBagConstraints();
							gbc_lblFechaEntradaNuevaReserva.anchor = GridBagConstraints.EAST;
							gbc_lblFechaEntradaNuevaReserva.insets = new Insets(0, 0, 5, 5);
							gbc_lblFechaEntradaNuevaReserva.gridx = 1;
							gbc_lblFechaEntradaNuevaReserva.gridy = 3;
							panelPaso2.add(lblFechaEntradaNuevaReserva, gbc_lblFechaEntradaNuevaReserva);
						}
						{
							formattedTextFieldFechaEntradaNuevaReserva = new JFormattedTextField();
							GridBagConstraints gbc_formattedTextFieldFechaEntradaNuevaReserva = new GridBagConstraints();
							gbc_formattedTextFieldFechaEntradaNuevaReserva.anchor = GridBagConstraints.NORTH;
							gbc_formattedTextFieldFechaEntradaNuevaReserva.fill = GridBagConstraints.HORIZONTAL;
							gbc_formattedTextFieldFechaEntradaNuevaReserva.insets = new Insets(0, 0, 5, 5);
							gbc_formattedTextFieldFechaEntradaNuevaReserva.gridwidth = 3;
							gbc_formattedTextFieldFechaEntradaNuevaReserva.gridx = 2;
							gbc_formattedTextFieldFechaEntradaNuevaReserva.gridy = 3;
							panelPaso2.add(formattedTextFieldFechaEntradaNuevaReserva,
									gbc_formattedTextFieldFechaEntradaNuevaReserva);
						}
						{
							lblFechaSalidaNuevaReserva = new JLabel("Fecha Salida:");
							GridBagConstraints gbc_lblFechaSalidaNuevaReserva = new GridBagConstraints();
							gbc_lblFechaSalidaNuevaReserva.fill = GridBagConstraints.HORIZONTAL;
							gbc_lblFechaSalidaNuevaReserva.insets = new Insets(0, 0, 5, 5);
							gbc_lblFechaSalidaNuevaReserva.gridx = 6;
							gbc_lblFechaSalidaNuevaReserva.gridy = 3;
							panelPaso2.add(lblFechaSalidaNuevaReserva, gbc_lblFechaSalidaNuevaReserva);
						}
						{
							formattedTextFieldFechaSalidaNuevaReserva = new JFormattedTextField();
							GridBagConstraints gbc_formattedTextFieldFechaSalidaNuevaReserva = new GridBagConstraints();
							gbc_formattedTextFieldFechaSalidaNuevaReserva.gridwidth = 2;
							gbc_formattedTextFieldFechaSalidaNuevaReserva.anchor = GridBagConstraints.NORTH;
							gbc_formattedTextFieldFechaSalidaNuevaReserva.fill = GridBagConstraints.HORIZONTAL;
							gbc_formattedTextFieldFechaSalidaNuevaReserva.insets = new Insets(0, 0, 5, 5);
							gbc_formattedTextFieldFechaSalidaNuevaReserva.gridx = 7;
							gbc_formattedTextFieldFechaSalidaNuevaReserva.gridy = 3;
							panelPaso2.add(formattedTextFieldFechaSalidaNuevaReserva,
									gbc_formattedTextFieldFechaSalidaNuevaReserva);
						}
						{
							lblHoraEntradaNuevaReserva = new JLabel("Hora Entrada:");
							GridBagConstraints gbc_lblHoraEntradaNuevaReserva = new GridBagConstraints();
							gbc_lblHoraEntradaNuevaReserva.anchor = GridBagConstraints.EAST;
							gbc_lblHoraEntradaNuevaReserva.insets = new Insets(0, 0, 0, 5);
							gbc_lblHoraEntradaNuevaReserva.gridwidth = 3;
							gbc_lblHoraEntradaNuevaReserva.gridx = 1;
							gbc_lblHoraEntradaNuevaReserva.gridy = 5;
							panelPaso2.add(lblHoraEntradaNuevaReserva, gbc_lblHoraEntradaNuevaReserva);
						}
						{
							spinnerHoraEntrada = new JSpinner();
							GridBagConstraints gbc_spinnerHoraEntrada = new GridBagConstraints();
							gbc_spinnerHoraEntrada.anchor = GridBagConstraints.NORTHWEST;
							gbc_spinnerHoraEntrada.insets = new Insets(0, 0, 0, 5);
							gbc_spinnerHoraEntrada.gridx = 4;
							gbc_spinnerHoraEntrada.gridy = 5;
							panelPaso2.add(spinnerHoraEntrada, gbc_spinnerHoraEntrada);
						}
						{
							lblHoraSalidaNuevaReserva = new JLabel("Hora Salida:");
							GridBagConstraints gbc_lblHoraSalidaNuevaReserva = new GridBagConstraints();
							gbc_lblHoraSalidaNuevaReserva.anchor = GridBagConstraints.EAST;
							gbc_lblHoraSalidaNuevaReserva.insets = new Insets(0, 0, 0, 5);
							gbc_lblHoraSalidaNuevaReserva.gridwidth = 2;
							gbc_lblHoraSalidaNuevaReserva.gridx = 6;
							gbc_lblHoraSalidaNuevaReserva.gridy = 5;
							panelPaso2.add(lblHoraSalidaNuevaReserva, gbc_lblHoraSalidaNuevaReserva);
						}
						{
							spinnerHoraSalida = new JSpinner();
							GridBagConstraints gbc_spinnerHoraSalida = new GridBagConstraints();
							gbc_spinnerHoraSalida.anchor = GridBagConstraints.NORTHWEST;
							gbc_spinnerHoraSalida.insets = new Insets(0, 0, 0, 5);
							gbc_spinnerHoraSalida.gridx = 8;
							gbc_spinnerHoraSalida.gridy = 5;
							panelPaso2.add(spinnerHoraSalida, gbc_spinnerHoraSalida);
						}
					}
					{
						panelPaso3 = new JPanel();
						panelPasos.add(panelPaso3, "Paso3");
						GridBagLayout gbl_panelPaso3 = new GridBagLayout();
						gbl_panelPaso3.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
						gbl_panelPaso3.rowHeights = new int[] { 0, 0, 47, 0, 0, 0, 0 };
						gbl_panelPaso3.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0,
								Double.MIN_VALUE };
						gbl_panelPaso3.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
						panelPaso3.setLayout(gbl_panelPaso3);
						{
							lblContacto = new JLabel("Contacto");
							lblContacto.setFont(new Font("Tahoma", Font.PLAIN, 16));
							GridBagConstraints gbc_lblContacto = new GridBagConstraints();
							gbc_lblContacto.insets = new Insets(0, 0, 5, 5);
							gbc_lblContacto.gridx = 1;
							gbc_lblContacto.gridy = 1;
							panelPaso3.add(lblContacto, gbc_lblContacto);
						}
						{
							lblDNI = new JLabel("DNI:");
							GridBagConstraints gbc_lblDNI = new GridBagConstraints();
							gbc_lblDNI.anchor = GridBagConstraints.WEST;
							gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
							gbc_lblDNI.gridx = 1;
							gbc_lblDNI.gridy = 3;
							panelPaso3.add(lblDNI, gbc_lblDNI);
						}
						{
							lblTlf = new JLabel("Tel\u00E9fono:");
							GridBagConstraints gbc_lblTlf = new GridBagConstraints();
							gbc_lblTlf.anchor = GridBagConstraints.WEST;
							gbc_lblTlf.insets = new Insets(0, 0, 5, 5);
							gbc_lblTlf.gridx = 3;
							gbc_lblTlf.gridy = 3;
							panelPaso3.add(lblTlf, gbc_lblTlf);
						}
						{
							lblCorreoElectronico = new JLabel("Correo:");
							GridBagConstraints gbc_lblCorreoElectronico = new GridBagConstraints();
							gbc_lblCorreoElectronico.anchor = GridBagConstraints.WEST;
							gbc_lblCorreoElectronico.insets = new Insets(0, 0, 5, 5);
							gbc_lblCorreoElectronico.gridx = 5;
							gbc_lblCorreoElectronico.gridy = 3;
							panelPaso3.add(lblCorreoElectronico, gbc_lblCorreoElectronico);
						}
						{
							formattedTextFieldDNI = new JFormattedTextField();
							GridBagConstraints gbc_formattedTextFieldDNI = new GridBagConstraints();
							gbc_formattedTextFieldDNI.insets = new Insets(0, 0, 5, 5);
							gbc_formattedTextFieldDNI.fill = GridBagConstraints.HORIZONTAL;
							gbc_formattedTextFieldDNI.gridx = 1;
							gbc_formattedTextFieldDNI.gridy = 4;
							panelPaso3.add(formattedTextFieldDNI, gbc_formattedTextFieldDNI);
						}
						{
							formattedTextFieldTelefonoNuevaReserva = new JFormattedTextField();
							GridBagConstraints gbc_formattedTextFieldTelefonoNuevaReserva = new GridBagConstraints();
							gbc_formattedTextFieldTelefonoNuevaReserva.insets = new Insets(0, 0, 5, 5);
							gbc_formattedTextFieldTelefonoNuevaReserva.fill = GridBagConstraints.HORIZONTAL;
							gbc_formattedTextFieldTelefonoNuevaReserva.gridx = 3;
							gbc_formattedTextFieldTelefonoNuevaReserva.gridy = 4;
							panelPaso3.add(formattedTextFieldTelefonoNuevaReserva,
									gbc_formattedTextFieldTelefonoNuevaReserva);
						}
						{
							txtCorreoElectronico = new JTextField();
							GridBagConstraints gbc_txtCorreoElectronico = new GridBagConstraints();
							gbc_txtCorreoElectronico.insets = new Insets(0, 0, 5, 5);
							gbc_txtCorreoElectronico.fill = GridBagConstraints.HORIZONTAL;
							gbc_txtCorreoElectronico.gridx = 5;
							gbc_txtCorreoElectronico.gridy = 4;
							panelPaso3.add(txtCorreoElectronico, gbc_txtCorreoElectronico);
							txtCorreoElectronico.setColumns(10);
						}
					}
					{
						panelPaso4 = new JPanel();
						panelPasos.add(panelPaso4, "Paso4");
						GridBagLayout gbl_panelPaso4 = new GridBagLayout();
						gbl_panelPaso4.columnWidths = new int[] { 0, 0, 0, 0, 0, 39, 0, 0 };
						gbl_panelPaso4.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
						gbl_panelPaso4.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0,
								Double.MIN_VALUE };
						gbl_panelPaso4.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0,
								Double.MIN_VALUE };
						panelPaso4.setLayout(gbl_panelPaso4);
						{
							lblDatosReserva = new JLabel("Datos de la Reserva");
							lblDatosReserva.setFont(new Font("Tahoma", Font.PLAIN, 16));
							GridBagConstraints gbc_lblDatosReserva = new GridBagConstraints();
							gbc_lblDatosReserva.gridwidth = 2;
							gbc_lblDatosReserva.insets = new Insets(0, 0, 5, 5);
							gbc_lblDatosReserva.gridx = 1;
							gbc_lblDatosReserva.gridy = 1;
							panelPaso4.add(lblDatosReserva, gbc_lblDatosReserva);
						}
						{
							lblOcupantes = new JLabel("N\u00BA Ocupantes:");
							GridBagConstraints gbc_lblOcupantes = new GridBagConstraints();
							gbc_lblOcupantes.insets = new Insets(0, 0, 5, 5);
							gbc_lblOcupantes.gridx = 1;
							gbc_lblOcupantes.gridy = 3;
							panelPaso4.add(lblOcupantes, gbc_lblOcupantes);
						}
						{
							spinnerOcupantes = new JSpinner();
							GridBagConstraints gbc_spinnerOcupantes = new GridBagConstraints();
							gbc_spinnerOcupantes.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerOcupantes.gridx = 2;
							gbc_spinnerOcupantes.gridy = 3;
							panelPaso4.add(spinnerOcupantes, gbc_spinnerOcupantes);
						}
						{
							lblSolicitudes = new JLabel("Solicitudes:");
							GridBagConstraints gbc_lblSolicitudes = new GridBagConstraints();
							gbc_lblSolicitudes.anchor = GridBagConstraints.NORTHEAST;
							gbc_lblSolicitudes.insets = new Insets(0, 0, 5, 5);
							gbc_lblSolicitudes.gridx = 1;
							gbc_lblSolicitudes.gridy = 5;
							panelPaso4.add(lblSolicitudes, gbc_lblSolicitudes);
						}
						{
							txtSolicitudesNuevaReserva = new JTextField();
							GridBagConstraints gbc_txtSolicitudesNuevaReserva = new GridBagConstraints();
							gbc_txtSolicitudesNuevaReserva.gridwidth = 4;
							gbc_txtSolicitudesNuevaReserva.insets = new Insets(0, 0, 5, 5);
							gbc_txtSolicitudesNuevaReserva.fill = GridBagConstraints.BOTH;
							gbc_txtSolicitudesNuevaReserva.gridx = 2;
							gbc_txtSolicitudesNuevaReserva.gridy = 5;
							panelPaso4.add(txtSolicitudesNuevaReserva, gbc_txtSolicitudesNuevaReserva);
							txtSolicitudesNuevaReserva.setColumns(10);
						}
					}
					{
						panelPaso5 = new JPanel();
						panelPasos.add(panelPaso5, "Paso5");
						GridBagLayout gbl_panelPaso5 = new GridBagLayout();
						gbl_panelPaso5.columnWidths = new int[] { 0, 0, 0, 0 };
						gbl_panelPaso5.rowHeights = new int[] { 0, 0, 0, 0 };
						gbl_panelPaso5.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
						gbl_panelPaso5.rowWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
						panelPaso5.setLayout(gbl_panelPaso5);
						{
							lblMensajeExito = new JLabel("RESERVA REALIZADA CON \u00C9XITO");
							lblMensajeExito.setFont(new Font("Tahoma", Font.PLAIN, 17));
							GridBagConstraints gbc_lblMensajeExito = new GridBagConstraints();
							gbc_lblMensajeExito.fill = GridBagConstraints.VERTICAL;
							gbc_lblMensajeExito.insets = new Insets(0, 0, 5, 5);
							gbc_lblMensajeExito.gridx = 1;
							gbc_lblMensajeExito.gridy = 1;
							panelPaso5.add(lblMensajeExito, gbc_lblMensajeExito);
						}
					}
				}
				{
					panelBarraProgreso = new JPanel();
					panelAnadirReserva.add(panelBarraProgreso, BorderLayout.NORTH);
					panelBarraProgreso.setLayout(new BorderLayout(0, 0));
					{
						progressBar = new JProgressBar(1, 5);
						progressBar.setStringPainted(true);
						panelBarraProgreso.add(progressBar);

					}
				}
				{
					panelBotones = new JPanel();
					panelAnadirReserva.add(panelBotones, BorderLayout.SOUTH);
					panelBotones.setLayout(new CardLayout(0, 0));
					{
						panelPasoInicial = new JPanel();
						panelBotones.add(panelPasoInicial, "botonesinicial");
						{
							btnCancelarNuevaReserva = new JButton("Cancelar");
							btnCancelarNuevaReserva.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnCancelarNuevaReserva.addActionListener(new BtnAnteriorActionListener());
							panelPasoInicial.add(btnCancelarNuevaReserva);
						}
						{
							btnSiguienteP1 = new JButton("Siguiente");
							btnSiguienteP1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnSiguienteP1.addActionListener(new BtnSiguienteActionListener());
							panelPasoInicial.add(btnSiguienteP1);
						}
					}
					{
						panelPasosIntermedios = new JPanel();
						panelBotones.add(panelPasosIntermedios, "botonesintermedios");
						{
							btnAtrasP2 = new JButton("Anterior");
							btnAtrasP2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnAtrasP2.addActionListener(new BtnAnteriorActionListener());
							panelPasosIntermedios.add(btnAtrasP2);
						}
						{
							btnSiguienteP2 = new JButton("Siguiente");
							btnSiguienteP2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnSiguienteP2.addActionListener(new BtnSiguienteActionListener());
							panelPasosIntermedios.add(btnSiguienteP2);
						}
					}
					{
						panelFinal = new JPanel();
						panelBotones.add(panelFinal, "botonesfinal");
						{
							btnAnterior = new JButton("Anterior");
							btnAnterior.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnAnterior.addActionListener(new BtnAnteriorActionListener());
							panelFinal.add(btnAnterior);
						}
						{
							btnFinalizar = new JButton("Finalizar");
							btnFinalizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnFinalizar.addActionListener(new BtnSiguienteActionListener());
							panelFinal.add(btnFinalizar);
						}
					}
					{
						panelPasoExito = new JPanel();
						panelBotones.add(panelPasoExito, "botonesexito");
						{
							btnAceptar = new JButton("Aceptar");
							btnAceptar.addActionListener(new BtnSiguienteActionListener());
							panelPasoExito.add(btnAceptar);
						}
					}
				}
			}
			{
				panelBorrarReserva = new JPanel();
				panelReservas.add(panelBorrarReserva, "Borrar");
				GridBagLayout gbl_panelBorrarReserva = new GridBagLayout();
				gbl_panelBorrarReserva.columnWidths = new int[] { 115, 172, 225, 0, 0, 0 };
				gbl_panelBorrarReserva.rowHeights = new int[] { 0, 0, 0, 44, 0, 54, 0, 0 };
				gbl_panelBorrarReserva.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
				gbl_panelBorrarReserva.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0,
						Double.MIN_VALUE };
				panelBorrarReserva.setLayout(gbl_panelBorrarReserva);
				{
					lblBorrarReserva = new JLabel("Borrar Reserva");
					lblBorrarReserva.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_lblBorrarReserva = new GridBagConstraints();
					gbc_lblBorrarReserva.gridwidth = 2;
					gbc_lblBorrarReserva.insets = new Insets(0, 0, 5, 5);
					gbc_lblBorrarReserva.gridx = 0;
					gbc_lblBorrarReserva.gridy = 1;
					panelBorrarReserva.add(lblBorrarReserva, gbc_lblBorrarReserva);
				}
				{
					lblIdReserva = new JLabel("ID Reserva:");
					GridBagConstraints gbc_lblIdReserva = new GridBagConstraints();
					gbc_lblIdReserva.anchor = GridBagConstraints.EAST;
					gbc_lblIdReserva.insets = new Insets(0, 0, 5, 5);
					gbc_lblIdReserva.gridx = 0;
					gbc_lblIdReserva.gridy = 3;
					panelBorrarReserva.add(lblIdReserva, gbc_lblIdReserva);
				}
				{
					cbIdReserva = new JComboBox<Integer>();
					cbIdReserva.addItemListener(new CbIdReservaItemListener());
					GridBagConstraints gbc_cbIdReserva = new GridBagConstraints();
					gbc_cbIdReserva.insets = new Insets(0, 0, 5, 5);
					gbc_cbIdReserva.fill = GridBagConstraints.HORIZONTAL;
					gbc_cbIdReserva.gridx = 1;
					gbc_cbIdReserva.gridy = 3;
					panelBorrarReserva.add(cbIdReserva, gbc_cbIdReserva);
				}
				{
					btnCancelar = new JButton("Cancelar");
					btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
					gbc_btnCancelar.fill = GridBagConstraints.BOTH;
					gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
					gbc_btnCancelar.gridx = 1;
					gbc_btnCancelar.gridy = 5;
					panelBorrarReserva.add(btnCancelar, gbc_btnCancelar);
				}
				{
					btnBorrarReserva = new JButton("Borrar");
					btnBorrarReserva.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					GridBagConstraints gbc_btnBorrarReserva = new GridBagConstraints();
					gbc_btnBorrarReserva.fill = GridBagConstraints.BOTH;
					gbc_btnBorrarReserva.insets = new Insets(0, 0, 5, 5);
					gbc_btnBorrarReserva.gridx = 2;
					gbc_btnBorrarReserva.gridy = 5;
					panelBorrarReserva.add(btnBorrarReserva, gbc_btnBorrarReserva);
				}
			}
			{
				panelConsultarReservas = new JPanel();
				panelReservas.add(panelConsultarReservas, "Consultar");
				GridBagLayout gbl_panelConsultarReservas = new GridBagLayout();
				gbl_panelConsultarReservas.columnWidths = new int[] { 0, 0, 134, 0, 0, 0, 0, 0 };
				gbl_panelConsultarReservas.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panelConsultarReservas.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0,
						Double.MIN_VALUE };
				gbl_panelConsultarReservas.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0,
						1.0, 1.0, 0.0, Double.MIN_VALUE };
				panelConsultarReservas.setLayout(gbl_panelConsultarReservas);
				{
					lblIdReservaConsulta = new JLabel("ID Reserva:");
					GridBagConstraints gbc_lblIdReservaConsulta = new GridBagConstraints();
					gbc_lblIdReservaConsulta.insets = new Insets(0, 0, 5, 5);
					gbc_lblIdReservaConsulta.anchor = GridBagConstraints.EAST;
					gbc_lblIdReservaConsulta.gridx = 1;
					gbc_lblIdReservaConsulta.gridy = 1;
					panelConsultarReservas.add(lblIdReservaConsulta, gbc_lblIdReservaConsulta);
				}
				{
					cbReserva = new JComboBox<Integer>();
					cbReserva.addItemListener(new CbReservaItemListener());
					GridBagConstraints gbc_cbReserva = new GridBagConstraints();
					gbc_cbReserva.insets = new Insets(0, 0, 5, 5);
					gbc_cbReserva.fill = GridBagConstraints.HORIZONTAL;
					gbc_cbReserva.gridx = 2;
					gbc_cbReserva.gridy = 1;
					panelConsultarReservas.add(cbReserva, gbc_cbReserva);
				}
				{
					lblFechaEntrada = new JLabel("Fecha Entrada:");
					GridBagConstraints gbc_lblFechaEntrada = new GridBagConstraints();
					gbc_lblFechaEntrada.anchor = GridBagConstraints.EAST;
					gbc_lblFechaEntrada.insets = new Insets(0, 0, 5, 5);
					gbc_lblFechaEntrada.gridx = 1;
					gbc_lblFechaEntrada.gridy = 3;
					panelConsultarReservas.add(lblFechaEntrada, gbc_lblFechaEntrada);
				}
				{
					txtFechaEntrada = new JTextField();
					txtFechaEntrada.setEditable(false);
					GridBagConstraints gbc_txtFechaEntrada = new GridBagConstraints();
					gbc_txtFechaEntrada.insets = new Insets(0, 0, 5, 5);
					gbc_txtFechaEntrada.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtFechaEntrada.gridx = 2;
					gbc_txtFechaEntrada.gridy = 3;
					panelConsultarReservas.add(txtFechaEntrada, gbc_txtFechaEntrada);
					txtFechaEntrada.setColumns(10);
				}
				{
					lblHoraEntrada = new JLabel("Hora Entrada:");
					GridBagConstraints gbc_lblHoraEntrada = new GridBagConstraints();
					gbc_lblHoraEntrada.anchor = GridBagConstraints.EAST;
					gbc_lblHoraEntrada.insets = new Insets(0, 0, 5, 5);
					gbc_lblHoraEntrada.gridx = 4;
					gbc_lblHoraEntrada.gridy = 3;
					panelConsultarReservas.add(lblHoraEntrada, gbc_lblHoraEntrada);
				}
				{
					txtHoraEntrada = new JTextField();
					txtHoraEntrada.setEditable(false);
					GridBagConstraints gbc_txtHoraEntrada = new GridBagConstraints();
					gbc_txtHoraEntrada.insets = new Insets(0, 0, 5, 5);
					gbc_txtHoraEntrada.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtHoraEntrada.gridx = 5;
					gbc_txtHoraEntrada.gridy = 3;
					panelConsultarReservas.add(txtHoraEntrada, gbc_txtHoraEntrada);
					txtHoraEntrada.setColumns(10);
				}
				{
					lblFechaSalida = new JLabel("Fecha Salida:");
					GridBagConstraints gbc_lblFechaSalida = new GridBagConstraints();
					gbc_lblFechaSalida.anchor = GridBagConstraints.EAST;
					gbc_lblFechaSalida.insets = new Insets(0, 0, 5, 5);
					gbc_lblFechaSalida.gridx = 1;
					gbc_lblFechaSalida.gridy = 4;
					panelConsultarReservas.add(lblFechaSalida, gbc_lblFechaSalida);
				}
				{
					txtFechaSalida = new JTextField();
					txtFechaSalida.setEditable(false);
					GridBagConstraints gbc_txtFechaSalida = new GridBagConstraints();
					gbc_txtFechaSalida.insets = new Insets(0, 0, 5, 5);
					gbc_txtFechaSalida.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtFechaSalida.gridx = 2;
					gbc_txtFechaSalida.gridy = 4;
					panelConsultarReservas.add(txtFechaSalida, gbc_txtFechaSalida);
					txtFechaSalida.setColumns(10);
				}
				{
					lblHoraSalida = new JLabel("Hora Salida:");
					GridBagConstraints gbc_lblHoraSalida = new GridBagConstraints();
					gbc_lblHoraSalida.anchor = GridBagConstraints.EAST;
					gbc_lblHoraSalida.insets = new Insets(0, 0, 5, 5);
					gbc_lblHoraSalida.gridx = 4;
					gbc_lblHoraSalida.gridy = 4;
					panelConsultarReservas.add(lblHoraSalida, gbc_lblHoraSalida);
				}
				{
					txtHoraSalida = new JTextField();
					txtHoraSalida.setEditable(false);
					GridBagConstraints gbc_txtHoraSalida = new GridBagConstraints();
					gbc_txtHoraSalida.insets = new Insets(0, 0, 5, 5);
					gbc_txtHoraSalida.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtHoraSalida.gridx = 5;
					gbc_txtHoraSalida.gridy = 4;
					panelConsultarReservas.add(txtHoraSalida, gbc_txtHoraSalida);
					txtHoraSalida.setColumns(10);
				}
				{
					lblDniReserva = new JLabel("DNI:");
					GridBagConstraints gbc_lblDniReserva = new GridBagConstraints();
					gbc_lblDniReserva.anchor = GridBagConstraints.EAST;
					gbc_lblDniReserva.insets = new Insets(0, 0, 5, 5);
					gbc_lblDniReserva.gridx = 1;
					gbc_lblDniReserva.gridy = 6;
					panelConsultarReservas.add(lblDniReserva, gbc_lblDniReserva);
				}
				{
					txtDni = new JTextField();
					txtDni.setEditable(false);
					GridBagConstraints gbc_txtDni = new GridBagConstraints();
					gbc_txtDni.insets = new Insets(0, 0, 5, 5);
					gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtDni.gridx = 2;
					gbc_txtDni.gridy = 6;
					panelConsultarReservas.add(txtDni, gbc_txtDni);
					txtDni.setColumns(10);
				}
				{
					lblTelefono = new JLabel("Tel\u00E9fono:");
					GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
					gbc_lblTelefono.anchor = GridBagConstraints.EAST;
					gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
					gbc_lblTelefono.gridx = 1;
					gbc_lblTelefono.gridy = 7;
					panelConsultarReservas.add(lblTelefono, gbc_lblTelefono);
				}
				{
					txtTel = new JTextField();
					txtTel.setEditable(false);
					GridBagConstraints gbc_txtTel = new GridBagConstraints();
					gbc_txtTel.insets = new Insets(0, 0, 5, 5);
					gbc_txtTel.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtTel.gridx = 2;
					gbc_txtTel.gridy = 7;
					panelConsultarReservas.add(txtTel, gbc_txtTel);
					txtTel.setColumns(10);
				}
				{
					lblCorreo = new JLabel("Correo:");
					GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
					gbc_lblCorreo.anchor = GridBagConstraints.EAST;
					gbc_lblCorreo.insets = new Insets(0, 0, 5, 5);
					gbc_lblCorreo.gridx = 4;
					gbc_lblCorreo.gridy = 7;
					panelConsultarReservas.add(lblCorreo, gbc_lblCorreo);
				}
				{
					txtCorreo = new JTextField();
					txtCorreo.setEditable(false);
					GridBagConstraints gbc_txtCorreo = new GridBagConstraints();
					gbc_txtCorreo.insets = new Insets(0, 0, 5, 5);
					gbc_txtCorreo.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtCorreo.gridx = 5;
					gbc_txtCorreo.gridy = 7;
					panelConsultarReservas.add(txtCorreo, gbc_txtCorreo);
					txtCorreo.setColumns(10);
				}
				{
					lblConsideraciones = new JLabel("Consideraciones:");
					GridBagConstraints gbc_lblConsideraciones = new GridBagConstraints();
					gbc_lblConsideraciones.insets = new Insets(0, 0, 5, 5);
					gbc_lblConsideraciones.gridx = 1;
					gbc_lblConsideraciones.gridy = 9;
					panelConsultarReservas.add(lblConsideraciones, gbc_lblConsideraciones);
				}
				{
					txtConsideraciones = new JTextPane();
					txtConsideraciones.setEditable(false);
					GridBagConstraints gbc_txtConsideraciones = new GridBagConstraints();
					gbc_txtConsideraciones.gridwidth = 4;
					gbc_txtConsideraciones.insets = new Insets(0, 0, 5, 5);
					gbc_txtConsideraciones.fill = GridBagConstraints.BOTH;
					gbc_txtConsideraciones.gridx = 2;
					gbc_txtConsideraciones.gridy = 9;
					panelConsultarReservas.add(txtConsideraciones, gbc_txtConsideraciones);
				}
				{
					btnCerrar = new JButton("Cerrar");
					btnCerrar.addActionListener(new BtnCerrarActionListener());
					btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_btnCerrar = new GridBagConstraints();
					gbc_btnCerrar.gridwidth = 3;
					gbc_btnCerrar.fill = GridBagConstraints.BOTH;
					gbc_btnCerrar.insets = new Insets(0, 0, 5, 5);
					gbc_btnCerrar.gridx = 2;
					gbc_btnCerrar.gridy = 11;
					panelConsultarReservas.add(btnCerrar, gbc_btnCerrar);
				}
			}
		}
	}

	public static void setElegirPanel(int valor) {
		elegirPanel = valor;
	}

	private class ThisWindowListener extends WindowAdapter {

		public void windowClosing(WindowEvent e) {
			int sel = JOptionPane.showOptionDialog(null, "¿Seguro que quieres cancelar la operación?", "Cerrar ventana",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (sel == JOptionPane.YES_OPTION) {
				dispose(); // Yes
			} else {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // No
			}
		}

		public void windowOpened(WindowEvent e) {

			Random rand = new Random();
			int int_random = rand.nextInt(1000000000); 
			
			txtIdGenerado.setText(String.valueOf(int_random));
			
			for (int i = 0; i < Reader.getListReservas().size(); i++) {
				cbReserva.addItem(Reader.getListReservas().get(i).getIdReserva());
				cbIdReserva.addItem(Reader.getListReservas().get(i).getIdReserva());
			}

			CardLayout panel = (CardLayout) (panelReservas.getLayout());
			switch (elegirPanel) {
			case 0:
				panel.show(panelReservas, "Añadir");
				break;
			case 1:
				panel.show(panelReservas, "Borrar");
				break;
			case 2:
				panel.show(panelReservas, "Consultar");
			}
		}
	}

	private class BtnAnteriorActionListener implements ActionListener {
		String pane = null;
		String panebotones = null;

		public void actionPerformed(ActionEvent e) {

			switch (numPanel) {
			case 0:
				dispose();
				break;
			case 1:
				pane = "Paso1";
				panebotones = "botonesinicial";
				break;
			case 2:
				pane = "Paso2";
				panebotones = "botonesintermedios";
			case 3:
				pane = "Paso3";
				panebotones = "botonesintermedios";
				break;
			case 4:
				pane = "Paso4";
				panebotones = "botonesfinal";
				break;
			}
			progressBar.setValue(numPanel);
			numPanel--;
			CardLayout panel = (CardLayout) (panelPasos.getLayout());
			CardLayout panelbotones = (CardLayout) (panelBotones.getLayout());
			panelbotones.show(panelBotones, panebotones);
			panel.show(panelPasos, pane);
		}
	}

	private class BtnSiguienteActionListener implements ActionListener {
		String pane = null;
		String panebotones = null;

		public void actionPerformed(ActionEvent e) {

			switch (numPanel) {
			case 0:
				pane = "Paso2";
				panebotones = "botonesintermedios";
				break;
			case 1:
				pane = "Paso3";
				panebotones = "botonesintermedios";
				break;
			case 2:
				pane = "Paso4";
				panebotones = "botonesfinal";
				break;
			case 3:

				// CREACION DE LA RESERVA
				try {
				int idReserva = Integer.parseInt(txtIdGenerado.getText());
				Fecha fechaEntrada = new Fecha(formattedTextFieldFechaEntradaNuevaReserva.getText());
				Fecha fechaSalida = new Fecha(formattedTextFieldFechaSalidaNuevaReserva.getText());
				String dni = formattedTextFieldDNI.getText();
				String correoElectronico = txtCorreoElectronico.getText();
				long telefono = Long.parseLong(formattedTextFieldTelefonoNuevaReserva.getText());
				int ocupantes = (int) spinnerOcupantes.getValue();
				String solicitudesEspeciales = txtSolicitudesNuevaReserva.getText();
				int horaEntrada = (int) spinnerHoraEntrada.getValue();
				int horaSalida = (int) spinnerHoraSalida.getValue();;

				Reserva r = new Reserva( idReserva,  fechaEntrada,  fechaSalida,  dni,  correoElectronico,  telefono,
						 ocupantes,  solicitudesEspeciales,  horaEntrada,  horaSalida);
				
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(new JFrame(), "Algo fue mal en el proceso, vuelva a intentarlo", "Error", JOptionPane.ERROR_MESSAGE);
					dispose();
				}
				//AÑADIR LA RESERVA Y SOBREESCRIBIR FICHERO
				
				pane = "Paso5";
				panebotones = "botonesexito";
				break;
			case 4:
				dispose();
				break;
			}
			numPanel++;
			progressBar.setValue(++numPanel);
			numPanel--;
			CardLayout panel = (CardLayout) (panelPasos.getLayout());
			CardLayout panelbotones = (CardLayout) (panelBotones.getLayout());
			panelbotones.show(panelBotones, panebotones);
			panel.show(panelPasos, pane);

		}
	}

	private class CbReservaItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int idReserva = (int) cbReserva.getSelectedItem();
			for (int i = 0; i < Reader.getListReservas().size(); i++) {
				if (idReserva == Reader.getListReservas().get(i).getIdReserva()) {
					Reserva r = Reader.getListReservas().get(i);
					txtHoraSalida.setText(String.valueOf(r.getHoraSalida()));
					txtHoraEntrada.setText(String.valueOf(r.getHoraEntrada()));
					txtConsideraciones.setText(r.getSolicitudesEspeciales());
					txtFechaEntrada.setText(r.getFechaEntrada().toString());
					txtFechaSalida.setText(r.getFechaSalida().toString());
					txtDni.setText(r.getDni());
					txtTel.setText(String.valueOf(r.getTelefono()));
					txtCorreo.setText(r.getCorreoElectronico());
				}
			}
		}
	}

	private class CbIdReservaItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int idReserva = (int) cbReserva.getSelectedItem();
			for (int i = 0; i < Reader.getListReservas().size(); i++) {
				if (idReserva == Reader.getListReservas().get(i).getIdReserva()) {
					// eliminar reserva
				}
			}
		}
	}

	private class BtnCerrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
}
