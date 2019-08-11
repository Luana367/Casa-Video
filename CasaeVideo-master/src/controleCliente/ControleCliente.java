package controleCliente;

import java.util.List;

import model.Cliente;

public class ControleCliente {
	
private List<Cliente> clientes;
	
	public void verificar(Cliente cliente) {
		if(cliente.isCompraRealizada()) {
			clientes.add(cliente);
		}
	}


	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
