package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Ruta;
import lecturaEscritura.Reader;

import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JComboBox;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;

public class UI_Rutas extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8705213009070343242L;
	private JPanel contentPane;
	private JTabbedPane tabbedPaneRutas;
	private JPanel Faciles;
	private JComboBox<String> cbNombre;
	private JLabel lblNombre;
	private JTextPane txtFecha;
	private JLabel lblFechal;
	private JLabel lblHoraInicio;
	private JLabel lblHoraFin;
	private JSpinner spinnerHoraInicio;
	private JSpinner spinnerHoraFin;
	private JLabel lblGenteMin;
	private JSpinner spinnerGenteMin;
	private JSpinner spinnerGenteMax;
	private JLabel lblGenteMax;
	private JLabel lblPuntoEncuentro;
	private JTextPane txtEncuentro;
	private JLabel lblDescripcion;
	private JTextArea txtDescripcion;
	private JLabel lblFotoRuta;
	private JLabel lblFoto;
	private JLabel lblDificultad;
	private JLabel lblListaMonitores;
	private JPanel Intermedias;
	private JLabel lblNombre_1;
	private JComboBox<String> cbNombre_1;
	private JLabel lblIntermedia;
	private JLabel lblFechal_1;
	private JLabel lblHoraInicio_1;
	private JLabel lblHoraFin_1;
	private JLabel lblFotoRuta_1;
	private JTextPane txtFecha_1;
	private JSpinner spinnerHoraInicio_1;
	private JSpinner spinnerHoraFin_1;
	private JLabel lblFoto_1;
	private JLabel lblPuntoEncuentro_1;
	private JLabel lblGenteMin_1;
	private JLabel lblGenteMax_1;
	private JTextPane txtEncuentro_1;
	private JSpinner spinnerGenteMin_1;
	private JSpinner spinnerGenteMax_1;
	private JLabel lblListaMonitores_1;
	private JLabel lblDescripcion_1;
	private JTextArea txtDescripcion_1;
	private JPanel Dificiles;
	private JLabel lblNombre_2;
	private JComboBox<String> cbNombre_2;
	private JLabel lblDificil;
	private JLabel lblFechal_2;
	private JLabel lblHoraInicio_2;
	private JLabel lblHoraFin_2;
	private JLabel lblFotoRuta_2;
	private JTextPane txtFecha_2;
	private JSpinner spinnerHoraInicio_2;
	private JSpinner spinnerHoraFin_2;
	private JLabel lblFoto_2;
	private JLabel lblPuntoEncuentro_2;
	private JLabel lblGenteMin_2;
	private JLabel lblGenteMax_2;
	private JTextPane txtEncuentro_2;
	private JSpinner spinnerGenteMin_2;
	private JSpinner spinnerGenteMax_2;
	private JLabel lblListaMonitores_2;
	private JLabel lblDescripcion_2;
	private JTextArea txtDescripcion_2;
	private JTextField txtMonitores;
	private JTextField textMonitores_1;
	private JTextField textMonitores_2;

	/**
	 * Create the frame.
	 */
	public UI_Rutas() {
		setResizable(false);
		addWindowListener(new ThisWindowListener());
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_Rutas.class.getResource("/recursos/logo.png")));
		setTitle("Gestor Los Olivos - Rutas");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 771, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
					tabbedPaneRutas = new JTabbedPane(JTabbedPane.TOP);
					tabbedPaneRutas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					contentPane.add(tabbedPaneRutas, BorderLayout.CENTER);
					{
						Faciles = new JPanel();
						Faciles.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
						tabbedPaneRutas.addTab("F\u00E1ciles", null, Faciles, null);
						GridBagLayout gbl_Faciles = new GridBagLayout();
						gbl_Faciles.columnWidths = new int[]{0, 0, 0, 90, 78, 0, 0, 0, 0, 0};
						gbl_Faciles.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 59, 47, 38, 0, 0, 0, 0, 0};
						gbl_Faciles.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
						gbl_Faciles.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
						Faciles.setLayout(gbl_Faciles);
						{
							lblNombre = new JLabel("Nombre:");
							GridBagConstraints gbc_lblNombre = new GridBagConstraints();
							gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
							gbc_lblNombre.anchor = GridBagConstraints.EAST;
							gbc_lblNombre.gridx = 1;
							gbc_lblNombre.gridy = 1;
							Faciles.add(lblNombre, gbc_lblNombre);
						}
						{
							cbNombre = new JComboBox<String>();
							cbNombre.addItemListener(new CbNombreItemListener());
							GridBagConstraints gbc_cbNombre = new GridBagConstraints();
							gbc_cbNombre.gridwidth = 3;
							gbc_cbNombre.insets = new Insets(0, 0, 5, 5);
							gbc_cbNombre.fill = GridBagConstraints.HORIZONTAL;
							gbc_cbNombre.gridx = 2;
							gbc_cbNombre.gridy = 1;
							Faciles.add(cbNombre, gbc_cbNombre);
						}
						{
							lblDificultad = new JLabel("FACIL");
							lblDificultad.setForeground(Color.GREEN);
							GridBagConstraints gbc_lblDificultad = new GridBagConstraints();
							gbc_lblDificultad.fill = GridBagConstraints.VERTICAL;
							gbc_lblDificultad.gridwidth = 2;
							gbc_lblDificultad.insets = new Insets(0, 0, 5, 5);
							gbc_lblDificultad.gridx = 6;
							gbc_lblDificultad.gridy = 1;
							Faciles.add(lblDificultad, gbc_lblDificultad);
						}
						{
							lblFechal = new JLabel("Fecha:");
							GridBagConstraints gbc_lblFechal = new GridBagConstraints();
							gbc_lblFechal.anchor = GridBagConstraints.WEST;
							gbc_lblFechal.insets = new Insets(0, 0, 5, 5);
							gbc_lblFechal.gridx = 1;
							gbc_lblFechal.gridy = 3;
							Faciles.add(lblFechal, gbc_lblFechal);
						}
						{
							lblHoraInicio = new JLabel("Hora Inicio:");
							GridBagConstraints gbc_lblHoraInicio = new GridBagConstraints();
							gbc_lblHoraInicio.anchor = GridBagConstraints.WEST;
							gbc_lblHoraInicio.insets = new Insets(0, 0, 5, 5);
							gbc_lblHoraInicio.gridx = 3;
							gbc_lblHoraInicio.gridy = 3;
							Faciles.add(lblHoraInicio, gbc_lblHoraInicio);
						}
						{
							lblHoraFin = new JLabel("Hora Fin:");
							GridBagConstraints gbc_lblHoraFin = new GridBagConstraints();
							gbc_lblHoraFin.anchor = GridBagConstraints.WEST;
							gbc_lblHoraFin.insets = new Insets(0, 0, 5, 5);
							gbc_lblHoraFin.gridx = 4;
							gbc_lblHoraFin.gridy = 3;
							Faciles.add(lblHoraFin, gbc_lblHoraFin);
						}
						{
							lblFotoRuta = new JLabel("Foto Ruta:");
							GridBagConstraints gbc_lblFotoRuta = new GridBagConstraints();
							gbc_lblFotoRuta.anchor = GridBagConstraints.WEST;
							gbc_lblFotoRuta.insets = new Insets(0, 0, 5, 5);
							gbc_lblFotoRuta.gridx = 6;
							gbc_lblFotoRuta.gridy = 3;
							Faciles.add(lblFotoRuta, gbc_lblFotoRuta);
						}
						{
							txtFecha = new JTextPane();
							txtFecha.setEditable(false);
							GridBagConstraints gbc_txtFecha = new GridBagConstraints();
							gbc_txtFecha.insets = new Insets(0, 0, 5, 5);
							gbc_txtFecha.fill = GridBagConstraints.BOTH;
							gbc_txtFecha.gridx = 1;
							gbc_txtFecha.gridy = 4;
							Faciles.add(txtFecha, gbc_txtFecha);
						}
						{
							spinnerHoraInicio = new JSpinner();
							spinnerHoraInicio.setEnabled(false);
							spinnerHoraInicio.setModel(new SpinnerNumberModel(0, null, null, 1));
							GridBagConstraints gbc_spinnerHoraInicio = new GridBagConstraints();
							gbc_spinnerHoraInicio.anchor = GridBagConstraints.WEST;
							gbc_spinnerHoraInicio.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerHoraInicio.gridx = 3;
							gbc_spinnerHoraInicio.gridy = 4;
							Faciles.add(spinnerHoraInicio, gbc_spinnerHoraInicio);
						}
						{
							spinnerHoraFin = new JSpinner();
							spinnerHoraFin.setEnabled(false);
							GridBagConstraints gbc_spinnerHoraFin = new GridBagConstraints();
							gbc_spinnerHoraFin.anchor = GridBagConstraints.WEST;
							gbc_spinnerHoraFin.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerHoraFin.gridx = 4;
							gbc_spinnerHoraFin.gridy = 4;
							Faciles.add(spinnerHoraFin, gbc_spinnerHoraFin);
						}
						{
							lblFoto = new JLabel("");
							lblFoto.setIcon(new ImageIcon(UI_Rutas.class.getResource("/recursos/location-pin@3x.png")));
							GridBagConstraints gbc_lblFoto = new GridBagConstraints();
							gbc_lblFoto.gridheight = 7;
							gbc_lblFoto.gridwidth = 2;
							gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
							gbc_lblFoto.gridx = 6;
							gbc_lblFoto.gridy = 4;
							Faciles.add(lblFoto, gbc_lblFoto);
						}
						{
							lblPuntoEncuentro = new JLabel("Encuentro:");
							GridBagConstraints gbc_lblPuntoEncuentro = new GridBagConstraints();
							gbc_lblPuntoEncuentro.anchor = GridBagConstraints.WEST;
							gbc_lblPuntoEncuentro.insets = new Insets(0, 0, 5, 5);
							gbc_lblPuntoEncuentro.gridx = 1;
							gbc_lblPuntoEncuentro.gridy = 6;
							Faciles.add(lblPuntoEncuentro, gbc_lblPuntoEncuentro);
						}
						{
							lblGenteMin = new JLabel("Gente Min:");
							GridBagConstraints gbc_lblGenteMin = new GridBagConstraints();
							gbc_lblGenteMin.anchor = GridBagConstraints.WEST;
							gbc_lblGenteMin.insets = new Insets(0, 0, 5, 5);
							gbc_lblGenteMin.gridx = 3;
							gbc_lblGenteMin.gridy = 6;
							Faciles.add(lblGenteMin, gbc_lblGenteMin);
						}
						{
							lblGenteMax = new JLabel("Gente Max:");
							GridBagConstraints gbc_lblGenteMax = new GridBagConstraints();
							gbc_lblGenteMax.anchor = GridBagConstraints.WEST;
							gbc_lblGenteMax.insets = new Insets(0, 0, 5, 5);
							gbc_lblGenteMax.gridx = 4;
							gbc_lblGenteMax.gridy = 6;
							Faciles.add(lblGenteMax, gbc_lblGenteMax);
						}
						{
							txtEncuentro = new JTextPane();
							txtEncuentro.setEditable(false);
							GridBagConstraints gbc_txtEncuentro = new GridBagConstraints();
							gbc_txtEncuentro.insets = new Insets(0, 0, 5, 5);
							gbc_txtEncuentro.fill = GridBagConstraints.BOTH;
							gbc_txtEncuentro.gridx = 1;
							gbc_txtEncuentro.gridy = 7;
							Faciles.add(txtEncuentro, gbc_txtEncuentro);
						}
						{
							spinnerGenteMin = new JSpinner();
							spinnerGenteMin.setEnabled(false);
							GridBagConstraints gbc_spinnerGenteMin = new GridBagConstraints();
							gbc_spinnerGenteMin.anchor = GridBagConstraints.WEST;
							gbc_spinnerGenteMin.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerGenteMin.gridx = 3;
							gbc_spinnerGenteMin.gridy = 7;
							Faciles.add(spinnerGenteMin, gbc_spinnerGenteMin);
						}
						{
							spinnerGenteMax = new JSpinner();
							spinnerGenteMax.setEnabled(false);
							GridBagConstraints gbc_spinnerGenteMax = new GridBagConstraints();
							gbc_spinnerGenteMax.anchor = GridBagConstraints.WEST;
							gbc_spinnerGenteMax.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerGenteMax.gridx = 4;
							gbc_spinnerGenteMax.gridy = 7;
							Faciles.add(spinnerGenteMax, gbc_spinnerGenteMax);
						}
						{
							lblListaMonitores = new JLabel("Lista Monitores:");
							GridBagConstraints gbc_lblListaMonitores = new GridBagConstraints();
							gbc_lblListaMonitores.anchor = GridBagConstraints.WEST;
							gbc_lblListaMonitores.insets = new Insets(0, 0, 5, 5);
							gbc_lblListaMonitores.gridx = 1;
							gbc_lblListaMonitores.gridy = 9;
							Faciles.add(lblListaMonitores, gbc_lblListaMonitores);
						}
						{
							txtMonitores = new JTextField();
							GridBagConstraints gbc_txtMonitores = new GridBagConstraints();
							gbc_txtMonitores.gridwidth = 3;
							gbc_txtMonitores.insets = new Insets(0, 0, 5, 5);
							gbc_txtMonitores.fill = GridBagConstraints.HORIZONTAL;
							gbc_txtMonitores.gridx = 1;
							gbc_txtMonitores.gridy = 10;
							Faciles.add(txtMonitores, gbc_txtMonitores);
							txtMonitores.setColumns(10);
						}
						{
							lblDescripcion = new JLabel("Descripcion:");
							GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
							gbc_lblDescripcion.anchor = GridBagConstraints.WEST;
							gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
							gbc_lblDescripcion.gridx = 1;
							gbc_lblDescripcion.gridy = 11;
							Faciles.add(lblDescripcion, gbc_lblDescripcion);
						}
						{
							txtDescripcion = new JTextArea();
							txtDescripcion.setEditable(false);
							GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
							gbc_txtDescripcion.gridheight = 4;
							gbc_txtDescripcion.gridwidth = 7;
							gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
							gbc_txtDescripcion.fill = GridBagConstraints.BOTH;
							gbc_txtDescripcion.gridx = 1;
							gbc_txtDescripcion.gridy = 12;
							Faciles.add(txtDescripcion, gbc_txtDescripcion);
						}
					}
					{
						Intermedias = new JPanel();
						Intermedias.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
						tabbedPaneRutas.addTab("Intermedias", null, Intermedias, null);
						GridBagLayout gbl_Intermedias = new GridBagLayout();
						gbl_Intermedias.columnWidths = new int[]{0, 0, 0, 90, 78, 0, 0, 0, 0, 0};
						gbl_Intermedias.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 59, 47, 38, 0, 0, 0, 0, 0};
						gbl_Intermedias.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
						gbl_Intermedias.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
						Intermedias.setLayout(gbl_Intermedias);
						{
							lblNombre_1 = new JLabel("Nombre:");
							GridBagConstraints gbc_lblNombre_1 = new GridBagConstraints();
							gbc_lblNombre_1.anchor = GridBagConstraints.EAST;
							gbc_lblNombre_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblNombre_1.gridx = 1;
							gbc_lblNombre_1.gridy = 1;
							Intermedias.add(lblNombre_1, gbc_lblNombre_1);
						}
						{
							cbNombre_1 = new JComboBox<String>();
							cbNombre_1.addItemListener(new CbNombre_1ItemListener());
							GridBagConstraints gbc_cbNombre_1 = new GridBagConstraints();
							gbc_cbNombre_1.fill = GridBagConstraints.HORIZONTAL;
							gbc_cbNombre_1.gridwidth = 3;
							gbc_cbNombre_1.insets = new Insets(0, 0, 5, 5);
							gbc_cbNombre_1.gridx = 2;
							gbc_cbNombre_1.gridy = 1;
							Intermedias.add(cbNombre_1, gbc_cbNombre_1);
						}
						{
							lblIntermedia = new JLabel("INTERMEDIA");
							lblIntermedia.setForeground(Color.ORANGE);
							GridBagConstraints gbc_lblIntermedia = new GridBagConstraints();
							gbc_lblIntermedia.fill = GridBagConstraints.VERTICAL;
							gbc_lblIntermedia.gridwidth = 2;
							gbc_lblIntermedia.insets = new Insets(0, 0, 5, 5);
							gbc_lblIntermedia.gridx = 6;
							gbc_lblIntermedia.gridy = 1;
							Intermedias.add(lblIntermedia, gbc_lblIntermedia);
						}
						{
							lblFechal_1 = new JLabel("Fecha:");
							GridBagConstraints gbc_lblFechal_1 = new GridBagConstraints();
							gbc_lblFechal_1.anchor = GridBagConstraints.WEST;
							gbc_lblFechal_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblFechal_1.gridx = 1;
							gbc_lblFechal_1.gridy = 3;
							Intermedias.add(lblFechal_1, gbc_lblFechal_1);
						}
						{
							lblHoraInicio_1 = new JLabel("Hora Inicio:");
							GridBagConstraints gbc_lblHoraInicio_1 = new GridBagConstraints();
							gbc_lblHoraInicio_1.anchor = GridBagConstraints.WEST;
							gbc_lblHoraInicio_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblHoraInicio_1.gridx = 3;
							gbc_lblHoraInicio_1.gridy = 3;
							Intermedias.add(lblHoraInicio_1, gbc_lblHoraInicio_1);
						}
						{
							lblHoraFin_1 = new JLabel("Hora Fin:");
							GridBagConstraints gbc_lblHoraFin_1 = new GridBagConstraints();
							gbc_lblHoraFin_1.anchor = GridBagConstraints.WEST;
							gbc_lblHoraFin_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblHoraFin_1.gridx = 4;
							gbc_lblHoraFin_1.gridy = 3;
							Intermedias.add(lblHoraFin_1, gbc_lblHoraFin_1);
						}
						{
							lblFotoRuta_1 = new JLabel("Foto Ruta:");
							GridBagConstraints gbc_lblFotoRuta_1 = new GridBagConstraints();
							gbc_lblFotoRuta_1.anchor = GridBagConstraints.WEST;
							gbc_lblFotoRuta_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblFotoRuta_1.gridx = 6;
							gbc_lblFotoRuta_1.gridy = 3;
							Intermedias.add(lblFotoRuta_1, gbc_lblFotoRuta_1);
						}
						{
							txtFecha_1 = new JTextPane();
							txtFecha_1.setEditable(false);
							GridBagConstraints gbc_txtFecha_1 = new GridBagConstraints();
							gbc_txtFecha_1.fill = GridBagConstraints.BOTH;
							gbc_txtFecha_1.insets = new Insets(0, 0, 5, 5);
							gbc_txtFecha_1.gridx = 1;
							gbc_txtFecha_1.gridy = 4;
							Intermedias.add(txtFecha_1, gbc_txtFecha_1);
						}
						{
							spinnerHoraInicio_1 = new JSpinner();
							spinnerHoraInicio_1.setEnabled(false);
							GridBagConstraints gbc_spinnerHoraInicio_1 = new GridBagConstraints();
							gbc_spinnerHoraInicio_1.anchor = GridBagConstraints.WEST;
							gbc_spinnerHoraInicio_1.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerHoraInicio_1.gridx = 3;
							gbc_spinnerHoraInicio_1.gridy = 4;
							Intermedias.add(spinnerHoraInicio_1, gbc_spinnerHoraInicio_1);
						}
						{
							spinnerHoraFin_1 = new JSpinner();
							spinnerHoraFin_1.setEnabled(false);
							GridBagConstraints gbc_spinnerHoraFin_1 = new GridBagConstraints();
							gbc_spinnerHoraFin_1.anchor = GridBagConstraints.WEST;
							gbc_spinnerHoraFin_1.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerHoraFin_1.gridx = 4;
							gbc_spinnerHoraFin_1.gridy = 4;
							Intermedias.add(spinnerHoraFin_1, gbc_spinnerHoraFin_1);
						}
						{
							lblFoto_1 = new JLabel("");
							lblFoto_1.setIcon(new ImageIcon(UI_Rutas.class.getResource("/recursos/location-pin@3x.png")));
							GridBagConstraints gbc_lblFoto_1 = new GridBagConstraints();
							gbc_lblFoto_1.gridheight = 7;
							gbc_lblFoto_1.gridwidth = 2;
							gbc_lblFoto_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblFoto_1.gridx = 6;
							gbc_lblFoto_1.gridy = 4;
							Intermedias.add(lblFoto_1, gbc_lblFoto_1);
						}
						{
							lblPuntoEncuentro_1 = new JLabel("Encuentro:");
							GridBagConstraints gbc_lblPuntoEncuentro_1 = new GridBagConstraints();
							gbc_lblPuntoEncuentro_1.anchor = GridBagConstraints.WEST;
							gbc_lblPuntoEncuentro_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblPuntoEncuentro_1.gridx = 1;
							gbc_lblPuntoEncuentro_1.gridy = 6;
							Intermedias.add(lblPuntoEncuentro_1, gbc_lblPuntoEncuentro_1);
						}
						{
							lblGenteMin_1 = new JLabel("Gente Min:");
							GridBagConstraints gbc_lblGenteMin_1 = new GridBagConstraints();
							gbc_lblGenteMin_1.anchor = GridBagConstraints.WEST;
							gbc_lblGenteMin_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblGenteMin_1.gridx = 3;
							gbc_lblGenteMin_1.gridy = 6;
							Intermedias.add(lblGenteMin_1, gbc_lblGenteMin_1);
						}
						{
							lblGenteMax_1 = new JLabel("Gente Max:");
							GridBagConstraints gbc_lblGenteMax_1 = new GridBagConstraints();
							gbc_lblGenteMax_1.anchor = GridBagConstraints.WEST;
							gbc_lblGenteMax_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblGenteMax_1.gridx = 4;
							gbc_lblGenteMax_1.gridy = 6;
							Intermedias.add(lblGenteMax_1, gbc_lblGenteMax_1);
						}
						{
							txtEncuentro_1 = new JTextPane();
							txtEncuentro_1.setEditable(false);
							GridBagConstraints gbc_txtEncuentro_1 = new GridBagConstraints();
							gbc_txtEncuentro_1.fill = GridBagConstraints.BOTH;
							gbc_txtEncuentro_1.insets = new Insets(0, 0, 5, 5);
							gbc_txtEncuentro_1.gridx = 1;
							gbc_txtEncuentro_1.gridy = 7;
							Intermedias.add(txtEncuentro_1, gbc_txtEncuentro_1);
						}
						{
							spinnerGenteMin_1 = new JSpinner();
							spinnerGenteMin_1.setEnabled(false);
							GridBagConstraints gbc_spinnerGenteMin_1 = new GridBagConstraints();
							gbc_spinnerGenteMin_1.anchor = GridBagConstraints.WEST;
							gbc_spinnerGenteMin_1.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerGenteMin_1.gridx = 3;
							gbc_spinnerGenteMin_1.gridy = 7;
							Intermedias.add(spinnerGenteMin_1, gbc_spinnerGenteMin_1);
						}
						{
							spinnerGenteMax_1 = new JSpinner();
							spinnerGenteMax_1.setEnabled(false);
							GridBagConstraints gbc_spinnerGenteMax_1 = new GridBagConstraints();
							gbc_spinnerGenteMax_1.anchor = GridBagConstraints.WEST;
							gbc_spinnerGenteMax_1.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerGenteMax_1.gridx = 4;
							gbc_spinnerGenteMax_1.gridy = 7;
							Intermedias.add(spinnerGenteMax_1, gbc_spinnerGenteMax_1);
						}
						{
							lblListaMonitores_1 = new JLabel("Lista Monitores:");
							GridBagConstraints gbc_lblListaMonitores_1 = new GridBagConstraints();
							gbc_lblListaMonitores_1.anchor = GridBagConstraints.WEST;
							gbc_lblListaMonitores_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblListaMonitores_1.gridx = 1;
							gbc_lblListaMonitores_1.gridy = 9;
							Intermedias.add(lblListaMonitores_1, gbc_lblListaMonitores_1);
						}
						{
							textMonitores_1 = new JTextField();
							textMonitores_1.setColumns(10);
							GridBagConstraints gbc_textMonitores_1 = new GridBagConstraints();
							gbc_textMonitores_1.gridwidth = 3;
							gbc_textMonitores_1.insets = new Insets(0, 0, 5, 5);
							gbc_textMonitores_1.fill = GridBagConstraints.HORIZONTAL;
							gbc_textMonitores_1.gridx = 1;
							gbc_textMonitores_1.gridy = 10;
							Intermedias.add(textMonitores_1, gbc_textMonitores_1);
						}
						{
							lblDescripcion_1 = new JLabel("Descripcion:");
							GridBagConstraints gbc_lblDescripcion_1 = new GridBagConstraints();
							gbc_lblDescripcion_1.anchor = GridBagConstraints.WEST;
							gbc_lblDescripcion_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblDescripcion_1.gridx = 1;
							gbc_lblDescripcion_1.gridy = 11;
							Intermedias.add(lblDescripcion_1, gbc_lblDescripcion_1);
						}
						{
							txtDescripcion_1 = new JTextArea();
							txtDescripcion_1.setEditable(false);
							GridBagConstraints gbc_txtDescripcion_1 = new GridBagConstraints();
							gbc_txtDescripcion_1.fill = GridBagConstraints.BOTH;
							gbc_txtDescripcion_1.gridheight = 4;
							gbc_txtDescripcion_1.gridwidth = 7;
							gbc_txtDescripcion_1.insets = new Insets(0, 0, 5, 5);
							gbc_txtDescripcion_1.gridx = 1;
							gbc_txtDescripcion_1.gridy = 12;
							Intermedias.add(txtDescripcion_1, gbc_txtDescripcion_1);
						}
					}
					{
						Dificiles = new JPanel();
						Dificiles.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
						tabbedPaneRutas.addTab("Dificiles", null, Dificiles, null);
						GridBagLayout gbl_Dificiles = new GridBagLayout();
						gbl_Dificiles.columnWidths = new int[]{0, 0, 0, 90, 78, 0, 0, 0, 0, 0};
						gbl_Dificiles.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 59, 47, 38, 0, 0, 0, 0, 0};
						gbl_Dificiles.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
						gbl_Dificiles.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
						Dificiles.setLayout(gbl_Dificiles);
						{
							lblNombre_2 = new JLabel("Nombre:");
							GridBagConstraints gbc_lblNombre_2 = new GridBagConstraints();
							gbc_lblNombre_2.anchor = GridBagConstraints.EAST;
							gbc_lblNombre_2.insets = new Insets(0, 0, 5, 5);
							gbc_lblNombre_2.gridx = 1;
							gbc_lblNombre_2.gridy = 1;
							Dificiles.add(lblNombre_2, gbc_lblNombre_2);
						}
						{
							cbNombre_2 = new JComboBox<String>();
							cbNombre_2.addItemListener(new CbNombre_2ItemListener());
							GridBagConstraints gbc_cbNombre_2 = new GridBagConstraints();
							gbc_cbNombre_2.fill = GridBagConstraints.HORIZONTAL;
							gbc_cbNombre_2.gridwidth = 3;
							gbc_cbNombre_2.insets = new Insets(0, 0, 5, 5);
							gbc_cbNombre_2.gridx = 2;
							gbc_cbNombre_2.gridy = 1;
							Dificiles.add(cbNombre_2, gbc_cbNombre_2);
						}
						{
							lblDificil = new JLabel("DIFICIL");
							lblDificil.setForeground(Color.RED);
							GridBagConstraints gbc_lblDificil = new GridBagConstraints();
							gbc_lblDificil.fill = GridBagConstraints.VERTICAL;
							gbc_lblDificil.gridwidth = 2;
							gbc_lblDificil.insets = new Insets(0, 0, 5, 5);
							gbc_lblDificil.gridx = 6;
							gbc_lblDificil.gridy = 1;
							Dificiles.add(lblDificil, gbc_lblDificil);
						}
						{
							lblFechal_2 = new JLabel("Fecha:");
							GridBagConstraints gbc_lblFechal_2 = new GridBagConstraints();
							gbc_lblFechal_2.anchor = GridBagConstraints.WEST;
							gbc_lblFechal_2.insets = new Insets(0, 0, 5, 5);
							gbc_lblFechal_2.gridx = 1;
							gbc_lblFechal_2.gridy = 3;
							Dificiles.add(lblFechal_2, gbc_lblFechal_2);
						}
						{
							lblHoraInicio_2 = new JLabel("Hora Inicio:");
							GridBagConstraints gbc_lblHoraInicio_2 = new GridBagConstraints();
							gbc_lblHoraInicio_2.anchor = GridBagConstraints.WEST;
							gbc_lblHoraInicio_2.insets = new Insets(0, 0, 5, 5);
							gbc_lblHoraInicio_2.gridx = 3;
							gbc_lblHoraInicio_2.gridy = 3;
							Dificiles.add(lblHoraInicio_2, gbc_lblHoraInicio_2);
						}
						{
							lblHoraFin_2 = new JLabel("Hora Fin:");
							GridBagConstraints gbc_lblHoraFin_2 = new GridBagConstraints();
							gbc_lblHoraFin_2.anchor = GridBagConstraints.WEST;
							gbc_lblHoraFin_2.insets = new Insets(0, 0, 5, 5);
							gbc_lblHoraFin_2.gridx = 4;
							gbc_lblHoraFin_2.gridy = 3;
							Dificiles.add(lblHoraFin_2, gbc_lblHoraFin_2);
						}
						{
							lblFotoRuta_2 = new JLabel("Foto Ruta:");
							GridBagConstraints gbc_lblFotoRuta_2 = new GridBagConstraints();
							gbc_lblFotoRuta_2.anchor = GridBagConstraints.WEST;
							gbc_lblFotoRuta_2.insets = new Insets(0, 0, 5, 5);
							gbc_lblFotoRuta_2.gridx = 6;
							gbc_lblFotoRuta_2.gridy = 3;
							Dificiles.add(lblFotoRuta_2, gbc_lblFotoRuta_2);
						}
						{
							txtFecha_2 = new JTextPane();
							txtFecha_2.setEditable(false);
							GridBagConstraints gbc_txtFecha_2 = new GridBagConstraints();
							gbc_txtFecha_2.fill = GridBagConstraints.BOTH;
							gbc_txtFecha_2.insets = new Insets(0, 0, 5, 5);
							gbc_txtFecha_2.gridx = 1;
							gbc_txtFecha_2.gridy = 4;
							Dificiles.add(txtFecha_2, gbc_txtFecha_2);
						}
						{
							spinnerHoraInicio_2 = new JSpinner();
							spinnerHoraInicio_2.setEnabled(false);
							GridBagConstraints gbc_spinnerHoraInicio_2 = new GridBagConstraints();
							gbc_spinnerHoraInicio_2.anchor = GridBagConstraints.WEST;
							gbc_spinnerHoraInicio_2.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerHoraInicio_2.gridx = 3;
							gbc_spinnerHoraInicio_2.gridy = 4;
							Dificiles.add(spinnerHoraInicio_2, gbc_spinnerHoraInicio_2);
						}
						{
							spinnerHoraFin_2 = new JSpinner();
							spinnerHoraFin_2.setEnabled(false);
							GridBagConstraints gbc_spinnerHoraFin_2 = new GridBagConstraints();
							gbc_spinnerHoraFin_2.anchor = GridBagConstraints.WEST;
							gbc_spinnerHoraFin_2.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerHoraFin_2.gridx = 4;
							gbc_spinnerHoraFin_2.gridy = 4;
							Dificiles.add(spinnerHoraFin_2, gbc_spinnerHoraFin_2);
						}
						{
							lblFoto_2 = new JLabel("");
							lblFoto_2.setIcon(new ImageIcon(UI_Rutas.class.getResource("/recursos/location-pin@3x.png")));
							GridBagConstraints gbc_lblFoto_2 = new GridBagConstraints();
							gbc_lblFoto_2.gridheight = 7;
							gbc_lblFoto_2.gridwidth = 2;
							gbc_lblFoto_2.insets = new Insets(0, 0, 5, 5);
							gbc_lblFoto_2.gridx = 6;
							gbc_lblFoto_2.gridy = 4;
							Dificiles.add(lblFoto_2, gbc_lblFoto_2);
						}
						{
							lblPuntoEncuentro_2 = new JLabel("Encuentro:");
							GridBagConstraints gbc_lblPuntoEncuentro_2 = new GridBagConstraints();
							gbc_lblPuntoEncuentro_2.anchor = GridBagConstraints.WEST;
							gbc_lblPuntoEncuentro_2.insets = new Insets(0, 0, 5, 5);
							gbc_lblPuntoEncuentro_2.gridx = 1;
							gbc_lblPuntoEncuentro_2.gridy = 6;
							Dificiles.add(lblPuntoEncuentro_2, gbc_lblPuntoEncuentro_2);
						}
						{
							lblGenteMin_2 = new JLabel("Gente Min:");
							GridBagConstraints gbc_lblGenteMin_2 = new GridBagConstraints();
							gbc_lblGenteMin_2.anchor = GridBagConstraints.WEST;
							gbc_lblGenteMin_2.insets = new Insets(0, 0, 5, 5);
							gbc_lblGenteMin_2.gridx = 3;
							gbc_lblGenteMin_2.gridy = 6;
							Dificiles.add(lblGenteMin_2, gbc_lblGenteMin_2);
						}
						{
							lblGenteMax_2 = new JLabel("Gente Max:");
							GridBagConstraints gbc_lblGenteMax_2 = new GridBagConstraints();
							gbc_lblGenteMax_2.anchor = GridBagConstraints.WEST;
							gbc_lblGenteMax_2.insets = new Insets(0, 0, 5, 5);
							gbc_lblGenteMax_2.gridx = 4;
							gbc_lblGenteMax_2.gridy = 6;
							Dificiles.add(lblGenteMax_2, gbc_lblGenteMax_2);
						}
						{
							txtEncuentro_2 = new JTextPane();
							txtEncuentro_2.setEditable(false);
							GridBagConstraints gbc_txtEncuentro_2 = new GridBagConstraints();
							gbc_txtEncuentro_2.fill = GridBagConstraints.BOTH;
							gbc_txtEncuentro_2.insets = new Insets(0, 0, 5, 5);
							gbc_txtEncuentro_2.gridx = 1;
							gbc_txtEncuentro_2.gridy = 7;
							Dificiles.add(txtEncuentro_2, gbc_txtEncuentro_2);
						}
						{
							spinnerGenteMin_2 = new JSpinner();
							spinnerGenteMin_2.setEnabled(false);
							GridBagConstraints gbc_spinnerGenteMin_2 = new GridBagConstraints();
							gbc_spinnerGenteMin_2.anchor = GridBagConstraints.WEST;
							gbc_spinnerGenteMin_2.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerGenteMin_2.gridx = 3;
							gbc_spinnerGenteMin_2.gridy = 7;
							Dificiles.add(spinnerGenteMin_2, gbc_spinnerGenteMin_2);
						}
						{
							spinnerGenteMax_2 = new JSpinner();
							spinnerGenteMax_2.setEnabled(false);
							GridBagConstraints gbc_spinnerGenteMax_2 = new GridBagConstraints();
							gbc_spinnerGenteMax_2.anchor = GridBagConstraints.WEST;
							gbc_spinnerGenteMax_2.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerGenteMax_2.gridx = 4;
							gbc_spinnerGenteMax_2.gridy = 7;
							Dificiles.add(spinnerGenteMax_2, gbc_spinnerGenteMax_2);
						}
						{
							lblListaMonitores_2 = new JLabel("Lista Monitores:");
							GridBagConstraints gbc_lblListaMonitores_2 = new GridBagConstraints();
							gbc_lblListaMonitores_2.anchor = GridBagConstraints.WEST;
							gbc_lblListaMonitores_2.insets = new Insets(0, 0, 5, 5);
							gbc_lblListaMonitores_2.gridx = 1;
							gbc_lblListaMonitores_2.gridy = 9;
							Dificiles.add(lblListaMonitores_2, gbc_lblListaMonitores_2);
						}
						{
							textMonitores_2 = new JTextField();
							textMonitores_2.setColumns(10);
							GridBagConstraints gbc_textMonitores_2 = new GridBagConstraints();
							gbc_textMonitores_2.gridwidth = 3;
							gbc_textMonitores_2.insets = new Insets(0, 0, 5, 5);
							gbc_textMonitores_2.fill = GridBagConstraints.HORIZONTAL;
							gbc_textMonitores_2.gridx = 1;
							gbc_textMonitores_2.gridy = 10;
							Dificiles.add(textMonitores_2, gbc_textMonitores_2);
						}
						{
							lblDescripcion_2 = new JLabel("Descripcion:");
							GridBagConstraints gbc_lblDescripcion_2 = new GridBagConstraints();
							gbc_lblDescripcion_2.anchor = GridBagConstraints.WEST;
							gbc_lblDescripcion_2.insets = new Insets(0, 0, 5, 5);
							gbc_lblDescripcion_2.gridx = 1;
							gbc_lblDescripcion_2.gridy = 11;
							Dificiles.add(lblDescripcion_2, gbc_lblDescripcion_2);
						}
						{
							txtDescripcion_2 = new JTextArea();
							txtDescripcion_2.setEditable(false);
							GridBagConstraints gbc_txtDescripcion_2 = new GridBagConstraints();
							gbc_txtDescripcion_2.fill = GridBagConstraints.BOTH;
							gbc_txtDescripcion_2.gridheight = 4;
							gbc_txtDescripcion_2.gridwidth = 7;
							gbc_txtDescripcion_2.insets = new Insets(0, 0, 5, 5);
							gbc_txtDescripcion_2.gridx = 1;
							gbc_txtDescripcion_2.gridy = 12;
							Dificiles.add(txtDescripcion_2, gbc_txtDescripcion_2);
						}
					}
		}
	}
	private class ThisWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			UI_Gestor.setComprobadorInfoRuta(0);
			dispose();
		}
		@Override
		public void windowActivated(WindowEvent e) {
			
			for(int i=0; i<Reader.getListRutas().size(); i++) {
				switch(Reader.getListRutas().get(i).getGradoDificultad()) {
				case FACIL:
					cbNombre.addItem(Reader.getListRutas().get(i).getNombre());
					break;
				case INTERMEDIA:
					cbNombre_1.addItem(Reader.getListRutas().get(i).getNombre());
					break;
				case DIFICIL:
					cbNombre_2.addItem(Reader.getListRutas().get(i).getNombre());
					break;
				}
			}
			
			
		}
	}
	private class CbNombreItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			String ruta = (String) cbNombre.getSelectedItem();
			for(int i=0; i<Reader.getListRutas().size(); i++) {
				if(ruta.equals(Reader.getListRutas().get(i).getNombre())) {
					Ruta rutaAuxiliar = Reader.getListRutas().get(i);
					txtFecha.setText(rutaAuxiliar.getFecha().toString());
					txtEncuentro.setText(rutaAuxiliar.getPuntoEncuentro());
					txtMonitores.setText(rutaAuxiliar.getMonitor());
					txtDescripcion.setText(rutaAuxiliar.getDescripcion());
					spinnerGenteMin.setModel(new SpinnerNumberModel(rutaAuxiliar.getNumeroMinimoPersonas(), null, null, 1));
					spinnerGenteMax.setModel(new SpinnerNumberModel(rutaAuxiliar.getNumeroMaximoPersonas(), null, null, 1));
					spinnerHoraInicio.setModel(new SpinnerNumberModel(rutaAuxiliar.getHoraInicio(), null, null, 1));
					spinnerHoraFin.setModel(new SpinnerNumberModel(rutaAuxiliar.getHoraFinal(), null, null, 1));
					
					Image imagenOriginal;
					
					File file = new File(rutaAuxiliar.getPathImagenRuta());
					try {
						imagenOriginal = ImageIO.read(file);

						Image imagenEscalada = imagenOriginal.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(),
								java.awt.Image.SCALE_SMOOTH);
						ImageIcon iconoLabel = new ImageIcon(imagenEscalada);
						lblFoto.setIcon(iconoLabel);
					} catch (IOException a) {
						a.printStackTrace();
					}
					
					//String[] absolutePath = rutaAuxiliar.getPathImagenRuta().split("recursos");
					//lblFoto.setIcon(new ImageIcon("src/recursos"+absolutePath[1]));
				}
			}
		}
	}
	private class CbNombre_1ItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			String ruta = (String) cbNombre_1.getSelectedItem();
			for(int i=0; i<Reader.getListRutas().size(); i++) {
				if(ruta.equals(Reader.getListRutas().get(i).getNombre())) {
					Ruta rutaAuxiliar = Reader.getListRutas().get(i);
					txtFecha_1.setText(rutaAuxiliar.getFecha().toString());
					txtEncuentro_1.setText(rutaAuxiliar.getPuntoEncuentro());
					textMonitores_1.setText(rutaAuxiliar.getMonitor());
					txtDescripcion_1.setText(rutaAuxiliar.getDescripcion());
					spinnerGenteMin_1.setModel(new SpinnerNumberModel(rutaAuxiliar.getNumeroMinimoPersonas(), null, null, 1));
					spinnerGenteMax_1.setModel(new SpinnerNumberModel(rutaAuxiliar.getNumeroMaximoPersonas(), null, null, 1));
					spinnerHoraInicio_1.setModel(new SpinnerNumberModel(rutaAuxiliar.getHoraInicio(), null, null, 1));
					spinnerHoraFin_1.setModel(new SpinnerNumberModel(rutaAuxiliar.getHoraFinal(), null, null, 1));
					Image imagenOriginal;
					
					File file = new File(rutaAuxiliar.getPathImagenRuta());
					try {
						imagenOriginal = ImageIO.read(file);

						Image imagenEscalada = imagenOriginal.getScaledInstance(lblFoto_1.getWidth(), lblFoto_1.getHeight(),
								java.awt.Image.SCALE_SMOOTH);
						ImageIcon iconoLabel = new ImageIcon(imagenEscalada);
						lblFoto_1.setIcon(iconoLabel);
					} catch (IOException a) {
						a.printStackTrace();
					}
				}
			}
		}
	}
	private class CbNombre_2ItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			String ruta = (String) cbNombre_2.getSelectedItem();
			for(int i=0; i<Reader.getListRutas().size(); i++) {
				if(ruta.equals(Reader.getListRutas().get(i).getNombre())) {
					Ruta rutaAuxiliar = Reader.getListRutas().get(i);
					txtFecha_2.setText(rutaAuxiliar.getFecha().toString());
					txtEncuentro_2.setText(rutaAuxiliar.getPuntoEncuentro());
					textMonitores_2.setText(rutaAuxiliar.getMonitor());
					txtDescripcion_2.setText(rutaAuxiliar.getDescripcion());
					spinnerGenteMin_2.setModel(new SpinnerNumberModel(rutaAuxiliar.getNumeroMinimoPersonas(), null, null, 1));
					spinnerGenteMax_2.setModel(new SpinnerNumberModel(rutaAuxiliar.getNumeroMaximoPersonas(), null, null, 1));
					spinnerHoraInicio_2.setModel(new SpinnerNumberModel(rutaAuxiliar.getHoraInicio(), null, null, 1));
					spinnerHoraFin_2.setModel(new SpinnerNumberModel(rutaAuxiliar.getHoraFinal(), null, null, 1));
					Image imagenOriginal;
					
					File file = new File(rutaAuxiliar.getPathImagenRuta());
					try {
						imagenOriginal = ImageIO.read(file);

						Image imagenEscalada = imagenOriginal.getScaledInstance(lblFoto_2.getWidth(), lblFoto_2.getHeight(),
								java.awt.Image.SCALE_SMOOTH);
						ImageIcon iconoLabel = new ImageIcon(imagenEscalada);
						lblFoto_2.setIcon(iconoLabel);
					} catch (IOException a) {
						a.printStackTrace();
					}
				}
			}
		}
	}
}
