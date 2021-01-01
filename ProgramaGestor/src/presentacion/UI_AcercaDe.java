package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class UI_AcercaDe extends JFrame {

	private JPanel contentPane;
	private JPanel panelInformacion;
	private JButton btnCerrar;
	private JPanel panelLogo;
	private JScrollPane scrollPane;
	private JTextArea txtrAcercaDelGestor;
	private JLabel lblFoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_AcercaDe frame = new UI_AcercaDe();
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
	public UI_AcercaDe() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_AcercaDe.class.getResource("/recursos/logo.png"))); //$NON-NLS-1$
		setTitle(MessagesUI_AcercaDe.getString("UI_AcercaDe.this.title")); //$NON-NLS-1$
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 523, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panelInformacion = new JPanel();
			contentPane.add(panelInformacion, BorderLayout.CENTER);
			panelInformacion.setLayout(new BorderLayout(0, 0));
			{
				panelLogo = new JPanel();
				panelLogo.setBorder(new TitledBorder(null, MessagesUI_AcercaDe.getString("UI_AcercaDe.panelLogo.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
				panelInformacion.add(panelLogo, BorderLayout.NORTH);
				{
					lblFoto = new JLabel(""); //$NON-NLS-1$
					lblFoto.setIcon(new ImageIcon(UI_AcercaDe.class.getResource("/recursos/logoPequeno.png"))); //$NON-NLS-1$
					panelLogo.add(lblFoto);
				}
			}
			{
				scrollPane = new JScrollPane();
				panelInformacion.add(scrollPane, BorderLayout.CENTER);
				{
					txtrAcercaDelGestor = new JTextArea();
					txtrAcercaDelGestor.setEditable(false);
					txtrAcercaDelGestor.setText(MessagesUI_AcercaDe.getString("UI_AcercaDe.3") //$NON-NLS-1$
							+ MessagesUI_AcercaDe.getString("UI_AcercaDe.4") //$NON-NLS-1$
							+ MessagesUI_AcercaDe.getString("UI_AcercaDe.5") //$NON-NLS-1$
							+ MessagesUI_AcercaDe.getString("UI_AcercaDe.6") //$NON-NLS-1$
							+ MessagesUI_AcercaDe.getString("UI_AcercaDe.7")); //$NON-NLS-1$
					scrollPane.setViewportView(txtrAcercaDelGestor);
				}
			}
		}
		{
			btnCerrar = new JButton(MessagesUI_AcercaDe.getString("UI_AcercaDe.btnCerrar.text")); //$NON-NLS-1$
			btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCerrar.addActionListener(new BtnCerrarActionListener());
			contentPane.add(btnCerrar, BorderLayout.SOUTH);
		}
	}

	private class BtnCerrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
}
