package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class UI_Principal extends JFrame {

	private static final long serialVersionUID = 6103557088498636460L;
	private JPanel contentPane;
	private JLabel lblGif;
	private static UI_Principal frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new UI_Principal();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		try {
			Thread.sleep(4900);
			frame.dispose();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
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

	public UI_Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_Principal.class.getResource("/recursos/logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			lblGif = new JLabel("");
			lblGif.setIcon(new ImageIcon(UI_Principal.class.getResource("/recursos/prueba.gif")));
			contentPane.add(lblGif, BorderLayout.CENTER);
		}
	}

}
