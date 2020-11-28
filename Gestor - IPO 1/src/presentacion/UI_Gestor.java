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
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

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
	private JPanel panelFoto;
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
	private JButton btnConsultarReservas;
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
	private JScrollPane scrollPaneMonitores;
	private JList listMonitores;
	private JLabel lblMonitores;
	private JPanel panelOpcionesPrincipales;
	private JButton btnHome;
	private JButton btnUser;
	private JButton btnHelp;
	private JScrollPane scrollMigas;
	private JButton btnLogout;
	private JPanel panelImagen;
	private JLabel lblImagen;
	private JPanel panelInicioSesion;
	private static int comprobadorUsuario = 0;
	private JLabel lblActividades;
	private JScrollPane scrollPaneActividades;
	private JList listActividades;
	private JButton btnAnadirActividad;
	private JButton btnModificarActividad;
	private JButton btnEliminarActividad;
	private JButton btnCalendario;
	private JButton btnVerActividad;
	private JButton btnVerMonitor;

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
		frmGestorLosOlivos.setIconImage(Toolkit.getDefaultToolkit().getImage(UI_Gestor.class.getResource("/recursos/logo.png")));
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
				gbl_panelUsuarioPass.columnWidths = new int[]{415, 129, 0};
				gbl_panelUsuarioPass.rowHeights = new int[]{531, 0};
				gbl_panelUsuarioPass.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
				gbl_panelUsuarioPass.rowWeights = new double[]{1.0, Double.MIN_VALUE};
				panelUsuarioPass.setLayout(gbl_panelUsuarioPass);
				{
					panelImagen = new JPanel();
					GridBagConstraints gbc_panelImagen = new GridBagConstraints();
					gbc_panelImagen.fill = GridBagConstraints.BOTH;
					gbc_panelImagen.insets = new Insets(0, 0, 0, 5);
					gbc_panelImagen.gridx = 0;
					gbc_panelImagen.gridy = 0;
					panelUsuarioPass.add(panelImagen, gbc_panelImagen);
					panelImagen.setLayout(null);
					{
						lblImagen = new JLabel("New label");
						lblImagen.setBounds(185, 247, 45, 13);
						panelImagen.add(lblImagen);
					}
				}
				{
					panelInicioSesion = new JPanel();
					panelInicioSesion.setOpaque(false);
					panelInicioSesion.setLayout(null);
					GridBagConstraints gbc_panelInicioSesion = new GridBagConstraints();
					gbc_panelInicioSesion.fill = GridBagConstraints.BOTH;
					gbc_panelInicioSesion.gridx = 1;
					gbc_panelInicioSesion.gridy = 0;
					panelUsuarioPass.add(panelInicioSesion, gbc_panelInicioSesion);
					{
						panelFoto = new JPanel();
						panelFoto.setBounds(122, 73, 158, 160);
						panelInicioSesion.add(panelFoto);
						panelFoto.setBackground(SystemColor.info);
						panelFoto.setBorder(new TitledBorder(null, "Foto de Perfil", TitledBorder.LEADING, TitledBorder.TOP,
								null, null));
						panelFoto.setLayout(null);
						{

							lblFoto = new JLabel("");
							lblFoto.setBounds(22, 15, 115, 135);
							panelFoto.add(lblFoto);
							lblFoto.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/user.png")));
						}
					}
					{
						lblUsuario = new JLabel("Usuario:");
						lblUsuario.setBounds(46, 260, 106, 27);
						panelInicioSesion.add(lblUsuario);
						lblUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
						lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
						lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
					}
					{
						textUsuario = new JTextField();
						textUsuario.setBounds(162, 264, 150, 19);
						panelInicioSesion.add(textUsuario);
						textUsuario.setColumns(10);
					}
					{
						lblPass = new JLabel("Password:");
						lblPass.setBounds(46, 292, 106, 20);
						panelInicioSesion.add(lblPass);
						lblPass.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
						lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
						lblPass.setFont(new Font("Tahoma", Font.PLAIN, 16));
					}
					{
						passwordField = new JPasswordField();
						passwordField.setBounds(162, 293, 150, 19);
						panelInicioSesion.add(passwordField);
						passwordField.setEnabled(false);
					}
					{
						btnIniciar = new JButton("Iniciar Sesión");
						btnIniciar.setBounds(122, 376, 158, 29);
						panelInicioSesion.add(btnIniciar);
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
					lblBanner.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/banner.jpg")));
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
						btnParcelasBungalows.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
						btnParcelasBungalows.addChangeListener(new BtnIniciarChangeListener());
						btnParcelasBungalows.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnParcelasBungalows.addActionListener(new BtnCambioPanelActionListener("panelParcelas-Bungalows"));
						btnParcelasBungalows
								.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/home@2x.png")));
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
						btnReservas.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
						btnReservas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnReservas.addActionListener(new BtnCambioPanelActionListener("panelReservas"));
						btnReservas.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/calendar@2x.png")));
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
						btnConfiguracion = new JButton("");
						btnConfiguracion.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
						btnConfiguracion.addChangeListener(new BtnIniciarChangeListener());
						btnConfiguracion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnConfiguracion.addActionListener(new BtnCambioPanelActionListener("panelConfiguracion"));
						{
							btnActividades = new JButton("");
							btnActividades.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
							btnActividades.addChangeListener(new BtnIniciarChangeListener());
							btnActividades.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnActividades.addActionListener(new BtnCambioPanelActionListener("panelActividades"));
							{
								btnRutas = new JButton("");
								btnRutas.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
								btnRutas.addChangeListener(new BtnIniciarChangeListener());
								btnRutas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
								btnRutas.addActionListener(new BtnCambioPanelActionListener("panelRutas"));
								btnRutas.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/location-pin@2x.png")));
								btnRutas.setToolTipText("Rutas");
								GridBagConstraints gbc_btnRutas = new GridBagConstraints();
								gbc_btnRutas.fill = GridBagConstraints.BOTH;
								gbc_btnRutas.insets = new Insets(0, 0, 5, 5);
								gbc_btnRutas.gridx = 3;
								gbc_btnRutas.gridy = 3;
								panelBotones.add(btnRutas, gbc_btnRutas);
							}
							{
								btnMonitores = new JButton("");
								btnMonitores.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
								btnMonitores.addChangeListener(new BtnIniciarChangeListener());
								btnMonitores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
								btnMonitores.addActionListener(new BtnCambioPanelActionListener("panelMonitores"));
								btnMonitores
										.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/user@2x.png")));
								btnMonitores.setToolTipText("Monitores");
								GridBagConstraints gbc_btnMonitores = new GridBagConstraints();
								gbc_btnMonitores.fill = GridBagConstraints.BOTH;
								gbc_btnMonitores.insets = new Insets(0, 0, 5, 5);
								gbc_btnMonitores.gridx = 1;
								gbc_btnMonitores.gridy = 4;
								panelBotones.add(btnMonitores, gbc_btnMonitores);
							}
							btnActividades
									.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/puzzle-piece@2x.png")));
							btnActividades.setToolTipText("Actividades");
							GridBagConstraints gbc_btnActividades = new GridBagConstraints();
							gbc_btnActividades.fill = GridBagConstraints.BOTH;
							gbc_btnActividades.insets = new Insets(0, 0, 5, 5);
							gbc_btnActividades.gridx = 2;
							gbc_btnActividades.gridy = 4;
							panelBotones.add(btnActividades, gbc_btnActividades);
						}
						btnConfiguracion
								.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/gear@2x.png")));
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
						btnNuevaReserva.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnNuevaReserva.addActionListener(new BtnReservasActionListener(0));
						btnNuevaReserva.setFont(new Font("Tahoma", Font.BOLD, 20));
						GridBagConstraints gbc_btnNuevaReserva = new GridBagConstraints();
						gbc_btnNuevaReserva.fill = GridBagConstraints.BOTH;
						gbc_btnNuevaReserva.insets = new Insets(0, 0, 5, 5);
						gbc_btnNuevaReserva.gridx = 2;
						gbc_btnNuevaReserva.gridy = 2;
						panelReservas.add(btnNuevaReserva, gbc_btnNuevaReserva);
					}
					{
						btnBorrarReserva = new JButton("Borrar Reserva");
						btnBorrarReserva.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnBorrarReserva.addActionListener(new BtnReservasActionListener(1));
						btnBorrarReserva.setFont(new Font("Tahoma", Font.BOLD, 20));
						GridBagConstraints gbc_btnBorrarReserva = new GridBagConstraints();
						gbc_btnBorrarReserva.fill = GridBagConstraints.BOTH;
						gbc_btnBorrarReserva.insets = new Insets(0, 0, 5, 5);
						gbc_btnBorrarReserva.gridx = 2;
						gbc_btnBorrarReserva.gridy = 4;
						panelReservas.add(btnBorrarReserva, gbc_btnBorrarReserva);
					}
					{
						btnConsultarReservas = new JButton("Consultar Reservas");
						btnConsultarReservas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnConsultarReservas.addActionListener(new BtnReservasActionListener(2));
						btnConsultarReservas.setFont(new Font("Tahoma", Font.BOLD, 20));
						GridBagConstraints gbc_btnConsultarReservas = new GridBagConstraints();
						gbc_btnConsultarReservas.fill = GridBagConstraints.BOTH;
						gbc_btnConsultarReservas.insets = new Insets(0, 0, 5, 5);
						gbc_btnConsultarReservas.gridx = 2;
						gbc_btnConsultarReservas.gridy = 6;
						panelReservas.add(btnConsultarReservas, gbc_btnConsultarReservas);
					}
				}
				{
					panelParcelasBungalos = new JPanel();
					panelParcelasBungalos.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
					panelPrincipal.add(panelParcelasBungalos, "panelParcelas-Bungalows");
					GridBagLayout gbl_panelParcelasBungalos = new GridBagLayout();
					gbl_panelParcelasBungalos.columnWidths = new int[]{33, 71, 81, 0, 0};
					gbl_panelParcelasBungalos.rowHeights = new int[]{21, 0, 0, 0};
					gbl_panelParcelasBungalos.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
					gbl_panelParcelasBungalos.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
					panelParcelasBungalos.setLayout(gbl_panelParcelasBungalos);
					{
						btnParcelas = new JButton("Parcelas");
						GridBagConstraints gbc_btnParcelas = new GridBagConstraints();
						gbc_btnParcelas.fill = GridBagConstraints.BOTH;
						gbc_btnParcelas.insets = new Insets(0, 0, 5, 5);
						gbc_btnParcelas.gridx = 1;
						gbc_btnParcelas.gridy = 1;
						panelParcelasBungalos.add(btnParcelas, gbc_btnParcelas);
					}
					{
						btnBungalows = new JButton("");
						btnBungalows.setOpaque(false);
						btnBungalows.setBorder(null);
						btnBungalows.setBackground(new Color(240, 240, 240));
						btnBungalows.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/home@3x.png")));
						GridBagConstraints gbc_btnBungalows = new GridBagConstraints();
						gbc_btnBungalows.fill = GridBagConstraints.BOTH;
						gbc_btnBungalows.insets = new Insets(0, 0, 5, 5);
						gbc_btnBungalows.gridx = 2;
						gbc_btnBungalows.gridy = 1;
						panelParcelasBungalos.add(btnBungalows, gbc_btnBungalows);
					}
				}
				{
					panelRutas = new JPanel();
					panelRutas.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
					panelPrincipal.add(panelRutas, "panelRutas");
					GridBagLayout gbl_panelRutas = new GridBagLayout();
					gbl_panelRutas.columnWidths = new int[]{16, 79, 91, 0, 0};
					gbl_panelRutas.rowHeights = new int[]{21, 0, 0, 0};
					gbl_panelRutas.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
					gbl_panelRutas.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
					panelRutas.setLayout(gbl_panelRutas);
					{
						btnInfoRutas = new JButton("");
						btnInfoRutas.setOpaque(false);
						btnInfoRutas.setBorder(null);
						btnInfoRutas.setBackground(new Color(240, 240, 240));
						btnInfoRutas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnInfoRutas.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/document@3x.png")));
						GridBagConstraints gbc_btnInfoRutas = new GridBagConstraints();
						gbc_btnInfoRutas.fill = GridBagConstraints.BOTH;
						gbc_btnInfoRutas.insets = new Insets(0, 0, 5, 5);
						gbc_btnInfoRutas.gridx = 1;
						gbc_btnInfoRutas.gridy = 1;
						panelRutas.add(btnInfoRutas, gbc_btnInfoRutas);
					}
					{
						btnDiseñoRuta = new JButton("");
						btnDiseñoRuta.setOpaque(false);
						btnDiseñoRuta.setBorder(null);
						btnDiseñoRuta.setBackground(new Color(240, 240, 240));
						btnDiseñoRuta.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/pencil@3x.png")));
						GridBagConstraints gbc_btnDiseñoRuta = new GridBagConstraints();
						gbc_btnDiseñoRuta.fill = GridBagConstraints.BOTH;
						gbc_btnDiseñoRuta.insets = new Insets(0, 0, 5, 5);
						gbc_btnDiseñoRuta.gridx = 2;
						gbc_btnDiseñoRuta.gridy = 1;
						panelRutas.add(btnDiseñoRuta, gbc_btnDiseñoRuta);
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
					gbl_panelMonitores.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
					gbl_panelMonitores.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
							Double.MIN_VALUE };
					gbl_panelMonitores.rowWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0,
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
						scrollPaneMonitores = new JScrollPane();
						GridBagConstraints gbc_scrollPaneMonitores = new GridBagConstraints();
						gbc_scrollPaneMonitores.gridwidth = 3;
						gbc_scrollPaneMonitores.gridheight = 9;
						gbc_scrollPaneMonitores.insets = new Insets(0, 0, 5, 5);
						gbc_scrollPaneMonitores.fill = GridBagConstraints.BOTH;
						gbc_scrollPaneMonitores.gridx = 1;
						gbc_scrollPaneMonitores.gridy = 1;
						panelMonitores.add(scrollPaneMonitores, gbc_scrollPaneMonitores);
						{
							listMonitores = new JList();
							scrollPaneMonitores.setViewportView(listMonitores);
						}
					}
					{
						btnAnadirMonitor = new JButton("A\u00F1adir");
						btnAnadirMonitor.addActionListener(new BtnMonitorActionListener(1));
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
						btnModificarMonitor.addActionListener(new BtnMonitorActionListener(2));
						btnModificarMonitor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						GridBagConstraints gbc_btnModificarMonitor = new GridBagConstraints();
						gbc_btnModificarMonitor.fill = GridBagConstraints.BOTH;
						gbc_btnModificarMonitor.insets = new Insets(0, 0, 5, 5);
						gbc_btnModificarMonitor.gridx = 5;
						gbc_btnModificarMonitor.gridy = 4;
						panelMonitores.add(btnModificarMonitor, gbc_btnModificarMonitor);
					}
					{
						btnVerMonitor = new JButton("Ver");
						btnVerMonitor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnVerMonitor.addActionListener(new BtnMonitorActionListener(0));
						GridBagConstraints gbc_btnVerMonitor = new GridBagConstraints();
						gbc_btnVerMonitor.fill = GridBagConstraints.BOTH;
						gbc_btnVerMonitor.insets = new Insets(0, 0, 5, 5);
						gbc_btnVerMonitor.gridx = 5;
						gbc_btnVerMonitor.gridy = 6;
						panelMonitores.add(btnVerMonitor, gbc_btnVerMonitor);
					}
					{
						btnEliminarMonitor = new JButton("Eliminar");
						btnEliminarMonitor.addActionListener(new BtnMonitorActionListener(3));
						btnEliminarMonitor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						GridBagConstraints gbc_btnEliminarMonitor = new GridBagConstraints();
						gbc_btnEliminarMonitor.fill = GridBagConstraints.BOTH;
						gbc_btnEliminarMonitor.insets = new Insets(0, 0, 5, 5);
						gbc_btnEliminarMonitor.gridx = 5;
						gbc_btnEliminarMonitor.gridy = 8;
						panelMonitores.add(btnEliminarMonitor, gbc_btnEliminarMonitor);
					}
				}
				{
					panelActividades = new JPanel();
					panelPrincipal.add(panelActividades, "panelActividades");
					GridBagLayout gbl_panelActividades = new GridBagLayout();
					gbl_panelActividades.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
					gbl_panelActividades.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
					gbl_panelActividades.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
							Double.MIN_VALUE };
					gbl_panelActividades.rowWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0,
							Double.MIN_VALUE };
					panelActividades.setLayout(gbl_panelActividades);
					{
						lblActividades = new JLabel("Actividades:");
						lblActividades.setFont(new Font("Tahoma", Font.PLAIN, 25));
						GridBagConstraints gbc_lblActividades = new GridBagConstraints();
						gbc_lblActividades.anchor = GridBagConstraints.WEST;
						gbc_lblActividades.insets = new Insets(0, 0, 5, 5);
						gbc_lblActividades.gridx = 1;
						gbc_lblActividades.gridy = 0;
						panelActividades.add(lblActividades, gbc_lblActividades);
					}
					{
						scrollPaneActividades = new JScrollPane();
						GridBagConstraints gbc_scrollPaneActividades = new GridBagConstraints();
						gbc_scrollPaneActividades.gridheight = 9;
						gbc_scrollPaneActividades.gridwidth = 3;
						gbc_scrollPaneActividades.insets = new Insets(0, 0, 5, 5);
						gbc_scrollPaneActividades.fill = GridBagConstraints.BOTH;
						gbc_scrollPaneActividades.gridx = 1;
						gbc_scrollPaneActividades.gridy = 1;
						panelActividades.add(scrollPaneActividades, gbc_scrollPaneActividades);
						{
							listActividades = new JList();
							scrollPaneActividades.setViewportView(listActividades);
						}
					}
					{
						btnAnadirActividad = new JButton("A\u00F1adir");
						btnAnadirActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnAnadirActividad.addActionListener(new BtnActividadActionListener(1));
						GridBagConstraints gbc_btnAnadirActividad = new GridBagConstraints();
						gbc_btnAnadirActividad.fill = GridBagConstraints.BOTH;
						gbc_btnAnadirActividad.insets = new Insets(0, 0, 5, 5);
						gbc_btnAnadirActividad.gridx = 5;
						gbc_btnAnadirActividad.gridy = 2;
						panelActividades.add(btnAnadirActividad, gbc_btnAnadirActividad);
					}
					{
						btnModificarActividad = new JButton("Modificar");
						btnModificarActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnModificarActividad.addActionListener(new BtnActividadActionListener(2));
						GridBagConstraints gbc_btnModificarActividad = new GridBagConstraints();
						gbc_btnModificarActividad.fill = GridBagConstraints.BOTH;
						gbc_btnModificarActividad.insets = new Insets(0, 0, 5, 5);
						gbc_btnModificarActividad.gridx = 5;
						gbc_btnModificarActividad.gridy = 4;
						panelActividades.add(btnModificarActividad, gbc_btnModificarActividad);
					}
					{
						btnVerActividad = new JButton("Ver");
						btnVerActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnVerActividad.addActionListener(new BtnActividadActionListener(0));
						GridBagConstraints gbc_btnVerActividad = new GridBagConstraints();
						gbc_btnVerActividad.fill = GridBagConstraints.BOTH;
						gbc_btnVerActividad.insets = new Insets(0, 0, 5, 5);
						gbc_btnVerActividad.gridx = 5;
						gbc_btnVerActividad.gridy = 6;
						panelActividades.add(btnVerActividad, gbc_btnVerActividad);
					}
					{
						btnEliminarActividad = new JButton("Eliminar");
						btnEliminarActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnEliminarActividad.addActionListener(new BtnActividadActionListener(3));
						GridBagConstraints gbc_btnEliminarActividad = new GridBagConstraints();
						gbc_btnEliminarActividad.fill = GridBagConstraints.BOTH;
						gbc_btnEliminarActividad.insets = new Insets(0, 0, 5, 5);
						gbc_btnEliminarActividad.gridx = 5;
						gbc_btnEliminarActividad.gridy = 8;
						panelActividades.add(btnEliminarActividad, gbc_btnEliminarActividad);
					}
				}
			}
			{
				lblBarraDeEstado = new JLabel("Barra de estado");
				lblBarraDeEstado.setFont(new Font("Tahoma", Font.PLAIN, 12));
				panelMenuPrincipal.add(lblBarraDeEstado, BorderLayout.SOUTH);
			}
			{
				panelOpcionesPrincipales = new JPanel();
				panelOpcionesPrincipales.setBackground(SystemColor.controlHighlight);
				panelMenuPrincipal.add(panelOpcionesPrincipales, BorderLayout.EAST);
				GridBagLayout gbl_panelOpcionesPrincipales = new GridBagLayout();
				gbl_panelOpcionesPrincipales.columnWidths = new int[] { 33, 0 };
				gbl_panelOpcionesPrincipales.rowHeights = new int[] { 33, 40, 36, 0, 32, 0 };
				gbl_panelOpcionesPrincipales.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
				gbl_panelOpcionesPrincipales.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
				panelOpcionesPrincipales.setLayout(gbl_panelOpcionesPrincipales);
				{
					{
						btnHome = new JButton("");
						btnHome.setBackground(new Color(240, 240, 240));
						btnHome.setOpaque(false);
						btnHome.setToolTipText("Menu Principal");
						btnHome.addActionListener(new BtnHomeActionListener());
						btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnHome.setBorder(null);
						btnHome.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/pestana1.png")));
						GridBagConstraints gbc_btnHome = new GridBagConstraints();
						gbc_btnHome.insets = new Insets(0, 0, 5, 0);
						gbc_btnHome.gridx = 0;
						gbc_btnHome.gridy = 0;
						panelOpcionesPrincipales.add(btnHome, gbc_btnHome);
					}
				}
				{
					btnHelp = new JButton("");
					btnHelp.setBackground(new Color(240, 240, 240));
					btnHelp.setOpaque(false);
					btnHelp.setToolTipText("Ayuda");
					btnHelp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnHelp.setBorder(null);
					btnHelp.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/help.png")));
					GridBagConstraints gbc_btnHelp = new GridBagConstraints();
					gbc_btnHelp.insets = new Insets(0, 0, 5, 0);
					gbc_btnHelp.gridx = 0;
					gbc_btnHelp.gridy = 1;
					panelOpcionesPrincipales.add(btnHelp, gbc_btnHelp);
				}
				{
					btnUser = new JButton("");
					btnUser.setBackground(new Color(240, 240, 240));
					btnUser.setOpaque(false);
					btnUser.setToolTipText("Inf. Usuario");
					btnUser.addActionListener(new BtnUserActionListener());
					btnUser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnUser.setBorder(null);
					btnUser.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/user-male.png")));
					GridBagConstraints gbc_btnUser = new GridBagConstraints();
					gbc_btnUser.insets = new Insets(0, 0, 5, 0);
					gbc_btnUser.gridx = 0;
					gbc_btnUser.gridy = 2;
					panelOpcionesPrincipales.add(btnUser, gbc_btnUser);
				}
				{
					btnLogout = new JButton("");
					btnLogout.setBackground(new Color(240, 240, 240));
					btnLogout.setOpaque(false);
					btnLogout.setToolTipText("Cerrar Sesi\u00F3n");
					btnLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnLogout.addActionListener(new BtnLogoutActionListener());
					{
						btnCalendario = new JButton("");
						btnCalendario.setBackground(new Color(240, 240, 240));
						btnCalendario.setOpaque(false);
						btnCalendario.setToolTipText("Calendario");
						btnCalendario.setBorder(null);
						btnCalendario.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/calendarbtn.png")));
						GridBagConstraints gbc_btnCalendario = new GridBagConstraints();
						gbc_btnCalendario.insets = new Insets(0, 0, 5, 0);
						gbc_btnCalendario.gridx = 0;
						gbc_btnCalendario.gridy = 3;
						panelOpcionesPrincipales.add(btnCalendario, gbc_btnCalendario);
					}
					btnLogout.setBorder(null);
					btnLogout.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/exit.png")));
					GridBagConstraints gbc_btnLogout = new GridBagConstraints();
					gbc_btnLogout.gridx = 0;
					gbc_btnLogout.gridy = 4;
					panelOpcionesPrincipales.add(btnLogout, gbc_btnLogout);
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
			if(comprobadorUsuario == 0) {
				JFrame window= new UI_Usuario();
				window.setVisible(true);
				comprobadorUsuario++;
			}
		}
	}
	
	public static void setComprobadorUsuario(int valor) {
		comprobadorUsuario=valor;
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
	private class BtnMonitorActionListener implements ActionListener {
		int valor = 0;
		
		public BtnMonitorActionListener(int valor) {
			this.valor = valor;
		}
		
		public void actionPerformed(ActionEvent e) {
			JFrame window= new UI_Auxiliar();
			window.setVisible(true);
			UI_Auxiliar.setElegirPanel(valor);
			UI_Auxiliar.setElegirFormulario(0);
		}
	}
	
	private class BtnActividadActionListener implements ActionListener {
		int valor = 0;
		
		public BtnActividadActionListener(int valor) {
			this.valor = valor;
		}
		
		public void actionPerformed(ActionEvent e) {
			JFrame window= new UI_Auxiliar();
			window.setVisible(true);
			UI_Auxiliar.setElegirPanel(valor);
			UI_Auxiliar.setElegirFormulario(1);
		}
	}
	private class BtnReservasActionListener implements ActionListener {
		int valor = 0;
		
		public BtnReservasActionListener(int valor) {
			this.valor = valor;
		}
		public void actionPerformed(ActionEvent e) {
			JFrame window= new UI_Reservas();
			window.setVisible(true);
			UI_Reservas.setElegirPanel(valor);
		}
	}
}
