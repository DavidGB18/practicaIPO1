package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UI_Reservas extends JFrame {

	private JPanel contentPane;
	private JPanel panelReservas;
	private JPanel panelAnadirReserva;
	private JPanel panelBorrarReserva;
	private JPanel panelConsultarReservas;
	private JButton btnCancelar;
	private JButton btnBorrarReserva;
	private JLabel lblBorrarReserva;
	private JLabel lblIdReserva;
	private JComboBox cbIdReserva;
	private JComboBox cbReserva;
	private JLabel lblIdReservaConsulta;
	private JLabel lblFechaEntrada;
	private JLabel lblHoraEntrada;
	private JTextField txtHoraEntrada;
	private JLabel lblNombreReserva;
	private JLabel lblTelefono;
	private JLabel lblCorreo;
	private JLabel lblConsideraciones;
	private JTextField txtNombre;
	private JTextField txtCorreo;
	private JLabel lblFechaSalida;
	private JLabel lblHoraSalida;
	private JTextField txtHoraSalida;
	private JTextPane txtConsideraciones;
	private JButton btnCerrar;
	private JButton btnModificar;
	private JFormattedTextField formattedTextFieldTlf;
	private JFormattedTextField formattedTextFieldFechaEntrada;
	private JFormattedTextField formattedTextFieldFechaSalida;
	
	public static int elegirPanel;

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
		addWindowListener(new ThisWindowListener());
		setTitle("Vista de Reserva");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 654, 457);
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
				panelAnadirReserva.setLayout(new CardLayout(0, 0));
			}
			{
				panelBorrarReserva = new JPanel();
				panelReservas.add(panelBorrarReserva, "Borrar");
				GridBagLayout gbl_panelBorrarReserva = new GridBagLayout();
				gbl_panelBorrarReserva.columnWidths = new int[]{115, 172, 225, 0, 0};
				gbl_panelBorrarReserva.rowHeights = new int[]{0, 0, 0, 44, 0, 54, 0, 0};
				gbl_panelBorrarReserva.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
				gbl_panelBorrarReserva.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
				panelBorrarReserva.setLayout(gbl_panelBorrarReserva);
				{
					lblBorrarReserva = new JLabel("Borrar Reserva");
					lblBorrarReserva.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_lblBorrarReserva = new GridBagConstraints();
					gbc_lblBorrarReserva.gridwidth = 2;
					gbc_lblBorrarReserva.insets = new Insets(0, 0, 5, 5);
					gbc_lblBorrarReserva.gridx = 0;
					gbc_lblBorrarReserva.gridy = 1;
					panelBorrarReserva.add(lblBorrarReserva, gbc_lblBorrarReserva);
				}
				{
					lblIdReserva = new JLabel("ID Reserva:");
					GridBagConstraints gbc_lblIdReserva = new GridBagConstraints();
					gbc_lblIdReserva.anchor = GridBagConstraints.EAST;
					gbc_lblIdReserva.insets = new Insets(0, 0, 5, 5);
					gbc_lblIdReserva.gridx = 0;
					gbc_lblIdReserva.gridy = 3;
					panelBorrarReserva.add(lblIdReserva, gbc_lblIdReserva);
				}
				{
					cbIdReserva = new JComboBox();
					GridBagConstraints gbc_cbIdReserva = new GridBagConstraints();
					gbc_cbIdReserva.insets = new Insets(0, 0, 5, 5);
					gbc_cbIdReserva.fill = GridBagConstraints.HORIZONTAL;
					gbc_cbIdReserva.gridx = 1;
					gbc_cbIdReserva.gridy = 3;
					panelBorrarReserva.add(cbIdReserva, gbc_cbIdReserva);
				}
				{
					btnCancelar = new JButton("Cancelar");
					btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
					gbc_btnCancelar.fill = GridBagConstraints.BOTH;
					gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
					gbc_btnCancelar.gridx = 1;
					gbc_btnCancelar.gridy = 5;
					panelBorrarReserva.add(btnCancelar, gbc_btnCancelar);
				}
				{
					btnBorrarReserva = new JButton("Borrar");
					btnBorrarReserva.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					GridBagConstraints gbc_btnBorrarReserva = new GridBagConstraints();
					gbc_btnBorrarReserva.fill = GridBagConstraints.BOTH;
					gbc_btnBorrarReserva.insets = new Insets(0, 0, 5, 5);
					gbc_btnBorrarReserva.gridx = 2;
					gbc_btnBorrarReserva.gridy = 5;
					panelBorrarReserva.add(btnBorrarReserva, gbc_btnBorrarReserva);
				}
			}
			{
				panelConsultarReservas = new JPanel();
				panelReservas.add(panelConsultarReservas, "Consultar");
				GridBagLayout gbl_panelConsultarReservas = new GridBagLayout();
				gbl_panelConsultarReservas.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
				gbl_panelConsultarReservas.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_panelConsultarReservas.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
				gbl_panelConsultarReservas.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
				panelConsultarReservas.setLayout(gbl_panelConsultarReservas);
				{
					lblIdReservaConsulta = new JLabel("ID Reserva:");
					GridBagConstraints gbc_lblIdReservaConsulta = new GridBagConstraints();
					gbc_lblIdReservaConsulta.insets = new Insets(0, 0, 5, 5);
					gbc_lblIdReservaConsulta.anchor = GridBagConstraints.EAST;
					gbc_lblIdReservaConsulta.gridx = 1;
					gbc_lblIdReservaConsulta.gridy = 1;
					panelConsultarReservas.add(lblIdReservaConsulta, gbc_lblIdReservaConsulta);
				}
				{
					cbReserva = new JComboBox();
					GridBagConstraints gbc_cbReserva = new GridBagConstraints();
					gbc_cbReserva.insets = new Insets(0, 0, 5, 5);
					gbc_cbReserva.fill = GridBagConstraints.HORIZONTAL;
					gbc_cbReserva.gridx = 2;
					gbc_cbReserva.gridy = 1;
					panelConsultarReservas.add(cbReserva, gbc_cbReserva);
				}
				{
					lblFechaEntrada = new JLabel("Fecha Entrada:");
					GridBagConstraints gbc_lblFechaEntrada = new GridBagConstraints();
					gbc_lblFechaEntrada.anchor = GridBagConstraints.EAST;
					gbc_lblFechaEntrada.insets = new Insets(0, 0, 5, 5);
					gbc_lblFechaEntrada.gridx = 1;
					gbc_lblFechaEntrada.gridy = 3;
					panelConsultarReservas.add(lblFechaEntrada, gbc_lblFechaEntrada);
				}
				{
					formattedTextFieldFechaEntrada = new JFormattedTextField();
					GridBagConstraints gbc_formattedTextFieldFechaEntrada = new GridBagConstraints();
					gbc_formattedTextFieldFechaEntrada.insets = new Insets(0, 0, 5, 5);
					gbc_formattedTextFieldFechaEntrada.fill = GridBagConstraints.HORIZONTAL;
					gbc_formattedTextFieldFechaEntrada.gridx = 2;
					gbc_formattedTextFieldFechaEntrada.gridy = 3;
					panelConsultarReservas.add(formattedTextFieldFechaEntrada, gbc_formattedTextFieldFechaEntrada);
				}
				{
					lblHoraEntrada = new JLabel("Hora Entrada:");
					GridBagConstraints gbc_lblHoraEntrada = new GridBagConstraints();
					gbc_lblHoraEntrada.anchor = GridBagConstraints.EAST;
					gbc_lblHoraEntrada.insets = new Insets(0, 0, 5, 5);
					gbc_lblHoraEntrada.gridx = 4;
					gbc_lblHoraEntrada.gridy = 3;
					panelConsultarReservas.add(lblHoraEntrada, gbc_lblHoraEntrada);
				}
				{
					txtHoraEntrada = new JTextField();
					GridBagConstraints gbc_txtHoraEntrada = new GridBagConstraints();
					gbc_txtHoraEntrada.insets = new Insets(0, 0, 5, 5);
					gbc_txtHoraEntrada.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtHoraEntrada.gridx = 5;
					gbc_txtHoraEntrada.gridy = 3;
					panelConsultarReservas.add(txtHoraEntrada, gbc_txtHoraEntrada);
					txtHoraEntrada.setColumns(10);
				}
				{
					lblFechaSalida = new JLabel("Fecha Salida:");
					GridBagConstraints gbc_lblFechaSalida = new GridBagConstraints();
					gbc_lblFechaSalida.anchor = GridBagConstraints.EAST;
					gbc_lblFechaSalida.insets = new Insets(0, 0, 5, 5);
					gbc_lblFechaSalida.gridx = 1;
					gbc_lblFechaSalida.gridy = 4;
					panelConsultarReservas.add(lblFechaSalida, gbc_lblFechaSalida);
				}
				{
					formattedTextFieldFechaSalida = new JFormattedTextField();
					GridBagConstraints gbc_formattedTextFieldFechaSalida = new GridBagConstraints();
					gbc_formattedTextFieldFechaSalida.insets = new Insets(0, 0, 5, 5);
					gbc_formattedTextFieldFechaSalida.fill = GridBagConstraints.HORIZONTAL;
					gbc_formattedTextFieldFechaSalida.gridx = 2;
					gbc_formattedTextFieldFechaSalida.gridy = 4;
					panelConsultarReservas.add(formattedTextFieldFechaSalida, gbc_formattedTextFieldFechaSalida);
				}
				{
					lblHoraSalida = new JLabel("Hora Salida:");
					GridBagConstraints gbc_lblHoraSalida = new GridBagConstraints();
					gbc_lblHoraSalida.anchor = GridBagConstraints.EAST;
					gbc_lblHoraSalida.insets = new Insets(0, 0, 5, 5);
					gbc_lblHoraSalida.gridx = 4;
					gbc_lblHoraSalida.gridy = 4;
					panelConsultarReservas.add(lblHoraSalida, gbc_lblHoraSalida);
				}
				{
					txtHoraSalida = new JTextField();
					GridBagConstraints gbc_txtHoraSalida = new GridBagConstraints();
					gbc_txtHoraSalida.insets = new Insets(0, 0, 5, 5);
					gbc_txtHoraSalida.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtHoraSalida.gridx = 5;
					gbc_txtHoraSalida.gridy = 4;
					panelConsultarReservas.add(txtHoraSalida, gbc_txtHoraSalida);
					txtHoraSalida.setColumns(10);
				}
				{
					lblNombreReserva = new JLabel("Nombre:");
					GridBagConstraints gbc_lblNombreReserva = new GridBagConstraints();
					gbc_lblNombreReserva.anchor = GridBagConstraints.EAST;
					gbc_lblNombreReserva.insets = new Insets(0, 0, 5, 5);
					gbc_lblNombreReserva.gridx = 1;
					gbc_lblNombreReserva.gridy = 6;
					panelConsultarReservas.add(lblNombreReserva, gbc_lblNombreReserva);
				}
				{
					txtNombre = new JTextField();
					GridBagConstraints gbc_txtNombre = new GridBagConstraints();
					gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
					gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtNombre.gridx = 2;
					gbc_txtNombre.gridy = 6;
					panelConsultarReservas.add(txtNombre, gbc_txtNombre);
					txtNombre.setColumns(10);
				}
				{
					lblTelefono = new JLabel("Tel\u00E9fono:");
					GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
					gbc_lblTelefono.anchor = GridBagConstraints.EAST;
					gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
					gbc_lblTelefono.gridx = 1;
					gbc_lblTelefono.gridy = 7;
					panelConsultarReservas.add(lblTelefono, gbc_lblTelefono);
				}
				{
					formattedTextFieldTlf = new JFormattedTextField();
					GridBagConstraints gbc_formattedTextFieldTlf = new GridBagConstraints();
					gbc_formattedTextFieldTlf.insets = new Insets(0, 0, 5, 5);
					gbc_formattedTextFieldTlf.fill = GridBagConstraints.HORIZONTAL;
					gbc_formattedTextFieldTlf.gridx = 2;
					gbc_formattedTextFieldTlf.gridy = 7;
					panelConsultarReservas.add(formattedTextFieldTlf, gbc_formattedTextFieldTlf);
				}
				{
					lblCorreo = new JLabel("Correo:");
					GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
					gbc_lblCorreo.anchor = GridBagConstraints.EAST;
					gbc_lblCorreo.insets = new Insets(0, 0, 5, 5);
					gbc_lblCorreo.gridx = 4;
					gbc_lblCorreo.gridy = 7;
					panelConsultarReservas.add(lblCorreo, gbc_lblCorreo);
				}
				{
					txtCorreo = new JTextField();
					GridBagConstraints gbc_txtCorreo = new GridBagConstraints();
					gbc_txtCorreo.insets = new Insets(0, 0, 5, 5);
					gbc_txtCorreo.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtCorreo.gridx = 5;
					gbc_txtCorreo.gridy = 7;
					panelConsultarReservas.add(txtCorreo, gbc_txtCorreo);
					txtCorreo.setColumns(10);
				}
				{
					lblConsideraciones = new JLabel("Consideraciones:");
					GridBagConstraints gbc_lblConsideraciones = new GridBagConstraints();
					gbc_lblConsideraciones.insets = new Insets(0, 0, 5, 5);
					gbc_lblConsideraciones.gridx = 1;
					gbc_lblConsideraciones.gridy = 9;
					panelConsultarReservas.add(lblConsideraciones, gbc_lblConsideraciones);
				}
				{
					txtConsideraciones = new JTextPane();
					GridBagConstraints gbc_txtConsideraciones = new GridBagConstraints();
					gbc_txtConsideraciones.gridwidth = 4;
					gbc_txtConsideraciones.insets = new Insets(0, 0, 5, 5);
					gbc_txtConsideraciones.fill = GridBagConstraints.BOTH;
					gbc_txtConsideraciones.gridx = 2;
					gbc_txtConsideraciones.gridy = 9;
					panelConsultarReservas.add(txtConsideraciones, gbc_txtConsideraciones);
				}
				{
					btnCerrar = new JButton("Cerrar");
					btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_btnCerrar = new GridBagConstraints();
					gbc_btnCerrar.fill = GridBagConstraints.BOTH;
					gbc_btnCerrar.insets = new Insets(0, 0, 5, 5);
					gbc_btnCerrar.gridx = 2;
					gbc_btnCerrar.gridy = 11;
					panelConsultarReservas.add(btnCerrar, gbc_btnCerrar);
				}
				{
					btnModificar = new JButton("Modificar");
					btnModificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_btnModificar = new GridBagConstraints();
					gbc_btnModificar.fill = GridBagConstraints.BOTH;
					gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
					gbc_btnModificar.gridx = 5;
					gbc_btnModificar.gridy = 11;
					panelConsultarReservas.add(btnModificar, gbc_btnModificar);
				}
			}
		}
	}

	public static void setElegirPanel(int valor) {
		elegirPanel=valor;
	}
	private class ThisWindowListener extends WindowAdapter {

		public void windowClosing(WindowEvent e) {
			int sel = JOptionPane.showOptionDialog(null, "¿Seguro que quieres cancelar la operación?",
					"Cerrar ventana", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (sel == JOptionPane.YES_OPTION) {
				dispose(); // Yes
			} else {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // No
			}
		}

		public void windowOpened(WindowEvent e) {
			CardLayout panel = (CardLayout) (panelReservas.getLayout());
			switch(elegirPanel) {
			case 0:
				panel.show(panelReservas, "Añadir");
				break;
			case 1:
				panel.show(panelReservas, "Borrar");
				break;
			case 2:
				panel.show(panelReservas, "Consultar");
			}
		}
	}
}
