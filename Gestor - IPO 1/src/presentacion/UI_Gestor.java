package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTree;
import javax.swing.MenuElement;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.Cursor;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class UI_Gestor {

	private JFrame frmGestorLosOlivos;
	private JPanel panelAutenticacion;
	private JPanel panelMenuPrincipal;
	private JLabel lblBarraEstado;
	private JPanel panelUsuarioPass;
	private JLabel lblUsuario;
	private JLabel lblPass;
	private JTextField textUsuario;
	private JButton btnIniciar;
	private JPasswordField passwordField;
	private JPanel panel_3;
	private JLabel lblFoto;
	private JPanel panelMigas;
	private JMenuBar menuBar;
	private JMenu mnInicio;
	private JMenu mnVer;
	private JMenu mnAyuda;
	private JPanel panelBanner;
	private JTree treePrograma;
	private JLabel lblBanner;
	private JPanel panelPrincipal;
	private JPanel panelBotones;
	private JLabel lblInfo;
	private JPanel panelOpciones;
	private JButton btnCerrarSesion;
	private JButton btnNewButton;
	private JButton btnAyuda;
	private JButton btnParcelasBungalows;
	private JButton btnReservas;
	private JButton btnActividades;
	private JButton btnRutas;
	private JButton btnMonitores;
	private JButton btnConfiguracion;
	private JPanel panelReservas;
	private JButton btnNuevaReserva;
	private JButton btnConsultarReserva;
	private JButton btnBorrarReserva;
	private JButton btnAyudaReservas;
	private JPanel panelParcelasBungalos;
	private JButton btnParcelas;
	private JButton btnBungalows;
	private JPanel panelRutas;
	private JButton btnInfoRutas;
	private JButton btnDiseñoRuta;
	private JPanel panelConfiguracion;
	private JPanel panelMonitores;
	private JPanel panelActividades;
	private JButton btnAyudaConfiguracion;
	private JLabel lblIdioma;
	private JLabel lblApariencia;
	private JLabel lblTipoLetra;
	private JLabel lblTamLetra;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JButton btnGuardarCambios;
	private JButton btnCancelarCambios;
	private JLabel lblBarraDeEstado;
	private int index = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_Gestor window = new UI_Gestor();
					window.frmGestorLosOlivos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI_Gestor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestorLosOlivos = new JFrame();
		frmGestorLosOlivos.setTitle("Gestor Los olivos");
		frmGestorLosOlivos.setBounds(100, 100, 849, 596);
		frmGestorLosOlivos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestorLosOlivos.getContentPane().setLayout(new CardLayout(0, 0));
		{
			panelAutenticacion = new JPanel();
			frmGestorLosOlivos.getContentPane().add(panelAutenticacion, "PanelSesion");
			panelAutenticacion.setLayout(new BorderLayout(0, 0));
			{
				lblBarraEstado = new JLabel("Barra de Estado");
				lblBarraEstado.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblBarraEstado.setVerticalAlignment(SwingConstants.TOP);
				panelAutenticacion.add(lblBarraEstado, BorderLayout.SOUTH);
			}
			{
				panelUsuarioPass = new JPanel();
				panelUsuarioPass.setBorder(new EmptyBorder(0, 0, 0, 0));
				panelAutenticacion.add(panelUsuarioPass, BorderLayout.CENTER);
				panelUsuarioPass.setLayout(null);
				{
					lblUsuario = new JLabel("Usuario:");
					lblUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
					lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
					lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
					lblUsuario.setBounds(376, 182, 75, 16);
					panelUsuarioPass.add(lblUsuario);
				}
				{
					lblPass = new JLabel("Contrase\u00F1a:");
					lblPass.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
					lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
					lblPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
					lblPass.setBounds(366, 235, 85, 13);
					panelUsuarioPass.add(lblPass);
				}
				{
					textUsuario = new JTextField();
					textUsuario.setBounds(461, 182, 129, 21);
					panelUsuarioPass.add(textUsuario);
					textUsuario.setColumns(10);
				}
				{
					btnIniciar = new JButton("Iniciar Sesión");
					btnIniciar.addChangeListener(new BtnIniciarChangeListener());
					btnIniciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnIniciar.addActionListener(new BtnPanelActionListener());
					btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 16));
					btnIniciar.setBounds(444, 292, 161, 46);
					panelUsuarioPass.add(btnIniciar);
				}
				{
					passwordField = new JPasswordField();
					passwordField.setEnabled(false);
					passwordField.setBounds(461, 234, 129, 19);
					panelUsuarioPass.add(passwordField);
				}
				{
					panel_3 = new JPanel();
					panel_3.setBorder(new TitledBorder(null, "Foto de Perfil", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panel_3.setBounds(195, 158, 161, 151);
					panelUsuarioPass.add(panel_3);
					panel_3.setLayout(null);
					{
						
						lblFoto = new JLabel("");
						lblFoto.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/user.png")));
						lblFoto.setBounds(26, 10, 106, 131);
						panel_3.add(lblFoto);
					}
				}
			}
		}
		{
			panelMenuPrincipal = new JPanel();
			frmGestorLosOlivos.getContentPane().add(panelMenuPrincipal, "Iniciar Sesión");
			panelMenuPrincipal.setLayout(new BorderLayout(0, 0));
			{
				panelMigas = new JPanel();
				panelMenuPrincipal.add(panelMigas, BorderLayout.WEST);
				GridBagLayout gbl_panelMigas = new GridBagLayout();
				gbl_panelMigas.columnWidths = new int[]{133, 0};
				gbl_panelMigas.rowHeights = new int[]{112, 0};
				gbl_panelMigas.columnWeights = new double[]{0.0, Double.MIN_VALUE};
				gbl_panelMigas.rowWeights = new double[]{1.0, Double.MIN_VALUE};
				panelMigas.setLayout(gbl_panelMigas);
				{
					treePrograma = new JTree();
					treePrograma.setAutoscrolls(true);
					treePrograma.setBackground(Color.WHITE);
					treePrograma.setForeground(Color.WHITE);
					treePrograma.setModel(new DefaultTreeModel(
						new DefaultMutableTreeNode("Gestor") {
							{
								DefaultMutableTreeNode node_1;
								DefaultMutableTreeNode node_2;
								node_1 = new DefaultMutableTreeNode("Parcelas-Bungalows");
									node_2 = new DefaultMutableTreeNode("parcelas");
										node_2.add(new DefaultMutableTreeNode("A\u00F1adir"));
										node_2.add(new DefaultMutableTreeNode("Modificar"));
										node_2.add(new DefaultMutableTreeNode("Borrar"));
									node_1.add(node_2);
									node_2 = new DefaultMutableTreeNode("Bungalows");
										node_2.add(new DefaultMutableTreeNode("A\u00F1adir"));
										node_2.add(new DefaultMutableTreeNode("Modificar"));
										node_2.add(new DefaultMutableTreeNode("Borrar"));
									node_1.add(node_2);
								add(node_1);
								node_1 = new DefaultMutableTreeNode("Reservas");
									node_1.add(new DefaultMutableTreeNode("A\u00F1adir"));
									node_1.add(new DefaultMutableTreeNode("Modificar "));
									node_1.add(new DefaultMutableTreeNode("Borrar "));
								add(node_1);
								node_1 = new DefaultMutableTreeNode("Actividades");
									node_1.add(new DefaultMutableTreeNode("A\u00F1adir"));
									node_1.add(new DefaultMutableTreeNode("Modificar"));
									node_1.add(new DefaultMutableTreeNode("Borrar"));
								add(node_1);
								node_1 = new DefaultMutableTreeNode("Rutas");
									node_1.add(new DefaultMutableTreeNode("Consultar"));
									node_1.add(new DefaultMutableTreeNode("Dise\u00F1ar"));
								add(node_1);
								node_1 = new DefaultMutableTreeNode("Monitores");
									node_1.add(new DefaultMutableTreeNode("A\u00F1adir"));
									node_1.add(new DefaultMutableTreeNode("Modificar"));
									node_1.add(new DefaultMutableTreeNode("Borrar"));
								add(node_1);
								add(new DefaultMutableTreeNode("Configuracion"));
							}
						}
					));
					GridBagConstraints gbc_treePrograma = new GridBagConstraints();
					gbc_treePrograma.fill = GridBagConstraints.BOTH;
					gbc_treePrograma.gridx = 0;
					gbc_treePrograma.gridy = 0;
					panelMigas.add(treePrograma, gbc_treePrograma);
				}
			}
			{
				panelBanner = new JPanel();
				panelMenuPrincipal.add(panelBanner, BorderLayout.NORTH);
				GridBagLayout gbl_panelBanner = new GridBagLayout();
				gbl_panelBanner.columnWidths = new int[]{844, 0};
				gbl_panelBanner.rowHeights = new int[]{50, 0};
				gbl_panelBanner.columnWeights = new double[]{0.0, Double.MIN_VALUE};
				gbl_panelBanner.rowWeights = new double[]{0.0, Double.MIN_VALUE};
				panelBanner.setLayout(gbl_panelBanner);
				{
					lblBanner = new JLabel("");
					lblBanner.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					lblBanner.addMouseListener(new LblBannerMouseListener());
					lblBanner.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/banner.jpg")));
					GridBagConstraints gbc_lblBanner = new GridBagConstraints();
					gbc_lblBanner.fill = GridBagConstraints.VERTICAL;
					gbc_lblBanner.gridx = 0;
					gbc_lblBanner.gridy = 0;
					panelBanner.add(lblBanner, gbc_lblBanner);
				}
			}
			{
				panelPrincipal = new JPanel();
				panelMenuPrincipal.add(panelPrincipal, BorderLayout.CENTER);
				panelPrincipal.setLayout(new CardLayout(0, 0));
				{
					panelBotones = new JPanel();
					panelBotones.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
					panelPrincipal.add(panelBotones, "panelPrincipal");
					GridBagLayout gbl_panelBotones = new GridBagLayout();
					gbl_panelBotones.columnWidths = new int[]{-3, 204, 209, 195, 8, 0};
					gbl_panelBotones.rowHeights = new int[]{0, 11, 0, 160, 160, 0, 0};
					gbl_panelBotones.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
					gbl_panelBotones.rowWeights = new double[]{1.0, 1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
					panelBotones.setLayout(gbl_panelBotones);
					{
						lblInfo = new JLabel("Seleccione una:");
						lblInfo.setFont(new Font("Tahoma", Font.BOLD, 17));
						GridBagConstraints gbc_lblInfo = new GridBagConstraints();
						gbc_lblInfo.fill = GridBagConstraints.HORIZONTAL;
						gbc_lblInfo.gridwidth = 2;
						gbc_lblInfo.insets = new Insets(0, 0, 5, 5);
						gbc_lblInfo.gridx = 1;
						gbc_lblInfo.gridy = 1;
						panelBotones.add(lblInfo, gbc_lblInfo);
					}
					{
						panelOpciones = new JPanel();
						GridBagConstraints gbc_panelOpciones = new GridBagConstraints();
						gbc_panelOpciones.fill = GridBagConstraints.HORIZONTAL;
						gbc_panelOpciones.insets = new Insets(0, 0, 5, 5);
						gbc_panelOpciones.gridx = 3;
						gbc_panelOpciones.gridy = 1;
						panelBotones.add(panelOpciones, gbc_panelOpciones);
						{
							btnCerrarSesion = new JButton("Cerrar Sesion");
							btnCerrarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnCerrarSesion.addActionListener(new BtnCerrarSesionActionListener());
							panelOpciones.add(btnCerrarSesion);
						}
						{
							btnNewButton = new JButton("");
							btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							panelOpciones.add(btnNewButton);
						}
						{
							btnAyuda = new JButton("");
							btnAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnAyuda.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/help.png")));
							btnAyuda.setBorder(null);
							panelOpciones.add(btnAyuda);
						}
					}
					{
						btnParcelasBungalows = new JButton("");
						btnParcelasBungalows.addChangeListener(new BtnIniciarChangeListener());
						btnParcelasBungalows.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnParcelasBungalows.addActionListener(new BtnParcelasBungalowsActionListener());
						btnParcelasBungalows.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/home@3x.png")));
						btnParcelasBungalows.setToolTipText("Parcelas / Bungalows");
						GridBagConstraints gbc_btnParcelasBungalows = new GridBagConstraints();
						gbc_btnParcelasBungalows.fill = GridBagConstraints.BOTH;
						gbc_btnParcelasBungalows.insets = new Insets(0, 0, 5, 5);
						gbc_btnParcelasBungalows.gridx = 1;
						gbc_btnParcelasBungalows.gridy = 3;
						panelBotones.add(btnParcelasBungalows, gbc_btnParcelasBungalows);
					}
					{
						btnReservas = new JButton("");
						btnReservas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnReservas.addActionListener(new BtnReservasActionListener());
						btnReservas.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/calendar.png")));
						btnReservas.setToolTipText("Reservas");
						btnReservas.setBackground(new Color(152, 251, 152));
						GridBagConstraints gbc_btnReservas = new GridBagConstraints();
						gbc_btnReservas.fill = GridBagConstraints.BOTH;
						gbc_btnReservas.insets = new Insets(0, 0, 5, 5);
						gbc_btnReservas.gridx = 2;
						gbc_btnReservas.gridy = 3;
						panelBotones.add(btnReservas, gbc_btnReservas);
					}
					{
						btnActividades = new JButton("");
						btnActividades.addChangeListener(new BtnIniciarChangeListener());
						btnActividades.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnActividades.addActionListener(new BtnActividadesActionListener());
						btnActividades.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/ping-pong@3x.png")));
						btnActividades.setToolTipText("Actividades");
						GridBagConstraints gbc_btnActividades = new GridBagConstraints();
						gbc_btnActividades.fill = GridBagConstraints.BOTH;
						gbc_btnActividades.insets = new Insets(0, 0, 5, 5);
						gbc_btnActividades.gridx = 3;
						gbc_btnActividades.gridy = 3;
						panelBotones.add(btnActividades, gbc_btnActividades);
					}
					{
						btnRutas = new JButton("");
						btnRutas.addChangeListener(new BtnIniciarChangeListener());
						btnRutas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnRutas.addActionListener(new BtnRutasActionListener());
						btnRutas.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/map@3x.png")));
						btnRutas.setToolTipText("Rutas");
						GridBagConstraints gbc_btnRutas = new GridBagConstraints();
						gbc_btnRutas.fill = GridBagConstraints.BOTH;
						gbc_btnRutas.insets = new Insets(0, 0, 5, 5);
						gbc_btnRutas.gridx = 1;
						gbc_btnRutas.gridy = 4;
						panelBotones.add(btnRutas, gbc_btnRutas);
					}
					{
						btnMonitores = new JButton("");
						btnMonitores.addChangeListener(new BtnIniciarChangeListener());
						btnMonitores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnMonitores.addActionListener(new BtnMonitoresActionListener());
						btnMonitores.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/users-1@3x.png")));
						btnMonitores.setToolTipText("Monitores");
						GridBagConstraints gbc_btnMonitores = new GridBagConstraints();
						gbc_btnMonitores.fill = GridBagConstraints.BOTH;
						gbc_btnMonitores.insets = new Insets(0, 0, 5, 5);
						gbc_btnMonitores.gridx = 2;
						gbc_btnMonitores.gridy = 4;
						panelBotones.add(btnMonitores, gbc_btnMonitores);
					}
					{
						btnConfiguracion = new JButton("");
						btnConfiguracion.addChangeListener(new BtnIniciarChangeListener());
						btnConfiguracion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnConfiguracion.addActionListener(new BtnConfiguracionActionListener());
						btnConfiguracion.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/gears@3x.png")));
						btnConfiguracion.setToolTipText("Configuraci\u00F3n");
						GridBagConstraints gbc_btnConfiguracion = new GridBagConstraints();
						gbc_btnConfiguracion.fill = GridBagConstraints.BOTH;
						gbc_btnConfiguracion.insets = new Insets(0, 0, 5, 5);
						gbc_btnConfiguracion.gridx = 3;
						gbc_btnConfiguracion.gridy = 4;
						panelBotones.add(btnConfiguracion, gbc_btnConfiguracion);
					}
				}
				{
					panelReservas = new JPanel();
					panelReservas.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
					panelPrincipal.add(panelReservas, "panelReserva");
					GridBagLayout gbl_panelReservas = new GridBagLayout();
					gbl_panelReservas.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
					gbl_panelReservas.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
					gbl_panelReservas.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
					gbl_panelReservas.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
					panelReservas.setLayout(gbl_panelReservas);
					{
						btnAyudaReservas = new JButton("");
						btnAyudaReservas.setBorder(null);
						btnAyudaReservas.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/help.png")));
						GridBagConstraints gbc_btnAyudaReservas = new GridBagConstraints();
						gbc_btnAyudaReservas.insets = new Insets(0, 0, 5, 5);
						gbc_btnAyudaReservas.gridx = 3;
						gbc_btnAyudaReservas.gridy = 1;
						panelReservas.add(btnAyudaReservas, gbc_btnAyudaReservas);
					}
					{
						btnNuevaReserva = new JButton("Nueva Reserva");
						btnNuevaReserva.setFont(new Font("Tahoma", Font.BOLD, 20));
						GridBagConstraints gbc_btnNuevaReserva = new GridBagConstraints();
						gbc_btnNuevaReserva.fill = GridBagConstraints.BOTH;
						gbc_btnNuevaReserva.insets = new Insets(0, 0, 5, 5);
						gbc_btnNuevaReserva.gridx = 2;
						gbc_btnNuevaReserva.gridy = 2;
						panelReservas.add(btnNuevaReserva, gbc_btnNuevaReserva);
					}
					{
						btnConsultarReserva = new JButton("ConsultarReserva");
						btnConsultarReserva.setFont(new Font("Tahoma", Font.BOLD, 20));
						GridBagConstraints gbc_btnConsultarReserva = new GridBagConstraints();
						gbc_btnConsultarReserva.fill = GridBagConstraints.BOTH;
						gbc_btnConsultarReserva.insets = new Insets(0, 0, 5, 5);
						gbc_btnConsultarReserva.gridx = 2;
						gbc_btnConsultarReserva.gridy = 4;
						panelReservas.add(btnConsultarReserva, gbc_btnConsultarReserva);
					}
					{
						btnBorrarReserva = new JButton("Borrar Reserva");
						btnBorrarReserva.setFont(new Font("Tahoma", Font.BOLD, 20));
						GridBagConstraints gbc_btnBorrarReserva = new GridBagConstraints();
						gbc_btnBorrarReserva.fill = GridBagConstraints.BOTH;
						gbc_btnBorrarReserva.insets = new Insets(0, 0, 5, 5);
						gbc_btnBorrarReserva.gridx = 2;
						gbc_btnBorrarReserva.gridy = 6;
						panelReservas.add(btnBorrarReserva, gbc_btnBorrarReserva);
					}
				}
				{
					panelParcelasBungalos = new JPanel();
					panelParcelasBungalos.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
					panelPrincipal.add(panelParcelasBungalos, "panelParcelaBungalow");
					panelParcelasBungalos.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
					{
						btnParcelas = new JButton("Parcelas");
						panelParcelasBungalos.add(btnParcelas);
					}
					{
						btnBungalows = new JButton("Bungalows");
						panelParcelasBungalos.add(btnBungalows);
					}
				}
				{
					panelRutas = new JPanel();
					panelRutas.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
					panelPrincipal.add(panelRutas, "panelRuta");
					{
						btnInfoRutas = new JButton("Info Rutas");
						panelRutas.add(btnInfoRutas);
					}
					{
						btnDiseñoRuta = new JButton("Dise\u00F1o Rutas");
						panelRutas.add(btnDiseñoRuta);
					}
				}
				{
					panelConfiguracion = new JPanel();
					panelConfiguracion.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
					panelPrincipal.add(panelConfiguracion, "panelConfiguracion");
					panelConfiguracion.setLayout(null);
					{
						btnAyudaConfiguracion = new JButton("");
						btnAyudaConfiguracion.setBorder(null);
						btnAyudaConfiguracion.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/help.png")));
						btnAyudaConfiguracion.setBounds(607, 24, 85, 42);
						panelConfiguracion.add(btnAyudaConfiguracion);
					}
					{
						lblIdioma = new JLabel("Idioma:");
						lblIdioma.setHorizontalAlignment(SwingConstants.RIGHT);
						lblIdioma.setFont(new Font("Tahoma", Font.PLAIN, 18));
						lblIdioma.setBounds(273, 121, 68, 32);
						panelConfiguracion.add(lblIdioma);
					}
					{
						lblApariencia = new JLabel("Apariencia:");
						lblApariencia.setHorizontalAlignment(SwingConstants.RIGHT);
						lblApariencia.setFont(new Font("Tahoma", Font.PLAIN, 18));
						lblApariencia.setBounds(247, 163, 94, 31);
						panelConfiguracion.add(lblApariencia);
					}
					{
						lblTipoLetra = new JLabel("Tipo de Letra:");
						lblTipoLetra.setHorizontalAlignment(SwingConstants.RIGHT);
						lblTipoLetra.setFont(new Font("Tahoma", Font.PLAIN, 18));
						lblTipoLetra.setBounds(209, 204, 132, 32);
						panelConfiguracion.add(lblTipoLetra);
					}
					{
						lblTamLetra = new JLabel("Tama\u00F1o de Letra:");
						lblTamLetra.setHorizontalAlignment(SwingConstants.RIGHT);
						lblTamLetra.setFont(new Font("Tahoma", Font.PLAIN, 18));
						lblTamLetra.setBounds(186, 246, 155, 29);
						panelConfiguracion.add(lblTamLetra);
					}
					{
						comboBox = new JComboBox();
						comboBox.setBounds(367, 130, 132, 21);
						panelConfiguracion.add(comboBox);
					}
					{
						comboBox_1 = new JComboBox();
						comboBox_1.setBounds(367, 171, 132, 21);
						panelConfiguracion.add(comboBox_1);
					}
					{
						comboBox_2 = new JComboBox();
						comboBox_2.setBounds(367, 213, 132, 21);
						panelConfiguracion.add(comboBox_2);
					}
					{
						comboBox_3 = new JComboBox();
						comboBox_3.setBounds(367, 253, 132, 21);
						panelConfiguracion.add(comboBox_3);
					}
					{
						btnGuardarCambios = new JButton("Guardar Cambios");
						btnGuardarCambios.setFont(new Font("Tahoma", Font.PLAIN, 18));
						btnGuardarCambios.setBounds(396, 340, 206, 32);
						panelConfiguracion.add(btnGuardarCambios);
					}
					{
						btnCancelarCambios = new JButton("Cancelar Cambios");
						btnCancelarCambios.setFont(new Font("Tahoma", Font.PLAIN, 18));
						btnCancelarCambios.setBounds(147, 340, 206, 32);
						panelConfiguracion.add(btnCancelarCambios);
					}
				}
				{
					panelMonitores = new JPanel();
					panelPrincipal.add(panelMonitores, "panelMonitores");
				}
				{
					panelActividades = new JPanel();
					panelPrincipal.add(panelActividades, "panelActividades");
				}
			}
			{
				lblBarraDeEstado = new JLabel("Barra de estado");
				lblBarraDeEstado.setFont(new Font("Tahoma", Font.PLAIN, 12));
				panelMenuPrincipal.add(lblBarraDeEstado, BorderLayout.SOUTH);
			}
		}
		{
			menuBar = new JMenuBar();
			frmGestorLosOlivos.setJMenuBar(menuBar);
			{
				mnInicio = new JMenu("Inicio");
				mnInicio.setMnemonic('I');
				menuBar.add(mnInicio);
			}
			{
				mnVer = new JMenu("Ver");
				mnVer.setMnemonic('V');
				menuBar.add(mnVer);
			}
			{
				mnAyuda = new JMenu("Ayuda");
				mnAyuda.setMnemonic('Y');
				menuBar.add(mnAyuda);
			}
		}
	}

	private class BtnPanelActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout panel = (CardLayout) (frmGestorLosOlivos.getContentPane().getLayout());
			panel.show(frmGestorLosOlivos.getContentPane(), e.getActionCommand());
		}
	}
	private class BtnReservasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout panel = (CardLayout) (panelPrincipal.getLayout());
			panel.show(panelPrincipal, "panelReserva");
		}
	}
	private class BtnParcelasBungalowsActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout panel = (CardLayout) (panelPrincipal.getLayout());
			panel.show(panelPrincipal, "panelParcelaBungalow");
		}
		
	}
	private class LblBannerMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			CardLayout panel = (CardLayout) (panelPrincipal.getLayout());
			panel.show(panelPrincipal, "panelPrincipal");
		}
	}
	private class BtnRutasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout panel = (CardLayout) (panelPrincipal.getLayout());
			panel.show(panelPrincipal, "panelRuta");
		}
	}
	private class BtnCerrarSesionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout panel = (CardLayout) (frmGestorLosOlivos.getContentPane().getLayout());
			panel.show(frmGestorLosOlivos.getContentPane(), "PanelSesion");
		}
	}
	private class BtnConfiguracionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout panel = (CardLayout) (panelPrincipal.getLayout());
			panel.show(panelPrincipal, "panelConfiguracion");
		}
	}
	private class BtnMonitoresActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout panel = (CardLayout) (panelPrincipal.getLayout());
			panel.show(panelPrincipal, "panelMonitores");
		}
	}
	private class BtnActividadesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout panel = (CardLayout) (panelPrincipal.getLayout());
			panel.show(panelPrincipal, "panelActividades");
		}
	}
	private class BtnIniciarChangeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			switch(index) {
			case 0:
				((JButton) e.getSource()).setBackground(new Color(254, 254, 190));
				index++;
			break;
			case 1:
				((JButton) e.getSource()).setBackground(null);
				index--;
			break;
			}
			
		}
	}
}
