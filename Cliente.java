public class Cliente {
	private String nombre;
	private String apellido;
	private String numero;
	private String estadoCivil;
	private String ciudad;

	public String getNumero() {
		return this.numero;
	}

	/**
	 *
	 * @param numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 *
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	/**
	 *
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	/**
	 *
	 * @param estadoCivil
	 */
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	/**
	 *
	 * @param ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
