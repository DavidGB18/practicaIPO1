package presentacion;

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

import dominio.Actividad;
import dominio.Monitor;
import lecturaEscritura.Reader;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.Cursor;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URI;
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
import javax.swing.JMenuItem;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.LineBorder;

public class UI_Gestor {

	private static int comprobadorUsuario = 0;
	private static int comprobadorCalendario = 0;
	private static int comprobadorInfoRuta = 0;
	private static int comprobadorDibujoRuta = 0;
	private static int comprobadorParcelasBungalows = 0;

	static JFrame frmGestorLosOlivos;
	private JPanel panelAutenticacion;
	private JPanel panelMenuPrincipal;
	private JLabel lblBarraEstado;
	private JPanel panelUsuarioPass;
	private JLabel lblUsuario;
	private JLabel lblPass;
	public JTextField textUsuario;
	private JButton btnIniciar;
	private JPasswordField passwordField;
	private JPanel panelFoto;
	private JLabel lblFoto;
	private JPanel panelArbol;
	private JMenuBar menuBar;
	private JMenu mnInicio;
	private JMenu mnOpciones;
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
	private JButton btnDisenoRuta;
	private JPanel panelConfiguracion;
	private JPanel panelMonitores;
	private JPanel panelActividades;
	private JLabel lblApariencia;
	private JLabel lblTipoLetra;
	private JLabel lblTamLetra;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private JButton btnGuardarCambios;
	private JButton btnCancelarCambios;
	private JLabel lblBarraDeEstado;
	private int index = 0;
	private JButton btnAnadirMonitor;
	private JButton btnModificarMonitor;
	private JButton btnEliminarMonitor;
	private JScrollPane scrollPaneMonitores;
	private JList<String> listMonitores;
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
	private JLabel lblActividades;
	private JScrollPane scrollPaneActividades;
	private JList<String> listActividades;
	private JButton btnAnadirActividad;
	private JButton btnModificarActividad;
	private JButton btnEliminarActividad;
	private JButton btnCalendario;
	private JButton btnVerActividad;
	private JButton btnVerMonitor;
	private JMenuItem mntmAbrirManual;
	private JMenuItem mntmAboutProgram;
	private JMenuItem mntmSalir;
	private JMenuItem mntmParcelas;
	private JMenuItem mntmBungalows;
	private JMenuItem mntmReservas;
	private JMenuItem mntmActividades;
	private JMenuItem mntmMonitores;
	private JMenuItem mntmRutas;
	private JMenuItem mntmCerrarSesion;
	private JLabel lblIdioma;
	private JComboBox cbIdioma;
	
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
		Reader.leerFicheros();
		frmGestorLosOlivos = new JFrame();
		frmGestorLosOlivos
				.setIconImage(Toolkit.getDefaultToolkit().getImage(UI_Gestor.class.getResource("/recursos/logo.png"))); //$NON-NLS-1$
		frmGestorLosOlivos.addWindowListener(new FrmGestorLosOlivosWindowListener());
		frmGestorLosOlivos.setResizable(false);
		frmGestorLosOlivos.setTitle(MessagesUI_Gestor.getString("UI_Gestor.frmGestorLosOlivos.title")); //$NON-NLS-1$
		frmGestorLosOlivos.setBounds(100, 100, 849, 596);
		frmGestorLosOlivos.getContentPane().setLayout(new CardLayout(0, 0));
		{
			panelAutenticacion = new JPanel();
			frmGestorLosOlivos.getContentPane().add(panelAutenticacion, "PanelSesion"); //$NON-NLS-1$
			panelAutenticacion.setLayout(new BorderLayout(0, 0));
			{
				lblBarraEstado = new JLabel(MessagesUI_Gestor.getString("UI_Gestor.lblBarraEstado.text")); //$NON-NLS-1$
				lblBarraEstado.setFont(new Font("Tahoma", Font.PLAIN, 12)); //$NON-NLS-1$
				lblBarraEstado.setVerticalAlignment(SwingConstants.TOP);
				panelAutenticacion.add(lblBarraEstado, BorderLayout.SOUTH);
			}
			{
				panelUsuarioPass = new JPanel();
				panelUsuarioPass.setBackground(new Color(240, 240, 240));
				panelUsuarioPass.setBorder(new EmptyBorder(0, 0, 0, 0));
				panelAutenticacion.add(panelUsuarioPass, BorderLayout.CENTER);
				GridBagLayout gbl_panelUsuarioPass = new GridBagLayout();
				gbl_panelUsuarioPass.columnWidths = new int[] { 415, 129, 0 };
				gbl_panelUsuarioPass.rowHeights = new int[] { 531, 0 };
				gbl_panelUsuarioPass.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
				gbl_panelUsuarioPass.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
				panelUsuarioPass.setLayout(gbl_panelUsuarioPass);
				{
					panelImagen = new JPanel();
					panelImagen.setBorder(null);
					GridBagConstraints gbc_panelImagen = new GridBagConstraints();
					gbc_panelImagen.fill = GridBagConstraints.BOTH;
					gbc_panelImagen.insets = new Insets(0, 0, 0, 5);
					gbc_panelImagen.gridx = 0;
					gbc_panelImagen.gridy = 0;
					panelUsuarioPass.add(panelImagen, gbc_panelImagen);
					panelImagen.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
					{
						lblImagen = new JLabel(""); //$NON-NLS-1$
						lblImagen.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/iniciosesion.jpg"))); //$NON-NLS-1$
						panelImagen.add(lblImagen);
					}
				}
				{
					panelInicioSesion = new JPanel();
					panelInicioSesion.setBackground(new Color(240, 240, 240));
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
						panelFoto.setBackground(new Color(240, 240, 240));
						panelFoto.setBorder(new TitledBorder(null, MessagesUI_Gestor.getString("UI_Gestor.panelFoto.borderTitle"), TitledBorder.LEADING, //$NON-NLS-1$
								TitledBorder.TOP, null, null));
						panelFoto.setLayout(null);
						{

							lblFoto = new JLabel(""); //$NON-NLS-1$
							lblFoto.setBounds(22, 15, 115, 135);
							panelFoto.add(lblFoto);
							lblFoto.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/user.png"))); //$NON-NLS-1$
						}
					}
					{
						lblUsuario = new JLabel(MessagesUI_Gestor.getString("UI_Gestor.lblUsuario.text")); //$NON-NLS-1$
						lblUsuario.setBounds(46, 260, 106, 27);
						panelInicioSesion.add(lblUsuario);
						lblUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
						lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
						lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
					}
					{
						textUsuario = new JTextField();
						textUsuario.setBorder(new LineBorder(Color.RED, 2));
						textUsuario.addKeyListener(new TextUsuarioKeyListener());
						textUsuario.setBounds(162, 264, 150, 19);
						panelInicioSesion.add(textUsuario);
						textUsuario.setColumns(10);
					}
					{
						lblPass = new JLabel(MessagesUI_Gestor.getString("UI_Gestor.lblPass.text")); //$NON-NLS-1$
						lblPass.setBounds(46, 292, 106, 20);
						panelInicioSesion.add(lblPass);
						lblPass.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
						lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
						lblPass.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
					}
					{
						passwordField = new JPasswordField();
						passwordField.addKeyListener(new PasswordFieldKeyListener());
						passwordField.setBounds(162, 293, 150, 19);
						panelInicioSesion.add(passwordField);
						passwordField.setEnabled(false);
					}
					{
						btnIniciar = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnIniciar.text"));
						btnIniciar.setVisible(false);
						btnIniciar.setBounds(122, 376, 158, 29);
						panelInicioSesion.add(btnIniciar);
						btnIniciar.addChangeListener(new BtnIniciarChangeListener());
						btnIniciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnIniciar.addActionListener(new BtnInicioSesionActionListener());
						btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
					}
				}
			}
		}
		{
			panelMenuPrincipal = new JPanel();
			frmGestorLosOlivos.getContentPane().add(panelMenuPrincipal, "Iniciar Sesi�n"); //$NON-NLS-1$
			panelMenuPrincipal.setLayout(new BorderLayout(0, 0));
			{
				panelArbol = new JPanel();
				panelMenuPrincipal.add(panelArbol, BorderLayout.WEST);
				GridBagLayout gbl_panelArbol = new GridBagLayout();
				gbl_panelArbol.columnWidths = new int[] { 133, 0 };
				gbl_panelArbol.rowHeights = new int[] { 0, 0 };
				gbl_panelArbol.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
				gbl_panelArbol.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
				panelArbol.setLayout(gbl_panelArbol);
				{
					scrollMigas = new JScrollPane();
					GridBagConstraints gbc_scrollMigas = new GridBagConstraints();
					gbc_scrollMigas.fill = GridBagConstraints.BOTH;
					gbc_scrollMigas.gridx = 0;
					gbc_scrollMigas.gridy = 0;
					panelArbol.add(scrollMigas, gbc_scrollMigas);
					{
						treePrograma = new JTree();
						treePrograma.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
						treePrograma.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						scrollMigas.setViewportView(treePrograma);
						treePrograma.addTreeSelectionListener(new TreeProgramaTreeSelectionListener());
						treePrograma.setAutoscrolls(true);
						treePrograma.setBackground(Color.WHITE);
						treePrograma.setForeground(Color.WHITE);
						treePrograma.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Gestor") { //$NON-NLS-1$

							private static final long serialVersionUID = 8896833283667913486L;

							{
								DefaultMutableTreeNode node_1;
								node_1 = new DefaultMutableTreeNode("Parcelas-Bungalows"); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("Parcelas")); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("Bungalows")); //$NON-NLS-1$
								add(node_1);
								node_1 = new DefaultMutableTreeNode("Reservas"); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode(MessagesUI_Gestor.getString("UI_Gestor.16"))); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("Borrar")); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("Consultar")); //$NON-NLS-1$
								add(node_1);
								node_1 = new DefaultMutableTreeNode("Actividades"); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("A\u00F1adir")); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("Modificar")); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("Borrar")); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("Consultar")); //$NON-NLS-1$
								add(node_1);
								node_1 = new DefaultMutableTreeNode("Rutas"); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("Informacion")); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("Dise\u00F1ar")); //$NON-NLS-1$
								add(node_1);
								node_1 = new DefaultMutableTreeNode("Monitores"); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("A\u00F1adir")); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("Modificar")); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("Borrar")); //$NON-NLS-1$
								node_1.add(new DefaultMutableTreeNode("Consultar")); //$NON-NLS-1$
								add(node_1);
								add(new DefaultMutableTreeNode("Configuracion")); //$NON-NLS-1$
							}
						}));
						
						treePrograma.setCellRenderer(new MiRenderizadoArbol());
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
					lblBanner = new JLabel(""); //$NON-NLS-1$
					lblBanner.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
					lblBanner.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/banner2.jpg"))); //$NON-NLS-1$
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
					panelPrincipal.add(panelBotones, "panelPrincipal"); //$NON-NLS-1$
					GridBagLayout gbl_panelBotones = new GridBagLayout();
					gbl_panelBotones.columnWidths = new int[] { -3, 204, 209, 195, 8, 0 };
					gbl_panelBotones.rowHeights = new int[] { 0, 11, 0, 160, 160, 0, 0 };
					gbl_panelBotones.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
					gbl_panelBotones.rowWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
					panelBotones.setLayout(gbl_panelBotones);
					{
						lblInfo = new JLabel(MessagesUI_Gestor.getString("UI_Gestor.lblInfo.text")); //$NON-NLS-1$
						lblInfo.setFont(new Font("Tahoma", Font.BOLD, 17)); //$NON-NLS-1$
						GridBagConstraints gbc_lblInfo = new GridBagConstraints();
						gbc_lblInfo.fill = GridBagConstraints.HORIZONTAL;
						gbc_lblInfo.gridwidth = 2;
						gbc_lblInfo.insets = new Insets(0, 0, 5, 5);
						gbc_lblInfo.gridx = 1;
						gbc_lblInfo.gridy = 1;
						panelBotones.add(lblInfo, gbc_lblInfo);
					}
					{
						btnParcelasBungalows = new JButton(""); //$NON-NLS-1$
						btnParcelasBungalows
								.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
						btnParcelasBungalows.addChangeListener(new BtnIniciarChangeListener());
						btnParcelasBungalows.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnParcelasBungalows
								.addActionListener(new BtnCambioPanelActionListener("panelParcelas-Bungalows")); //$NON-NLS-1$
						btnParcelasBungalows
								.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/home@2x.png"))); //$NON-NLS-1$
						btnParcelasBungalows.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnParcelasBungalows.toolTipText")); //$NON-NLS-1$
						GridBagConstraints gbc_btnParcelasBungalows = new GridBagConstraints();
						gbc_btnParcelasBungalows.fill = GridBagConstraints.BOTH;
						gbc_btnParcelasBungalows.insets = new Insets(0, 0, 5, 5);
						gbc_btnParcelasBungalows.gridx = 1;
						gbc_btnParcelasBungalows.gridy = 3;
						panelBotones.add(btnParcelasBungalows, gbc_btnParcelasBungalows);
					}
					{
						btnReservas = new JButton(""); //$NON-NLS-1$
						btnReservas.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
						btnReservas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnReservas.addActionListener(new BtnCambioPanelActionListener("panelReservas")); //$NON-NLS-1$
						btnReservas.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/calendar@2x.png"))); //$NON-NLS-1$
						btnReservas.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnReservas.toolTipText")); //$NON-NLS-1$
						btnReservas.setBackground(new Color(152, 251, 152));
						GridBagConstraints gbc_btnReservas = new GridBagConstraints();
						gbc_btnReservas.fill = GridBagConstraints.BOTH;
						gbc_btnReservas.insets = new Insets(0, 0, 5, 5);
						gbc_btnReservas.gridx = 2;
						gbc_btnReservas.gridy = 3;
						panelBotones.add(btnReservas, gbc_btnReservas);
					}
					{
						btnConfiguracion = new JButton(""); //$NON-NLS-1$
						btnConfiguracion.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
						btnConfiguracion.addChangeListener(new BtnIniciarChangeListener());
						btnConfiguracion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnConfiguracion.addActionListener(new BtnCambioPanelActionListener("panelConfiguracion")); //$NON-NLS-1$
						{
							btnActividades = new JButton(""); //$NON-NLS-1$
							btnActividades.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
							btnActividades.addChangeListener(new BtnIniciarChangeListener());
							btnActividades.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnActividades.addActionListener(new BtnCambioPanelActionListener("panelActividades")); //$NON-NLS-1$
							{
								btnRutas = new JButton(""); //$NON-NLS-1$
								btnRutas.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
								btnRutas.addChangeListener(new BtnIniciarChangeListener());
								btnRutas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
								btnRutas.addActionListener(new BtnCambioPanelActionListener("panelRutas")); //$NON-NLS-1$
								btnRutas.setIcon(
										new ImageIcon(UI_Gestor.class.getResource("/recursos/compass@2x.png"))); //$NON-NLS-1$
								btnRutas.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnRutas.toolTipText")); //$NON-NLS-1$
								GridBagConstraints gbc_btnRutas = new GridBagConstraints();
								gbc_btnRutas.fill = GridBagConstraints.BOTH;
								gbc_btnRutas.insets = new Insets(0, 0, 5, 5);
								gbc_btnRutas.gridx = 3;
								gbc_btnRutas.gridy = 3;
								panelBotones.add(btnRutas, gbc_btnRutas);
							}
							{
								btnMonitores = new JButton(""); //$NON-NLS-1$
								btnMonitores
										.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
								btnMonitores.addChangeListener(new BtnIniciarChangeListener());
								btnMonitores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
								btnMonitores.addActionListener(new BtnCambioPanelActionListener("panelMonitores")); //$NON-NLS-1$
								btnMonitores
										.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/user@2x.png"))); //$NON-NLS-1$
								btnMonitores.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnMonitores.toolTipText")); //$NON-NLS-1$
								GridBagConstraints gbc_btnMonitores = new GridBagConstraints();
								gbc_btnMonitores.fill = GridBagConstraints.BOTH;
								gbc_btnMonitores.insets = new Insets(0, 0, 5, 5);
								gbc_btnMonitores.gridx = 1;
								gbc_btnMonitores.gridy = 4;
								panelBotones.add(btnMonitores, gbc_btnMonitores);
							}
							btnActividades.setIcon(
									new ImageIcon(UI_Gestor.class.getResource("/recursos/puzzle-piece@2x.png"))); //$NON-NLS-1$
							btnActividades.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnActividades.toolTipText")); //$NON-NLS-1$
							GridBagConstraints gbc_btnActividades = new GridBagConstraints();
							gbc_btnActividades.fill = GridBagConstraints.BOTH;
							gbc_btnActividades.insets = new Insets(0, 0, 5, 5);
							gbc_btnActividades.gridx = 2;
							gbc_btnActividades.gridy = 4;
							panelBotones.add(btnActividades, gbc_btnActividades);
						}
						btnConfiguracion.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/gear@2x.png"))); //$NON-NLS-1$
						btnConfiguracion.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnConfiguracion.toolTipText")); //$NON-NLS-1$
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
					panelPrincipal.add(panelReservas, "panelReservas"); //$NON-NLS-1$
					GridBagLayout gbl_panelReservas = new GridBagLayout();
					gbl_panelReservas.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
					gbl_panelReservas.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
					gbl_panelReservas.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
					gbl_panelReservas.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0,
							Double.MIN_VALUE };
					panelReservas.setLayout(gbl_panelReservas);
					{
						btnNuevaReserva = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnNuevaReserva.text")); //$NON-NLS-1$
						btnNuevaReserva.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnNuevaReserva.addActionListener(new BtnReservasActionListener(0));
						btnNuevaReserva.setFont(new Font("Tahoma", Font.BOLD, 20)); //$NON-NLS-1$
						GridBagConstraints gbc_btnNuevaReserva = new GridBagConstraints();
						gbc_btnNuevaReserva.fill = GridBagConstraints.BOTH;
						gbc_btnNuevaReserva.insets = new Insets(0, 0, 5, 5);
						gbc_btnNuevaReserva.gridx = 2;
						gbc_btnNuevaReserva.gridy = 2;
						panelReservas.add(btnNuevaReserva, gbc_btnNuevaReserva);
					}
					{
						btnBorrarReserva = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnBorrarReserva.text")); //$NON-NLS-1$
						btnBorrarReserva.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnBorrarReserva.addActionListener(new BtnReservasActionListener(1));
						btnBorrarReserva.setFont(new Font("Tahoma", Font.BOLD, 20)); //$NON-NLS-1$
						GridBagConstraints gbc_btnBorrarReserva = new GridBagConstraints();
						gbc_btnBorrarReserva.fill = GridBagConstraints.BOTH;
						gbc_btnBorrarReserva.insets = new Insets(0, 0, 5, 5);
						gbc_btnBorrarReserva.gridx = 2;
						gbc_btnBorrarReserva.gridy = 4;
						panelReservas.add(btnBorrarReserva, gbc_btnBorrarReserva);
					}
					{
						btnConsultarReservas = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnConsultarReservas.text")); //$NON-NLS-1$
						btnConsultarReservas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnConsultarReservas.addActionListener(new BtnReservasActionListener(2));
						btnConsultarReservas.setFont(new Font("Tahoma", Font.BOLD, 20)); //$NON-NLS-1$
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
					panelPrincipal.add(panelParcelasBungalos, "panelParcelas-Bungalows"); //$NON-NLS-1$
					GridBagLayout gbl_panelParcelasBungalos = new GridBagLayout();
					gbl_panelParcelasBungalos.columnWidths = new int[] { 33, 71, 81, 0, 0 };
					gbl_panelParcelasBungalos.rowHeights = new int[] { 21, 0, 0, 0 };
					gbl_panelParcelasBungalos.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
					gbl_panelParcelasBungalos.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
					panelParcelasBungalos.setLayout(gbl_panelParcelasBungalos);
					{
						btnParcelas = new JButton(""); //$NON-NLS-1$
						btnParcelas.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnParcelas.toolTipText")); //$NON-NLS-1$
						btnParcelas.addActionListener(new BtnParcelasBungalowsActionListener(0));
						btnParcelas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnParcelas.setBackground(new Color(240, 240, 240));
						btnParcelas.setBorderPainted(false);
						btnParcelas
								.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/location-pin@3x.png"))); //$NON-NLS-1$
						GridBagConstraints gbc_btnParcelas = new GridBagConstraints();
						gbc_btnParcelas.fill = GridBagConstraints.BOTH;
						gbc_btnParcelas.insets = new Insets(0, 0, 5, 5);
						gbc_btnParcelas.gridx = 1;
						gbc_btnParcelas.gridy = 1;
						panelParcelasBungalos.add(btnParcelas, gbc_btnParcelas);
					}
					{
						btnBungalows = new JButton(""); //$NON-NLS-1$
						btnBungalows.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnBungalows.toolTipText")); //$NON-NLS-1$
						btnBungalows.addActionListener(new BtnParcelasBungalowsActionListener(1));
						btnBungalows.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnBungalows.setOpaque(false);
						btnBungalows.setBorder(null);
						btnBungalows.setBackground(new Color(240, 240, 240));
						btnBungalows.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/home@3x.png"))); //$NON-NLS-1$
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
					panelPrincipal.add(panelRutas, "panelRutas"); //$NON-NLS-1$
					GridBagLayout gbl_panelRutas = new GridBagLayout();
					gbl_panelRutas.columnWidths = new int[] { 16, 79, 91, 0, 0 };
					gbl_panelRutas.rowHeights = new int[] { 21, 0, 0, 0 };
					gbl_panelRutas.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
					gbl_panelRutas.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
					panelRutas.setLayout(gbl_panelRutas);
					{
						btnInfoRutas = new JButton(""); //$NON-NLS-1$
						btnInfoRutas.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnInfoRutas.toolTipText")); //$NON-NLS-1$
						btnInfoRutas.addActionListener(new BtnInfoRutasActionListener());
						btnInfoRutas.setOpaque(false);
						btnInfoRutas.setBorder(null);
						btnInfoRutas.setBackground(new Color(240, 240, 240));
						btnInfoRutas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnInfoRutas.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/document@3x.png"))); //$NON-NLS-1$
						GridBagConstraints gbc_btnInfoRutas = new GridBagConstraints();
						gbc_btnInfoRutas.fill = GridBagConstraints.BOTH;
						gbc_btnInfoRutas.insets = new Insets(0, 0, 5, 5);
						gbc_btnInfoRutas.gridx = 1;
						gbc_btnInfoRutas.gridy = 1;
						panelRutas.add(btnInfoRutas, gbc_btnInfoRutas);
					}
					{
						btnDisenoRuta = new JButton(""); //$NON-NLS-1$
						btnDisenoRuta.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnDisenoRuta.toolTipText")); //$NON-NLS-1$
						btnDisenoRuta.addActionListener(new BtnDisenoRutaActionListener());
						btnDisenoRuta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnDisenoRuta.setOpaque(false);
						btnDisenoRuta.setBorder(null);
						btnDisenoRuta.setBackground(new Color(240, 240, 240));
						btnDisenoRuta.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/pencil@3x.png"))); //$NON-NLS-1$
						GridBagConstraints gbc_btnDisenoRuta = new GridBagConstraints();
						gbc_btnDisenoRuta.fill = GridBagConstraints.BOTH;
						gbc_btnDisenoRuta.insets = new Insets(0, 0, 5, 5);
						gbc_btnDisenoRuta.gridx = 2;
						gbc_btnDisenoRuta.gridy = 1;
						panelRutas.add(btnDisenoRuta, gbc_btnDisenoRuta);
					}
				}
				{
					panelConfiguracion = new JPanel();
					panelConfiguracion.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
					panelPrincipal.add(panelConfiguracion, "panelConfiguracion"); //$NON-NLS-1$
					panelConfiguracion.setLayout(null);
					{
						lblApariencia = new JLabel(MessagesUI_Gestor.getString("UI_Gestor.lblApariencia.text")); //$NON-NLS-1$
						lblApariencia.setHorizontalAlignment(SwingConstants.RIGHT);
						lblApariencia.setFont(new Font("Tahoma", Font.PLAIN, 18)); //$NON-NLS-1$
						lblApariencia.setBounds(208, 163, 94, 31);
						panelConfiguracion.add(lblApariencia);
					}
					{
						lblTipoLetra = new JLabel(MessagesUI_Gestor.getString("UI_Gestor.lblTipoLetra.text")); //$NON-NLS-1$
						lblTipoLetra.setHorizontalAlignment(SwingConstants.RIGHT);
						lblTipoLetra.setFont(new Font("Tahoma", Font.PLAIN, 18)); //$NON-NLS-1$
						lblTipoLetra.setBounds(170, 204, 132, 32);
						panelConfiguracion.add(lblTipoLetra);
					}
					{
						lblTamLetra = new JLabel(MessagesUI_Gestor.getString("UI_Gestor.lblTamLetra.text")); //$NON-NLS-1$
						lblTamLetra.setHorizontalAlignment(SwingConstants.RIGHT);
						lblTamLetra.setFont(new Font("Tahoma", Font.PLAIN, 18)); //$NON-NLS-1$
						lblTamLetra.setBounds(147, 246, 155, 29);
						panelConfiguracion.add(lblTamLetra);
					}
					{
						comboBox_1 = new JComboBox<String>();
						comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {MessagesUI_Gestor.getString("UI_Gestor.0"), MessagesUI_Gestor.getString("UI_Gestor.1")})); //$NON-NLS-1$ //$NON-NLS-2$
						comboBox_1.setBounds(328, 171, 132, 21);
						panelConfiguracion.add(comboBox_1);
					}
					{
						comboBox_2 = new JComboBox<String>();
						comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] {"Tahoma"})); //$NON-NLS-1$
						comboBox_2.setBounds(328, 213, 132, 21);
						panelConfiguracion.add(comboBox_2);
					}
					{
						comboBox_3 = new JComboBox<String>();
						comboBox_3.setModel(new DefaultComboBoxModel<String>(new String[] {MessagesUI_Gestor.getString("UI_Gestor.76"), MessagesUI_Gestor.getString("UI_Gestor.77"), MessagesUI_Gestor.getString("UI_Gestor.78")})); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						comboBox_3.setBounds(328, 253, 132, 21);
						panelConfiguracion.add(comboBox_3);
					}
					{
						btnGuardarCambios = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnGuardarCambios.text")); //$NON-NLS-1$
						btnGuardarCambios.addActionListener(new BtnGuardarCambiosActionListener());
						btnGuardarCambios.setFont(new Font("Tahoma", Font.PLAIN, 18)); //$NON-NLS-1$
						btnGuardarCambios.setBounds(358, 340, 206, 32);
						panelConfiguracion.add(btnGuardarCambios);
					}
					{
						btnCancelarCambios = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnCancelarCambios.text")); //$NON-NLS-1$
						btnCancelarCambios.setFont(new Font("Tahoma", Font.PLAIN, 18)); //$NON-NLS-1$
						btnCancelarCambios.setBounds(109, 340, 206, 32);
						panelConfiguracion.add(btnCancelarCambios);
					}
					{
						lblIdioma = new JLabel(MessagesUI_Gestor.getString("UI_Gestor.lblNewLabel.text")); //$NON-NLS-1$
						lblIdioma.setHorizontalAlignment(SwingConstants.RIGHT);
						lblIdioma.setFont(new Font("Tahoma", Font.PLAIN, 18)); //$NON-NLS-1$
						lblIdioma.setBounds(208, 132, 94, 21);
						panelConfiguracion.add(lblIdioma);
					}
					{
						cbIdioma = new JComboBox();
						cbIdioma.setModel(new DefaultComboBoxModel(new String[] {MessagesUI_Gestor.getString("UI_Gestor.82"), MessagesUI_Gestor.getString("UI_Gestor.83")})); //$NON-NLS-1$ //$NON-NLS-2$
						cbIdioma.setBounds(328, 135, 132, 21);
						panelConfiguracion.add(cbIdioma);
					}
				}
				{
					panelMonitores = new JPanel();
					panelPrincipal.add(panelMonitores, "panelMonitores"); //$NON-NLS-1$
					GridBagLayout gbl_panelMonitores = new GridBagLayout();
					gbl_panelMonitores.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
					gbl_panelMonitores.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
					gbl_panelMonitores.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
							Double.MIN_VALUE };
					gbl_panelMonitores.rowWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
							1.0, Double.MIN_VALUE };
					panelMonitores.setLayout(gbl_panelMonitores);
					{
						lblMonitores = new JLabel(MessagesUI_Gestor.getString("UI_Gestor.lblMonitores.text")); //$NON-NLS-1$
						lblMonitores.setFont(new Font("Tahoma", Font.PLAIN, 25)); //$NON-NLS-1$
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
							listMonitores = new JList<String>();
							scrollPaneMonitores.setViewportView(listMonitores);
						}
					}
					{
						btnAnadirMonitor = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnAnadirMonitor.text")); //$NON-NLS-1$
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
						btnModificarMonitor = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnModificarMonitor.text")); //$NON-NLS-1$
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
						btnVerMonitor = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnVerMonitor.text")); //$NON-NLS-1$
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
						btnEliminarMonitor = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnEliminarMonitor.text")); //$NON-NLS-1$
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
					panelPrincipal.add(panelActividades, "panelActividades"); //$NON-NLS-1$
					GridBagLayout gbl_panelActividades = new GridBagLayout();
					gbl_panelActividades.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
					gbl_panelActividades.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
					gbl_panelActividades.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
							Double.MIN_VALUE };
					gbl_panelActividades.rowWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
							1.0, Double.MIN_VALUE };
					panelActividades.setLayout(gbl_panelActividades);
					{
						lblActividades = new JLabel(MessagesUI_Gestor.getString("UI_Gestor.lblActividades.text")); //$NON-NLS-1$
						lblActividades.setFont(new Font("Tahoma", Font.PLAIN, 25)); //$NON-NLS-1$
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
							listActividades = new JList<String>();
							scrollPaneActividades.setViewportView(listActividades);
						}
					}
					{
						btnAnadirActividad = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnAnadirActividad.text")); //$NON-NLS-1$
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
						btnModificarActividad = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnModificarActividad.text")); //$NON-NLS-1$
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
						btnVerActividad = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnVerActividad.text")); //$NON-NLS-1$
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
						btnEliminarActividad = new JButton(MessagesUI_Gestor.getString("UI_Gestor.btnEliminarActividad.text")); //$NON-NLS-1$
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
				lblBarraDeEstado = new JLabel(MessagesUI_Gestor.getString("UI_Gestor.lblBarraDeEstado.text")); //$NON-NLS-1$
				lblBarraDeEstado.setFont(new Font("Tahoma", Font.PLAIN, 12)); //$NON-NLS-1$
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
						btnHome = new JButton(""); //$NON-NLS-1$
						btnHome.setBackground(new Color(240, 240, 240));
						btnHome.setOpaque(false);
						btnHome.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnHome.toolTipText")); //$NON-NLS-1$
						btnHome.addActionListener(new BtnHomeActionListener());
						btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnHome.setBorder(null);
						btnHome.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/barraLateral/pestana1.png"))); //$NON-NLS-1$
						GridBagConstraints gbc_btnHome = new GridBagConstraints();
						gbc_btnHome.insets = new Insets(0, 0, 5, 0);
						gbc_btnHome.gridx = 0;
						gbc_btnHome.gridy = 0;
						panelOpcionesPrincipales.add(btnHome, gbc_btnHome);
					}
				}
				{
					btnHelp = new JButton(""); //$NON-NLS-1$
					btnHelp.addActionListener(new BtnHelpActionListener());
					btnHelp.setBackground(new Color(240, 240, 240));
					btnHelp.setOpaque(false);
					btnHelp.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnHelp.toolTipText")); //$NON-NLS-1$
					btnHelp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnHelp.setBorder(null);
					btnHelp.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/barraLateral/help.png"))); //$NON-NLS-1$
					GridBagConstraints gbc_btnHelp = new GridBagConstraints();
					gbc_btnHelp.insets = new Insets(0, 0, 5, 0);
					gbc_btnHelp.gridx = 0;
					gbc_btnHelp.gridy = 1;
					panelOpcionesPrincipales.add(btnHelp, gbc_btnHelp);
				}
				{
					btnUser = new JButton(""); //$NON-NLS-1$
					btnUser.setBackground(new Color(240, 240, 240));
					btnUser.setOpaque(false);
					btnUser.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnUser.toolTipText")); //$NON-NLS-1$
					btnUser.addActionListener(new BtnUserActionListener());
					btnUser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnUser.setBorder(null);
					btnUser.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/barraLateral/user-male.png"))); //$NON-NLS-1$
					GridBagConstraints gbc_btnUser = new GridBagConstraints();
					gbc_btnUser.insets = new Insets(0, 0, 5, 0);
					gbc_btnUser.gridx = 0;
					gbc_btnUser.gridy = 2;
					panelOpcionesPrincipales.add(btnUser, gbc_btnUser);
				}
				{
					btnLogout = new JButton(""); //$NON-NLS-1$
					btnLogout.setBackground(new Color(240, 240, 240));
					btnLogout.setOpaque(false);
					btnLogout.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnLogout.toolTipText")); //$NON-NLS-1$
					btnLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnLogout.addActionListener(new BtnLogoutActionListener());
					{
						btnCalendario = new JButton(""); //$NON-NLS-1$
						btnCalendario.addActionListener(new BtnCalendarioActionListener());
						btnCalendario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnCalendario.setBackground(new Color(240, 240, 240));
						btnCalendario.setOpaque(false);
						btnCalendario.setToolTipText(MessagesUI_Gestor.getString("UI_Gestor.btnCalendario.toolTipText")); //$NON-NLS-1$
						btnCalendario.setBorder(null);
						btnCalendario.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/barraLateral/calendarbtn.png"))); //$NON-NLS-1$
						GridBagConstraints gbc_btnCalendario = new GridBagConstraints();
						gbc_btnCalendario.insets = new Insets(0, 0, 5, 0);
						gbc_btnCalendario.gridx = 0;
						gbc_btnCalendario.gridy = 3;
						panelOpcionesPrincipales.add(btnCalendario, gbc_btnCalendario);
					}
					btnLogout.setBorder(null);
					btnLogout.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/barraLateral/exit.png"))); //$NON-NLS-1$
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
				mnInicio = new JMenu(MessagesUI_Gestor.getString("UI_Gestor.mnInicio.text")); //$NON-NLS-1$
				mnInicio.setMnemonic('I');
				menuBar.add(mnInicio);
				{
					mntmSalir = new JMenuItem(MessagesUI_Gestor.getString("UI_Gestor.mntmSalir.text")); //$NON-NLS-1$
					mntmSalir.addActionListener(new MntmSalirActionListener());
					{
						mntmCerrarSesion = new JMenuItem(MessagesUI_Gestor.getString("UI_Gestor.mntmCerrarSesion.text")); //$NON-NLS-1$
						mntmCerrarSesion.setEnabled(false);
						mnInicio.add(mntmCerrarSesion);
					}
					mnInicio.add(mntmSalir);
				}
			}
			{
				mnOpciones = new JMenu(MessagesUI_Gestor.getString("UI_Gestor.mnOpciones.text")); //$NON-NLS-1$
				mnOpciones.setMnemonic('V');
				menuBar.add(mnOpciones);
				{
					mntmParcelas = new JMenuItem(MessagesUI_Gestor.getString("UI_Gestor.mntmParcelas.text")); //$NON-NLS-1$
					mntmParcelas.setEnabled(false);
					mnOpciones.add(mntmParcelas);
				}
				{
					mntmBungalows = new JMenuItem(MessagesUI_Gestor.getString("UI_Gestor.mntmBungalows.text")); //$NON-NLS-1$
					mntmBungalows.setEnabled(false);
					mnOpciones.add(mntmBungalows);
				}
				{
					mntmReservas = new JMenuItem(MessagesUI_Gestor.getString("UI_Gestor.mntmReservas.text")); //$NON-NLS-1$
					mntmReservas.setEnabled(false);
					mnOpciones.add(mntmReservas);
				}
				{
					mntmActividades = new JMenuItem(MessagesUI_Gestor.getString("UI_Gestor.mntmActividades.text")); //$NON-NLS-1$
					mntmActividades.setEnabled(false);
					mnOpciones.add(mntmActividades);
				}
				{
					mntmMonitores = new JMenuItem(MessagesUI_Gestor.getString("UI_Gestor.mntmMonitores.text")); //$NON-NLS-1$
					mntmMonitores.setEnabled(false);
					mnOpciones.add(mntmMonitores);
				}
				{
					mntmRutas = new JMenuItem(MessagesUI_Gestor.getString("UI_Gestor.mntmRutas.text")); //$NON-NLS-1$
					mntmRutas.setEnabled(false);
					mnOpciones.add(mntmRutas);
				}
			}
			{
				mnAyuda = new JMenu(MessagesUI_Gestor.getString("UI_Gestor.mnAyuda.text")); //$NON-NLS-1$
				mnAyuda.setMnemonic('Y');
				menuBar.add(mnAyuda);
				{
					mntmAbrirManual = new JMenuItem(MessagesUI_Gestor.getString("UI_Gestor.mntmAbrirManual.text")); //$NON-NLS-1$
					mntmAbrirManual.addActionListener(new BtnHelpActionListener());
					mnAyuda.add(mntmAbrirManual);
				}
				{
					mntmAboutProgram = new JMenuItem(MessagesUI_Gestor.getString("UI_Gestor.mntmAboutProgram.text")); //$NON-NLS-1$
					mntmAboutProgram.addActionListener(new MntmAboutProgramActionListener());
					mnAyuda.add(mntmAboutProgram);
				}
			}
		}
		
	}
	
	public static void cerrar () {
		frmGestorLosOlivos.dispose();
	}

	// ***EVENTOS***//

	private class FrmGestorLosOlivosWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			int sel = JOptionPane.showOptionDialog(frmGestorLosOlivos, MessagesUI_Gestor.getString("UI_Gestor.101"), //$NON-NLS-1$
					MessagesUI_Gestor.getString("UI_Gestor.102"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null); //$NON-NLS-1$
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
			panel.show(frmGestorLosOlivos.getContentPane(), "Iniciar Sesi�n"); //$NON-NLS-1$
			Date date = java.util.Calendar.getInstance().getTime();
			lblBarraDeEstado.setText(MessagesUI_Gestor.getString("UI_Gestor.104") + date); //$NON-NLS-1$
		}
	}

	private class BtnLogoutActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			int sel = JOptionPane.showOptionDialog(frmGestorLosOlivos, MessagesUI_Gestor.getString("UI_Gestor.105"), //$NON-NLS-1$
					MessagesUI_Gestor.getString("UI_Gestor.106"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null); //$NON-NLS-1$
			if (sel == JOptionPane.YES_OPTION) {
				CardLayout panel = (CardLayout) (frmGestorLosOlivos.getContentPane().getLayout());
				panel.show(frmGestorLosOlivos.getContentPane(), "PanelSesion"); // Yes //$NON-NLS-1$
				Date date = java.util.Calendar.getInstance().getTime();
				lblBarraEstado.setText(MessagesUI_Gestor.getString("UI_Gestor.108") + date); //$NON-NLS-1$

				textUsuario.setText(""); //$NON-NLS-1$
				textUsuario.setBorder(new LineBorder(Color.RED, 2));
				lblFoto.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/user.png"))); //$NON-NLS-1$
				passwordField.setText(""); //$NON-NLS-1$
				btnIniciar.setVisible(false);
				
			}
		}
	}

	private class BtnHomeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout panel = (CardLayout) (panelPrincipal.getLayout());
			panel.show(panelPrincipal, "panelPrincipal"); //$NON-NLS-1$
		}
	}

	private class BtnUserActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (comprobadorUsuario == 0) {
				JFrame window = new UI_Usuario();
				UI_Usuario.usuario.setNombre(textUsuario.getText());
				UI_Usuario.usuario.setPass(new String(passwordField.getPassword()));
				UI_Usuario.usuario.setFoto(lblFoto.getIcon().toString());
				window.setVisible(true);
				comprobadorUsuario++;
			}
		}
	}

	private class BtnCambioPanelActionListener implements ActionListener {
		String pane = null;
		DefaultListModel<String> listModel;

		public BtnCambioPanelActionListener(String pane) {
			this.pane = pane;
		}

		public void actionPerformed(ActionEvent e) {
			CardLayout panel = (CardLayout) (panelPrincipal.getLayout());
			panel.show(panelPrincipal, pane);
			switch(pane) {
				case "panelMonitores": //$NON-NLS-1$
					listModel = new DefaultListModel<String>();
					for(int i=0; i<Reader.getListMonitores().size(); i++) {
						listModel.addElement(Reader.getListMonitores().get(i).getNombre());
					}
					listMonitores.setModel(listModel);
					listMonitores.setSelectedIndex(0);
					break;
				case "panelActividades": //$NON-NLS-1$
					listModel = new DefaultListModel<String>();
					for(int i=0; i<Reader.getListActividades().size(); i++) {
						listModel.addElement(Reader.getListActividades().get(i).getDescripcion());
					}
					listActividades.setModel(listModel);
					listActividades.setSelectedIndex(0);
					break;
			}
					
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
			DefaultListModel<String> listModel;
			if (e.getNewLeadSelectionPath() != null) {
				int tam = e.getNewLeadSelectionPath().getPath().length;
				switch (tam) {
				case 1:
					panel = (CardLayout) (panelPrincipal.getLayout());
					panel.show(panelPrincipal, "panelPrincipal"); //$NON-NLS-1$
					break;
				case 2:
					if("Actividades".equals(e.getNewLeadSelectionPath().getPath()[1].toString())) {
						
						listModel = new DefaultListModel<String>();
						for(int i=0; i<Reader.getListActividades().size(); i++) {
							listModel.addElement(Reader.getListActividades().get(i).getDescripcion());
						}
						listActividades.setModel(listModel);
						listActividades.setSelectedIndex(0);
						
					} else if ("Monitores".equals(e.getNewLeadSelectionPath().getPath()[1].toString())) {
						listModel = new DefaultListModel<String>();
						for(int i=0; i<Reader.getListMonitores().size(); i++) {
							listModel.addElement(Reader.getListMonitores().get(i).getNombre());
						}
						listMonitores.setModel(listModel);
						listMonitores.setSelectedIndex(0);
					}
					
					panel = (CardLayout) (panelPrincipal.getLayout());
					panel.show(panelPrincipal, "panel" + e.getNewLeadSelectionPath().getPath()[1]); //$NON-NLS-1$
						
					break;
				case 3:
					String s = e.getNewLeadSelectionPath().getPath()[2].toString();
					String s1 = e.getNewLeadSelectionPath().getPath()[1].toString();
					switch (s) {
					case "Parcelas": //$NON-NLS-1$
						new BtnParcelasBungalowsActionListener(0).actionPerformed(null);
						break;
					case "Bungalows": //$NON-NLS-1$
						new BtnParcelasBungalowsActionListener(1).actionPerformed(null);
						break;
					case "Informacion": //$NON-NLS-1$
						new BtnInfoRutasActionListener().actionPerformed(null);
						break;
					case "Dise�ar": //$NON-NLS-1$
						new BtnDisenoRutaActionListener().actionPerformed(null);
						break;
					case "A�adir": //$NON-NLS-1$
						abrirVentanaArbol(s1, 1);
						break;
					case "Borrar": //$NON-NLS-1$
						abrirVentanaArbol(s1, 2);
						break;
					case "Modificar": //$NON-NLS-1$
						abrirVentanaArbol(s1, 3);
						break;
					case "Consultar": //$NON-NLS-1$
						abrirVentanaArbol(s1, 4);
						break;
					}

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
			JFrame window = new UI_Auxiliar();
			
			for(int i=0; i<Reader.getListMonitores().size(); i++) {
				if(listMonitores.getSelectedValue().equals(Reader.getListMonitores().get(i).getNombre()) && !listMonitores.isSelectionEmpty()) {
					Monitor m = Reader.getListMonitores().get(i);
					
					UI_Auxiliar.monitor.setNombre(m.getNombre());
					UI_Auxiliar.monitor.setApellido1(m.getApellido1());
					UI_Auxiliar.monitor.setApellido2(m.getApellido2());
					UI_Auxiliar.monitor.setDni(m.getDni());
					UI_Auxiliar.monitor.setTelefono(m.getTelefono());
					UI_Auxiliar.monitor.setCorreoElectronico(m.getCorreoElectronico());
					UI_Auxiliar.monitor.setFormacion(m.getFormacion());
					UI_Auxiliar.monitor.setRutaFotoMonitor(m.getRutaFotoMonitor());
					UI_Auxiliar.monitor.setIdiomas(m.getIdiomas());	
				} 
			}
			
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
			JFrame window = new UI_Auxiliar();
			
			for(int i=0; i<Reader.getListActividades().size(); i++) {
				if(listActividades.getSelectedValue().equals(Reader.getListActividades().get(i).getDescripcion()) && !listActividades.isSelectionEmpty()) {
					Actividad a = Reader.getListActividades().get(i);
					
					UI_Auxiliar.actividad.setMonitor(a.getMonitor());
					UI_Auxiliar.actividad.setHoraComienzo(a.getHoraComienzo());
					UI_Auxiliar.actividad.setHoraFin(a.getHoraFin());
					UI_Auxiliar.actividad.setCupoMaximo(a.getCupoMaximo());
					UI_Auxiliar.actividad.setDestinatario(a.getDestinatario());
					UI_Auxiliar.actividad.setPrecio(a.getPrecio());
					UI_Auxiliar.actividad.setDescripcion(a.getDescripcion());
				
				} 
			}
			
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
			JFrame window = new UI_Reservas();
			window.setVisible(true);
			UI_Reservas.setElegirPanel(valor);
		}
	}

	private class BtnCalendarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (comprobadorCalendario == 0) {
				JFrame window = new UI_Calendario();
				window.setVisible(true);
				comprobadorCalendario++;
			}
		}
	}

	private class BtnHelpActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String url = "https://www.youtube.com/watch?v=R_p8MWqnOcE"; //$NON-NLS-1$
			
			try {
				URI uri = new URI(url);
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}

	private class BtnDisenoRutaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (comprobadorDibujoRuta == 0) {
				JFrame window = new UI_DibujoRutas();
				window.setVisible(true);
				comprobadorDibujoRuta++;
			}
		}
	}

	private class MntmSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int sel = JOptionPane.showOptionDialog(frmGestorLosOlivos, MessagesUI_Gestor.getString("UI_Gestor.126"), //$NON-NLS-1$
					MessagesUI_Gestor.getString("UI_Gestor.127"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null); //$NON-NLS-1$
			if (sel == JOptionPane.YES_OPTION) {
				System.exit(1);
			}
		}
	}

	private class BtnInfoRutasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (comprobadorInfoRuta == 0) {
				JFrame window = new UI_Rutas();
				window.setVisible(true);
				comprobadorInfoRuta++;
			}
		}
	}

	private class BtnParcelasBungalowsActionListener implements ActionListener {
		int valor = 0;

		public BtnParcelasBungalowsActionListener(int valor) {
			this.valor = valor;
		}

		public void actionPerformed(ActionEvent e) {
			if (comprobadorParcelasBungalows == 0) {
				JFrame window = new UI_ParcelasBungalows();
				window.setVisible(true);
				UI_ParcelasBungalows.setElegirPanel(valor);
				comprobadorParcelasBungalows++;
			}
		}
	}
	private class TextUsuarioKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			String user = textUsuario.getText();
			for(int i = 0; i<Reader.getListUsuarios().size(); i++) {
				if (user.equals(Reader.getListUsuarios().get(i).getNombre())) {
					textUsuario.setBorder(new LineBorder(Color.GREEN, 2));
					passwordField.setEnabled(true);
					lblFoto.setIcon(new ImageIcon(UI_Gestor.class.getResource(Reader.getListUsuarios().get(i).getFoto())));
				}
			}
		}
		@Override
		public void keyTyped(KeyEvent e) {
			String user = textUsuario.getText();
			for(int i = 0; i<Reader.getListUsuarios().size(); i++) {
				if (!user.equals(Reader.getListUsuarios().get(i).getNombre())) {
					textUsuario.setBorder(new LineBorder(Color.RED, 2));
					passwordField.setEnabled(false);
					lblFoto.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos/user.png")));
				} 
			}
		}
	}
	private class PasswordFieldKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			String pass = new String(passwordField.getPassword());
			for(int i = 0; i<Reader.getListUsuarios().size(); i++) {
				if (pass.equals(Reader.getListUsuarios().get(i).getPass())) {
					btnIniciar.setVisible(true);
				} else {
					btnIniciar.setVisible(false);
				}
			}
		}
	}
	private class BtnGuardarCambiosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (cbIdioma.getSelectedItem().equals("ingl�s")) { //$NON-NLS-1$
				
				MessagesUI_AcercaDe.setIdioma("ingl�s");
				MessagesUI_Auxiliar.setIdioma("ingl�s"); //$NON-NLS-1$
				MessagesUI_Calendario.setIdioma("ingl�s"); //$NON-NLS-1$
				MessagesUI_DibujoRutas.setIdioma("ingl�s"); //$NON-NLS-1$
				MessagesUI_Gestor.setIdioma("ingl�s"); //$NON-NLS-1$
				MessagesUI_ParcelasBungalows.setIdioma("ingl�s"); //$NON-NLS-1$
				MessagesUI_Reservas.setIdioma("ingl�s"); //$NON-NLS-1$
				MessagesUI_Rutas.setIdioma("ingl�s"); //$NON-NLS-1$
				MessagesUI_Usuario.setIdioma("ingl�s"); //$NON-NLS-1$
				cerrar();
				UI_Gestor ventana = new UI_Gestor();
				ventana.frmGestorLosOlivos.setVisible(true);
				ventana.frmGestorLosOlivos.setLocationRelativeTo(null);
			}
			else {
				MessagesUI_Auxiliar.setIdioma("espa�ol"); //$NON-NLS-1$
				MessagesUI_Calendario.setIdioma("espa�ol"); //$NON-NLS-1$
				MessagesUI_DibujoRutas.setIdioma("espa�ol"); //$NON-NLS-1$
				MessagesUI_Gestor.setIdioma("espa�ol"); //$NON-NLS-1$
				MessagesUI_ParcelasBungalows.setIdioma("espa�ol"); //$NON-NLS-1$
				MessagesUI_Reservas.setIdioma("espa�ol"); //$NON-NLS-1$
				MessagesUI_Rutas.setIdioma("espa�ol"); //$NON-NLS-1$
				MessagesUI_Usuario.setIdioma("espa�ol"); //$NON-NLS-1$
				cerrar();
				UI_Gestor ventana = new UI_Gestor();
				ventana.frmGestorLosOlivos.setVisible(true);
				ventana.frmGestorLosOlivos.setLocationRelativeTo(null);
			}
		}
	}
	private class MntmAboutProgramActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			UI_AcercaDe ventana = new UI_AcercaDe();
			ventana.setVisible(true);
			ventana.setLocationRelativeTo(null);
		}
	}

	// ***METODOS***//

	private void abrirVentanaArbol(String seleccion, int modo) {

		switch (seleccion) {
		case "Reservas": //$NON-NLS-1$
			if (modo == 1) {
				new BtnReservasActionListener(0).actionPerformed(null);
			} else if (modo == 2) {
				new BtnReservasActionListener(1).actionPerformed(null);
			} else {
				new BtnReservasActionListener(2).actionPerformed(null);
			}
			break;
		case "Actividades": //$NON-NLS-1$
			
			if (modo == 1) {
				new BtnActividadActionListener(1).actionPerformed(null);
			} else if (modo == 2) {
				new BtnActividadActionListener(3).actionPerformed(null);
			} else if (modo == 3) {
				new BtnActividadActionListener(2).actionPerformed(null);
			} else {
				new BtnActividadActionListener(0).actionPerformed(null);
			}
			break;
		case "Monitores": //$NON-NLS-1$
			
			if (modo == 1) {
				new BtnMonitorActionListener(1).actionPerformed(null);
			} else if (modo == 2) {
				new BtnMonitorActionListener(3).actionPerformed(null);
			} else if (modo == 3) {
				new BtnMonitorActionListener(2).actionPerformed(null);
			} else {
				new BtnMonitorActionListener(0).actionPerformed(null);
			}
			break;
		}
	}

	public static void setComprobadorCalendario(int valor) {
		comprobadorCalendario = valor;
	}

	public static void setComprobadorInfoRuta(int valor) {
		comprobadorInfoRuta = valor;
	}

	public static void setComprobadorDibujoRuta(int valor) {
		comprobadorDibujoRuta = valor;
	}

	public static void setComprobadorUsuario(int valor) {
		comprobadorUsuario = valor;
	}

	public static void setComprobadorParcelasBungalows(int valor) {
		comprobadorParcelasBungalows = valor;
	}
}
