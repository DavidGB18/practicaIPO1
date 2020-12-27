package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class UI_Principal extends JFrame {

	private static final long serialVersionUID = 6103557088498636460L;
	private JPanel contentPane;
	private JLabel lblGif;
	private static UI_Principal frame;
	private JLabel lblCargando;

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
			Thread.sleep(3000);
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		{
			lblCargando = new JLabel("CARGANDO");
			lblCargando.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblCargando.setHorizontalAlignment(SwingConstants.CENTER);
			contentPane.add(lblCargando, BorderLayout.NORTH);
		}
	}

}
