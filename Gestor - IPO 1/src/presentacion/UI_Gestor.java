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
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTree;
import javax.swing.JSeparator;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class UI_Gestor {

	private JFrame frame;
	private JPanel panelAutenticacion;
	private JPanel panelMenuPrincipal;
	private JLabel lblBarraEstado;
	private JPanel panelUsuarioPass;
	private JLabel lblUsuario;
	private JLabel lblPass;
	private JTextField textUsuario;
	private JButton btnIniciar;
	private JPasswordField passwordField;
	private JPanel panelPrincipal;
	private JButton btnParcelasBungalows;
	private JButton btnReservas;
	private JButton btnActividades;
	private JButton btnRutas;
	private JButton btnMonitores;
	private JButton btnConfiguracion;
	private JPanel panelReservas;
	private JPanel panel_3;
	private JLabel lblFoto;
	private JPanel panelMigas;
	private JMenuBar menuBar;
	private JMenu mnInicio;
	private JMenu mnVer;
	private JMenu mnAyuda;
	private JPanel panelBanner;
	private JPanel panelOpciones;
	private JButton btnAyuda;
	private JButton btnCerrarSesion;
	private JButton btnNewButton;
	private JLabel lblInfo;
	private JTree treePrograma;
	private JLabel lblBanner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_Gestor window = new UI_Gestor();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 849, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		{
			panelAutenticacion = new JPanel();
			frame.getContentPane().add(panelAutenticacion, "PanelSesion");
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
					lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
					lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
					lblUsuario.setBounds(376, 182, 75, 16);
					panelUsuarioPass.add(lblUsuario);
				}
				{
					lblPass = new JLabel("Contrase\u00F1a:");
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
			frame.getContentPane().add(panelMenuPrincipal, "Iniciar Sesión");
			panelMenuPrincipal.setLayout(new BorderLayout(0, 0));
			{
				panelPrincipal = new JPanel();
				panelMenuPrincipal.add(panelPrincipal, BorderLayout.CENTER);
				GridBagLayout gbl_panelPrincipal = new GridBagLayout();
				gbl_panelPrincipal.columnWidths = new int[]{0, -27, 160, 199, 217, 38, 0};
				gbl_panelPrincipal.rowHeights = new int[]{21, 11, 0, 160, 160, 0, 0};
				gbl_panelPrincipal.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
				gbl_panelPrincipal.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
				panelPrincipal.setLayout(gbl_panelPrincipal);
				{
					lblInfo = new JLabel("Seleccione una:");
					lblInfo.setFont(new Font("Tahoma", Font.BOLD, 17));
					GridBagConstraints gbc_lblInfo = new GridBagConstraints();
					gbc_lblInfo.fill = GridBagConstraints.HORIZONTAL;
					gbc_lblInfo.gridwidth = 2;
					gbc_lblInfo.insets = new Insets(0, 0, 5, 5);
					gbc_lblInfo.gridx = 2;
					gbc_lblInfo.gridy = 1;
					panelPrincipal.add(lblInfo, gbc_lblInfo);
				}
				{
					panelOpciones = new JPanel();
					GridBagConstraints gbc_panelOpciones = new GridBagConstraints();
					gbc_panelOpciones.fill = GridBagConstraints.HORIZONTAL;
					gbc_panelOpciones.insets = new Insets(0, 0, 5, 5);
					gbc_panelOpciones.gridx = 4;
					gbc_panelOpciones.gridy = 1;
					panelPrincipal.add(panelOpciones, gbc_panelOpciones);
					{
						btnCerrarSesion = new JButton("Cerrar Sesion");
						panelOpciones.add(btnCerrarSesion);
					}
					{
						btnNewButton = new JButton("");
						panelOpciones.add(btnNewButton);
					}
					{
						btnAyuda = new JButton("");
						btnAyuda.setBorder(null);
						btnAyuda.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/help.png")));
						panelOpciones.add(btnAyuda);
					}
				}
				{
					btnParcelasBungalows = new JButton("");
					btnParcelasBungalows.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/home@3x.png")));
					btnParcelasBungalows.setToolTipText("Parcelas / Bungalows");
					GridBagConstraints gbc_btnParcelasBungalows = new GridBagConstraints();
					gbc_btnParcelasBungalows.fill = GridBagConstraints.BOTH;
					gbc_btnParcelasBungalows.insets = new Insets(0, 0, 5, 5);
					gbc_btnParcelasBungalows.gridx = 2;
					gbc_btnParcelasBungalows.gridy = 3;
					panelPrincipal.add(btnParcelasBungalows, gbc_btnParcelasBungalows);
				}
				{
					btnReservas = new JButton("");
					btnReservas.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/suitcase-1@3x.png")));
					btnReservas.setToolTipText("Reservas");
					GridBagConstraints gbc_btnReservas = new GridBagConstraints();
					gbc_btnReservas.fill = GridBagConstraints.BOTH;
					gbc_btnReservas.insets = new Insets(0, 0, 5, 5);
					gbc_btnReservas.gridx = 3;
					gbc_btnReservas.gridy = 3;
					panelPrincipal.add(btnReservas, gbc_btnReservas);
				}
				{
					btnActividades = new JButton("");
					btnActividades.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/ping-pong@3x.png")));
					btnActividades.setToolTipText("Actividades");
					GridBagConstraints gbc_btnActividades = new GridBagConstraints();
					gbc_btnActividades.fill = GridBagConstraints.BOTH;
					gbc_btnActividades.insets = new Insets(0, 0, 5, 5);
					gbc_btnActividades.gridx = 4;
					gbc_btnActividades.gridy = 3;
					panelPrincipal.add(btnActividades, gbc_btnActividades);
				}
				{
					btnRutas = new JButton("");
					btnRutas.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/map@3x.png")));
					btnRutas.setToolTipText("Rutas");
					GridBagConstraints gbc_btnRutas = new GridBagConstraints();
					gbc_btnRutas.fill = GridBagConstraints.BOTH;
					gbc_btnRutas.insets = new Insets(0, 0, 5, 5);
					gbc_btnRutas.gridx = 2;
					gbc_btnRutas.gridy = 4;
					panelPrincipal.add(btnRutas, gbc_btnRutas);
				}
				{
					btnMonitores = new JButton("");
					btnMonitores.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/users-1@3x.png")));
					btnMonitores.setToolTipText("Monitores");
					GridBagConstraints gbc_btnMonitores = new GridBagConstraints();
					gbc_btnMonitores.fill = GridBagConstraints.BOTH;
					gbc_btnMonitores.insets = new Insets(0, 0, 5, 5);
					gbc_btnMonitores.gridx = 3;
					gbc_btnMonitores.gridy = 4;
					panelPrincipal.add(btnMonitores, gbc_btnMonitores);
				}
				{
					btnConfiguracion = new JButton("");
					btnConfiguracion.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/gears@3x.png")));
					btnConfiguracion.setToolTipText("Configuraci\u00F3n");
					GridBagConstraints gbc_btnConfiguracion = new GridBagConstraints();
					gbc_btnConfiguracion.fill = GridBagConstraints.BOTH;
					gbc_btnConfiguracion.insets = new Insets(0, 0, 5, 5);
					gbc_btnConfiguracion.gridx = 4;
					gbc_btnConfiguracion.gridy = 4;
					panelPrincipal.add(btnConfiguracion, gbc_btnConfiguracion);
				}
			}
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
					lblBanner.setIcon(new ImageIcon(UI_Gestor.class.getResource("/presentacion/banner.jpg")));
					GridBagConstraints gbc_lblBanner = new GridBagConstraints();
					gbc_lblBanner.fill = GridBagConstraints.VERTICAL;
					gbc_lblBanner.gridx = 0;
					gbc_lblBanner.gridy = 0;
					panelBanner.add(lblBanner, gbc_lblBanner);
				}
			}
		}
		{
			panelReservas = new JPanel();
			frame.getContentPane().add(panelReservas, "name_789651186991000");
		}
		{
			menuBar = new JMenuBar();
			frame.setJMenuBar(menuBar);
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
			CardLayout panel = (CardLayout) (frame.getContentPane().getLayout());
			panel.show(frame.getContentPane(), e.getActionCommand());
		}
	}

}
