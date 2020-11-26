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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.Cursor;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Component;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import java.awt.Toolkit;
import javax.swing.border.EtchedBorder;

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
	private JPanel panelParcelasBungalos;
	private JButton btnParcelas;
	private JButton btnBungalows;
	private JPanel panelRutas;
	private JButton btnInfoRutas;
	private JButton btnDiseñoRuta;
	private JPanel panelConfiguracion;
	private JPanel panelMonitores;
	private JPanel panelActividades;
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
	private String text = null;
	private JButton btnAnadirMonitor;
	private JButton btnModificarMonitor;
	private JButton btnEliminarMonitor;
	private JScrollPane scrollPane;
	private JList list;
	private JLabel lblMonitores;
	private JPanel panel_1;
	private JButton btnHome;
	private JButton btnUser;
	private JButton btnHelp;
	private JScrollPane scrollMigas;
	private JButton btnLogout;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JPanel panel_4;
	private static int comprobadorUsuario = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_Gestor window = new UI_Gestor();
					window.frmGestorLosOlivos.setVisible(true);
					window.frmGestorLosOlivos.setLocationRelativeTo(null);
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
		frmGestorLosOlivos.setIconImage(Toolkit.getDefaultToolkit().getImage(UI_Gestor.class.getResource("/presentacion/logo.png")));
		frmGestorLosOlivos.addWindowListener(new FrmGestorLosOlivosWindowListener());
		frmGestorLosOlivos.setResizable(false);
		frmGestorLosOlivos.setTitle("Gestor Los olivos");
		frmGestorLosOlivos.setBounds(100, 100, 849, 596);
		// frmGestorLosOlivos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestorLosOlivos.getContentPane().setLayout(new CardLayout(0, 0));
		{
			panelAutenticacion = new JPanel();
			frmGestorLosOlivos.getContentPane().add(panelAutenticacion, "PanelSesion");
			panelAutenticacion.setLayout(new BorderLayout(0, 0));
			{
				lblBarraEstado = new JLabel("Barra de estado");
				lblBarraEstado.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblBarraEstado.setVerticalAlignment(SwingConstants.TOP);
				panelAutenticacion.add(lblBarraEstado, BorderLayout.SOUTH);
			}
			{
				panelUsuarioPass = new JPanel();
				panelUsuarioPass.setBackground(SystemColor.info);
				panelUsuarioPass.setBorder(new EmptyBorder(0, 0, 0, 0));
				panelAutenticacion.add(panelUsuarioPass, BorderLayout.CENTER);
				GridBagLayout gbl_panelUsuarioPass = new GridBagLayout();
				gbl_panelUsuarioPass.columnWidths = new int[]{453, 129, 0};
				gbl_panelUsuarioPass.rowHeights = new int[]{205, 0};
				gbl_panelUsuarioPass.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
				gbl_panelUsuarioPass.rowWeights = new double[]{1.0, Double.MIN_VALUE};
				panelUsuarioPass.setLayout(gbl_panelUsuarioPass);
				{
					panel_2 = new JPanel();
					GridBagConstraints gbc_panel_2 = new GridBagConstraints();
					gbc_panel_2.fill = GridBagConstraints.BOTH;
					gbc_panel_2.insets = new Insets(0, 0, 0, 5);
					gbc_panel_2.gridx = 0;
					gbc_panel_2.gridy = 0;
					panelUsuarioPass.add(panel_2, gbc_panel_2);
					panel_2.setLayout(null);
					{
						lblNewLabel = new JLabel("New label");
						lblNewLabel.setBounds(185, 247, 45, 13);
						panel_2.add(lblNewLabel);
					}
				}
				{
					panel_4 = new JPanel();
					panel_4.setOpaque(false);
					panel_4.setLayout(null);
					GridBagConstraints gbc_panel_4 = new GridBagConstraints();
					gbc_panel_4.fill = GridBagConstraints.BOTH;
					gbc_panel_4.gridx = 1;
					gbc_panel_4.gridy = 0;
					panelUsuarioPass.add(panel_4, gbc_panel_4);
					{
						panel_3 = new JPanel();
						panel_3.setBounds(122, 73, 158, 160);
						panel_4.add(panel_3);
						panel_3.setBackground(SystemColor.info);
						panel_3.setBorder(new TitledBorder(null, "Foto de Perfil", TitledBorder.LEADING, TitledBorder.TOP,
								null, null));
						panel_3.setLayout(null);
						{

							lblFoto = new JLabel("");
							lblFoto.setBounds(22, 15, 115, 135);
							panel_3.add(lblFoto);
							lblFoto.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/user.png")));
						}
					}
					{
						lblUsuario = new JLabel("Usuario:");
						lblUsuario.setBounds(46, 260, 106, 27);
						panel_4.add(lblUsuario);
						lblUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
						lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
						lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
					}
					{
						textUsuario = new JTextField();
						textUsuario.setBounds(162, 264, 150, 19);
						panel_4.add(textUsuario);
						textUsuario.setColumns(10);
					}
					{
						lblPass = new JLabel("Password:");
						lblPass.setBounds(46, 292, 106, 20);
						panel_4.add(lblPass);
						lblPass.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
						lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
						lblPass.setFont(new Font("Tahoma", Font.PLAIN, 16));
					}
					{
						passwordField = new JPasswordField();
						passwordField.setBounds(162, 293, 150, 19);
						panel_4.add(passwordField);
						passwordField.setEnabled(false);
					}
					{
						btnIniciar = new JButton("Iniciar Sesión");
						btnIniciar.setBounds(122, 376, 158, 29);
						panel_4.add(btnIniciar);
						btnIniciar.addChangeListener(new BtnIniciarChangeListener());
						btnIniciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnIniciar.addActionListener(new BtnInicioSesionActionListener());
						btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
				gbl_panelMigas.columnWidths = new int[] { 133, 0 };
				gbl_panelMigas.rowHeights = new int[] { 0, 0 };
				gbl_panelMigas.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
				gbl_panelMigas.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
				panelMigas.setLayout(gbl_panelMigas);
				{
					scrollMigas = new JScrollPane();
					GridBagConstraints gbc_scrollMigas = new GridBagConstraints();
					gbc_scrollMigas.fill = GridBagConstraints.BOTH;
					gbc_scrollMigas.gridx = 0;
					gbc_scrollMigas.gridy = 0;
					panelMigas.add(scrollMigas, gbc_scrollMigas);
					{
						treePrograma = new JTree();
						treePrograma.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
						treePrograma.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						scrollMigas.setViewportView(treePrograma);
						treePrograma.addTreeSelectionListener(new TreeProgramaTreeSelectionListener());
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
					}
				}
			}
			{
				panelBanner = new JPanel();
				panelMenuPrincipal.add(panelBanner, BorderLayout.NORTH);
				GridBagLayout gbl_panelBanner = new GridBagLayout();
				gbl_panelBanner.columnWidths = new int[] { 844, 0 };
				gbl_panelBanner.rowHeights = new int[] { 50, 0 };
				gbl_panelBanner.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
				gbl_panelBanner.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
				panelBanner.setLayout(gbl_panelBanner);
				{
					lblBanner = new JLabel("");
					lblBanner.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
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
					gbl_panelBotones.columnWidths = new int[] { -3, 204, 209, 195, 8, 0 };
					gbl_panelBotones.rowHeights = new int[] { 0, 11, 0, 160, 160, 0, 0 };
					gbl_panelBotones.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
					gbl_panelBotones.rowWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
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
						btnParcelasBungalows = new JButton("");
						btnParcelasBungalows.addChangeListener(new BtnIniciarChangeListener());
						btnParcelasBungalows.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnParcelasBungalows.addActionListener(new BtnCambioPanelActionListener("panelParcelas-Bungalows"));
						btnParcelasBungalows
								.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/home@3x.png")));
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
						btnReservas.addActionListener(new BtnCambioPanelActionListener("panelReservas"));
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
						btnActividades.addActionListener(new BtnCambioPanelActionListener("panelActividades"));
						btnActividades
								.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/ping-pong@3x.png")));
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
						btnRutas.addActionListener(new BtnCambioPanelActionListener("panelRutas"));
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
						btnMonitores.addActionListener(new BtnCambioPanelActionListener("panelMonitores"));
						btnMonitores
								.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/users-1@3x.png")));
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
						btnConfiguracion.addActionListener(new BtnCambioPanelActionListener("panelConfiguracion"));
						btnConfiguracion
								.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/gears@3x.png")));
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
					panelPrincipal.add(panelReservas, "panelReservas");
					GridBagLayout gbl_panelReservas = new GridBagLayout();
					gbl_panelReservas.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
					gbl_panelReservas.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
					gbl_panelReservas.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
					gbl_panelReservas.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0,
							Double.MIN_VALUE };
					panelReservas.setLayout(gbl_panelReservas);
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
						btnConsultarReserva = new JButton("Consultar Reserva");
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
					panelPrincipal.add(panelParcelasBungalos, "panelParcelas-Bungalows");
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
					panelPrincipal.add(panelRutas, "panelRutas");
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
					GridBagLayout gbl_panelMonitores = new GridBagLayout();
					gbl_panelMonitores.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
					gbl_panelMonitores.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
					gbl_panelMonitores.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
							Double.MIN_VALUE };
					gbl_panelMonitores.rowWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0,
							Double.MIN_VALUE };
					panelMonitores.setLayout(gbl_panelMonitores);
					{
						lblMonitores = new JLabel("Monitores:");
						lblMonitores.setFont(new Font("Tahoma", Font.PLAIN, 25));
						lblMonitores.setAlignmentY(Component.TOP_ALIGNMENT);
						GridBagConstraints gbc_lblMonitores = new GridBagConstraints();
						gbc_lblMonitores.anchor = GridBagConstraints.WEST;
						gbc_lblMonitores.insets = new Insets(0, 0, 5, 5);
						gbc_lblMonitores.gridx = 1;
						gbc_lblMonitores.gridy = 0;
						panelMonitores.add(lblMonitores, gbc_lblMonitores);
					}
					{
						scrollPane = new JScrollPane();
						GridBagConstraints gbc_scrollPane = new GridBagConstraints();
						gbc_scrollPane.gridwidth = 3;
						gbc_scrollPane.gridheight = 7;
						gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
						gbc_scrollPane.fill = GridBagConstraints.BOTH;
						gbc_scrollPane.gridx = 1;
						gbc_scrollPane.gridy = 1;
						panelMonitores.add(scrollPane, gbc_scrollPane);
						{
							list = new JList();
							scrollPane.setViewportView(list);
						}
					}
					{
						btnAnadirMonitor = new JButton("A\u00F1adir");
						btnAnadirMonitor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						GridBagConstraints gbc_btnAnadirMonitor = new GridBagConstraints();
						gbc_btnAnadirMonitor.fill = GridBagConstraints.BOTH;
						gbc_btnAnadirMonitor.insets = new Insets(0, 0, 5, 5);
						gbc_btnAnadirMonitor.gridx = 5;
						gbc_btnAnadirMonitor.gridy = 2;
						panelMonitores.add(btnAnadirMonitor, gbc_btnAnadirMonitor);
					}
					{
						btnModificarMonitor = new JButton("Modificar");
						btnModificarMonitor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						GridBagConstraints gbc_btnModificarMonitor = new GridBagConstraints();
						gbc_btnModificarMonitor.fill = GridBagConstraints.BOTH;
						gbc_btnModificarMonitor.insets = new Insets(0, 0, 5, 5);
						gbc_btnModificarMonitor.gridx = 5;
						gbc_btnModificarMonitor.gridy = 4;
						panelMonitores.add(btnModificarMonitor, gbc_btnModificarMonitor);
					}
					{
						btnEliminarMonitor = new JButton("Eliminar");
						btnEliminarMonitor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						GridBagConstraints gbc_btnEliminarMonitor = new GridBagConstraints();
						gbc_btnEliminarMonitor.fill = GridBagConstraints.BOTH;
						gbc_btnEliminarMonitor.insets = new Insets(0, 0, 5, 5);
						gbc_btnEliminarMonitor.gridx = 5;
						gbc_btnEliminarMonitor.gridy = 6;
						panelMonitores.add(btnEliminarMonitor, gbc_btnEliminarMonitor);
					}
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
			{
				panel_1 = new JPanel();
				panel_1.setBackground(SystemColor.controlHighlight);
				panelMenuPrincipal.add(panel_1, BorderLayout.EAST);
				GridBagLayout gbl_panel_1 = new GridBagLayout();
				gbl_panel_1.columnWidths = new int[] { 33, 0 };
				gbl_panel_1.rowHeights = new int[] { 33, 40, 36, 32, 0 };
				gbl_panel_1.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
				gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
				panel_1.setLayout(gbl_panel_1);
				{
					{
						btnHome = new JButton("");
						btnHome.addActionListener(new BtnHomeActionListener());
						btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnHome.setBorder(null);
						btnHome.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/pestana1.png")));
						GridBagConstraints gbc_btnHome = new GridBagConstraints();
						gbc_btnHome.insets = new Insets(0, 0, 5, 0);
						gbc_btnHome.gridx = 0;
						gbc_btnHome.gridy = 0;
						panel_1.add(btnHome, gbc_btnHome);
					}
				}
				{
					btnHelp = new JButton("");
					btnHelp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnHelp.setBorder(null);
					btnHelp.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/help.png")));
					GridBagConstraints gbc_btnHelp = new GridBagConstraints();
					gbc_btnHelp.insets = new Insets(0, 0, 5, 0);
					gbc_btnHelp.gridx = 0;
					gbc_btnHelp.gridy = 1;
					panel_1.add(btnHelp, gbc_btnHelp);
				}
				{
					btnUser = new JButton("");
					btnUser.addActionListener(new BtnUserActionListener());
					btnUser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnUser.setBorder(null);
					btnUser.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/user-male.png")));
					GridBagConstraints gbc_btnUser = new GridBagConstraints();
					gbc_btnUser.insets = new Insets(0, 0, 5, 0);
					gbc_btnUser.gridx = 0;
					gbc_btnUser.gridy = 2;
					panel_1.add(btnUser, gbc_btnUser);
				}
				{
					btnLogout = new JButton("");
					btnLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnLogout.addActionListener(new BtnLogoutActionListener());
					btnLogout.setBorder(null);
					btnLogout.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/exit.png")));
					GridBagConstraints gbc_btnLogout = new GridBagConstraints();
					gbc_btnLogout.gridx = 0;
					gbc_btnLogout.gridy = 3;
					panel_1.add(btnLogout, gbc_btnLogout);
				}
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
	
	//***EVENTOS***//
	
	private class FrmGestorLosOlivosWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			int sel = JOptionPane.showOptionDialog(frmGestorLosOlivos, "¿Seguro que quieres salir?",
					"Salir del programa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (sel == JOptionPane.YES_OPTION) {
				frmGestorLosOlivos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Yes
			} else {
				frmGestorLosOlivos.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // No
			}
		}
	}

	
	private class BtnInicioSesionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout panel = (CardLayout) (frmGestorLosOlivos.getContentPane().getLayout());
			panel.show(frmGestorLosOlivos.getContentPane(), e.getActionCommand());
			Date date=java.util.Calendar.getInstance().getTime();
			lblBarraEstado.setText("Sesión iniciada a las: "+ date);
			lblBarraDeEstado.setText("Sesión iniciada a las: "+ date);
		}
	}
	
	private class BtnLogoutActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			int sel = JOptionPane.showOptionDialog(frmGestorLosOlivos, "¿Seguro que quieres cerrar sesión?",
					"Cerrar Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (sel == JOptionPane.YES_OPTION) {
				CardLayout panel = (CardLayout) (frmGestorLosOlivos.getContentPane().getLayout());
				panel.show(frmGestorLosOlivos.getContentPane(), "PanelSesion"); // Yes
				Date date=java.util.Calendar.getInstance().getTime();
				lblBarraEstado.setText("Sesión cerrada a las: "+ date);
				lblBarraDeEstado.setText("Sesión cerrada a las: "+ date);
			} 
		}
	}
	
	private class BtnHomeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout panel = (CardLayout) (panelPrincipal.getLayout());
			panel.show(panelPrincipal, "panelPrincipal");
		}
	}

	private class BtnUserActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFrame window= new UI_Usuario();
			window.setVisible(true);
		}
	}
	
	
	
	
	private class BtnCambioPanelActionListener implements ActionListener {
		String pane = null;

		public BtnCambioPanelActionListener(String pane) {
			this.pane = pane;
		}

		public void actionPerformed(ActionEvent e) {
			CardLayout panel = (CardLayout) (panelPrincipal.getLayout());
			panel.show(panelPrincipal, pane);
		}
	}

	private class BtnIniciarChangeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			switch (index) {
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

	private class TreeProgramaTreeSelectionListener implements TreeSelectionListener {
		public void valueChanged(TreeSelectionEvent e) {
			CardLayout panel = null;
			if(e.getNewLeadSelectionPath() != null) {
				int tam = e.getNewLeadSelectionPath().getPath().length;
				switch(tam) {
				case 1:
					panel = (CardLayout) (panelPrincipal.getLayout());
					panel.show(panelPrincipal, "panelPrincipal");	
					break;
				case 2:
					panel = (CardLayout) (panelPrincipal.getLayout());
					panel.show(panelPrincipal, "panel" + e.getNewLeadSelectionPath().getPath()[1]);	
					break;
				case 3:
					//rellenar cuando esten disponibles las ventanas
					break;
				default:
			
				}
				treePrograma.setSelectionPath(null);
			} 
			
		}
	}


}
