package dominio;

public class Configuracion {

	private String idioma;
	private String apariencia;
	public String tipoLetra;
	private int tamLetra;
	
	public Configuracion(String idioma, String apariencia, String tipoLetra, int tamLetra) {
		this.idioma = idioma;
		this.apariencia = apariencia;
		this.tipoLetra = tipoLetra;
		this.tamLetra = tamLetra;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getApariencia() {
		return apariencia;
	}

	public void setApariencia(String apariencia) {
		this.apariencia = apariencia;
	}

	public String getTipoLetra() {
		return tipoLetra;
	}

	public void setTipoLetra(String tipoLetra) {
		this.tipoLetra = tipoLetra;
	}

	public int getTamLetra() {
		return tamLetra;
	}

	public void setTamLetra(int tamLetra) {
		this.tamLetra = tamLetra;
	}
	
	
}
