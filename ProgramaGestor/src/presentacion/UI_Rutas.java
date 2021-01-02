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
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;

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
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_3;
	private JPanel panel_2;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;

	/**
	 * Create the frame.
	 */
	public UI_Rutas() {
		setResizable(false);
		addWindowListener(new ThisWindowListener());
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_Rutas.class.getResource("/recursos/logo.png"))); //$NON-NLS-1$
		setTitle(MessagesUI_Rutas.getString("UI_Rutas.this.title")); //$NON-NLS-1$
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 905, 624);
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
						tabbedPaneRutas.addTab(MessagesUI_Rutas.getString("UI_Rutas.1"), null, Faciles, null); //$NON-NLS-1$
						GridBagLayout gbl_Faciles = new GridBagLayout();
						gbl_Faciles.columnWidths = new int[]{0, 0, 0, 90, 78, 0, 0, 0, 0, 0};
						gbl_Faciles.rowHeights = new int[]{0, 0, 0, 0, 0, 36, 0, 0, 29, 0, 30, 38, 0, 0, 0, 0, 0};
						gbl_Faciles.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
						gbl_Faciles.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
						Faciles.setLayout(gbl_Faciles);
						{
							panel = new JPanel();
							panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Rutas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
							GridBagConstraints gbc_panel = new GridBagConstraints();
							gbc_panel.gridwidth = 4;
							gbc_panel.insets = new Insets(0, 0, 5, 5);
							gbc_panel.fill = GridBagConstraints.BOTH;
							gbc_panel.gridx = 1;
							gbc_panel.gridy = 1;
							Faciles.add(panel, gbc_panel);
							{
								lblNombre = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblNombre.text"));
								lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
								panel.add(lblNombre);
							}
							{
								cbNombre = new JComboBox<String>();
								panel.add(cbNombre);
								cbNombre.addItemListener(new CbNombreItemListener());
							}
						}
						{
							lblDificultad = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblDificultad.text")); //$NON-NLS-1$
							lblDificultad.setFont(new Font("Tahoma", Font.BOLD, 22));
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
							panel_1 = new JPanel();
							panel_1.setBorder(new TitledBorder(null, "Fecha y Hora", TitledBorder.LEADING, TitledBorder.TOP, null, null));
							GridBagConstraints gbc_panel_1 = new GridBagConstraints();
							gbc_panel_1.gridheight = 2;
							gbc_panel_1.gridwidth = 4;
							gbc_panel_1.insets = new Insets(0, 0, 5, 5);
							gbc_panel_1.fill = GridBagConstraints.BOTH;
							gbc_panel_1.gridx = 1;
							gbc_panel_1.gridy = 3;
							Faciles.add(panel_1, gbc_panel_1);
							GridBagLayout gbl_panel_1 = new GridBagLayout();
							gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
							gbl_panel_1.rowHeights = new int[]{0, 0, 0};
							gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
							gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
							panel_1.setLayout(gbl_panel_1);
							{
								lblFechal = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblFechal.text"));
								GridBagConstraints gbc_lblFechal = new GridBagConstraints();
								gbc_lblFechal.insets = new Insets(0, 0, 5, 5);
								gbc_lblFechal.gridx = 0;
								gbc_lblFechal.gridy = 0;
								panel_1.add(lblFechal, gbc_lblFechal);
							}
							{
								lblHoraInicio = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblHoraInicio.text"));
								GridBagConstraints gbc_lblHoraInicio = new GridBagConstraints();
								gbc_lblHoraInicio.insets = new Insets(0, 0, 5, 5);
								gbc_lblHoraInicio.gridx = 6;
								gbc_lblHoraInicio.gridy = 0;
								panel_1.add(lblHoraInicio, gbc_lblHoraInicio);
							}
							{
								lblHoraFin = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblHoraFin.text"));
								GridBagConstraints gbc_lblHoraFin = new GridBagConstraints();
								gbc_lblHoraFin.insets = new Insets(0, 0, 5, 5);
								gbc_lblHoraFin.gridx = 8;
								gbc_lblHoraFin.gridy = 0;
								panel_1.add(lblHoraFin, gbc_lblHoraFin);
							}
							{
								txtFecha = new JTextPane();
								GridBagConstraints gbc_txtFecha = new GridBagConstraints();
								gbc_txtFecha.fill = GridBagConstraints.BOTH;
								gbc_txtFecha.gridwidth = 5;
								gbc_txtFecha.insets = new Insets(0, 0, 0, 5);
								gbc_txtFecha.gridx = 0;
								gbc_txtFecha.gridy = 1;
								panel_1.add(txtFecha, gbc_txtFecha);
								txtFecha.setEditable(false);
							}
							{
								spinnerHoraInicio = new JSpinner();
								GridBagConstraints gbc_spinnerHoraInicio = new GridBagConstraints();
								gbc_spinnerHoraInicio.fill = GridBagConstraints.BOTH;
								gbc_spinnerHoraInicio.insets = new Insets(0, 0, 0, 5);
								gbc_spinnerHoraInicio.gridx = 6;
								gbc_spinnerHoraInicio.gridy = 1;
								panel_1.add(spinnerHoraInicio, gbc_spinnerHoraInicio);
								spinnerHoraInicio.setEnabled(false);
								spinnerHoraInicio.setModel(new SpinnerNumberModel(0, null, null, 1));
							}
							{
								spinnerHoraFin = new JSpinner();
								GridBagConstraints gbc_spinnerHoraFin = new GridBagConstraints();
								gbc_spinnerHoraFin.fill = GridBagConstraints.BOTH;
								gbc_spinnerHoraFin.insets = new Insets(0, 0, 0, 5);
								gbc_spinnerHoraFin.gridx = 8;
								gbc_spinnerHoraFin.gridy = 1;
								panel_1.add(spinnerHoraFin, gbc_spinnerHoraFin);
								spinnerHoraFin.setEnabled(false);
							}
						}
						{
							lblFoto = new JLabel("");
							lblFoto.setBorder(new TitledBorder(null, "Foto Ruta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
							GridBagConstraints gbc_lblFoto = new GridBagConstraints();
							gbc_lblFoto.gridheight = 8;
							gbc_lblFoto.gridwidth = 2;
							gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
							gbc_lblFoto.gridx = 6;
							gbc_lblFoto.gridy = 2;
							Faciles.add(lblFoto, gbc_lblFoto);
							lblFoto.setIcon(new ImageIcon(UI_Rutas.class.getResource("/recursos/location-pin@3x.png")));
						}
						{
							panel_3 = new JPanel();
							panel_3.setBorder(new TitledBorder(null, "Datos de Ruta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
							GridBagConstraints gbc_panel_3 = new GridBagConstraints();
							gbc_panel_3.gridheight = 4;
							gbc_panel_3.gridwidth = 4;
							gbc_panel_3.insets = new Insets(0, 0, 5, 5);
							gbc_panel_3.fill = GridBagConstraints.BOTH;
							gbc_panel_3.gridx = 1;
							gbc_panel_3.gridy = 6;
							Faciles.add(panel_3, gbc_panel_3);
							GridBagLayout gbl_panel_3 = new GridBagLayout();
							gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
							gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0};
							gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
							gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
							panel_3.setLayout(gbl_panel_3);
							{
								lblPuntoEncuentro = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblPuntoEncuentro.text"));
								GridBagConstraints gbc_lblPuntoEncuentro = new GridBagConstraints();
								gbc_lblPuntoEncuentro.insets = new Insets(0, 0, 5, 5);
								gbc_lblPuntoEncuentro.gridx = 0;
								gbc_lblPuntoEncuentro.gridy = 0;
								panel_3.add(lblPuntoEncuentro, gbc_lblPuntoEncuentro);
							}
							{
								lblGenteMin = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblGenteMin.text"));
								GridBagConstraints gbc_lblGenteMin = new GridBagConstraints();
								gbc_lblGenteMin.insets = new Insets(0, 0, 5, 5);
								gbc_lblGenteMin.gridx = 7;
								gbc_lblGenteMin.gridy = 0;
								panel_3.add(lblGenteMin, gbc_lblGenteMin);
							}
							{
								lblGenteMax = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblGenteMax.text"));
								GridBagConstraints gbc_lblGenteMax = new GridBagConstraints();
								gbc_lblGenteMax.insets = new Insets(0, 0, 5, 5);
								gbc_lblGenteMax.gridx = 9;
								gbc_lblGenteMax.gridy = 0;
								panel_3.add(lblGenteMax, gbc_lblGenteMax);
							}
							{
								txtEncuentro = new JTextPane();
								GridBagConstraints gbc_txtEncuentro = new GridBagConstraints();
								gbc_txtEncuentro.fill = GridBagConstraints.BOTH;
								gbc_txtEncuentro.gridwidth = 6;
								gbc_txtEncuentro.insets = new Insets(0, 0, 5, 5);
								gbc_txtEncuentro.gridx = 0;
								gbc_txtEncuentro.gridy = 1;
								panel_3.add(txtEncuentro, gbc_txtEncuentro);
								txtEncuentro.setEditable(false);
							}
							{
								spinnerGenteMin = new JSpinner();
								GridBagConstraints gbc_spinnerGenteMin = new GridBagConstraints();
								gbc_spinnerGenteMin.fill = GridBagConstraints.BOTH;
								gbc_spinnerGenteMin.insets = new Insets(0, 0, 5, 5);
								gbc_spinnerGenteMin.gridx = 7;
								gbc_spinnerGenteMin.gridy = 1;
								panel_3.add(spinnerGenteMin, gbc_spinnerGenteMin);
								spinnerGenteMin.setEnabled(false);
							}
							{
								spinnerGenteMax = new JSpinner();
								GridBagConstraints gbc_spinnerGenteMax = new GridBagConstraints();
								gbc_spinnerGenteMax.fill = GridBagConstraints.BOTH;
								gbc_spinnerGenteMax.insets = new Insets(0, 0, 5, 5);
								gbc_spinnerGenteMax.gridx = 9;
								gbc_spinnerGenteMax.gridy = 1;
								panel_3.add(spinnerGenteMax, gbc_spinnerGenteMax);
								spinnerGenteMax.setEnabled(false);
							}
							{
								lblListaMonitores = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblListaMonitores.text"));
								GridBagConstraints gbc_lblListaMonitores = new GridBagConstraints();
								gbc_lblListaMonitores.insets = new Insets(0, 0, 5, 5);
								gbc_lblListaMonitores.gridx = 0;
								gbc_lblListaMonitores.gridy = 2;
								panel_3.add(lblListaMonitores, gbc_lblListaMonitores);
							}
							{
								txtMonitores = new JTextField();
								GridBagConstraints gbc_txtMonitores = new GridBagConstraints();
								gbc_txtMonitores.fill = GridBagConstraints.BOTH;
								gbc_txtMonitores.gridwidth = 6;
								gbc_txtMonitores.insets = new Insets(0, 0, 0, 5);
								gbc_txtMonitores.gridx = 0;
								gbc_txtMonitores.gridy = 3;
								panel_3.add(txtMonitores, gbc_txtMonitores);
								txtMonitores.setColumns(10);
							}
						}
						{
							lblDescripcion = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblDescripcion.text")); //$NON-NLS-1$
							GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
							gbc_lblDescripcion.anchor = GridBagConstraints.WEST;
							gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
							gbc_lblDescripcion.gridx = 1;
							gbc_lblDescripcion.gridy = 10;
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
							gbc_txtDescripcion.gridy = 11;
							Faciles.add(txtDescripcion, gbc_txtDescripcion);
						}
					}
					{
						Intermedias = new JPanel();
						Intermedias.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
						tabbedPaneRutas.addTab(MessagesUI_Rutas.getString("UI_Rutas.4"), null, Intermedias, null); //$NON-NLS-1$
						GridBagLayout gbl_Intermedias = new GridBagLayout();
						gbl_Intermedias.columnWidths = new int[]{0, 0, 0, 90, 78, 0, 0, 0, 0, 0};
						gbl_Intermedias.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 47, 38, 0, 0, 0, 0};
						gbl_Intermedias.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
						gbl_Intermedias.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
						Intermedias.setLayout(gbl_Intermedias);
						{
							panel_2 = new JPanel();
							panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Rutas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
							GridBagConstraints gbc_panel_2 = new GridBagConstraints();
							gbc_panel_2.gridwidth = 4;
							gbc_panel_2.insets = new Insets(0, 0, 5, 5);
							gbc_panel_2.fill = GridBagConstraints.BOTH;
							gbc_panel_2.gridx = 1;
							gbc_panel_2.gridy = 1;
							Intermedias.add(panel_2, gbc_panel_2);
							{
								lblNombre_1 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblNombre_1.text"));
								panel_2.add(lblNombre_1);
							}
							{
								cbNombre_1 = new JComboBox<String>();
								panel_2.add(cbNombre_1);
								cbNombre_1.addItemListener(new CbNombre_1ItemListener());
							}
						}
						{
							lblIntermedia = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblIntermedia.text")); //$NON-NLS-1$
							lblIntermedia.setFont(new Font("Tahoma", Font.BOLD, 22));
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
							panel_4 = new JPanel();
							panel_4.setBorder(new TitledBorder(null, "Fecha y Hora", TitledBorder.LEADING, TitledBorder.TOP, null, null));
							GridBagConstraints gbc_panel_4 = new GridBagConstraints();
							gbc_panel_4.gridheight = 2;
							gbc_panel_4.gridwidth = 4;
							gbc_panel_4.insets = new Insets(0, 0, 5, 5);
							gbc_panel_4.fill = GridBagConstraints.BOTH;
							gbc_panel_4.gridx = 1;
							gbc_panel_4.gridy = 3;
							Intermedias.add(panel_4, gbc_panel_4);
							GridBagLayout gbl_panel_4 = new GridBagLayout();
							gbl_panel_4.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
							gbl_panel_4.rowHeights = new int[]{0, 0, 0};
							gbl_panel_4.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
							gbl_panel_4.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
							panel_4.setLayout(gbl_panel_4);
							{
								lblFechal_1 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblFechal_1.text"));
								GridBagConstraints gbc_lblFechal_1 = new GridBagConstraints();
								gbc_lblFechal_1.insets = new Insets(0, 0, 5, 5);
								gbc_lblFechal_1.gridx = 0;
								gbc_lblFechal_1.gridy = 0;
								panel_4.add(lblFechal_1, gbc_lblFechal_1);
							}
							{
								lblHoraInicio_1 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblHoraInicio_1.text"));
								GridBagConstraints gbc_lblHoraInicio_1 = new GridBagConstraints();
								gbc_lblHoraInicio_1.insets = new Insets(0, 0, 5, 5);
								gbc_lblHoraInicio_1.gridx = 6;
								gbc_lblHoraInicio_1.gridy = 0;
								panel_4.add(lblHoraInicio_1, gbc_lblHoraInicio_1);
							}
							{
								lblHoraFin_1 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblHoraFin_1.text"));
								GridBagConstraints gbc_lblHoraFin_1 = new GridBagConstraints();
								gbc_lblHoraFin_1.insets = new Insets(0, 0, 5, 5);
								gbc_lblHoraFin_1.gridx = 8;
								gbc_lblHoraFin_1.gridy = 0;
								panel_4.add(lblHoraFin_1, gbc_lblHoraFin_1);
							}
							{
								txtFecha_1 = new JTextPane();
								GridBagConstraints gbc_txtFecha_1 = new GridBagConstraints();
								gbc_txtFecha_1.fill = GridBagConstraints.BOTH;
								gbc_txtFecha_1.gridwidth = 5;
								gbc_txtFecha_1.insets = new Insets(0, 0, 0, 5);
								gbc_txtFecha_1.gridx = 0;
								gbc_txtFecha_1.gridy = 1;
								panel_4.add(txtFecha_1, gbc_txtFecha_1);
								txtFecha_1.setEditable(false);
							}
							{
								spinnerHoraInicio_1 = new JSpinner();
								GridBagConstraints gbc_spinnerHoraInicio_1 = new GridBagConstraints();
								gbc_spinnerHoraInicio_1.insets = new Insets(0, 0, 0, 5);
								gbc_spinnerHoraInicio_1.gridx = 6;
								gbc_spinnerHoraInicio_1.gridy = 1;
								panel_4.add(spinnerHoraInicio_1, gbc_spinnerHoraInicio_1);
								spinnerHoraInicio_1.setEnabled(false);
							}
							{
								spinnerHoraFin_1 = new JSpinner();
								GridBagConstraints gbc_spinnerHoraFin_1 = new GridBagConstraints();
								gbc_spinnerHoraFin_1.insets = new Insets(0, 0, 0, 5);
								gbc_spinnerHoraFin_1.gridx = 8;
								gbc_spinnerHoraFin_1.gridy = 1;
								panel_4.add(spinnerHoraFin_1, gbc_spinnerHoraFin_1);
								spinnerHoraFin_1.setEnabled(false);
							}
						}
						{
							panel_5 = new JPanel();
							panel_5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Foto Ruta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
							GridBagConstraints gbc_panel_5 = new GridBagConstraints();
							gbc_panel_5.gridheight = 8;
							gbc_panel_5.gridwidth = 2;
							gbc_panel_5.insets = new Insets(0, 0, 5, 5);
							gbc_panel_5.gridx = 6;
							gbc_panel_5.gridy = 2;
							Intermedias.add(panel_5, gbc_panel_5);
							{
								lblFoto_1 = new JLabel(""); //$NON-NLS-1$
								panel_5.add(lblFoto_1);
								lblFoto_1.setIcon(new ImageIcon(UI_Rutas.class.getResource("/recursos/location-pin@3x.png")));
							}
						}
						{
							panel_6 = new JPanel();
							panel_6.setBorder(new TitledBorder(null, "Datos de Ruta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
							GridBagConstraints gbc_panel_6 = new GridBagConstraints();
							gbc_panel_6.gridheight = 4;
							gbc_panel_6.gridwidth = 4;
							gbc_panel_6.insets = new Insets(0, 0, 5, 5);
							gbc_panel_6.fill = GridBagConstraints.BOTH;
							gbc_panel_6.gridx = 1;
							gbc_panel_6.gridy = 6;
							Intermedias.add(panel_6, gbc_panel_6);
							GridBagLayout gbl_panel_6 = new GridBagLayout();
							gbl_panel_6.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
							gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0, 0};
							gbl_panel_6.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
							gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
							panel_6.setLayout(gbl_panel_6);
							{
								lblPuntoEncuentro_1 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblPuntoEncuentro_1.text"));
								GridBagConstraints gbc_lblPuntoEncuentro_1 = new GridBagConstraints();
								gbc_lblPuntoEncuentro_1.insets = new Insets(0, 0, 5, 5);
								gbc_lblPuntoEncuentro_1.gridx = 0;
								gbc_lblPuntoEncuentro_1.gridy = 0;
								panel_6.add(lblPuntoEncuentro_1, gbc_lblPuntoEncuentro_1);
							}
							{
								lblGenteMin_1 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblGenteMin_1.text"));
								GridBagConstraints gbc_lblGenteMin_1 = new GridBagConstraints();
								gbc_lblGenteMin_1.insets = new Insets(0, 0, 5, 5);
								gbc_lblGenteMin_1.gridx = 7;
								gbc_lblGenteMin_1.gridy = 0;
								panel_6.add(lblGenteMin_1, gbc_lblGenteMin_1);
							}
							{
								lblGenteMax_1 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblGenteMax_1.text"));
								GridBagConstraints gbc_lblGenteMax_1 = new GridBagConstraints();
								gbc_lblGenteMax_1.insets = new Insets(0, 0, 5, 5);
								gbc_lblGenteMax_1.gridx = 9;
								gbc_lblGenteMax_1.gridy = 0;
								panel_6.add(lblGenteMax_1, gbc_lblGenteMax_1);
							}
							{
								txtEncuentro_1 = new JTextPane();
								GridBagConstraints gbc_txtEncuentro_1 = new GridBagConstraints();
								gbc_txtEncuentro_1.fill = GridBagConstraints.BOTH;
								gbc_txtEncuentro_1.gridwidth = 6;
								gbc_txtEncuentro_1.insets = new Insets(0, 0, 5, 5);
								gbc_txtEncuentro_1.gridx = 0;
								gbc_txtEncuentro_1.gridy = 1;
								panel_6.add(txtEncuentro_1, gbc_txtEncuentro_1);
								txtEncuentro_1.setEditable(false);
							}
							{
								spinnerGenteMin_1 = new JSpinner();
								GridBagConstraints gbc_spinnerGenteMin_1 = new GridBagConstraints();
								gbc_spinnerGenteMin_1.fill = GridBagConstraints.BOTH;
								gbc_spinnerGenteMin_1.insets = new Insets(0, 0, 5, 5);
								gbc_spinnerGenteMin_1.gridx = 7;
								gbc_spinnerGenteMin_1.gridy = 1;
								panel_6.add(spinnerGenteMin_1, gbc_spinnerGenteMin_1);
								spinnerGenteMin_1.setEnabled(false);
							}
							{
								spinnerGenteMax_1 = new JSpinner();
								GridBagConstraints gbc_spinnerGenteMax_1 = new GridBagConstraints();
								gbc_spinnerGenteMax_1.fill = GridBagConstraints.BOTH;
								gbc_spinnerGenteMax_1.insets = new Insets(0, 0, 5, 5);
								gbc_spinnerGenteMax_1.gridx = 9;
								gbc_spinnerGenteMax_1.gridy = 1;
								panel_6.add(spinnerGenteMax_1, gbc_spinnerGenteMax_1);
								spinnerGenteMax_1.setEnabled(false);
							}
							{
								lblListaMonitores_1 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblListaMonitores_1.text"));
								GridBagConstraints gbc_lblListaMonitores_1 = new GridBagConstraints();
								gbc_lblListaMonitores_1.insets = new Insets(0, 0, 5, 5);
								gbc_lblListaMonitores_1.gridx = 0;
								gbc_lblListaMonitores_1.gridy = 2;
								panel_6.add(lblListaMonitores_1, gbc_lblListaMonitores_1);
							}
							{
								textMonitores_1 = new JTextField();
								GridBagConstraints gbc_textMonitores_1 = new GridBagConstraints();
								gbc_textMonitores_1.fill = GridBagConstraints.BOTH;
								gbc_textMonitores_1.gridwidth = 6;
								gbc_textMonitores_1.insets = new Insets(0, 0, 0, 5);
								gbc_textMonitores_1.gridx = 0;
								gbc_textMonitores_1.gridy = 3;
								panel_6.add(textMonitores_1, gbc_textMonitores_1);
								textMonitores_1.setColumns(10);
							}
						}
						{
							lblDescripcion_1 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblDescripcion_1.text")); //$NON-NLS-1$
							GridBagConstraints gbc_lblDescripcion_1 = new GridBagConstraints();
							gbc_lblDescripcion_1.anchor = GridBagConstraints.WEST;
							gbc_lblDescripcion_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblDescripcion_1.gridx = 1;
							gbc_lblDescripcion_1.gridy = 10;
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
							gbc_txtDescripcion_1.gridy = 11;
							Intermedias.add(txtDescripcion_1, gbc_txtDescripcion_1);
						}
					}
					{
						Dificiles = new JPanel();
						Dificiles.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
						tabbedPaneRutas.addTab(MessagesUI_Rutas.getString("UI_Rutas.7"), null, Dificiles, null); //$NON-NLS-1$
						GridBagLayout gbl_Dificiles = new GridBagLayout();
						gbl_Dificiles.columnWidths = new int[]{0, 0, 0, 90, 78, 0, 0, 0, 0, 0};
						gbl_Dificiles.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 47, 38, 0, 0, 0, 0};
						gbl_Dificiles.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
						gbl_Dificiles.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
						Dificiles.setLayout(gbl_Dificiles);
						{
							panel_7 = new JPanel();
							panel_7.setBorder(new TitledBorder(null, "Rutas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
							GridBagConstraints gbc_panel_7 = new GridBagConstraints();
							gbc_panel_7.gridwidth = 4;
							gbc_panel_7.insets = new Insets(0, 0, 5, 5);
							gbc_panel_7.fill = GridBagConstraints.BOTH;
							gbc_panel_7.gridx = 1;
							gbc_panel_7.gridy = 1;
							Dificiles.add(panel_7, gbc_panel_7);
							{
								lblNombre_2 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblNombre_2.text"));
								panel_7.add(lblNombre_2);
							}
							{
								cbNombre_2 = new JComboBox<String>();
								panel_7.add(cbNombre_2);
								cbNombre_2.addItemListener(new CbNombre_2ItemListener());
							}
						}
						{
							lblDificil = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblDificil.text")); //$NON-NLS-1$
							lblDificil.setFont(new Font("Tahoma", Font.BOLD, 22));
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
							panel_8 = new JPanel();
							panel_8.setBorder(new TitledBorder(null, "Foto Ruta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
							GridBagConstraints gbc_panel_8 = new GridBagConstraints();
							gbc_panel_8.gridheight = 8;
							gbc_panel_8.gridwidth = 2;
							gbc_panel_8.insets = new Insets(0, 0, 5, 5);
							gbc_panel_8.gridx = 6;
							gbc_panel_8.gridy = 2;
							Dificiles.add(panel_8, gbc_panel_8);
							{
								lblFoto_2 = new JLabel(""); //$NON-NLS-1$
								panel_8.add(lblFoto_2);
								lblFoto_2.setIcon(new ImageIcon(UI_Rutas.class.getResource("/recursos/location-pin@3x.png")));
							}
						}
						{
							panel_9 = new JPanel();
							GridBagConstraints gbc_panel_9 = new GridBagConstraints();
							gbc_panel_9.gridheight = 2;
							gbc_panel_9.gridwidth = 4;
							gbc_panel_9.insets = new Insets(0, 0, 5, 5);
							gbc_panel_9.fill = GridBagConstraints.BOTH;
							gbc_panel_9.gridx = 1;
							gbc_panel_9.gridy = 3;
							Dificiles.add(panel_9, gbc_panel_9);
							GridBagLayout gbl_panel_9 = new GridBagLayout();
							gbl_panel_9.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
							gbl_panel_9.rowHeights = new int[]{0, 0, 0};
							gbl_panel_9.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
							gbl_panel_9.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
							panel_9.setLayout(gbl_panel_9);
							{
								lblFechal_2 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblFechal_2.text"));
								GridBagConstraints gbc_lblFechal_2 = new GridBagConstraints();
								gbc_lblFechal_2.insets = new Insets(0, 0, 5, 5);
								gbc_lblFechal_2.gridx = 0;
								gbc_lblFechal_2.gridy = 0;
								panel_9.add(lblFechal_2, gbc_lblFechal_2);
							}
							{
								lblHoraInicio_2 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblHoraInicio_2.text"));
								GridBagConstraints gbc_lblHoraInicio_2 = new GridBagConstraints();
								gbc_lblHoraInicio_2.insets = new Insets(0, 0, 5, 5);
								gbc_lblHoraInicio_2.gridx = 6;
								gbc_lblHoraInicio_2.gridy = 0;
								panel_9.add(lblHoraInicio_2, gbc_lblHoraInicio_2);
							}
							{
								lblHoraFin_2 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblHoraFin_2.text"));
								GridBagConstraints gbc_lblHoraFin_2 = new GridBagConstraints();
								gbc_lblHoraFin_2.insets = new Insets(0, 0, 5, 5);
								gbc_lblHoraFin_2.gridx = 8;
								gbc_lblHoraFin_2.gridy = 0;
								panel_9.add(lblHoraFin_2, gbc_lblHoraFin_2);
							}
							{
								txtFecha_2 = new JTextPane();
								GridBagConstraints gbc_txtFecha_2 = new GridBagConstraints();
								gbc_txtFecha_2.fill = GridBagConstraints.BOTH;
								gbc_txtFecha_2.insets = new Insets(0, 0, 0, 5);
								gbc_txtFecha_2.gridwidth = 5;
								gbc_txtFecha_2.gridx = 0;
								gbc_txtFecha_2.gridy = 1;
								panel_9.add(txtFecha_2, gbc_txtFecha_2);
								txtFecha_2.setEditable(false);
							}
							{
								spinnerHoraInicio_2 = new JSpinner();
								GridBagConstraints gbc_spinnerHoraInicio_2 = new GridBagConstraints();
								gbc_spinnerHoraInicio_2.fill = GridBagConstraints.HORIZONTAL;
								gbc_spinnerHoraInicio_2.insets = new Insets(0, 0, 0, 5);
								gbc_spinnerHoraInicio_2.gridx = 6;
								gbc_spinnerHoraInicio_2.gridy = 1;
								panel_9.add(spinnerHoraInicio_2, gbc_spinnerHoraInicio_2);
								spinnerHoraInicio_2.setEnabled(false);
							}
							{
								spinnerHoraFin_2 = new JSpinner();
								GridBagConstraints gbc_spinnerHoraFin_2 = new GridBagConstraints();
								gbc_spinnerHoraFin_2.fill = GridBagConstraints.HORIZONTAL;
								gbc_spinnerHoraFin_2.insets = new Insets(0, 0, 0, 5);
								gbc_spinnerHoraFin_2.gridx = 8;
								gbc_spinnerHoraFin_2.gridy = 1;
								panel_9.add(spinnerHoraFin_2, gbc_spinnerHoraFin_2);
								spinnerHoraFin_2.setEnabled(false);
							}
						}
						{
							panel_10 = new JPanel();
							GridBagConstraints gbc_panel_10 = new GridBagConstraints();
							gbc_panel_10.gridheight = 4;
							gbc_panel_10.gridwidth = 4;
							gbc_panel_10.insets = new Insets(0, 0, 5, 5);
							gbc_panel_10.fill = GridBagConstraints.BOTH;
							gbc_panel_10.gridx = 1;
							gbc_panel_10.gridy = 6;
							Dificiles.add(panel_10, gbc_panel_10);
							GridBagLayout gbl_panel_10 = new GridBagLayout();
							gbl_panel_10.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
							gbl_panel_10.rowHeights = new int[]{0, 0, 0, 0, 0};
							gbl_panel_10.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
							gbl_panel_10.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
							panel_10.setLayout(gbl_panel_10);
							{
								lblPuntoEncuentro_2 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblPuntoEncuentro_2.text"));
								GridBagConstraints gbc_lblPuntoEncuentro_2 = new GridBagConstraints();
								gbc_lblPuntoEncuentro_2.insets = new Insets(0, 0, 5, 5);
								gbc_lblPuntoEncuentro_2.gridx = 0;
								gbc_lblPuntoEncuentro_2.gridy = 0;
								panel_10.add(lblPuntoEncuentro_2, gbc_lblPuntoEncuentro_2);
							}
							{
								lblGenteMin_2 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblGenteMin_2.text"));
								GridBagConstraints gbc_lblGenteMin_2 = new GridBagConstraints();
								gbc_lblGenteMin_2.insets = new Insets(0, 0, 5, 5);
								gbc_lblGenteMin_2.gridx = 7;
								gbc_lblGenteMin_2.gridy = 0;
								panel_10.add(lblGenteMin_2, gbc_lblGenteMin_2);
							}
							{
								lblGenteMax_2 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblGenteMax_2.text"));
								GridBagConstraints gbc_lblGenteMax_2 = new GridBagConstraints();
								gbc_lblGenteMax_2.insets = new Insets(0, 0, 5, 5);
								gbc_lblGenteMax_2.gridx = 9;
								gbc_lblGenteMax_2.gridy = 0;
								panel_10.add(lblGenteMax_2, gbc_lblGenteMax_2);
							}
							{
								txtEncuentro_2 = new JTextPane();
								GridBagConstraints gbc_txtEncuentro_2 = new GridBagConstraints();
								gbc_txtEncuentro_2.fill = GridBagConstraints.BOTH;
								gbc_txtEncuentro_2.gridwidth = 6;
								gbc_txtEncuentro_2.insets = new Insets(0, 0, 5, 5);
								gbc_txtEncuentro_2.gridx = 0;
								gbc_txtEncuentro_2.gridy = 1;
								panel_10.add(txtEncuentro_2, gbc_txtEncuentro_2);
								txtEncuentro_2.setEditable(false);
							}
							{
								spinnerGenteMin_2 = new JSpinner();
								GridBagConstraints gbc_spinnerGenteMin_2 = new GridBagConstraints();
								gbc_spinnerGenteMin_2.fill = GridBagConstraints.HORIZONTAL;
								gbc_spinnerGenteMin_2.insets = new Insets(0, 0, 5, 5);
								gbc_spinnerGenteMin_2.gridx = 7;
								gbc_spinnerGenteMin_2.gridy = 1;
								panel_10.add(spinnerGenteMin_2, gbc_spinnerGenteMin_2);
								spinnerGenteMin_2.setEnabled(false);
							}
							{
								spinnerGenteMax_2 = new JSpinner();
								GridBagConstraints gbc_spinnerGenteMax_2 = new GridBagConstraints();
								gbc_spinnerGenteMax_2.fill = GridBagConstraints.HORIZONTAL;
								gbc_spinnerGenteMax_2.insets = new Insets(0, 0, 5, 5);
								gbc_spinnerGenteMax_2.gridx = 9;
								gbc_spinnerGenteMax_2.gridy = 1;
								panel_10.add(spinnerGenteMax_2, gbc_spinnerGenteMax_2);
								spinnerGenteMax_2.setEnabled(false);
							}
							{
								lblListaMonitores_2 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblListaMonitores_2.text"));
								GridBagConstraints gbc_lblListaMonitores_2 = new GridBagConstraints();
								gbc_lblListaMonitores_2.insets = new Insets(0, 0, 5, 5);
								gbc_lblListaMonitores_2.gridx = 0;
								gbc_lblListaMonitores_2.gridy = 2;
								panel_10.add(lblListaMonitores_2, gbc_lblListaMonitores_2);
							}
							{
								textMonitores_2 = new JTextField();
								GridBagConstraints gbc_textMonitores_2 = new GridBagConstraints();
								gbc_textMonitores_2.fill = GridBagConstraints.BOTH;
								gbc_textMonitores_2.gridwidth = 6;
								gbc_textMonitores_2.insets = new Insets(0, 0, 0, 5);
								gbc_textMonitores_2.gridx = 0;
								gbc_textMonitores_2.gridy = 3;
								panel_10.add(textMonitores_2, gbc_textMonitores_2);
								textMonitores_2.setColumns(10);
							}
						}
						{
							lblDescripcion_2 = new JLabel(MessagesUI_Rutas.getString("UI_Rutas.lblDescripcion_2.text")); //$NON-NLS-1$
							GridBagConstraints gbc_lblDescripcion_2 = new GridBagConstraints();
							gbc_lblDescripcion_2.anchor = GridBagConstraints.WEST;
							gbc_lblDescripcion_2.insets = new Insets(0, 0, 5, 5);
							gbc_lblDescripcion_2.gridx = 1;
							gbc_lblDescripcion_2.gridy = 10;
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
							gbc_txtDescripcion_2.gridy = 11;
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
