package presentacion;

import java.io.Serializable;

public class ObjetoGrafico implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8383411679447068443L;
	private int x, y;

	public ObjetoGrafico(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}