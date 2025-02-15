package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Usuario;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Toolkit;

public class UI_Usuario extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5491443667104786935L;
	public static Usuario usuario;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblFotoUsuario;
	private JButton btnCambiarFoto;
	private JLabel lblNombre;
	private JTextPane textPaneNombre;
	private JLabel lblPassword;
	private JTextPane textPanePass;
	private JButton btnCambiarPass;
	private JButton btnAceptar;

	/**
	 * Create the frame.
	 */
	public UI_Usuario() {
		usuario = new Usuario();
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_Usuario.class.getResource("/recursos/logo.png")));
		addWindowListener(new ThisWindowListener());
		setResizable(false);
		setTitle(MessagesUI_Usuario.getString("UI_Usuario.this.title")); //$NON-NLS-1$
		setBounds(100, 100, 531, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panel = new JPanel();
			contentPane.add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				lblFotoUsuario = new JLabel("");
				lblFotoUsuario.setIcon(new ImageIcon(UI_Usuario.class.getResource("/recursos/user.png")));
				GridBagConstraints gbc_lblFotoUsuario = new GridBagConstraints();
				gbc_lblFotoUsuario.gridheight = 2;
				gbc_lblFotoUsuario.insets = new Insets(0, 0, 5, 5);
				gbc_lblFotoUsuario.gridx = 1;
				gbc_lblFotoUsuario.gridy = 1;
				panel.add(lblFotoUsuario, gbc_lblFotoUsuario);
			}
			{
				lblNombre = new JLabel(MessagesUI_Usuario.getString("UI_Usuario.lblNombre.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 3;
				gbc_lblNombre.gridy = 2;
				panel.add(lblNombre, gbc_lblNombre);
			}
			{
				textPaneNombre = new JTextPane();
				textPaneNombre.setEditable(false);
				GridBagConstraints gbc_textPaneNombre = new GridBagConstraints();
				gbc_textPaneNombre.insets = new Insets(0, 0, 5, 5);
				gbc_textPaneNombre.fill = GridBagConstraints.BOTH;
				gbc_textPaneNombre.gridx = 4;
				gbc_textPaneNombre.gridy = 2;
				panel.add(textPaneNombre, gbc_textPaneNombre);
			}
			{
				lblPassword = new JLabel(MessagesUI_Usuario.getString("UI_Usuario.lblPassword.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblPassword = new GridBagConstraints();
				gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
				gbc_lblPassword.gridx = 3;
				gbc_lblPassword.gridy = 3;
				panel.add(lblPassword, gbc_lblPassword);
			}
			{
				textPanePass = new JTextPane();
				textPanePass.setEditable(false);
				GridBagConstraints gbc_textPanePass = new GridBagConstraints();
				gbc_textPanePass.insets = new Insets(0, 0, 5, 5);
				gbc_textPanePass.fill = GridBagConstraints.BOTH;
				gbc_textPanePass.gridx = 4;
				gbc_textPanePass.gridy = 3;
				panel.add(textPanePass, gbc_textPanePass);
			}
			{
				btnCambiarFoto = new JButton(MessagesUI_Usuario.getString("UI_Usuario.btnCambiarFoto.text")); //$NON-NLS-1$
				btnCambiarFoto.setEnabled(false);
				btnCambiarFoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				GridBagConstraints gbc_btnCambiarFoto = new GridBagConstraints();
				gbc_btnCambiarFoto.insets = new Insets(0, 0, 5, 5);
				gbc_btnCambiarFoto.gridx = 1;
				gbc_btnCambiarFoto.gridy = 4;
				panel.add(btnCambiarFoto, gbc_btnCambiarFoto);
			}
			{
				btnCambiarPass = new JButton(MessagesUI_Usuario.getString("UI_Usuario.btnCambiarPass.text")); //$NON-NLS-1$
				btnCambiarPass.setEnabled(false);
				btnCambiarPass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				GridBagConstraints gbc_btnCambiarPass = new GridBagConstraints();
				gbc_btnCambiarPass.insets = new Insets(0, 0, 5, 5);
				gbc_btnCambiarPass.gridx = 4;
				gbc_btnCambiarPass.gridy = 4;
				panel.add(btnCambiarPass, gbc_btnCambiarPass);
			}
			{
				btnAceptar = new JButton(MessagesUI_Usuario.getString("UI_Usuario.btnAceptar.text")); //$NON-NLS-1$
				btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnAceptar.addActionListener(new BtnAceptarActionListener());
				GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
				gbc_btnAceptar.fill = GridBagConstraints.BOTH;
				gbc_btnAceptar.gridwidth = 4;
				gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
				gbc_btnAceptar.gridx = 1;
				gbc_btnAceptar.gridy = 6;
				panel.add(btnAceptar, gbc_btnAceptar);
			}
		}
	}
	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			UI_Gestor.setComprobadorUsuario(0);
			dispose();
		}
	}
	private class ThisWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			UI_Gestor.setComprobadorUsuario(0);
			dispose();
		}
		@Override
		public void windowOpened(WindowEvent e) {
			textPaneNombre.setText(usuario.getNombre());
			textPanePass.setText(usuario.getPass());
			String[] absolutePath = usuario.getFoto().split("recursos");
			lblFotoUsuario.setIcon(new ImageIcon(UI_Gestor.class.getResource("/recursos"+absolutePath[1])));
		}
	}
}
