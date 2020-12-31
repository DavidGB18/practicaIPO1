package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;

import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dominio.Bungalow;
import dominio.Categoria;
import dominio.Parcela;
import lecturaEscritura.Reader;
import lecturaEscritura.Writer;

import javax.swing.JScrollPane;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	private JPopupMenu popupMenu;
	private JMenuItem mntmAñadir;
	private JMenuItem mntmEliminar;

	/**
	 * Create the frame.
	 */
	public UI_ParcelasBungalows() {
		setResizable(false);
		addWindowListener(new ThisWindowListener());
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_ParcelasBungalows.class.getResource("/recursos/logo.png"))); //$NON-NLS-1$
		setTitle(MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.this.title")); //$NON-NLS-1$
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 686, 437);
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
				panelParcelasBungalows.add(panelParcelas, "Parcelas"); //$NON-NLS-1$
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
						Object[] nuevaFilaP = {0,0,false,"", null, ""}; //$NON-NLS-1$ //$NON-NLS-2$
						modeloTabla.aniadeFila(nuevaFilaP);
						{
							popupMenu = new JPopupMenu();
							addPopup(tParcelas, popupMenu);
							{
								mntmAñadir = new JMenuItem(MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.mntmA\u00F1adir.text")); //$NON-NLS-1$
								mntmAñadir.addActionListener(new BtnAñadirFilaActionListener(0));
								popupMenu.add(mntmAñadir);
							}
							{
								mntmEliminar = new JMenuItem(MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.mntmEliminar.text")); //$NON-NLS-1$
								mntmEliminar.addActionListener(new BtnEliminarFilaActionListener(0));
								popupMenu.add(mntmEliminar);
							}
						}
						spParcelas.setViewportView(tParcelas);
						
						TableColumn columnaCategoria = tParcelas.getColumnModel().getColumn(5);

						JComboBox<Categoria> comboBox = new JComboBox<Categoria>();
						comboBox.addItem(Categoria.PEQUENA);
						comboBox.addItem(Categoria.MEDIANA);
						comboBox.addItem(Categoria.DELUXE);
						comboBox.addItem(Categoria.GRANDE);
						comboBox.addItem(Categoria.AUTOCARAVANA);

						columnaCategoria.setCellEditor(new DefaultCellEditor(comboBox));
					}
				}
				{
					lblTituloParcelas = new JLabel(MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.lblTituloParcelas.text")); //$NON-NLS-1$
					lblTituloParcelas.setHorizontalAlignment(SwingConstants.CENTER);
					lblTituloParcelas.setFont(new Font("Tahoma", Font.BOLD, 20)); //$NON-NLS-1$
					panelParcelas.add(lblTituloParcelas, BorderLayout.NORTH);
				}
			}
			{
				panelBungalows = new JPanel();
				panelParcelasBungalows.add(panelBungalows, "Bungalows"); //$NON-NLS-1$
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
									 b.getEquipamiento(), b.getCapacidadMaxima(), b.getEstanciaMinima()};
							modeloTabla.aniadeFila(fila);
						}
						Object[] nuevaFilaP = {0,0.0,false,"","", 0, 0}; //$NON-NLS-1$ //$NON-NLS-2$
						modeloTabla.aniadeFila(nuevaFilaP);
						{
							popupMenu = new JPopupMenu();
							addPopup(tBungalows, popupMenu);
							{
								mntmAñadir = new JMenuItem(MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.mntmA\u00F1adir.text")); //$NON-NLS-1$
								mntmAñadir.addActionListener(new BtnAñadirFilaActionListener(1));
								popupMenu.add(mntmAñadir);
							}
							{
								mntmEliminar = new JMenuItem(MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.mntmEliminar.text")); //$NON-NLS-1$
								mntmEliminar.addActionListener(new BtnEliminarFilaActionListener(1));
								popupMenu.add(mntmEliminar);
							}
						}
						spBungalows.setViewportView(tBungalows);

						{
							lblTituloBungalows = new JLabel(MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.lblTituloBungalows.text")); //$NON-NLS-1$
							lblTituloBungalows.setFont(new Font("Tahoma", Font.BOLD, 20)); //$NON-NLS-1$
							lblTituloBungalows.setHorizontalAlignment(SwingConstants.CENTER);
							panelBungalows.add(lblTituloBungalows, BorderLayout.NORTH);
						}
						{
							panelBotones = new JPanel();
							contentPane.add(panelBotones, BorderLayout.SOUTH);
							{
								btnCancelar = new JButton(MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.btnCancelar.text")); //$NON-NLS-1$
								btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
								btnCancelar.addActionListener(new BtnCancelarActionListener());
								panelBotones.add(btnCancelar);
							}
							{
								btnGuardarCambios = new JButton(MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.btnGuardarCambios.text")); //$NON-NLS-1$
								btnGuardarCambios.addActionListener(new BtnGuardarCambiosActionListener());
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
				panel.show(panelParcelasBungalows, "Parcelas"); //$NON-NLS-1$
				break;
			case 1:
				panel.show(panelParcelasBungalows, "Bungalows"); //$NON-NLS-1$
				break;
			}
		}
		@Override
		public void windowClosing(WindowEvent e) {
			
			int sel = JOptionPane.showOptionDialog(null, MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.11"), MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.12"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (sel == JOptionPane.YES_OPTION) {
				UI_Gestor.setComprobadorParcelasBungalows(0);
				dispose();
			} else {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // No
			}
		}
	}
	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int sel = JOptionPane.showOptionDialog(null, MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.13"), //$NON-NLS-1$
					MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.14"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null); //$NON-NLS-1$
			if (sel == JOptionPane.YES_OPTION) {
				UI_Gestor.setComprobadorParcelasBungalows(0);
				dispose();
			} 
		}
	}
	
	public static void setElegirPanel(int valor) {
		elegirPanel=valor;
	}
	
	private class BtnAñadirFilaActionListener implements ActionListener {
		
		int selector;
		
		public BtnAñadirFilaActionListener(int selector) {
			this.selector = selector;
		}
		
		public void actionPerformed(ActionEvent e) {

			switch(selector) {
			case 0:
				MiModeloTablaParcelas modeloTablaP = (MiModeloTablaParcelas) tParcelas.getModel();
				Object[] nuevaFilaP = {0,0,false,"", null, ""}; //$NON-NLS-1$ //$NON-NLS-2$
				modeloTablaP.aniadeFila(nuevaFilaP);
				modeloTablaP.fireTableDataChanged();
				break;
			case 1:
				MiModeloTablaBungalows modeloTablaB = (MiModeloTablaBungalows) tBungalows.getModel();
				Object[] nuevaFilaB = {0,0.0,false,"","",0,0}; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				modeloTablaB.aniadeFila(nuevaFilaB);
				modeloTablaB.fireTableDataChanged();
				break;
			}
		}
	}

	private class BtnEliminarFilaActionListener implements ActionListener {
		
		int selector;
		
		public BtnEliminarFilaActionListener(int selector) {
			this.selector = selector;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			switch(selector) {
			case 0:
				MiModeloTablaParcelas modeloTablaP = (MiModeloTablaParcelas) tParcelas.getModel();
				int n1 = tParcelas.getSelectedRow();
				if (n1 != -1)
					modeloTablaP.eliminaFila(tParcelas.getSelectedRow());
				modeloTablaP.fireTableDataChanged();
				break;
			case 1:
				MiModeloTablaBungalows modeloTablaB = (MiModeloTablaBungalows) tBungalows.getModel();
				int n2 = tBungalows.getSelectedRow();
				if (n2 != -1)
					modeloTablaB.eliminaFila(tBungalows.getSelectedRow());
				modeloTablaB.fireTableDataChanged();
				break;
			}
			

		}
	}
	private class BtnGuardarCambiosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//parcelas-0 , bungalows-1
			
			int sel = JOptionPane.showOptionDialog(null, MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.20"), //$NON-NLS-1$
					MessagesUI_ParcelasBungalows.getString("UI_ParcelasBungalows.21"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null); //$NON-NLS-1$
			if (sel == JOptionPane.YES_OPTION) {
				switch(elegirPanel) {
				case 0:
					ArrayList<Parcela> listParcelasNueva = new ArrayList<Parcela>();
					for(int i=0; i<tParcelas.getRowCount();i++) {
						
						int tam = (int) tParcelas.getValueAt(i,0);
						double precioNoche = (double) tParcelas.getValueAt(i,1);
						boolean disponibilidad = (boolean) tParcelas.getValueAt(i,2);
						String ubicacion= (String) tParcelas.getValueAt(i,3);
						String arrayServicios = (String) tParcelas.getValueAt(i,4);
						Categoria categoria = (Categoria) tParcelas.getValueAt(i,5);
						
						Parcela p = new Parcela(tam, precioNoche, disponibilidad, ubicacion, arrayServicios, categoria);
						listParcelasNueva.add(p);
					}
					while(tParcelas.getRowCount()!=0) {
						MiModeloTablaParcelas modeloTablaP = (MiModeloTablaParcelas) tParcelas.getModel();
						modeloTablaP.eliminaFila(0);
						modeloTablaP.fireTableDataChanged();
					}
					Writer.escribirListaParcelas(listParcelasNueva);
					Reader.setListParcelas(listParcelasNueva);
					break;
				case 1:
					ArrayList<Bungalow> listBungalowsNueva = new ArrayList<Bungalow>();
					
					for(int i=0; i<tBungalows.getRowCount();i++) {
						
						 int tam = (int) tBungalows.getValueAt(i,0);
						 double precioNoche = (double) tBungalows.getValueAt(i,1);
						 boolean disponibilidad = (boolean) tBungalows.getValueAt(i,2);
						 String descripcion = (String) tBungalows.getValueAt(i,3);
						 String equipamiento = (String) tBungalows.getValueAt(i,4);
						 int capacidadMaxima = (int) tBungalows.getValueAt(i,5);
						 int estanciaMinima = (int) tBungalows.getValueAt(i,6);
						
						Bungalow b = new Bungalow(tam, precioNoche, disponibilidad, descripcion, 
								 equipamiento, capacidadMaxima, estanciaMinima);
						listBungalowsNueva.add(b);
					}
					while(tBungalows.getRowCount()!=0) {
						MiModeloTablaBungalows modeloTablaB = (MiModeloTablaBungalows) tBungalows.getModel();
						modeloTablaB.eliminaFila(0);
						modeloTablaB.fireTableDataChanged();
					}
					Writer.escribirListaBungalows(listBungalowsNueva);
					Reader.setListBungalows(listBungalowsNueva);
					break;
				}
				UI_Gestor.setComprobadorParcelasBungalows(0);
				dispose();	
			} 
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
}
