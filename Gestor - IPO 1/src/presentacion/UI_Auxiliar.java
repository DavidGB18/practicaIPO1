package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.ImageIcon;

public class UI_Auxiliar extends JFrame {

	private JPanel contentPane;
	private JPanel panelFormularios;
	private JPanel panelBotones;
	private JPanel panelVer;
	private JPanel panelAnadir;
	private JPanel panelBorrar;
	private JPanel panelModificar;
	private JButton btnCancelar;
	private JButton btnAnadir;
	private JButton btnBorrar;
	private JButton btnCancelar2;
	private JButton btnModificar;
	private JButton btnCerrar;
	private JButton btnCancelar1;
	private JPanel panelMonitores;
	private JPanel panelActividad;
	private JLabel lblNombreMonitor;
	private JLabel lblApellido1Monitor;
	private JLabel lblFotoMonitor;
	private JTextField txtNombreMonitor;
	private JTextField txtApellido1Monitor;
	private JLabel lblApellido2Monitor;
	private JLabel lblTlfMonitor;
	private JLabel lblDniMonitor;
	private JLabel lblIdiomasMonitor;
	private JTextField txtApellido2Monitor;
	private JComboBox cbIdiomasMonitor;
	private JFormattedTextField formattedTextFieldTlfMonitor;
	private JFormattedTextField formattedTextFieldDniMonitor;
	private JLabel lblFormacionMonitor;
	private JTextField textField;
	private JLabel lblConfiguracionMonitor;
	private JLabel lblFotoMonitor2;
	private JFormattedTextField formattedTextFieldCorreoMonitor;
	private JLabel lblCorreoMonitor;
	
	public static int elegirPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_Auxiliar frame = new UI_Auxiliar();
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
	public UI_Auxiliar() {
		addWindowListener(new ThisWindowListener());
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 548, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panelFormularios = new JPanel();
			contentPane.add(panelFormularios, BorderLayout.CENTER);
			panelFormularios.setLayout(new CardLayout(0, 0));
			{
				panelMonitores = new JPanel();
				panelFormularios.add(panelMonitores, "Monitor");
				GridBagLayout gbl_panelMonitores = new GridBagLayout();
				gbl_panelMonitores.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_panelMonitores.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_panelMonitores.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
				gbl_panelMonitores.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
				panelMonitores.setLayout(gbl_panelMonitores);
				{
					lblConfiguracionMonitor = new JLabel("Configuraci\u00F3n Monitor:");
					lblConfiguracionMonitor.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_lblConfiguracionMonitor = new GridBagConstraints();
					gbc_lblConfiguracionMonitor.anchor = GridBagConstraints.WEST;
					gbc_lblConfiguracionMonitor.gridwidth = 2;
					gbc_lblConfiguracionMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblConfiguracionMonitor.gridx = 1;
					gbc_lblConfiguracionMonitor.gridy = 1;
					panelMonitores.add(lblConfiguracionMonitor, gbc_lblConfiguracionMonitor);
				}
				{
					lblNombreMonitor = new JLabel("Nombre:");
					GridBagConstraints gbc_lblNombreMonitor = new GridBagConstraints();
					gbc_lblNombreMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblNombreMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblNombreMonitor.gridx = 1;
					gbc_lblNombreMonitor.gridy = 3;
					panelMonitores.add(lblNombreMonitor, gbc_lblNombreMonitor);
				}
				{
					txtNombreMonitor = new JTextField();
					GridBagConstraints gbc_txtNombreMonitor = new GridBagConstraints();
					gbc_txtNombreMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_txtNombreMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtNombreMonitor.gridx = 2;
					gbc_txtNombreMonitor.gridy = 3;
					panelMonitores.add(txtNombreMonitor, gbc_txtNombreMonitor);
					txtNombreMonitor.setColumns(10);
				}
				{
					lblFotoMonitor2 = new JLabel("Foto:");
					GridBagConstraints gbc_lblFotoMonitor2 = new GridBagConstraints();
					gbc_lblFotoMonitor2.insets = new Insets(0, 0, 5, 5);
					gbc_lblFotoMonitor2.gridx = 4;
					gbc_lblFotoMonitor2.gridy = 3;
					panelMonitores.add(lblFotoMonitor2, gbc_lblFotoMonitor2);
				}
				{
					lblFotoMonitor = new JLabel("");
					lblFotoMonitor.setIcon(new ImageIcon(UI_Auxiliar.class.getResource("/recursos/user.png")));
					GridBagConstraints gbc_lblFotoMonitor = new GridBagConstraints();
					gbc_lblFotoMonitor.gridheight = 4;
					gbc_lblFotoMonitor.gridwidth = 5;
					gbc_lblFotoMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblFotoMonitor.gridx = 5;
					gbc_lblFotoMonitor.gridy = 3;
					panelMonitores.add(lblFotoMonitor, gbc_lblFotoMonitor);
				}
				{
					lblApellido1Monitor = new JLabel("Apellido 1:");
					GridBagConstraints gbc_lblApellido1Monitor = new GridBagConstraints();
					gbc_lblApellido1Monitor.anchor = GridBagConstraints.EAST;
					gbc_lblApellido1Monitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblApellido1Monitor.gridx = 1;
					gbc_lblApellido1Monitor.gridy = 4;
					panelMonitores.add(lblApellido1Monitor, gbc_lblApellido1Monitor);
				}
				{
					txtApellido1Monitor = new JTextField();
					GridBagConstraints gbc_txtApellido1Monitor = new GridBagConstraints();
					gbc_txtApellido1Monitor.insets = new Insets(0, 0, 5, 5);
					gbc_txtApellido1Monitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtApellido1Monitor.gridx = 2;
					gbc_txtApellido1Monitor.gridy = 4;
					panelMonitores.add(txtApellido1Monitor, gbc_txtApellido1Monitor);
					txtApellido1Monitor.setColumns(10);
				}
				{
					lblApellido2Monitor = new JLabel("Apellido 2:");
					GridBagConstraints gbc_lblApellido2Monitor = new GridBagConstraints();
					gbc_lblApellido2Monitor.anchor = GridBagConstraints.EAST;
					gbc_lblApellido2Monitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblApellido2Monitor.gridx = 1;
					gbc_lblApellido2Monitor.gridy = 5;
					panelMonitores.add(lblApellido2Monitor, gbc_lblApellido2Monitor);
				}
				{
					txtApellido2Monitor = new JTextField();
					GridBagConstraints gbc_txtApellido2Monitor = new GridBagConstraints();
					gbc_txtApellido2Monitor.insets = new Insets(0, 0, 5, 5);
					gbc_txtApellido2Monitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtApellido2Monitor.gridx = 2;
					gbc_txtApellido2Monitor.gridy = 5;
					panelMonitores.add(txtApellido2Monitor, gbc_txtApellido2Monitor);
					txtApellido2Monitor.setColumns(10);
				}
				{
					lblDniMonitor = new JLabel("DNI:");
					GridBagConstraints gbc_lblDniMonitor = new GridBagConstraints();
					gbc_lblDniMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblDniMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblDniMonitor.gridx = 1;
					gbc_lblDniMonitor.gridy = 7;
					panelMonitores.add(lblDniMonitor, gbc_lblDniMonitor);
				}
				{
					formattedTextFieldDniMonitor = new JFormattedTextField();
					GridBagConstraints gbc_formattedTextFieldDniMonitor = new GridBagConstraints();
					gbc_formattedTextFieldDniMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_formattedTextFieldDniMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_formattedTextFieldDniMonitor.gridx = 2;
					gbc_formattedTextFieldDniMonitor.gridy = 7;
					panelMonitores.add(formattedTextFieldDniMonitor, gbc_formattedTextFieldDniMonitor);
				}
				{
					lblTlfMonitor = new JLabel("Tlf:");
					GridBagConstraints gbc_lblTlfMonitor = new GridBagConstraints();
					gbc_lblTlfMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblTlfMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblTlfMonitor.gridx = 1;
					gbc_lblTlfMonitor.gridy = 8;
					panelMonitores.add(lblTlfMonitor, gbc_lblTlfMonitor);
				}
				{
					formattedTextFieldTlfMonitor = new JFormattedTextField();
					GridBagConstraints gbc_formattedTextFieldTlfMonitor = new GridBagConstraints();
					gbc_formattedTextFieldTlfMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_formattedTextFieldTlfMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_formattedTextFieldTlfMonitor.gridx = 2;
					gbc_formattedTextFieldTlfMonitor.gridy = 8;
					panelMonitores.add(formattedTextFieldTlfMonitor, gbc_formattedTextFieldTlfMonitor);
				}
				{
					lblFormacionMonitor = new JLabel("Formacion:");
					GridBagConstraints gbc_lblFormacionMonitor = new GridBagConstraints();
					gbc_lblFormacionMonitor.gridwidth = 2;
					gbc_lblFormacionMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblFormacionMonitor.gridx = 4;
					gbc_lblFormacionMonitor.gridy = 8;
					panelMonitores.add(lblFormacionMonitor, gbc_lblFormacionMonitor);
				}
				{
					lblCorreoMonitor = new JLabel("Correo:");
					GridBagConstraints gbc_lblCorreoMonitor = new GridBagConstraints();
					gbc_lblCorreoMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblCorreoMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblCorreoMonitor.gridx = 1;
					gbc_lblCorreoMonitor.gridy = 9;
					panelMonitores.add(lblCorreoMonitor, gbc_lblCorreoMonitor);
				}
				{
					formattedTextFieldCorreoMonitor = new JFormattedTextField();
					GridBagConstraints gbc_formattedTextFieldCorreoMonitor = new GridBagConstraints();
					gbc_formattedTextFieldCorreoMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_formattedTextFieldCorreoMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_formattedTextFieldCorreoMonitor.gridx = 2;
					gbc_formattedTextFieldCorreoMonitor.gridy = 9;
					panelMonitores.add(formattedTextFieldCorreoMonitor, gbc_formattedTextFieldCorreoMonitor);
				}
				{
					textField = new JTextField();
					GridBagConstraints gbc_textField = new GridBagConstraints();
					gbc_textField.gridheight = 2;
					gbc_textField.gridwidth = 6;
					gbc_textField.insets = new Insets(0, 0, 5, 5);
					gbc_textField.fill = GridBagConstraints.BOTH;
					gbc_textField.gridx = 4;
					gbc_textField.gridy = 9;
					panelMonitores.add(textField, gbc_textField);
					textField.setColumns(10);
				}
				{
					lblIdiomasMonitor = new JLabel("Idiomas:");
					GridBagConstraints gbc_lblIdiomasMonitor = new GridBagConstraints();
					gbc_lblIdiomasMonitor.anchor = GridBagConstraints.EAST;
					gbc_lblIdiomasMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_lblIdiomasMonitor.gridx = 1;
					gbc_lblIdiomasMonitor.gridy = 10;
					panelMonitores.add(lblIdiomasMonitor, gbc_lblIdiomasMonitor);
				}
				{
					cbIdiomasMonitor = new JComboBox();
					GridBagConstraints gbc_cbIdiomasMonitor = new GridBagConstraints();
					gbc_cbIdiomasMonitor.insets = new Insets(0, 0, 5, 5);
					gbc_cbIdiomasMonitor.fill = GridBagConstraints.HORIZONTAL;
					gbc_cbIdiomasMonitor.gridx = 2;
					gbc_cbIdiomasMonitor.gridy = 10;
					panelMonitores.add(cbIdiomasMonitor, gbc_cbIdiomasMonitor);
				}
			}
			{
				panelActividad = new JPanel();
				panelFormularios.add(panelActividad, "Actividad");
				GridBagLayout gbl_panelActividad = new GridBagLayout();
				gbl_panelActividad.columnWidths = new int[]{0};
				gbl_panelActividad.rowHeights = new int[]{0};
				gbl_panelActividad.columnWeights = new double[]{Double.MIN_VALUE};
				gbl_panelActividad.rowWeights = new double[]{Double.MIN_VALUE};
				panelActividad.setLayout(gbl_panelActividad);
			}
		}
		{
			panelBotones = new JPanel();
			contentPane.add(panelBotones, BorderLayout.SOUTH);
			panelBotones.setLayout(new CardLayout(0, 0));
			{
				panelVer = new JPanel();
				panelBotones.add(panelVer, "Ver");
				{
					btnCerrar = new JButton("Cerrar");
					panelVer.add(btnCerrar);
				}
			}
			{
				panelAnadir = new JPanel();
				panelBotones.add(panelAnadir, "Anadir");
				{
					btnCancelar = new JButton("Cancelar");
					panelAnadir.add(btnCancelar);
				}
				{
					btnAnadir = new JButton("A\u00F1adir");
					panelAnadir.add(btnAnadir);
				}
			}
			{
				panelBorrar = new JPanel();
				panelBotones.add(panelBorrar, "Borrar");
				{
					btnCancelar1 = new JButton("Cancelar");
					panelBorrar.add(btnCancelar1);
				}
				{
					btnBorrar = new JButton("Borrar");
					panelBorrar.add(btnBorrar);
				}
			}
			{
				panelModificar = new JPanel();
				panelBotones.add(panelModificar, "Modificar");
				{
					btnCancelar2 = new JButton("Cancelar");
					panelModificar.add(btnCancelar2);
				}
				{
					btnModificar = new JButton("Modificar");
					panelModificar.add(btnModificar);
				}
			}
		}
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
		@Override
		public void windowOpened(WindowEvent e) {
			CardLayout panel = (CardLayout) (panelBotones.getLayout());
			switch(elegirPanel) {		
			case 0:				
				panel.show(panelBotones, "Ver");
				break;
			case 1:
				panel.show(panelBotones, "Anadir");
				break;
			case 2:
				panel.show(panelBotones, "Modificar");
				break;
			case 3:
				panel.show(panelBotones, "Borrar");
				break;
			}
		}
	}
	public static void setElegirPanel(int valor) {
		elegirPanel=valor;
	}
}
