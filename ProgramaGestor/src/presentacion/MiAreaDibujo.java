package presentacion;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JLabel;

public class MiAreaDibujo extends JLabel {
	private ArrayList<ObjetoGrafico> objetosGraficos = new ArrayList<ObjetoGrafico>();

	public MiAreaDibujo() {
	}

	void addObjetoGrafico(ObjetoGrafico objg) {
		objetosGraficos.add(objg);
	}

	public ObjetoGrafico getUltimoObjetoGrafico() {
		return objetosGraficos.get(objetosGraficos.size() - 1);
	}

	public void paint(Graphics g) {
		super.paint(g);

		for (int i = 0; i < objetosGraficos.size(); i++) {
			ObjetoGrafico objg = objetosGraficos.get(i);
			if (objg instanceof LineaGrafico) {
				g.setColor(((LineaGrafico) objg).getColor());
				g.drawLine(objg.getX(), objg.getY(), ((LineaGrafico) objg).getX1(), ((LineaGrafico) objg).getY1());
			} else { // Es un objeto de tipo TextoGrafico
				g.setColor(((TextoGrafico) objg).getColor());
				g.drawString(((TextoGrafico) objg).getTexto(), objg.getX(), objg.getY());
			}

		}
	}
}

