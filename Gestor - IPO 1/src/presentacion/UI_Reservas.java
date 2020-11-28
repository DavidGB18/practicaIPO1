package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class UI_Reservas extends JFrame {

	private JPanel contentPane;
	private JPanel panelReservas;
	private JPanel panelAnadirReserva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_Reservas frame = new UI_Reservas();
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
	public UI_Reservas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panelReservas = new JPanel();
			contentPane.add(panelReservas, BorderLayout.CENTER);
			panelReservas.setLayout(new CardLayout(0, 0));
			{
				panelAnadirReserva = new JPanel();
				panelReservas.add(panelAnadirReserva, "Añadir");
			}
		}
	}

}
