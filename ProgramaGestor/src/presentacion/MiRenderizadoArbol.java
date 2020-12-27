package presentacion;

import java.awt.Component;
import javax.swing.*;
import javax.swing.tree.*;

class MiRenderizadoArbol extends DefaultTreeCellRenderer {

	private static final long serialVersionUID = 8343593297862561331L;

	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf,
			int row, boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
		DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) value;
		String c = (String) (nodo.getUserObject());
		switch (c) {
		case "Gestor":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/home.png")));
			break;
		case "Parcelas-Bungalows":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/parcelas-bungalows.png")));
			break;
		case "Parcelas":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/parcelas.png")));
			break;
		case "Bungalows":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/parcelas-bungalows.png")));
			break;
		case "Reservas":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/reservas.png")));
			break;
		case "A\u00F1adir":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/agregar.png")));
			break;
		case "Borrar":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/borrar.png")));
			break;
		case "Consultar":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/ver.png")));
			break;
		case "Modificar":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/modificar.png")));
			break;
		case "Actividades":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/actividad.png")));
			break;
		case "Rutas":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/rutas.png")));
			break;
		case "Monitores":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/usuario.png")));
			break;
		case "Configuracion":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/configuracion.png")));
			break;
		case "Informacion":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/info.png")));
			break;
		case "Dise\u00F1ar":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/disenar.png")));
			break;
		default:
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/recursos/arbol/home.png")));
			break;
		}
		return this;
	}
}
