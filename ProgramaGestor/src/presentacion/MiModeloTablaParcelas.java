package presentacion;

import java.util.*;
import javax.swing.table.*;

class MiModeloTablaParcelas extends AbstractTableModel {

	private static final long serialVersionUID = 7761091626461228430L;
	private String[] nombreColumnas = { "Tam", "Precio Noche", "Disponibilidad", "Ubicacion", "Servicios", "Categoria" };
	private Vector<Object> datos = new Vector<Object>();

	public int getColumnCount() {
		return nombreColumnas.length;
	}

	public int getRowCount() {
		return datos.size();
	}

	public String getColumnName(int col) {
		return nombreColumnas[col];
	}

	public Object getValueAt(int row, int col) {
		Object[] fila = (Object[]) datos.elementAt(row);
		return fila[col];
	}

	public void setValueAt(Object value, int row, int col) {
		if (row < getRowCount() && col < getColumnCount()) {
			Object[] fila = (Object[]) datos.elementAt(row);
			fila[col] = value;
			fireTableCellUpdated(row, col);
		}
	}

	public void eliminaFila(int row) {
		datos.remove(row);
	}

	public void aniadeFila(Object[] row) {
		datos.add(row);
	}
}
