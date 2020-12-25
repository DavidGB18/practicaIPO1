package presentacion;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;

public class UI_DibujoRutas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1805295933480759024L;
	private JPanel contentPane;
	private JToolBar tbBarraDibujo;
	private JButton btnGuardar;
	private JButton btnTexto;
	private JButton btnDibujar;
	private JButton btnCargar;
	private JScrollPane scrollPane;

	// Area de dibujo personalizada (extendida de JLabel)
	private MiAreaDibujo miAreaDibujo;
	// Imagen en la que se cargara el fichero seleccionado por el usuario
	private ImageIcon imagen;

	// Variable que almacena el modo de dibujado seleccionado por el usuario
	int modo = -1;
	private final int DIBUJO = 1;
	private final int TEXTO = 2;
	private final int ZOOMMAYOR = 2;
	private final double ZOOMMENOR = 0.5;
	private int currentX, currentY, oldX, oldY;

	// Variables para almacenar las coordenadas actuales
	private int x, y;

	// Componente de entrada de texto que permitirá
	// añadir anotaciones (dibujar texto) sobre la imagen
	private JTextField txtTexto = new JTextField();
	private JButton btnZoomMayor;
	private JButton btnZoomMenor;

	public UI_DibujoRutas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI_DibujoRutas.class.getResource("/recursos/logo.png")));
		setTitle("Dise\u00F1o de Rutas");
		setResizable(false);
		addWindowListener(new ThisWindowListener());
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			tbBarraDibujo = new JToolBar();
			contentPane.add(tbBarraDibujo, BorderLayout.NORTH);
			{
				btnGuardar = new JButton("");
				btnGuardar.setIcon(new ImageIcon(UI_DibujoRutas.class.getResource("/recursos/floppy-disk-2@1x.png")));
				btnGuardar.addActionListener(new BtnGuardarActionListener());

				tbBarraDibujo.add(btnGuardar);
			}
			{
				btnCargar = new JButton("");
				btnCargar.setIcon(new ImageIcon(UI_DibujoRutas.class.getResource("/recursos/folder@1x.png")));
				btnCargar.addActionListener(new BtnCargarActionListener());
				tbBarraDibujo.add(btnCargar);
			}
			{
				btnDibujar = new JButton("");
				btnDibujar.setIcon(new ImageIcon(UI_DibujoRutas.class.getResource("/recursos/pencil@1x.png")));
				btnDibujar.addActionListener(new BtnDibujarActionListener());
				tbBarraDibujo.add(btnDibujar);
			}
			{
				btnTexto = new JButton("");
				btnTexto.setIcon(new ImageIcon(UI_DibujoRutas.class.getResource("/recursos/texto.png")));
				btnTexto.addActionListener(new BtnTextoActionListener());

				tbBarraDibujo.add(btnTexto);
			}
			{
				btnZoomMayor = new JButton("");
				btnZoomMayor.addActionListener(new BtnZoomMayorActionListener());
				btnZoomMayor.setIcon(new ImageIcon(UI_DibujoRutas.class.getResource("/recursos/plus-in-circle@1x.png")));
				tbBarraDibujo.add(btnZoomMayor);
			}
			{
				btnZoomMenor = new JButton("");
				btnZoomMenor.addActionListener(new BtnZoomMenorActionListener());
				btnZoomMenor.setIcon(new ImageIcon(UI_DibujoRutas.class.getResource("/recursos/minus-in-circle@1x.png")));
				tbBarraDibujo.add(btnZoomMenor);
			}
		}
		{
			scrollPane = new JScrollPane();
			contentPane.add(scrollPane, BorderLayout.CENTER);
		}

		// Creacion del area de dibujo personalizada
		miAreaDibujo = new MiAreaDibujo();
		miAreaDibujo.addMouseMotionListener(new MiAreaDibujoMouseMotionListener());
		miAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());
		miAreaDibujo.setIcon(null);
		scrollPane.setViewportView(miAreaDibujo);
	}

	private class MiAreaDibujoMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			if (imagen != null) {
				switch (modo) {
				case DIBUJO:
					oldX = e.getX();
					oldY = e.getY();
					// miAreaDibujo.addObjetoGrafico(new RectanguloGrafico(x, y, x, y, Color.RED));
					break;
				case TEXTO:
					txtTexto.setBounds(x, y, 200, 30);
					txtTexto.setVisible(true);
					txtTexto.requestFocus();
					txtTexto.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg) {
							if (!txtTexto.getText().equals(""))
								miAreaDibujo
										.addObjetoGrafico(new TextoGrafico(x, y + 15, txtTexto.getText(), Color.BLUE));
							txtTexto.setText("");
							txtTexto.setVisible(false);
							miAreaDibujo.repaint();
						}
					});
					miAreaDibujo.add(txtTexto);
					break;
				}
			}

		}
	}

	private class MiAreaDibujoMouseMotionListener extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			if (modo == DIBUJO && imagen != null) {
				currentX = e.getX();
				currentY = e.getY();

				// draw line if g2 context not null
				miAreaDibujo.addObjetoGrafico(new LineaGrafico(currentX, currentY, oldX, oldY, Color.RED));
				// refresh draw area to repaint
				miAreaDibujo.repaint();
				// store current coords x,y as olds x,y
				oldX = currentX;
				oldY = currentY;

			}

		}
	}

	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}

	private class BtnCargarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(contentPane);
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				imagen = new ImageIcon(file.getAbsolutePath());
				miAreaDibujo.setIcon(imagen);
			}
		}
	}

	private class BtnDibujarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = DIBUJO;
		}
	}

	private class BtnTextoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = TEXTO;
		}
	}
	private class ThisWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			UI_Gestor.setComprobadorDibujoRuta(0);
			dispose();
		}
	}
	private class BtnZoomMayorActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int newH = (int) (imagen.getIconHeight() * ZOOMMAYOR);
			int newW = (int) (imagen.getIconWidth() * ZOOMMAYOR);
			Image img= imagen.getImage();
			imagen = new ImageIcon(img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH));
			miAreaDibujo.setIcon(imagen);
			
		}
	}
	private class BtnZoomMenorActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int newH = (int) (imagen.getIconHeight() * ZOOMMENOR);
			int newW = (int) (imagen.getIconWidth() * ZOOMMENOR);
			Image img= imagen.getImage();
			imagen = new ImageIcon(img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH));
			miAreaDibujo.setIcon(imagen);
		}
	}

}