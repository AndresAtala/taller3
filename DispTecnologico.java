public abstract class DispTecnologico {
	private String marca;
	private String modelo;
	private String ram;
	private String almacenamiento;
	private String procesador;
	private String anoFabricacion;
	private String precio;
	private String stock;

	public String getMarca() {
		return this.marca;
	}

	/**
	 *
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	/**
	 *
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getRam() {
		return this.ram;
	}

	/**
	 *
	 * @param ram
	 */
	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getAlmacenamiento() {
		return this.almacenamiento;
	}

	/**
	 *
	 * @param almacenamiento
	 */
	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	/**
	 *
	 * @param procesador
	 */
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getAnoFabricacion() {
		return this.anoFabricacion;
	}

	/**
	 *
	 * @param anoFabricacion
	 */
	public void setAnoFabricacion(String anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	public String getPrecio() {
		return this.precio;
	}

	/**
	 *
	 * @param precio
	 */
	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getStock() {
		return this.stock;
	}

	/**
	 *
	 * @param stock
	 */
	public void setStock(String stock) {
		this.stock = stock;
	}
}
