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

public class Principal {

	private JFrame frame;
	private JPanel panelAutenticacion;
	private JPanel panel_1;
	private JLabel lblBarraEstado;
	private JPanel panelUsuarioPass;
	private JLabel lblUsuario;
	private JLabel lblPass;
	private JTextField textField;
	private JButton btnIniciar;
	private JLabel lblFoto;
	private JPasswordField passwordField;
	private JPanel panel;
	private JPanel panel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1093, 668);
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
				panelAutenticacion.add(panelUsuarioPass, BorderLayout.CENTER);
				panelUsuarioPass.setLayout(null);
				{
					lblUsuario = new JLabel("Usuario:");
					lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
					lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
					lblUsuario.setBounds(562, 226, 75, 16);
					panelUsuarioPass.add(lblUsuario);
				}
				{
					lblPass = new JLabel("Contrase\u00F1a:");
					lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
					lblPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
					lblPass.setBounds(552, 279, 85, 13);
					panelUsuarioPass.add(lblPass);
				}
				{
					textField = new JTextField();
					textField.setBounds(647, 277, 129, 21);
					panelUsuarioPass.add(textField);
					textField.setColumns(10);
				}
				{
					btnIniciar = new JButton("Iniciar Sesión");
					btnIniciar.addActionListener(new BtnPanelActionListener());
					btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 16));
					btnIniciar.setBounds(630, 336, 161, 46);
					panelUsuarioPass.add(btnIniciar);
				}
				{
					lblFoto = new JLabel("New label");
					lblFoto.setIcon(new ImageIcon(Principal.class.getResource("/presentacion/manageuser.png")));
					lblFoto.setBounds(274, 205, 216, 164);
					panelUsuarioPass.add(lblFoto);
				}
				{
					passwordField = new JPasswordField();
					passwordField.setBounds(647, 227, 129, 19);
					panelUsuarioPass.add(passwordField);
				}
			}
			{
				panel = new JPanel();
				panelAutenticacion.add(panel, BorderLayout.NORTH);
				panel.setLayout(new BorderLayout(0, 0));
			}
		}
		{
			panel_1 = new JPanel();
			frame.getContentPane().add(panel_1, "Iniciar Sesión");
			panel_1.setLayout(new BorderLayout(0, 0));
			{
				panel_2 = new JPanel();
				panel_1.add(panel_2, BorderLayout.CENTER);
				GridBagLayout gbl_panel_2 = new GridBagLayout();
				gbl_panel_2.columnWidths = new int[]{269, 160, 160, 160, 0, 0};
				gbl_panel_2.rowHeights = new int[]{145, 160, 160, 0, 0};
				gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
				gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
				panel_2.setLayout(gbl_panel_2);
				{
					btnNewButton = new JButton("New button");
					btnNewButton.setToolTipText("Parcelas / Bungalows");
					GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
					gbc_btnNewButton.fill = GridBagConstraints.BOTH;
					gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
					gbc_btnNewButton.gridx = 1;
					gbc_btnNewButton.gridy = 1;
					panel_2.add(btnNewButton, gbc_btnNewButton);
				}
				{
					btnNewButton_1 = new JButton("New button");
					btnNewButton_1.setToolTipText("Reservas");
					GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
					gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
					gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
					gbc_btnNewButton_1.gridx = 2;
					gbc_btnNewButton_1.gridy = 1;
					panel_2.add(btnNewButton_1, gbc_btnNewButton_1);
				}
				{
					btnNewButton_2 = new JButton("New button");
					btnNewButton_2.setToolTipText("Actividades");
					GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
					gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
					gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
					gbc_btnNewButton_2.gridx = 3;
					gbc_btnNewButton_2.gridy = 1;
					panel_2.add(btnNewButton_2, gbc_btnNewButton_2);
				}
				{
					btnNewButton_3 = new JButton("New button");
					btnNewButton_3.setToolTipText("Rutas");
					GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
					gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
					gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
					gbc_btnNewButton_3.gridx = 1;
					gbc_btnNewButton_3.gridy = 2;
					panel_2.add(btnNewButton_3, gbc_btnNewButton_3);
				}
				{
					btnNewButton_4 = new JButton("New button");
					btnNewButton_4.setToolTipText("Monitores");
					GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
					gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
					gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
					gbc_btnNewButton_4.gridx = 2;
					gbc_btnNewButton_4.gridy = 2;
					panel_2.add(btnNewButton_4, gbc_btnNewButton_4);
				}
				{
					btnNewButton_5 = new JButton("New button");
					btnNewButton_5.setToolTipText("Configuraci\u00F3n");
					GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
					gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
					gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
					gbc_btnNewButton_5.gridx = 3;
					gbc_btnNewButton_5.gridy = 2;
					panel_2.add(btnNewButton_5, gbc_btnNewButton_5);
				}
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
