import java.util.ArrayList;
import java.util.List;

public class tiendaTecnologia {
	private String direccion;
	private List<Cliente> clientes;
	private List<DispTecnologico> dispositivos;

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public tiendaTecnologia() {
		this.direccion = "";
		this.clientes = new ArrayList<>();
		this.dispositivos = new ArrayList<>();
	}

	public void agregarCliente(Cliente cliente) {
		if (!buscarCliente(cliente.getNumero())) {
			clientes.add(cliente);
			System.out.println("Cliente agregado correctamente.");
		} else {
			System.out.println("El cliente ya existe en el sistema.");
		}
	}

	public boolean buscarCliente(String numero) {
		for (Cliente cliente : clientes) {
			if (cliente.getNumero().equals(numero)) {
				return true;
			}
		}
		return false;
	}

	public List<DispTecnologico> buscarDispositivosPorMarca(String marca) {
		List<DispTecnologico> dispositivosEncontrados = new ArrayList<>();
		for (DispTecnologico dispositivo : dispositivos) {
			if (dispositivo.getMarca().equals(marca)) {
				dispositivosEncontrados.add(dispositivo);
			}
		}
		return dispositivosEncontrados;
	}

	public List<DispTecnologico> buscarDispositivosPorModeloYTipo(String modelo, Class<?> tipo) {
		List<DispTecnologico> dispositivosEncontrados = new ArrayList<>();
		for (DispTecnologico dispositivo : dispositivos) {
			if (dispositivo.getModelo().equals(modelo) && tipo.isInstance(dispositivo)) {
				dispositivosEncontrados.add(dispositivo);
			}
		}
		return dispositivosEncontrados;
	}
}
