public class notebook extends DIspTecnologico {

	private string resolucionPantalla;
	private string tipoTeclado;
	private string bateria;

	public string getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	/**
	 * 
	 * @param resolucionPantalla
	 */
	public void setResolucionPantalla(string resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public string getTipoTeclado() {
		return this.tipoTeclado;
	}

	/**
	 * 
	 * @param tipoTeclado
	 */
	public void setTipoTeclado(string tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public string getBateria() {
		return this.bateria;
	}

	/**
	 * 
	 * @param bateria
	 */
	public void setBateria(string bateria) {
		this.bateria = bateria;
	}

}