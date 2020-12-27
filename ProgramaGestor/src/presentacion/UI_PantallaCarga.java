package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class UI_PantallaCarga extends JFrame {

	private static final long serialVersionUID = 6103557088498636460L;
	private JPanel contentPane;
	private JLabel lblGif;
	private static UI_PantallaCarga frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new UI_PantallaCarga();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		try {
			Thread.sleep(5000);
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

	/**
	 * Create the frame.
	 */
	public UI_PantallaCarga() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			lblGif = new JLabel("");
			lblGif.setIcon(new ImageIcon(UI_PantallaCarga.class.getResource("/recursos/prueba.gif")));
			contentPane.add(lblGif, BorderLayout.CENTER);
		}
	}

}
