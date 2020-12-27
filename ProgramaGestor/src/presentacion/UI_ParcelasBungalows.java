package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dominio.Bungalow;
import dominio.Parcela;
import lecturaEscritura.Reader;

import javax.swing.JScrollPane;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;
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
						tParcelas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
						
						tParcelas.setRowHeight(30);
						MiModeloTablaParcelas modeloTabla = new MiModeloTablaParcelas();
						tParcelas.setModel(modeloTabla);
						
						for(int i=0; i<Reader.getListParcelas().size(); i++) {
							Parcela p = Reader.getListParcelas().get(i);
							Object[] fila = {p.getTam(), p.getPrecioNoche(), p.isDisponibilidad(), p.getUbicacion(), p.getArrayServicios(), p.getCategoria()};
							modeloTabla.aniadeFila(fila);
						}
						
						spParcelas.setViewportView(tParcelas);
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
						tBungalows.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
						
						tBungalows.setRowHeight(30);
						MiModeloTablaBungalows modeloTabla = new MiModeloTablaBungalows();
						tBungalows.setModel(modeloTabla);
						
						for(int i=0; i<Reader.getListBungalows().size(); i++) {
							Bungalow b = Reader.getListBungalows().get(i);
							Object[] fila = {b.getTam(), b.getPrecioNoche(), b.isDisponibilidad(), b.getDescripcion(), 
									b.getPathFotos(), b.getEquipamiento(), b.getCapacidadMaxima(), b.getEstanciaMinima()};
							modeloTabla.aniadeFila(fila);
						}
						spBungalows.setViewportView(tBungalows);

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
