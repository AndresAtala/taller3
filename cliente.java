public class cliente {

	private string nombre;
	private string apeliido;
	private string numero;
	private string estadoCivil;
	private string ciudad;

	public string getNumero() {
		return this.numero;
	}

	/**
	 * 
	 * @param numero
	 */
	public void setNumero(string numero) {
		this.numero = numero;
	}

	public string getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(string nombre) {
		this.nombre = nombre;
	}

	public string getApeliido() {
		return this.apeliido;
	}

	/**
	 * 
	 * @param apeliido
	 */
	public void setApeliido(string apeliido) {
		this.apeliido = apeliido;
	}

	public string getEstadoCivil() {
		return this.estadoCivil;
	}

	/**
	 * 
	 * @param estadoCivil
	 */
	public void setEstadoCivil(string estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public string getCiudad() {
		return this.ciudad;
	}

	/**
	 * 
	 * @param ciudad
	 */
	public void setCiudad(string ciudad) {
		this.ciudad = ciudad;
	}

}