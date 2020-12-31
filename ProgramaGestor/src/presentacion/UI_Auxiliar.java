package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import dominio.Actividad;
import dominio.Monitor;
import lecturaEscritura.Reader;
import lecturaEscritura.Writer;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.Icon;

public class UI_Auxiliar extends JFrame {

	private static final long serialVersionUID = 1L;

	public static Monitor monitor;
	public static Actividad actividad;

	private JPanel contentPane;
	private JPanel panelFormularios;
	private JPanel panelBotones;
	private JPanel panelVer;
	private JPanel panelAnadir;
	private JPanel panelBorrar;
	private JPanel panelModificar;
	private JButton btnCancelar;
	private JButton btnAnadir;
	private JButton btnBorrar;
	private JButton btnCancelar2;
	private JButton btnModificar;
	private JButton btnCerrar;
	private JButton btnCancelar1;
	private JPanel panelMonitores;
	private JPanel panelActividad;
	private JLabel lblNombreMonitor;
	private JLabel lblApellido1Monitor;
	private JLabel lblFotoMonitor;
	private JTextField txtNombreMonitor;
	private JTextField txtApellido1Monitor;
	private JLabel lblApellido2Monitor;
	private JLabel lblTlfMonitor;
	private JLabel lblDniMonitor;
	private JLabel lblIdiomasMonitor;
	private JTextField txtApellido2Monitor;
	private JFormattedTextField formattedTextFieldTlfMonitor;
	private JFormattedTextField formattedTextFieldDniMonitor;
	private JLabel lblFormacionMonitor;
	private JTextField txtFormacion;
	private JLabel lblConfiguracionMonitor;
	private JLabel lblFotoMonitor2;
	private JTextField txtCorreoMonitor;
	private JLabel lblCorreoMonitor;

	public static int elegirPanel;
	public static int elegirFormulario;
	private JLabel lblConfiguracionActividad;
	private JLabel lblMonitoresActividades;
	private JLabel lblPrecio;
	private JTextField textFieldPrecioActividad;
	private JLabel lblHoraInicioActividad;
	private JSpinner spinnerInicioActividad;
	private JLabel lblHoraFinalActividad;
	private JSpinner spinnerFinalActividad;
	private JLabel lblDestinatariosActividad;
	private JPanel panelDestinatariosActividad;
	private JRadioButton rdbtnNinos;
	private JRadioButton rdbtnAdultos;
	private JRadioButton rdbtnAncianos;
	private JLabel lblCupoMaxActividad;
	private JLabel lblDescripcionActividad;
	private JScrollPane scrollPaneDescripcionActividad;
	private JTextPane txtDescripcionActividad;
	private JTextField textFieldCupoMaximoActividad;
	private JTextField textFieldMonitor;
	private JTextField txtIdiomas;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnAdjuntarImagen;

	/**
	 * Create the frame.
	 */
	public UI_Auxiliar() {

		monitor = new Monitor();
		actividad = new Actividad();

		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_Auxiliar.class.getResource("/recursos/logo.png"))); //$NON-NLS-1$
		setTitle(MessagesUI_Auxiliar.getString("UI_Auxiliar.this.title")); //$NON-NLS-1$
		setResizable(false);
		addWindowListener(new ThisWindowListener());
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 563, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panelFormularios = new JPanel();
			contentPane.add(panelFormularios, BorderLayout.CENTER);
			panelFormularios.setLayout(new CardLayout(0, 0));
			{
				panelMonitores = new JPanel();
				panelFormularios.add(panelMonitores, "Monitor"); //$NON-NLS-1$
				GridBagLayout gbl_panelMonitores = new GridBagLayout();
				gbl_panelMonitores.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panelMonitores.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panelMonitores.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
						Double.MIN_VALUE };
				gbl_panelMonitores.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0,
						1.0, Double.MIN_VALUE };
				panelMonitores.setLayout(gbl_panelMonitores);
				{
					lblConfiguracionMonitor = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblConfiguracionMonitor.text")); //$NON-NLS-1$
					lblConfiguracionMonitor.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
					GridBagConstraints gbc_lblConfiguracionMonitor = new GridBagConstraints();
					gbc_lblConfiguracionMonitor.anchor = GridBagConstraints.WEST;
					gbc_lblConfiguracionMonitor.gridwidth = 2;
					gbc_lblConfiguracionMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblConfiguracionMonitor.gridx = 1;
					gbc_lblConfiguracionMonitor.gridy = 1;
					panelMonitores.add(lblConfiguracionMonitor, gbc_lblConfiguracionMonitor);
				}
				{
					lblNombreMonitor = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblNombreMonitor.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblNombreMonitor = new GridBagConstraints();
					gbc_lblNombreMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblNombreMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblNombreMonitor.gridx = 1;
					gbc_lblNombreMonitor.gridy = 3;
					panelMonitores.add(lblNombreMonitor, gbc_lblNombreMonitor);
				}
				{
					txtNombreMonitor = new JTextField();
					GridBagConstraints gbc_txtNombreMonitor = new GridBagConstraints();
					gbc_txtNombreMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_txtNombreMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtNombreMonitor.gridx = 2;
					gbc_txtNombreMonitor.gridy = 3;
					panelMonitores.add(txtNombreMonitor, gbc_txtNombreMonitor);
					txtNombreMonitor.setColumns(10);
				}
				{
					lblFotoMonitor2 = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblFotoMonitor2.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblFotoMonitor2 = new GridBagConstraints();
					gbc_lblFotoMonitor2.insets = new Insets(0, 0, 5, 5);
					gbc_lblFotoMonitor2.gridx = 4;
					gbc_lblFotoMonitor2.gridy = 3;
					panelMonitores.add(lblFotoMonitor2, gbc_lblFotoMonitor2);
				}
				{
					lblFotoMonitor = new JLabel(""); //$NON-NLS-1$
					lblFotoMonitor.setIcon(new ImageIcon(UI_Auxiliar.class.getResource("/recursos/user.png"))); //$NON-NLS-1$
					GridBagConstraints gbc_lblFotoMonitor = new GridBagConstraints();
					gbc_lblFotoMonitor.gridheight = 4;
					gbc_lblFotoMonitor.gridwidth = 5;
					gbc_lblFotoMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblFotoMonitor.gridx = 5;
					gbc_lblFotoMonitor.gridy = 3;
					panelMonitores.add(lblFotoMonitor, gbc_lblFotoMonitor);
				}
				{
					lblApellido1Monitor = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblApellido1Monitor.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblApellido1Monitor = new GridBagConstraints();
					gbc_lblApellido1Monitor.anchor = GridBagConstraints.EAST;
					gbc_lblApellido1Monitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblApellido1Monitor.gridx = 1;
					gbc_lblApellido1Monitor.gridy = 4;
					panelMonitores.add(lblApellido1Monitor, gbc_lblApellido1Monitor);
				}
				{
					txtApellido1Monitor = new JTextField();
					GridBagConstraints gbc_txtApellido1Monitor = new GridBagConstraints();
					gbc_txtApellido1Monitor.insets = new Insets(0, 0, 5, 5);
					gbc_txtApellido1Monitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtApellido1Monitor.gridx = 2;
					gbc_txtApellido1Monitor.gridy = 4;
					panelMonitores.add(txtApellido1Monitor, gbc_txtApellido1Monitor);
					txtApellido1Monitor.setColumns(10);
				}
				{
					lblApellido2Monitor = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblApellido2Monitor.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblApellido2Monitor = new GridBagConstraints();
					gbc_lblApellido2Monitor.anchor = GridBagConstraints.EAST;
					gbc_lblApellido2Monitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblApellido2Monitor.gridx = 1;
					gbc_lblApellido2Monitor.gridy = 5;
					panelMonitores.add(lblApellido2Monitor, gbc_lblApellido2Monitor);
				}
				{
					txtApellido2Monitor = new JTextField();
					GridBagConstraints gbc_txtApellido2Monitor = new GridBagConstraints();
					gbc_txtApellido2Monitor.insets = new Insets(0, 0, 5, 5);
					gbc_txtApellido2Monitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtApellido2Monitor.gridx = 2;
					gbc_txtApellido2Monitor.gridy = 5;
					panelMonitores.add(txtApellido2Monitor, gbc_txtApellido2Monitor);
					txtApellido2Monitor.setColumns(10);
				}
				{
					lblDniMonitor = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblDniMonitor.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblDniMonitor = new GridBagConstraints();
					gbc_lblDniMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblDniMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblDniMonitor.gridx = 1;
					gbc_lblDniMonitor.gridy = 7;
					panelMonitores.add(lblDniMonitor, gbc_lblDniMonitor);
				}
				{
					MaskFormatter formatoDNI;
					try {
						formatoDNI = new MaskFormatter("#######'-U"); //$NON-NLS-1$
						formatoDNI.setPlaceholderCharacter('X');
						formattedTextFieldDniMonitor = new JFormattedTextField(formatoDNI);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					GridBagConstraints gbc_formattedTextFieldDniMonitor = new GridBagConstraints();
					gbc_formattedTextFieldDniMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_formattedTextFieldDniMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_formattedTextFieldDniMonitor.gridx = 2;
					gbc_formattedTextFieldDniMonitor.gridy = 7;
					panelMonitores.add(formattedTextFieldDniMonitor, gbc_formattedTextFieldDniMonitor);
				}
				{
					btnAdjuntarImagen = new JButton(MessagesUI_Auxiliar.getString("UI_Auxiliar.btnAdjuntarImagen.text")); //$NON-NLS-1$
					btnAdjuntarImagen.addActionListener(new BtnAdjuntarImagenActionListener());
					GridBagConstraints gbc_btnAdjuntarImagen = new GridBagConstraints();
					gbc_btnAdjuntarImagen.gridwidth = 4;
					gbc_btnAdjuntarImagen.insets = new Insets(0, 0, 5, 5);
					gbc_btnAdjuntarImagen.gridx = 5;
					gbc_btnAdjuntarImagen.gridy = 7;
					panelMonitores.add(btnAdjuntarImagen, gbc_btnAdjuntarImagen);
				}
				{
					lblTlfMonitor = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblTlfMonitor.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblTlfMonitor = new GridBagConstraints();
					gbc_lblTlfMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblTlfMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblTlfMonitor.gridx = 1;
					gbc_lblTlfMonitor.gridy = 8;
					panelMonitores.add(lblTlfMonitor, gbc_lblTlfMonitor);
				}
				{
					MaskFormatter formato;
					try {
						formato = new MaskFormatter("#########"); //$NON-NLS-1$
						formato.setPlaceholderCharacter('*');
						formattedTextFieldTlfMonitor = new JFormattedTextField(formato);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					GridBagConstraints gbc_formattedTextFieldTlfMonitor = new GridBagConstraints();
					gbc_formattedTextFieldTlfMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_formattedTextFieldTlfMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_formattedTextFieldTlfMonitor.gridx = 2;
					gbc_formattedTextFieldTlfMonitor.gridy = 8;
					panelMonitores.add(formattedTextFieldTlfMonitor, gbc_formattedTextFieldTlfMonitor);
				}
				{
					lblFormacionMonitor = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblFormacionMonitor.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblFormacionMonitor = new GridBagConstraints();
					gbc_lblFormacionMonitor.gridwidth = 2;
					gbc_lblFormacionMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblFormacionMonitor.gridx = 4;
					gbc_lblFormacionMonitor.gridy = 8;
					panelMonitores.add(lblFormacionMonitor, gbc_lblFormacionMonitor);
				}
				{
					lblCorreoMonitor = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblCorreoMonitor.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblCorreoMonitor = new GridBagConstraints();
					gbc_lblCorreoMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblCorreoMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblCorreoMonitor.gridx = 1;
					gbc_lblCorreoMonitor.gridy = 9;
					panelMonitores.add(lblCorreoMonitor, gbc_lblCorreoMonitor);
				}
				{
					txtCorreoMonitor = new JTextField();
					GridBagConstraints gbc_txtCorreoMonitor = new GridBagConstraints();
					gbc_txtCorreoMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_txtCorreoMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtCorreoMonitor.gridx = 2;
					gbc_txtCorreoMonitor.gridy = 9;
					panelMonitores.add(txtCorreoMonitor, gbc_txtCorreoMonitor);
				}
				{
					txtFormacion = new JTextField();
					GridBagConstraints gbc_txtFormacion = new GridBagConstraints();
					gbc_txtFormacion.gridheight = 2;
					gbc_txtFormacion.gridwidth = 6;
					gbc_txtFormacion.insets = new Insets(0, 0, 5, 5);
					gbc_txtFormacion.fill = GridBagConstraints.BOTH;
					gbc_txtFormacion.gridx = 4;
					gbc_txtFormacion.gridy = 9;
					panelMonitores.add(txtFormacion, gbc_txtFormacion);
					txtFormacion.setColumns(10);
				}
				{
					lblIdiomasMonitor = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblIdiomasMonitor.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblIdiomasMonitor = new GridBagConstraints();
					gbc_lblIdiomasMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblIdiomasMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblIdiomasMonitor.gridx = 1;
					gbc_lblIdiomasMonitor.gridy = 10;
					panelMonitores.add(lblIdiomasMonitor, gbc_lblIdiomasMonitor);
				}
				{
					txtIdiomas = new JTextField();
					GridBagConstraints gbc_txtIdiomas = new GridBagConstraints();
					gbc_txtIdiomas.insets = new Insets(0, 0, 5, 5);
					gbc_txtIdiomas.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtIdiomas.gridx = 2;
					gbc_txtIdiomas.gridy = 10;
					panelMonitores.add(txtIdiomas, gbc_txtIdiomas);
					txtIdiomas.setColumns(10);
				}
			}
			{
				panelActividad = new JPanel();
				panelFormularios.add(panelActividad, "Actividad"); //$NON-NLS-1$
				GridBagLayout gbl_panelActividad = new GridBagLayout();
				gbl_panelActividad.columnWidths = new int[] { 0, 0, 213, 0, 0, 0, 0, 0 };
				gbl_panelActividad.rowHeights = new int[] { 0, 0, 0, 45, 0, 0, 0, 0, 0, 0, 0 };
				gbl_panelActividad.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
				gbl_panelActividad.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0,
						Double.MIN_VALUE };
				panelActividad.setLayout(gbl_panelActividad);
				{
					lblConfiguracionActividad = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblConfiguracionActividad.text")); //$NON-NLS-1$
					lblConfiguracionActividad.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
					GridBagConstraints gbc_lblConfiguracionActividad = new GridBagConstraints();
					gbc_lblConfiguracionActividad.anchor = GridBagConstraints.WEST;
					gbc_lblConfiguracionActividad.gridwidth = 2;
					gbc_lblConfiguracionActividad.insets = new Insets(0, 0, 5, 5);
					gbc_lblConfiguracionActividad.gridx = 1;
					gbc_lblConfiguracionActividad.gridy = 1;
					panelActividad.add(lblConfiguracionActividad, gbc_lblConfiguracionActividad);
				}
				{
					lblMonitoresActividades = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblMonitoresActividades.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblMonitoresActividades = new GridBagConstraints();
					gbc_lblMonitoresActividades.anchor = GridBagConstraints.EAST;
					gbc_lblMonitoresActividades.insets = new Insets(0, 0, 5, 5);
					gbc_lblMonitoresActividades.gridx = 1;
					gbc_lblMonitoresActividades.gridy = 3;
					panelActividad.add(lblMonitoresActividades, gbc_lblMonitoresActividades);
				}
				{
					textFieldMonitor = new JTextField();
					GridBagConstraints gbc_textFieldMonitor = new GridBagConstraints();
					gbc_textFieldMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_textFieldMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_textFieldMonitor.gridx = 2;
					gbc_textFieldMonitor.gridy = 3;
					panelActividad.add(textFieldMonitor, gbc_textFieldMonitor);
					textFieldMonitor.setColumns(10);
				}
				{
					lblPrecio = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblPrecio.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
					gbc_lblPrecio.anchor = GridBagConstraints.EAST;
					gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
					gbc_lblPrecio.gridx = 4;
					gbc_lblPrecio.gridy = 3;
					panelActividad.add(lblPrecio, gbc_lblPrecio);
				}
				{
					textFieldPrecioActividad = new JTextField();
					GridBagConstraints gbc_textFieldPrecioActividad = new GridBagConstraints();
					gbc_textFieldPrecioActividad.fill = GridBagConstraints.HORIZONTAL;
					gbc_textFieldPrecioActividad.insets = new Insets(0, 0, 5, 5);
					gbc_textFieldPrecioActividad.gridx = 5;
					gbc_textFieldPrecioActividad.gridy = 3;
					panelActividad.add(textFieldPrecioActividad, gbc_textFieldPrecioActividad);
					textFieldPrecioActividad.setColumns(10);
				}
				{
					lblDestinatariosActividad = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblDestinatariosActividad.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblDestinatariosActividad = new GridBagConstraints();
					gbc_lblDestinatariosActividad.insets = new Insets(0, 0, 5, 5);
					gbc_lblDestinatariosActividad.gridx = 1;
					gbc_lblDestinatariosActividad.gridy = 5;
					panelActividad.add(lblDestinatariosActividad, gbc_lblDestinatariosActividad);
				}
				{
					panelDestinatariosActividad = new JPanel();
					GridBagConstraints gbc_panelDestinatariosActividad = new GridBagConstraints();
					gbc_panelDestinatariosActividad.insets = new Insets(0, 0, 5, 5);
					gbc_panelDestinatariosActividad.fill = GridBagConstraints.BOTH;
					gbc_panelDestinatariosActividad.gridx = 2;
					gbc_panelDestinatariosActividad.gridy = 5;
					panelActividad.add(panelDestinatariosActividad, gbc_panelDestinatariosActividad);
					{
						rdbtnNinos = new JRadioButton(MessagesUI_Auxiliar.getString("UI_Auxiliar.rdbtnNinos.text")); //$NON-NLS-1$
						buttonGroup.add(rdbtnNinos);
						panelDestinatariosActividad.add(rdbtnNinos);
					}
					{
						rdbtnAdultos = new JRadioButton(MessagesUI_Auxiliar.getString("UI_Auxiliar.rdbtnAdultos.text")); //$NON-NLS-1$
						buttonGroup.add(rdbtnAdultos);
						panelDestinatariosActividad.add(rdbtnAdultos);
					}
					{
						rdbtnAncianos = new JRadioButton(MessagesUI_Auxiliar.getString("UI_Auxiliar.rdbtnAncianos.text")); //$NON-NLS-1$
						buttonGroup.add(rdbtnAncianos);
						panelDestinatariosActividad.add(rdbtnAncianos);
					}
				}
				{
					lblHoraInicioActividad = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblHoraInicioActividad.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblHoraInicioActividad = new GridBagConstraints();
					gbc_lblHoraInicioActividad.insets = new Insets(0, 0, 5, 5);
					gbc_lblHoraInicioActividad.gridx = 4;
					gbc_lblHoraInicioActividad.gridy = 5;
					panelActividad.add(lblHoraInicioActividad, gbc_lblHoraInicioActividad);
				}
				{
					spinnerInicioActividad = new JSpinner();
					spinnerInicioActividad.setModel(new SpinnerNumberModel(0, 0, 24, 1));
					GridBagConstraints gbc_spinnerInicioActividad = new GridBagConstraints();
					gbc_spinnerInicioActividad.insets = new Insets(0, 0, 5, 5);
					gbc_spinnerInicioActividad.gridx = 5;
					gbc_spinnerInicioActividad.gridy = 5;
					panelActividad.add(spinnerInicioActividad, gbc_spinnerInicioActividad);
				}
				{
					lblCupoMaxActividad = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblCupoMaxActividad.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblCupoMaxActividad = new GridBagConstraints();
					gbc_lblCupoMaxActividad.anchor = GridBagConstraints.EAST;
					gbc_lblCupoMaxActividad.insets = new Insets(0, 0, 5, 5);
					gbc_lblCupoMaxActividad.gridx = 1;
					gbc_lblCupoMaxActividad.gridy = 6;
					panelActividad.add(lblCupoMaxActividad, gbc_lblCupoMaxActividad);
				}
				{
					textFieldCupoMaximoActividad = new JTextField();
					GridBagConstraints gbc_textFieldCupoMaximoActividad = new GridBagConstraints();
					gbc_textFieldCupoMaximoActividad.insets = new Insets(0, 0, 5, 5);
					gbc_textFieldCupoMaximoActividad.fill = GridBagConstraints.HORIZONTAL;
					gbc_textFieldCupoMaximoActividad.gridx = 2;
					gbc_textFieldCupoMaximoActividad.gridy = 6;
					panelActividad.add(textFieldCupoMaximoActividad, gbc_textFieldCupoMaximoActividad);
					textFieldCupoMaximoActividad.setColumns(10);
				}
				{
					lblHoraFinalActividad = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblHoraFinalActividad.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblHoraFinalActividad = new GridBagConstraints();
					gbc_lblHoraFinalActividad.insets = new Insets(0, 0, 5, 5);
					gbc_lblHoraFinalActividad.gridx = 4;
					gbc_lblHoraFinalActividad.gridy = 6;
					panelActividad.add(lblHoraFinalActividad, gbc_lblHoraFinalActividad);
				}
				{
					spinnerFinalActividad = new JSpinner();
					spinnerFinalActividad.setModel(new SpinnerNumberModel(0, 0, 24, 1));
					GridBagConstraints gbc_spinnerFinalActividad = new GridBagConstraints();
					gbc_spinnerFinalActividad.insets = new Insets(0, 0, 5, 5);
					gbc_spinnerFinalActividad.gridx = 5;
					gbc_spinnerFinalActividad.gridy = 6;
					panelActividad.add(spinnerFinalActividad, gbc_spinnerFinalActividad);
				}
				{
					lblDescripcionActividad = new JLabel(MessagesUI_Auxiliar.getString("UI_Auxiliar.lblDescripcionActividad.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblDescripcionActividad = new GridBagConstraints();
					gbc_lblDescripcionActividad.anchor = GridBagConstraints.NORTH;
					gbc_lblDescripcionActividad.insets = new Insets(0, 0, 5, 5);
					gbc_lblDescripcionActividad.gridx = 1;
					gbc_lblDescripcionActividad.gridy = 8;
					panelActividad.add(lblDescripcionActividad, gbc_lblDescripcionActividad);
				}
				{
					scrollPaneDescripcionActividad = new JScrollPane();
					GridBagConstraints gbc_scrollPaneDescripcionActividad = new GridBagConstraints();
					gbc_scrollPaneDescripcionActividad.gridwidth = 4;
					gbc_scrollPaneDescripcionActividad.insets = new Insets(0, 0, 5, 5);
					gbc_scrollPaneDescripcionActividad.fill = GridBagConstraints.BOTH;
					gbc_scrollPaneDescripcionActividad.gridx = 2;
					gbc_scrollPaneDescripcionActividad.gridy = 8;
					panelActividad.add(scrollPaneDescripcionActividad, gbc_scrollPaneDescripcionActividad);
					{
						txtDescripcionActividad = new JTextPane();
						scrollPaneDescripcionActividad.setViewportView(txtDescripcionActividad);
					}
				}
			}
		}
		{
			panelBotones = new JPanel();
			contentPane.add(panelBotones, BorderLayout.SOUTH);
			panelBotones.setLayout(new CardLayout(0, 0));
			{
				panelVer = new JPanel();
				panelBotones.add(panelVer, "Ver"); //$NON-NLS-1$
				{
					btnCerrar = new JButton(MessagesUI_Auxiliar.getString("UI_Auxiliar.btnCerrar.text")); //$NON-NLS-1$
					btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnCerrar.addActionListener(new BtnCerrarActionListener());
					panelVer.add(btnCerrar);
				}
			}
			{
				panelAnadir = new JPanel();
				panelBotones.add(panelAnadir, "Anadir"); //$NON-NLS-1$
				{
					btnCancelar = new JButton(MessagesUI_Auxiliar.getString("UI_Auxiliar.btnCancelar.text")); //$NON-NLS-1$
					btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnCancelar.addActionListener(new BtnCancelarActionListener());
					panelAnadir.add(btnCancelar);
				}
				{
					btnAnadir = new JButton(MessagesUI_Auxiliar.getString("UI_Auxiliar.btnAnadir.text")); //$NON-NLS-1$
					btnAnadir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnAnadir.addActionListener(new BtnConfirmacionAccionActionListener("agregar")); //$NON-NLS-1$
					panelAnadir.add(btnAnadir);
				}
			}
			{
				panelBorrar = new JPanel();
				panelBotones.add(panelBorrar, "Borrar"); //$NON-NLS-1$
				{
					btnCancelar1 = new JButton(MessagesUI_Auxiliar.getString("UI_Auxiliar.btnCancelar1.text")); //$NON-NLS-1$
					btnCancelar1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnCancelar1.addActionListener(new BtnCancelarActionListener());
					panelBorrar.add(btnCancelar1);
				}
				{
					btnBorrar = new JButton(MessagesUI_Auxiliar.getString("UI_Auxiliar.btnBorrar.text")); //$NON-NLS-1$
					btnBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnBorrar.addActionListener(new BtnConfirmacionAccionActionListener("borrar")); //$NON-NLS-1$
					panelBorrar.add(btnBorrar);
				}
			}
			{
				panelModificar = new JPanel();
				panelBotones.add(panelModificar, "Modificar"); //$NON-NLS-1$
				{
					btnCancelar2 = new JButton(MessagesUI_Auxiliar.getString("UI_Auxiliar.btnCancelar2.text")); //$NON-NLS-1$
					btnCancelar2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnCancelar2.addActionListener(new BtnCancelarActionListener());
					panelModificar.add(btnCancelar2);
				}
				{
					btnModificar = new JButton(MessagesUI_Auxiliar.getString("UI_Auxiliar.btnModificar.text")); //$NON-NLS-1$
					btnModificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnModificar.addActionListener(new BtnConfirmacionAccionActionListener("modificar")); //$NON-NLS-1$
					panelModificar.add(btnModificar);
				}
			}
		}
	}

	private class ThisWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			int sel = JOptionPane.showOptionDialog(null, MessagesUI_Auxiliar.getString("UI_Auxiliar.16"), MessagesUI_Auxiliar.getString("UI_Auxiliar.17"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (sel == JOptionPane.YES_OPTION) {
				dispose(); // Yes
			} else {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // No
			}
		}

		public void setEditableFalse() {
			txtNombreMonitor.setEditable(false);
			txtApellido1Monitor.setEditable(false);
			txtApellido2Monitor.setEditable(false);
			formattedTextFieldDniMonitor.setEditable(false);
			formattedTextFieldTlfMonitor.setEditable(false);
			txtCorreoMonitor.setEditable(false);
			txtFormacion.setEditable(false);
			txtIdiomas.setEditable(false);
			btnAdjuntarImagen.setEnabled(false);

			textFieldMonitor.setEditable(false);
			textFieldPrecioActividad.setEditable(false);
			textFieldCupoMaximoActividad.setEditable(false);
			txtDescripcionActividad.setEditable(false);
			rdbtnNinos.setEnabled(false);
			rdbtnAdultos.setEnabled(false);
			rdbtnAncianos.setEnabled(false);
			spinnerInicioActividad.setEnabled(false);
			spinnerFinalActividad.setEnabled(false);
		}

		public void cargarMonitor(Monitor m) {
			txtNombreMonitor.setText(m.getNombre());
			txtApellido1Monitor.setText(m.getApellido1());
			txtApellido2Monitor.setText(m.getApellido2());
			formattedTextFieldDniMonitor.setText(m.getDni());
			formattedTextFieldTlfMonitor.setText(String.valueOf(m.getTelefono()));
			txtCorreoMonitor.setText(m.getCorreoElectronico());
			txtFormacion.setText(m.getFormacion());
			txtIdiomas.setText(m.getIdiomas());
			
			String[] absolutePath = m.getRutaFotoMonitor().split("recursos"); //$NON-NLS-1$
			lblFotoMonitor.setIcon(new ImageIcon("src/recursos"+absolutePath[1])); //$NON-NLS-1$
			
		}

		public void cargarActividad(Actividad a) {
			textFieldMonitor.setText(a.getMonitor());
			textFieldPrecioActividad.setText(String.valueOf(a.getPrecio()));
			textFieldCupoMaximoActividad.setText(String.valueOf(a.getCupoMaximo()));
			txtDescripcionActividad.setText(a.getDescripcion());

			switch (a.getDestinatario()) {
			case "ninos": //$NON-NLS-1$
				rdbtnNinos.setSelected(true);
				break;
			case "adultos": //$NON-NLS-1$
				rdbtnAdultos.setSelected(true);
				break;
			case "ancianos": //$NON-NLS-1$
				rdbtnAncianos.setSelected(true);
				break;
			}

			spinnerInicioActividad.setValue(a.getHoraComienzo());
			spinnerFinalActividad.setValue(a.getHoraFin());
		}

		@Override
		public void windowOpened(WindowEvent e) {
			CardLayout panel = (CardLayout) (panelBotones.getLayout());
			switch (elegirPanel) {
			case 0:
				panel.show(panelBotones, "Ver"); //$NON-NLS-1$
				setEditableFalse();
				if(elegirFormulario==0) {
					cargarMonitor(monitor);
				} else {
					cargarActividad(actividad);
				}	

				break;
			case 1:
				panel.show(panelBotones, "Anadir"); //$NON-NLS-1$
				break;
			case 2:
				panel.show(panelBotones, "Modificar"); //$NON-NLS-1$
				if(elegirFormulario==0) {
					cargarMonitor(monitor);
				} else {
					cargarActividad(actividad);
				}
				break;
			case 3:
				panel.show(panelBotones, "Borrar"); //$NON-NLS-1$
				if(elegirFormulario==0) {
					cargarMonitor(monitor);
				} else {
					cargarActividad(actividad);
				}
				setEditableFalse();

				break;
			}

			CardLayout panel2 = (CardLayout) (panelFormularios.getLayout());
			switch (elegirFormulario) {
			case 0:
				panel2.show(panelFormularios, "Monitor"); //$NON-NLS-1$
				setTitle("Vista de Monitor"); //$NON-NLS-1$
				break;
			case 1:
				panel2.show(panelFormularios, "Actividad"); //$NON-NLS-1$
				setTitle("Vista de Actividad"); //$NON-NLS-1$
				break;
			}
		}
	}

	private class BtnCerrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int sel = JOptionPane.showOptionDialog(null, MessagesUI_Auxiliar.getString("UI_Auxiliar.31"), MessagesUI_Auxiliar.getString("UI_Auxiliar.32"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (sel == JOptionPane.YES_OPTION) {
				dispose(); // Yes
			} else {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // No
			}
		}
	}

	private class BtnConfirmacionAccionActionListener implements ActionListener {
		String palabra = null;

		public BtnConfirmacionAccionActionListener(String palabra) {
			this.palabra = palabra;
		}

		public void actionPerformed(ActionEvent e) {
			int sel = JOptionPane.showOptionDialog(null, MessagesUI_Auxiliar.getString("UI_Auxiliar.33") + palabra + MessagesUI_Auxiliar.getString("UI_Auxiliar.34"), //$NON-NLS-1$ //$NON-NLS-2$
					MessagesUI_Auxiliar.getString("UI_Auxiliar.35"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null); //$NON-NLS-1$
			if (sel == JOptionPane.YES_OPTION) {

				// 0-Monitor, 1-Actividad -> Paneles
				switch (palabra) {
				case "agregar": //$NON-NLS-1$
					switch (elegirFormulario) {
					case 0:
						try {
							String nombre = txtNombreMonitor.getText();
							String apellido1 = txtApellido1Monitor.getText();
							String apellido2 = txtApellido2Monitor.getText();
							String dni = formattedTextFieldDniMonitor.getText();
							Long telefono = Long.parseLong(formattedTextFieldTlfMonitor.getText());
							String correoElectronico = txtCorreoMonitor.getText();
							String formacion = txtFormacion.getText();
							String idiomas = txtIdiomas.getText();
							
							Image img = iconToImage(lblFotoMonitor.getIcon());

							BufferedImage bi = new BufferedImage(img.getWidth(null),img.getHeight(null),BufferedImage.TYPE_INT_RGB);

							Graphics2D g2 = bi.createGraphics();
							g2.drawImage(img, 0, 0, null);
							g2.dispose();
							String rutaFotoMonitor = "src/recursos/fotos/"+dni+".png"; //$NON-NLS-1$ //$NON-NLS-2$
							try {
								ImageIO.write(bi, "png", new File(rutaFotoMonitor)); //$NON-NLS-1$
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}

							Monitor m = new Monitor(nombre, apellido1, apellido2, dni, telefono, correoElectronico,
									formacion, rutaFotoMonitor, idiomas);

							Reader.getListMonitores().add(m);
							Writer.escribirListaMonitores(Reader.getListMonitores());
	
						} catch (Exception e1) {
							e1.printStackTrace();
							JOptionPane.showMessageDialog(new JFrame(),
									MessagesUI_Auxiliar.getString("UI_Auxiliar.40"), MessagesUI_Auxiliar.getString("UI_Auxiliar.41"), //$NON-NLS-1$ //$NON-NLS-2$
									JOptionPane.ERROR_MESSAGE);
							dispose();
						}

						break;
					case 1:

						try {
							String monitor = textFieldMonitor.getText();
							int horaComienzo = (int) spinnerInicioActividad.getValue();
							int horaFin = (int) spinnerFinalActividad.getValue();
							int cupoMaximo = Integer.parseInt(textFieldCupoMaximoActividad.getText());
							String destinatario = null;

							if (rdbtnNinos.isSelected()) {
								destinatario = "ninos"; //$NON-NLS-1$
							} else if (rdbtnAdultos.isSelected()) {
								destinatario = "adultos"; //$NON-NLS-1$
							} else if (rdbtnAncianos.isSelected()) {
								destinatario = "ancianos"; //$NON-NLS-1$
							}

							int precio = Integer.parseInt(textFieldPrecioActividad.getText());
							String descripcion = txtDescripcionActividad.getText();

							Actividad a = new Actividad(monitor, horaComienzo, horaFin, cupoMaximo, destinatario,
									precio, descripcion);

							Reader.getListActividades().add(a);
							Writer.escribirListaActividades(Reader.getListActividades());

						} catch (Exception e2) {
							JOptionPane.showMessageDialog(new JFrame(),
									MessagesUI_Auxiliar.getString("UI_Auxiliar.45"), MessagesUI_Auxiliar.getString("UI_Auxiliar.46"), //$NON-NLS-1$ //$NON-NLS-2$
									JOptionPane.ERROR_MESSAGE);
							dispose();
						}
						break;
					}
					break;
				case "modificar": //$NON-NLS-1$
					switch (elegirFormulario) {
					case 0:
						for (int i = 0; i < Reader.getListMonitores().size(); i++) {
							if (monitor.getNombre().equals(Reader.getListMonitores().get(i).getNombre())) {

								try {
									String nombre = txtNombreMonitor.getText();
									String apellido1 = txtApellido1Monitor.getText();
									String apellido2 = txtApellido2Monitor.getText();
									String dni = formattedTextFieldDniMonitor.getText();
									Long telefono = Long.parseLong(formattedTextFieldTlfMonitor.getText());
									String correoElectronico = txtCorreoMonitor.getText();
									String formacion = txtFormacion.getText();
									String idiomas = txtIdiomas.getText();
									
									Image img = iconToImage(lblFotoMonitor.getIcon());

									BufferedImage bi = new BufferedImage(img.getWidth(null),img.getHeight(null),BufferedImage.TYPE_INT_RGB);

									Graphics2D g2 = bi.createGraphics();
									g2.drawImage(img, 0, 0, null);
									g2.dispose();
									String rutaFotoMonitor = "src/recursos/fotos/"+dni+".png"; //$NON-NLS-1$ //$NON-NLS-2$
									try {
										ImageIO.write(bi, "png", new File(rutaFotoMonitor)); //$NON-NLS-1$
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}

									Monitor m = new Monitor(nombre, apellido1, apellido2, dni, telefono,
											correoElectronico, formacion, rutaFotoMonitor, idiomas);

									Reader.getListMonitores().remove(i);
									Reader.getListMonitores().add(m);

									Writer.escribirListaMonitores(Reader.getListMonitores());
									break;
								} catch (Exception e2) {
									JOptionPane.showMessageDialog(new JFrame(),
											MessagesUI_Auxiliar.getString("UI_Auxiliar.51"), MessagesUI_Auxiliar.getString("UI_Auxiliar.52"), //$NON-NLS-1$ //$NON-NLS-2$
											JOptionPane.ERROR_MESSAGE);
									dispose();
								}
							}
						}

						break;
					case 1:
						for (int i = 0; i < Reader.getListActividades().size(); i++) {
							if (actividad.getDescripcion()
									.equals(Reader.getListActividades().get(i).getDescripcion())) {

								try {
									String monitor = textFieldMonitor.getText();
									int horaComienzo = (int) spinnerInicioActividad.getValue();
									int horaFin = (int) spinnerFinalActividad.getValue();
									int cupoMaximo = Integer.parseInt(textFieldCupoMaximoActividad.getText());
									String destinatario = null;

									if (rdbtnNinos.isSelected()) {
										destinatario = "ninos"; //$NON-NLS-1$
									} else if (rdbtnAdultos.isSelected()) {
										destinatario = "adultos"; //$NON-NLS-1$
									} else if (rdbtnAncianos.isSelected()) {
										destinatario = "ancianos"; //$NON-NLS-1$
									}

									int precio = Integer.parseInt(textFieldPrecioActividad.getText());
									String descripcion = txtDescripcionActividad.getText();

									Actividad a = new Actividad(monitor, horaComienzo, horaFin, cupoMaximo,
											destinatario, precio, descripcion);

									Reader.getListActividades().remove(i);
									Reader.getListActividades().add(a);

									Writer.escribirListaActividades(Reader.getListActividades());
									break;
								} catch (Exception e2) {
									JOptionPane.showMessageDialog(new JFrame(),
											MessagesUI_Auxiliar.getString("UI_Auxiliar.56"), MessagesUI_Auxiliar.getString("UI_Auxiliar.57"), //$NON-NLS-1$ //$NON-NLS-2$
											JOptionPane.ERROR_MESSAGE);
									dispose();
								}
							}
						}

						break;
					}

					break;
				case "borrar": //$NON-NLS-1$

					switch (elegirFormulario) {
					case 0:
						for (int i = 0; i < Reader.getListMonitores().size(); i++) {
							if (monitor.getNombre().equals(Reader.getListMonitores().get(i).getNombre())) {
								Reader.getListMonitores().remove(i);
								Writer.escribirListaMonitores(Reader.getListMonitores());
							}
						}
						break;
					case 1:
						for (int i = 0; i < Reader.getListActividades().size(); i++) {
							if (actividad.getDescripcion()
									.equals(Reader.getListActividades().get(i).getDescripcion())) {
								Reader.getListActividades().remove(i);
								Writer.escribirListaActividades(Reader.getListActividades());
							}
						}
						break;
					}

					break;
				}

				JOptionPane.showMessageDialog(null, MessagesUI_Auxiliar.getString("UI_Auxiliar.59"), MessagesUI_Auxiliar.getString("UI_Auxiliar.60"), //$NON-NLS-1$ //$NON-NLS-2$
						JOptionPane.PLAIN_MESSAGE);
				dispose(); // Yes
			} else {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // No
			}
		}
	}
	
    public Image iconToImage(Icon icon) {
        if (icon instanceof ImageIcon) {
            return ((ImageIcon)icon).getImage();
        } else {
            int w = icon.getIconWidth();
            int h = icon.getIconHeight();
            GraphicsEnvironment ge = 
              GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice gd = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            BufferedImage image = gc.createCompatibleImage(w, h);
            Graphics2D g = image.createGraphics();
            icon.paintIcon(null, g, 0, 0);
            g.dispose();
            return image;
        }
    }
    
	private class BtnAdjuntarImagenActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new ImageFilter());
			fcAbrir.addChoosableFileFilter(new ImageFilter2());
			int valorDevuelto = fcAbrir.showOpenDialog(null);
			Image imagenOriginal;

			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				try {
					imagenOriginal = ImageIO.read(file);

					Image imagenEscalada = imagenOriginal.getScaledInstance(lblFotoMonitor.getWidth(), lblFotoMonitor.getHeight(),
							java.awt.Image.SCALE_SMOOTH);
					ImageIcon iconoLabel = new ImageIcon(imagenEscalada);
					lblFotoMonitor.setIcon(iconoLabel);
				} catch (IOException a) {
					a.printStackTrace();
				}
		}
		}
	}

	public static void setElegirPanel(int valor) {
		elegirPanel = valor;
	}

	public static void setElegirFormulario(int valor) {
		elegirFormulario = valor;
	}
}
