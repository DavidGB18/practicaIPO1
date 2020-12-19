package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class UI_ParcelasBungalows extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5396939609123725256L;
	private JPanel contentPane;
	private JPanel panelParcelasBungalows;
	private JPanel panelParcelas;
	private JPanel panelBungalows;
	private JTable tParcelas;
	private JTable tBungalows;
	private JScrollPane spBungalows;
	private JScrollPane spParcelas;
	public static int elegirPanel;
	private JLabel lblTituloParcelas;
	private JLabel lblTituloBungalows;
	private JPanel panelBotones;
	private JButton btnCancelar;
	private JButton btnGuardarCambios;
	
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
		setResizable(false);
		addWindowListener(new ThisWindowListener());
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_ParcelasBungalows.class.getResource("/recursos/logo.png")));
		setTitle("Gestor Los Olivos - Tablas Parcelas y Bungalows");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
				panelParcelasBungalows.add(panelParcelas, "Parcelas");
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
				{
					lblTituloParcelas = new JLabel("Parcelas");
					lblTituloParcelas.setHorizontalAlignment(SwingConstants.CENTER);
					lblTituloParcelas.setFont(new Font("Tahoma", Font.BOLD, 20));
					panelParcelas.add(lblTituloParcelas, BorderLayout.NORTH);
				}
			}
			{
				panelBungalows = new JPanel();
				panelParcelasBungalows.add(panelBungalows, "Bungalows");
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
						{
							lblTituloBungalows = new JLabel("Bungalows");
							lblTituloBungalows.setFont(new Font("Tahoma", Font.BOLD, 20));
							lblTituloBungalows.setHorizontalAlignment(SwingConstants.CENTER);
							panelBungalows.add(lblTituloBungalows, BorderLayout.NORTH);
						}
						{
							panelBotones = new JPanel();
							contentPane.add(panelBotones, BorderLayout.SOUTH);
							{
								btnCancelar = new JButton("Cancelar");
								btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
								btnCancelar.addActionListener(new BtnCancelarActionListener());
								panelBotones.add(btnCancelar);
							}
							{
								btnGuardarCambios = new JButton("Guardar Cambios");
								btnGuardarCambios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
								panelBotones.add(btnGuardarCambios);
							}
						}
						tBungalows.getColumnModel().getColumn(6).setPreferredWidth(96);
					}
				}
			}
		}
	}

	private class ThisWindowListener extends WindowAdapter {
		@Override
		public void windowOpened(WindowEvent e) {
			CardLayout panel = (CardLayout) (panelParcelasBungalows.getLayout());
			switch(elegirPanel) {
			case 0:
				panel.show(panelParcelasBungalows, "Parcelas");
				break;
			case 1:
				panel.show(panelParcelasBungalows, "Bungalows");
				break;
			}
		}
		@Override
		public void windowClosing(WindowEvent e) {
			UI_Gestor.setComprobadorParcelasBungalows(0);
			dispose();
		}
	}
	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int sel = JOptionPane.showOptionDialog(null, "¿Seguro que quieres cancelar?",
					"Cancelar operacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (sel == JOptionPane.YES_OPTION) {
				UI_Gestor.setComprobadorParcelasBungalows(0);
				dispose();
			} 
		}
	}
	
	public static void setElegirPanel(int valor) {
		elegirPanel=valor;
	}
}
