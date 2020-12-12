package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.SpinnerNumberModel;
import java.awt.Toolkit;

public class UI_Rutas extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panelInfoRuta;
	private JTabbedPane tabbedPane;
	private JPanel Faciles;
	private JPanel Intermedias;
	private JPanel Dificiles;
	private JComboBox cbNombre;
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
	private JList listMonitores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_Rutas frame = new UI_Rutas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI_Rutas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_Rutas.class.getResource("/recursos/logo.png")));
		setTitle("Gestor Los Olivos - Rutas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panel = new JPanel();
			contentPane.add(panel, BorderLayout.CENTER);
			panel.setLayout(new CardLayout(0, 0));
			{
				panelInfoRuta = new JPanel();
				panel.add(panelInfoRuta, "name_835350581030900");
				panelInfoRuta.setLayout(new BorderLayout(0, 0));
				{
					tabbedPane = new JTabbedPane(JTabbedPane.TOP);
					panelInfoRuta.add(tabbedPane, BorderLayout.CENTER);
					{
						Faciles = new JPanel();
						tabbedPane.addTab("F\u00E1ciles", null, Faciles, null);
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
							cbNombre = new JComboBox();
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
							spinnerHoraInicio.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
							GridBagConstraints gbc_spinnerHoraInicio = new GridBagConstraints();
							gbc_spinnerHoraInicio.anchor = GridBagConstraints.WEST;
							gbc_spinnerHoraInicio.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerHoraInicio.gridx = 3;
							gbc_spinnerHoraInicio.gridy = 4;
							Faciles.add(spinnerHoraInicio, gbc_spinnerHoraInicio);
						}
						{
							spinnerHoraFin = new JSpinner();
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
							GridBagConstraints gbc_spinnerGenteMin = new GridBagConstraints();
							gbc_spinnerGenteMin.anchor = GridBagConstraints.WEST;
							gbc_spinnerGenteMin.insets = new Insets(0, 0, 5, 5);
							gbc_spinnerGenteMin.gridx = 3;
							gbc_spinnerGenteMin.gridy = 7;
							Faciles.add(spinnerGenteMin, gbc_spinnerGenteMin);
						}
						{
							spinnerGenteMax = new JSpinner();
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
							listMonitores = new JList();
							GridBagConstraints gbc_listMonitores = new GridBagConstraints();
							gbc_listMonitores.gridheight = 2;
							gbc_listMonitores.gridwidth = 4;
							gbc_listMonitores.insets = new Insets(0, 0, 5, 5);
							gbc_listMonitores.fill = GridBagConstraints.BOTH;
							gbc_listMonitores.gridx = 1;
							gbc_listMonitores.gridy = 10;
							Faciles.add(listMonitores, gbc_listMonitores);
						}
						{
							lblDescripcion = new JLabel("Descripcion:");
							GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
							gbc_lblDescripcion.anchor = GridBagConstraints.WEST;
							gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
							gbc_lblDescripcion.gridx = 1;
							gbc_lblDescripcion.gridy = 13;
							Faciles.add(lblDescripcion, gbc_lblDescripcion);
						}
						{
							txtDescripcion = new JTextArea();
							txtDescripcion.setEditable(false);
							GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
							gbc_txtDescripcion.gridheight = 2;
							gbc_txtDescripcion.gridwidth = 7;
							gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
							gbc_txtDescripcion.fill = GridBagConstraints.BOTH;
							gbc_txtDescripcion.gridx = 1;
							gbc_txtDescripcion.gridy = 14;
							Faciles.add(txtDescripcion, gbc_txtDescripcion);
						}
					}
					{
						Intermedias = new JPanel();
						tabbedPane.addTab("Intermedias", null, Intermedias, null);
					}
					{
						Dificiles = new JPanel();
						tabbedPane.addTab("Dif\u00EDciles", null, Dificiles, null);
					}
				}
			}
		}
	}

}
