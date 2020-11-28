package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class UI_Auxiliar extends JFrame {

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
	private JComboBox cbIdiomasMonitor;
	private JFormattedTextField formattedTextFieldTlfMonitor;
	private JFormattedTextField formattedTextFieldDniMonitor;
	private JLabel lblFormacionMonitor;
	private JTextField textField;
	private JLabel lblConfiguracionMonitor;
	private JLabel lblFotoMonitor2;
	private JFormattedTextField formattedTextFieldCorreoMonitor;
	private JLabel lblCorreoMonitor;
	
	public static int elegirPanel;
	public static int elegirFormulario;
	private JLabel lblConfiguracionActividad;
	private JLabel lblMonitoresActividades;
	private JScrollPane scrollPaneMonitoresActividad;
	private JList listMonitoresActividad;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_Auxiliar frame = new UI_Auxiliar();
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
	public UI_Auxiliar() {
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
				panelFormularios.add(panelMonitores, "Monitor");
				GridBagLayout gbl_panelMonitores = new GridBagLayout();
				gbl_panelMonitores.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_panelMonitores.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_panelMonitores.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
				gbl_panelMonitores.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
				panelMonitores.setLayout(gbl_panelMonitores);
				{
					lblConfiguracionMonitor = new JLabel("Configuraci\u00F3n Monitor:");
					lblConfiguracionMonitor.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_lblConfiguracionMonitor = new GridBagConstraints();
					gbc_lblConfiguracionMonitor.anchor = GridBagConstraints.WEST;
					gbc_lblConfiguracionMonitor.gridwidth = 2;
					gbc_lblConfiguracionMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblConfiguracionMonitor.gridx = 1;
					gbc_lblConfiguracionMonitor.gridy = 1;
					panelMonitores.add(lblConfiguracionMonitor, gbc_lblConfiguracionMonitor);
				}
				{
					lblNombreMonitor = new JLabel("Nombre:");
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
					lblFotoMonitor2 = new JLabel("Foto:");
					GridBagConstraints gbc_lblFotoMonitor2 = new GridBagConstraints();
					gbc_lblFotoMonitor2.insets = new Insets(0, 0, 5, 5);
					gbc_lblFotoMonitor2.gridx = 4;
					gbc_lblFotoMonitor2.gridy = 3;
					panelMonitores.add(lblFotoMonitor2, gbc_lblFotoMonitor2);
				}
				{
					lblFotoMonitor = new JLabel("");
					lblFotoMonitor.setIcon(new ImageIcon(UI_Auxiliar.class.getResource("/recursos/user.png")));
					GridBagConstraints gbc_lblFotoMonitor = new GridBagConstraints();
					gbc_lblFotoMonitor.gridheight = 4;
					gbc_lblFotoMonitor.gridwidth = 5;
					gbc_lblFotoMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblFotoMonitor.gridx = 5;
					gbc_lblFotoMonitor.gridy = 3;
					panelMonitores.add(lblFotoMonitor, gbc_lblFotoMonitor);
				}
				{
					lblApellido1Monitor = new JLabel("Apellido 1:");
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
					lblApellido2Monitor = new JLabel("Apellido 2:");
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
					lblDniMonitor = new JLabel("DNI:");
					GridBagConstraints gbc_lblDniMonitor = new GridBagConstraints();
					gbc_lblDniMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblDniMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblDniMonitor.gridx = 1;
					gbc_lblDniMonitor.gridy = 7;
					panelMonitores.add(lblDniMonitor, gbc_lblDniMonitor);
				}
				{
					formattedTextFieldDniMonitor = new JFormattedTextField();
					GridBagConstraints gbc_formattedTextFieldDniMonitor = new GridBagConstraints();
					gbc_formattedTextFieldDniMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_formattedTextFieldDniMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_formattedTextFieldDniMonitor.gridx = 2;
					gbc_formattedTextFieldDniMonitor.gridy = 7;
					panelMonitores.add(formattedTextFieldDniMonitor, gbc_formattedTextFieldDniMonitor);
				}
				{
					lblTlfMonitor = new JLabel("Tlf:");
					GridBagConstraints gbc_lblTlfMonitor = new GridBagConstraints();
					gbc_lblTlfMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblTlfMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblTlfMonitor.gridx = 1;
					gbc_lblTlfMonitor.gridy = 8;
					panelMonitores.add(lblTlfMonitor, gbc_lblTlfMonitor);
				}
				{
					formattedTextFieldTlfMonitor = new JFormattedTextField();
					GridBagConstraints gbc_formattedTextFieldTlfMonitor = new GridBagConstraints();
					gbc_formattedTextFieldTlfMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_formattedTextFieldTlfMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_formattedTextFieldTlfMonitor.gridx = 2;
					gbc_formattedTextFieldTlfMonitor.gridy = 8;
					panelMonitores.add(formattedTextFieldTlfMonitor, gbc_formattedTextFieldTlfMonitor);
				}
				{
					lblFormacionMonitor = new JLabel("Formacion:");
					GridBagConstraints gbc_lblFormacionMonitor = new GridBagConstraints();
					gbc_lblFormacionMonitor.gridwidth = 2;
					gbc_lblFormacionMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblFormacionMonitor.gridx = 4;
					gbc_lblFormacionMonitor.gridy = 8;
					panelMonitores.add(lblFormacionMonitor, gbc_lblFormacionMonitor);
				}
				{
					lblCorreoMonitor = new JLabel("Correo:");
					GridBagConstraints gbc_lblCorreoMonitor = new GridBagConstraints();
					gbc_lblCorreoMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblCorreoMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblCorreoMonitor.gridx = 1;
					gbc_lblCorreoMonitor.gridy = 9;
					panelMonitores.add(lblCorreoMonitor, gbc_lblCorreoMonitor);
				}
				{
					formattedTextFieldCorreoMonitor = new JFormattedTextField();
					GridBagConstraints gbc_formattedTextFieldCorreoMonitor = new GridBagConstraints();
					gbc_formattedTextFieldCorreoMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_formattedTextFieldCorreoMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_formattedTextFieldCorreoMonitor.gridx = 2;
					gbc_formattedTextFieldCorreoMonitor.gridy = 9;
					panelMonitores.add(formattedTextFieldCorreoMonitor, gbc_formattedTextFieldCorreoMonitor);
				}
				{
					textField = new JTextField();
					GridBagConstraints gbc_textField = new GridBagConstraints();
					gbc_textField.gridheight = 2;
					gbc_textField.gridwidth = 6;
					gbc_textField.insets = new Insets(0, 0, 5, 5);
					gbc_textField.fill = GridBagConstraints.BOTH;
					gbc_textField.gridx = 4;
					gbc_textField.gridy = 9;
					panelMonitores.add(textField, gbc_textField);
					textField.setColumns(10);
				}
				{
					lblIdiomasMonitor = new JLabel("Idiomas:");
					GridBagConstraints gbc_lblIdiomasMonitor = new GridBagConstraints();
					gbc_lblIdiomasMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblIdiomasMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblIdiomasMonitor.gridx = 1;
					gbc_lblIdiomasMonitor.gridy = 10;
					panelMonitores.add(lblIdiomasMonitor, gbc_lblIdiomasMonitor);
				}
				{
					cbIdiomasMonitor = new JComboBox();
					GridBagConstraints gbc_cbIdiomasMonitor = new GridBagConstraints();
					gbc_cbIdiomasMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_cbIdiomasMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_cbIdiomasMonitor.gridx = 2;
					gbc_cbIdiomasMonitor.gridy = 10;
					panelMonitores.add(cbIdiomasMonitor, gbc_cbIdiomasMonitor);
				}
			}
			{
				panelActividad = new JPanel();
				panelFormularios.add(panelActividad, "Actividad");
				GridBagLayout gbl_panelActividad = new GridBagLayout();
				gbl_panelActividad.columnWidths = new int[]{0, 0, 213, 0, 0, 0, 0, 0};
				gbl_panelActividad.rowHeights = new int[]{0, 0, 0, 64, 0, 0, 0, 0, 0, 0, 0};
				gbl_panelActividad.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
				gbl_panelActividad.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
				panelActividad.setLayout(gbl_panelActividad);
				{
					lblConfiguracionActividad = new JLabel("Configuraci\u00F3n Actividad:");
					lblConfiguracionActividad.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_lblConfiguracionActividad = new GridBagConstraints();
					gbc_lblConfiguracionActividad.anchor = GridBagConstraints.WEST;
					gbc_lblConfiguracionActividad.gridwidth = 2;
					gbc_lblConfiguracionActividad.insets = new Insets(0, 0, 5, 5);
					gbc_lblConfiguracionActividad.gridx = 1;
					gbc_lblConfiguracionActividad.gridy = 1;
					panelActividad.add(lblConfiguracionActividad, gbc_lblConfiguracionActividad);
				}
				{
					lblMonitoresActividades = new JLabel("Monitores:");
					GridBagConstraints gbc_lblMonitoresActividades = new GridBagConstraints();
					gbc_lblMonitoresActividades.anchor = GridBagConstraints.NORTH;
					gbc_lblMonitoresActividades.insets = new Insets(0, 0, 5, 5);
					gbc_lblMonitoresActividades.gridx = 1;
					gbc_lblMonitoresActividades.gridy = 3;
					panelActividad.add(lblMonitoresActividades, gbc_lblMonitoresActividades);
				}
				{
					scrollPaneMonitoresActividad = new JScrollPane();
					GridBagConstraints gbc_scrollPaneMonitoresActividad = new GridBagConstraints();
					gbc_scrollPaneMonitoresActividad.insets = new Insets(0, 0, 5, 5);
					gbc_scrollPaneMonitoresActividad.fill = GridBagConstraints.BOTH;
					gbc_scrollPaneMonitoresActividad.gridx = 2;
					gbc_scrollPaneMonitoresActividad.gridy = 3;
					panelActividad.add(scrollPaneMonitoresActividad, gbc_scrollPaneMonitoresActividad);
					{
						listMonitoresActividad = new JList();
						scrollPaneMonitoresActividad.setViewportView(listMonitoresActividad);
					}
				}
				{
					lblPrecio = new JLabel("Precio:");
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
					lblDestinatariosActividad = new JLabel("Destinatarios:");
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
						rdbtnNinos = new JRadioButton("Ni\u00F1os");
						panelDestinatariosActividad.add(rdbtnNinos);
					}
					{
						rdbtnAdultos = new JRadioButton("Adultos");
						panelDestinatariosActividad.add(rdbtnAdultos);
					}
					{
						rdbtnAncianos = new JRadioButton("Ancianos");
						panelDestinatariosActividad.add(rdbtnAncianos);
					}
				}
				{
					lblHoraInicioActividad = new JLabel("Hora Inicio:");
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
					lblCupoMaxActividad = new JLabel("Cupo m\u00E1ximo:");
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
					lblHoraFinalActividad = new JLabel("Hora Finalizaci\u00F3n:");
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
					lblDescripcionActividad = new JLabel("Descripci\u00F3n:");
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
				panelBotones.add(panelVer, "Ver");
				{
					btnCerrar = new JButton("Cerrar");
					btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnCerrar.addActionListener(new BtnCerrarActionListener());
					panelVer.add(btnCerrar);
				}
			}
			{
				panelAnadir = new JPanel();
				panelBotones.add(panelAnadir, "Anadir");
				{
					btnCancelar = new JButton("Cancelar");
					btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnCancelar.addActionListener(new BtnCancelarActionListener());
					panelAnadir.add(btnCancelar);
				}
				{
					btnAnadir = new JButton("A\u00F1adir");
					btnAnadir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnAnadir.addActionListener(new BtnConfirmacionAccionActionListener("añadir"));
					panelAnadir.add(btnAnadir);
				}
			}
			{
				panelBorrar = new JPanel();
				panelBotones.add(panelBorrar, "Borrar");
				{
					btnCancelar1 = new JButton("Cancelar");
					btnCancelar1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnCancelar1.addActionListener(new BtnCancelarActionListener());
					panelBorrar.add(btnCancelar1);
				}
				{
					btnBorrar = new JButton("Borrar");
					btnBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnBorrar.addActionListener(new BtnConfirmacionAccionActionListener("borrar"));
					panelBorrar.add(btnBorrar);
				}
			}
			{
				panelModificar = new JPanel();
				panelBotones.add(panelModificar, "Modificar");
				{
					btnCancelar2 = new JButton("Cancelar");
					btnCancelar2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnCancelar2.addActionListener(new BtnCancelarActionListener());
					panelModificar.add(btnCancelar2);
				}
				{
					btnModificar = new JButton("Modificar");
					btnModificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnModificar.addActionListener(new BtnConfirmacionAccionActionListener("Modificar"));
					panelModificar.add(btnModificar);
				}
			}
		}
	}

	private class ThisWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			int sel = JOptionPane.showOptionDialog(null, "¿Seguro que quieres cancelar la operación?",
					"Cerrar ventana", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (sel == JOptionPane.YES_OPTION) {
				dispose(); // Yes
			} else {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // No
			}
		}
		@Override
		public void windowOpened(WindowEvent e) {
			CardLayout panel = (CardLayout) (panelBotones.getLayout());
			switch(elegirPanel) {		
			case 0:				
				panel.show(panelBotones, "Ver");
				break;
			case 1:
				panel.show(panelBotones, "Anadir");
				break;
			case 2:
				panel.show(panelBotones, "Modificar");
				break;
			case 3:
				panel.show(panelBotones, "Borrar");
				break;
			}
			
			CardLayout panel2 = (CardLayout) (panelFormularios.getLayout());
			switch(elegirFormulario) {
			case 0:
				panel2.show(panelFormularios, "Monitor");
				break;
			case 1:
				panel2.show(panelFormularios, "Actividad");
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
			int sel = JOptionPane.showOptionDialog(null, "¿Seguro que quieres cancelar la operación?",
					"Cerrar ventana", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
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
			int sel = JOptionPane.showOptionDialog(null, "¿Seguro que quieres "+palabra+" este elemento?",
					"Confirmar operación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (sel == JOptionPane.YES_OPTION) {
				
				//HACER LA FUNCION QUE HAGA FALTA
				
				JOptionPane.showMessageDialog(null, "Se han guardado los cambios",
						"Confirmación de cambios", JOptionPane.PLAIN_MESSAGE);
				dispose(); // Yes
			} else {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // No
			}
		}
	}

	public static void setElegirPanel(int valor) {
		elegirPanel=valor;
	}
	
	public static void setElegirFormulario(int valor) {
		elegirFormulario=valor;
	}
}
