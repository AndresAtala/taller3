public class Notebook extends DispTecnologico {
	private String resolucionPantalla;
	private String tipoTeclado;
	private String bateria;

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	/**
	 *
	 * @param resolucionPantalla
	 */
	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	/**
	 *
	 * @param tipoTeclado
	 */
	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public String getBateria() {
		return this.bateria;
	}

	/**
	 *
	 * @param bateria
	 */
	public void setBateria(String bateria) {
		this.bateria = bateria;
	}
}
