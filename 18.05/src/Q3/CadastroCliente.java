package Q3;

import Q3.Exceptions.ClienteInexistenteException;
import Q3.Exceptions.ClienteJaExistenteException;
import Q3.Exceptions.DadoInvalidoException;
import Q3.Exceptions.RepositorioException;

import java.util.ArrayList;

public class CadastroCliente {
	private final int QUANTIDADE_CLIENTES_DISPONIVEIS = 10;
	private ArrayList<Cliente> clientes = new ArrayList<>(QUANTIDADE_CLIENTES_DISPONIVEIS);

	public void inserirClientes(int cpf, String nome, int idade) throws DadoInvalidoException, ClienteJaExistenteException, RepositorioException {
		Cliente c = new Cliente(cpf, nome, idade);
		Cliente cliente = null;

		if (clientes.size() == QUANTIDADE_CLIENTES_DISPONIVEIS) {
			throw new RepositorioException();
		}
		try {
			cliente = buscarCliente(cpf);
		}
		catch (ClienteInexistenteException ex) {
			clientes.add(c);
		}
		if (cliente != null) {
			throw new ClienteJaExistenteException();
		}

	}

	public Cliente buscarCliente(int cpf) throws ClienteInexistenteException {
		int buscaSucesso = 0;
		for (Cliente cliente: clientes) {
			if (cliente.getCpf() == cpf) {
				buscaSucesso = 1;
				return cliente;
			}
		}
		throw new ClienteInexistenteException();
	}

}
