package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import dominio.Dificultad;
import dominio.Fecha;
import dominio.Ruta;
import lecturaEscritura.Reader;
import lecturaEscritura.Writer;

import java.awt.Toolkit;
import java.text.ParseException;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFormattedTextField;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;

public class UI_CrearRuta extends JFrame {

	private static final long serialVersionUID = 1618728439383522343L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNombre;
	private static JTextField txtNombre;
	private JLabel lblFecha;
	private JLabel lblEncuentro;
	private JTextField txtEncuentro;
	private JLabel lblMonitores;
	private JTextField txtMonitores;
	private JLabel lblDescripcion;
	private JTextField txtDescripcion;
	private JLabel lblDificultad;
	private JComboBox<Dificultad> cbDificultad;
	private JLabel lblHoraInicio;
	private JSpinner spHoraInicio;
	private JLabel lblHoraFin;
	private JSpinner spHoraFin;
	private JLabel lblGenteMin;
	private JLabel lblGenteMax;
	private JSpinner spGenteMin;
	private JSpinner spGenteMax;
	private JLabel lblInfo;
	private JFormattedTextField formattedTextFieldFecha;
	private JButton btnCancelar;
	private JButton btnCrear;
	private static Icon icon;
	private static String rutaIcono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_CrearRuta frame = new UI_CrearRuta();
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
	public UI_CrearRuta() {
		addWindowListener(new ThisWindowListener());
		setTitle("Gestor Los Olivos - Crear Ruta");
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_CrearRuta.class.getResource("/recursos/logo.png")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 604, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panel = new JPanel();
			contentPane.add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
			gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			gbl_panel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
			gbl_panel.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0,
					Double.MIN_VALUE };
			panel.setLayout(gbl_panel);
			{
				lblInfo = new JLabel("Introduzca los datos de su RUTA:");
				lblInfo.setFont(new Font("Tahoma", Font.BOLD, 17));
				GridBagConstraints gbc_lblInfo = new GridBagConstraints();
				gbc_lblInfo.anchor = GridBagConstraints.WEST;
				gbc_lblInfo.gridwidth = 6;
				gbc_lblInfo.insets = new Insets(0, 0, 5, 0);
				gbc_lblInfo.gridx = 1;
				gbc_lblInfo.gridy = 1;
				panel.add(lblInfo, gbc_lblInfo);
			}
			{
				lblNombre = new JLabel("Nombre:");
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.anchor = GridBagConstraints.EAST;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 1;
				gbc_lblNombre.gridy = 3;
				panel.add(lblNombre, gbc_lblNombre);
			}
			{
				txtNombre = new JTextField();
				GridBagConstraints gbc_txtNombre = new GridBagConstraints();
				gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
				gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtNombre.gridx = 2;
				gbc_txtNombre.gridy = 3;
				panel.add(txtNombre, gbc_txtNombre);
				txtNombre.setColumns(10);
			}
			{
				lblDificultad = new JLabel("Dificultad:");
				GridBagConstraints gbc_lblDificultad = new GridBagConstraints();
				gbc_lblDificultad.anchor = GridBagConstraints.EAST;
				gbc_lblDificultad.insets = new Insets(0, 0, 5, 5);
				gbc_lblDificultad.gridx = 4;
				gbc_lblDificultad.gridy = 3;
				panel.add(lblDificultad, gbc_lblDificultad);
			}
			{
				cbDificultad = new JComboBox<Dificultad>();
				cbDificultad.setModel(new DefaultComboBoxModel(Dificultad.values()));
				GridBagConstraints gbc_cbDificultad = new GridBagConstraints();
				gbc_cbDificultad.insets = new Insets(0, 0, 5, 5);
				gbc_cbDificultad.fill = GridBagConstraints.HORIZONTAL;
				gbc_cbDificultad.gridx = 5;
				gbc_cbDificultad.gridy = 3;
				panel.add(cbDificultad, gbc_cbDificultad);
			}
			{
				lblFecha = new JLabel("Fecha:");
				GridBagConstraints gbc_lblFecha = new GridBagConstraints();
				gbc_lblFecha.anchor = GridBagConstraints.EAST;
				gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
				gbc_lblFecha.gridx = 1;
				gbc_lblFecha.gridy = 5;
				panel.add(lblFecha, gbc_lblFecha);
			}
			{

				MaskFormatter formatoFecha;
				try {
					formatoFecha = new MaskFormatter("##'/##'/####");
					formatoFecha.setPlaceholderCharacter('*');
					formattedTextFieldFecha = new JFormattedTextField(formatoFecha);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				GridBagConstraints gbc_formattedTextFieldFecha = new GridBagConstraints();
				gbc_formattedTextFieldFecha.insets = new Insets(0, 0, 5, 5);
				gbc_formattedTextFieldFecha.fill = GridBagConstraints.HORIZONTAL;
				gbc_formattedTextFieldFecha.gridx = 2;
				gbc_formattedTextFieldFecha.gridy = 5;
				panel.add(formattedTextFieldFecha, gbc_formattedTextFieldFecha);
			}
			{
				lblHoraInicio = new JLabel("Hora Inicio:");
				GridBagConstraints gbc_lblHoraInicio = new GridBagConstraints();
				gbc_lblHoraInicio.insets = new Insets(0, 0, 5, 5);
				gbc_lblHoraInicio.gridx = 4;
				gbc_lblHoraInicio.gridy = 5;
				panel.add(lblHoraInicio, gbc_lblHoraInicio);
			}
			{
				spHoraInicio = new JSpinner();
				spHoraInicio.setModel(new SpinnerNumberModel(0, 0, 24, 1));
				GridBagConstraints gbc_spHoraInicio = new GridBagConstraints();
				gbc_spHoraInicio.insets = new Insets(0, 0, 5, 5);
				gbc_spHoraInicio.gridx = 5;
				gbc_spHoraInicio.gridy = 5;
				panel.add(spHoraInicio, gbc_spHoraInicio);
			}
			{
				lblHoraFin = new JLabel("Hora Fin:");
				GridBagConstraints gbc_lblHoraFin = new GridBagConstraints();
				gbc_lblHoraFin.insets = new Insets(0, 0, 5, 5);
				gbc_lblHoraFin.gridx = 4;
				gbc_lblHoraFin.gridy = 6;
				panel.add(lblHoraFin, gbc_lblHoraFin);
			}
			{
				spHoraFin = new JSpinner();
				spHoraFin.setModel(new SpinnerNumberModel(0, 0, 24, 1));
				GridBagConstraints gbc_spHoraFin = new GridBagConstraints();
				gbc_spHoraFin.insets = new Insets(0, 0, 5, 5);
				gbc_spHoraFin.gridx = 5;
				gbc_spHoraFin.gridy = 6;
				panel.add(spHoraFin, gbc_spHoraFin);
			}
			{
				lblEncuentro = new JLabel("Punto Encuentro:");
				GridBagConstraints gbc_lblEncuentro = new GridBagConstraints();
				gbc_lblEncuentro.anchor = GridBagConstraints.EAST;
				gbc_lblEncuentro.insets = new Insets(0, 0, 5, 5);
				gbc_lblEncuentro.gridx = 1;
				gbc_lblEncuentro.gridy = 7;
				panel.add(lblEncuentro, gbc_lblEncuentro);
			}
			{
				txtEncuentro = new JTextField();
				GridBagConstraints gbc_txtEncuentro = new GridBagConstraints();
				gbc_txtEncuentro.insets = new Insets(0, 0, 5, 5);
				gbc_txtEncuentro.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtEncuentro.gridx = 2;
				gbc_txtEncuentro.gridy = 7;
				panel.add(txtEncuentro, gbc_txtEncuentro);
				txtEncuentro.setColumns(10);
			}
			{
				lblMonitores = new JLabel("Monitores:");
				GridBagConstraints gbc_lblMonitores = new GridBagConstraints();
				gbc_lblMonitores.anchor = GridBagConstraints.EAST;
				gbc_lblMonitores.insets = new Insets(0, 0, 5, 5);
				gbc_lblMonitores.gridx = 1;
				gbc_lblMonitores.gridy = 8;
				panel.add(lblMonitores, gbc_lblMonitores);
			}
			{
				txtMonitores = new JTextField();
				GridBagConstraints gbc_txtMonitores = new GridBagConstraints();
				gbc_txtMonitores.insets = new Insets(0, 0, 5, 5);
				gbc_txtMonitores.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtMonitores.gridx = 2;
				gbc_txtMonitores.gridy = 8;
				panel.add(txtMonitores, gbc_txtMonitores);
				txtMonitores.setColumns(10);
			}
			{
				lblGenteMin = new JLabel("Aforo minimo:");
				GridBagConstraints gbc_lblGenteMin = new GridBagConstraints();
				gbc_lblGenteMin.insets = new Insets(0, 0, 5, 5);
				gbc_lblGenteMin.gridx = 4;
				gbc_lblGenteMin.gridy = 8;
				panel.add(lblGenteMin, gbc_lblGenteMin);
			}
			{
				spGenteMin = new JSpinner();
				spGenteMin.setModel(new SpinnerNumberModel(1, 1, null, 1));
				GridBagConstraints gbc_spGenteMin = new GridBagConstraints();
				gbc_spGenteMin.insets = new Insets(0, 0, 5, 5);
				gbc_spGenteMin.gridx = 5;
				gbc_spGenteMin.gridy = 8;
				panel.add(spGenteMin, gbc_spGenteMin);
			}
			{
				lblDescripcion = new JLabel("Descripcion:");
				GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
				gbc_lblDescripcion.anchor = GridBagConstraints.EAST;
				gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
				gbc_lblDescripcion.gridx = 1;
				gbc_lblDescripcion.gridy = 9;
				panel.add(lblDescripcion, gbc_lblDescripcion);
			}
			{
				txtDescripcion = new JTextField();
				GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
				gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
				gbc_txtDescripcion.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtDescripcion.gridx = 2;
				gbc_txtDescripcion.gridy = 9;
				panel.add(txtDescripcion, gbc_txtDescripcion);
				txtDescripcion.setColumns(10);
			}
			{
				lblGenteMax = new JLabel("Aforo maximo:");
				GridBagConstraints gbc_lblGenteMax = new GridBagConstraints();
				gbc_lblGenteMax.insets = new Insets(0, 0, 5, 5);
				gbc_lblGenteMax.gridx = 4;
				gbc_lblGenteMax.gridy = 9;
				panel.add(lblGenteMax, gbc_lblGenteMax);
			}
			{
				spGenteMax = new JSpinner();
				spGenteMax.setModel(new SpinnerNumberModel(1, 1, null, 1));
				GridBagConstraints gbc_spGenteMax = new GridBagConstraints();
				gbc_spGenteMax.insets = new Insets(0, 0, 5, 5);
				gbc_spGenteMax.gridx = 5;
				gbc_spGenteMax.gridy = 9;
				panel.add(spGenteMax, gbc_spGenteMax);
			}
			{
				btnCancelar = new JButton("Cancelar");
				btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
				gbc_btnCancelar.fill = GridBagConstraints.BOTH;
				gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
				gbc_btnCancelar.gridx = 2;
				gbc_btnCancelar.gridy = 11;
				panel.add(btnCancelar, gbc_btnCancelar);
			}
			{
				btnCrear = new JButton("Crear Ruta");
				btnCrear.addActionListener(new BtnCrearActionListener());
				btnCrear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				GridBagConstraints gbc_btnCrear = new GridBagConstraints();
				gbc_btnCrear.fill = GridBagConstraints.BOTH;
				gbc_btnCrear.gridwidth = 2;
				gbc_btnCrear.insets = new Insets(0, 0, 5, 5);
				gbc_btnCrear.gridx = 4;
				gbc_btnCrear.gridy = 11;
				panel.add(btnCrear, gbc_btnCrear);
			}
		}
	}

	private class BtnCrearActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			int sel = JOptionPane.showOptionDialog(null, "¿Seguro que quieres agregar este elemento?",
					"Confirmar operación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (sel == JOptionPane.YES_OPTION) {

				try {
					String nombre = txtNombre.getText();
					Fecha fecha = new Fecha(formattedTextFieldFecha.getText());
					int horaInicio = (int) spHoraInicio.getValue();
					int horaFinal = (int) spHoraFin.getValue();
					String monitor = txtMonitores.getText();
					String puntoEncuentro = txtEncuentro.getText();
					int numeroMinimoPersonas = (int) spGenteMin.getValue();
					int numeroMaximoPersonas = (int) spGenteMax.getValue();
					Dificultad gradoDificultad = (Dificultad) cbDificultad.getSelectedItem();
					
					String descripcion = txtDescripcion.getText();
					String pathImagenRuta = guardarImagen(icon);

					Ruta r = new Ruta(nombre, fecha, horaInicio, horaFinal, monitor, puntoEncuentro,
							numeroMinimoPersonas, numeroMaximoPersonas, gradoDificultad, descripcion, pathImagenRuta);

					Reader.getListRutas().add(r);
					Writer.escribirListaRutas(Reader.getListRutas());
					
					JOptionPane.showMessageDialog(null, "Se han guardado los cambios", "Confirmación de cambios",
							JOptionPane.PLAIN_MESSAGE);
					dispose();
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Algo fue mal en el proceso, vuelva a intentarlo", "Error",
							JOptionPane.ERROR_MESSAGE);
					dispose();
				}
			}
		}
	}

	private class ThisWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			int sel = JOptionPane.showOptionDialog(null, "¿Seguro que quieres cancelar la operación?", "Cerrar ventana",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (sel == JOptionPane.YES_OPTION) {
				dispose();
			} else {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // No
			}
		}
	}

	public static Image iconToImage(Icon icon) {
		if (icon instanceof ImageIcon) {
			return ((ImageIcon) icon).getImage();
		} else {
			int w = icon.getIconWidth();
			int h = icon.getIconHeight();
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			GraphicsDevice gd = ge.getDefaultScreenDevice();
			GraphicsConfiguration gc = gd.getDefaultConfiguration();
			BufferedImage image = gc.createCompatibleImage(w, h);
			Graphics2D g = image.createGraphics();
			icon.paintIcon(null, g, 0, 0);
			g.dispose();
			return image;
		}
	}

	public static void recibirIcono(Icon icono) {
		icon = icono;
	}
	
	public String guardarImagen(Icon icono) {
		rutaIcono = "src/recursos/fotos/" + txtNombre.getText() + ".png";
		Image img = iconToImage(icono);

		BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);

		Graphics2D g2 = bi.createGraphics();
		g2.drawImage(img, 0, 0, null);
		g2.dispose();
		try {
			ImageIO.write(bi, "png", new File(rutaIcono));
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(new JFrame(),
					"Algo fue mal en el proceso, vuelva a intentarlo", "Error",
					JOptionPane.ERROR_MESSAGE);
			dispose();
		}
		return rutaIcono;
	}
}
