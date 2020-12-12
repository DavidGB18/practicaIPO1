package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Toolkit;

public class UI_ParcelasBungalows extends JFrame {

	private JPanel contentPane;
	private JPanel panelParcelasBungalows;
	private JPanel panelParcelas;
	private JPanel panelBungalows;
	private JTable tParcelas;
	private JTable tBungalows;
	private JScrollPane spBungalows;
	private JScrollPane spParcelas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_ParcelasBungalows frame = new UI_ParcelasBungalows();
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
	public UI_ParcelasBungalows() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_ParcelasBungalows.class.getResource("/recursos/logo.png")));
		setTitle("Gestor Los Olivos - Tablas Parcelas y Bungalows");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panelParcelasBungalows = new JPanel();
			contentPane.add(panelParcelasBungalows, BorderLayout.CENTER);
			panelParcelasBungalows.setLayout(new CardLayout(0, 0));
			{
				panelParcelas = new JPanel();
				panelParcelasBungalows.add(panelParcelas, "name_249437940637600");
				panelParcelas.setLayout(new BorderLayout(0, 0));
				{
					spParcelas = new JScrollPane();
					panelParcelas.add(spParcelas, BorderLayout.CENTER);
					{
						tParcelas = new JTable();
						spParcelas.setViewportView(tParcelas);
						tParcelas.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
							},
							new String[] {
								"Disponibilidad", "Categoria", "Precio Noche", "Ubicaci\u00F3n", "Servicios", "Tama\u00F1o"
							}
						));
					}
				}
			}
			{
				panelBungalows = new JPanel();
				panelParcelasBungalows.add(panelBungalows, "name_249439998390200");
				panelBungalows.setLayout(new BorderLayout(0, 0));
				{
					spBungalows = new JScrollPane();
					panelBungalows.add(spBungalows, BorderLayout.CENTER);
					{
						tBungalows = new JTable();
						spBungalows.setViewportView(tBungalows);
						tBungalows.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null, null},
								{null, null, null, null, null, null, null, null},
							},
							new String[] {
								"Tama\u00F1o", "Precio Noche", "Disponibilidad", "Descripcion", "Equipamiento", "Capacidad", "Estancia Minima", "Foto"
							}
						));
						tBungalows.getColumnModel().getColumn(6).setPreferredWidth(96);
					}
				}
			}
		}
	}

}
