package Cliente;

import Cliente.Exceptions.ClienteInexistenteException;
import Cliente.Exceptions.ClienteJaExistenteException;
import Cliente.Exceptions.DadoInvalidoException;
import Cliente.Exceptions.RepositorioException;

import java.io.IOException;
import java.util.List;


public class CadastroCliente {
	private static final int QUANTIDADE_CLIENTES_DISPONIVEIS = 10;


	public static boolean inserirCliente(int cpf, String nome, int idade) throws RepositorioException, DadoInvalidoException {
		Cliente c = new Cliente(cpf, nome, idade);
		try {
			ClienteArquivo.inserir(c, ClienteArquivo.DIRECTORY_CLIENTE_DADOS);
		} catch (IOException e) {
			ClienteArquivo.criarClienteArquivo(ClienteArquivo.DIRECTORY_CLIENTE_DADOS);
			try {
				ClienteArquivo.inserir(c, ClienteArquivo.DIRECTORY_CLIENTE_DADOS);
			} catch (IOException ex) {
				throw new RuntimeException("Ocorreu um erro ao inserir o cliente no arquivo de dados.");
			} catch (ClassNotFoundException ex) {
				throw new RuntimeException("Ocorreu um erro ao atribuir os dados aos clientes");
			} catch (ClienteJaExistenteException ex) {
				throw new RuntimeException("O cliente ja existe, confire os dados");
			}
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Ocorreu um erro ao atribuir os dados aos clientes");
		} catch (ClienteJaExistenteException e) {
			throw new RuntimeException("O cliente ja existe, confire os dados");
		}

		return false;
	}

	public static Cliente buscarClienteCPF(int cpf) throws ClienteInexistenteException {

		Cliente c = null;

		try {
			c = ClienteArquivo.buscarPorCPF(cpf, ClienteArquivo.DIRECTORY_CLIENTE_DADOS);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		if (c != null) {
			listarInformacoes(c, 0);
			return c;

		}
		throw new ClienteInexistenteException();
	}

	public static void buscarClientesNomes(String nome) {
		try {
			List<Cliente> clientes = ClienteArquivo.buscaPorNome(nome, ClienteArquivo.DIRECTORY_CLIENTE_DADOS);
			for (Cliente cliente : clientes) {
				listarInformacoes(cliente, 1);
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void listarClientes() {
		try {
			List<Cliente> clientes = ClienteArquivo.lerCollectionArquivo(ClienteArquivo.DIRECTORY_CLIENTE_DADOS);
			for (Cliente cliente : clientes) {
				listarInformacoes(cliente, 1);
			}
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void excluir(int cpf) {
		try {
			if (ClienteArquivo.excluir(cpf, ClienteArquivo.DIRECTORY_CLIENTE_DADOS)) {
				System.out.println("Cliente excluido com sucesso");
			}
		} catch (IOException | ClassNotFoundException | ClienteInexistenteException e) {
			e.printStackTrace();
		}
	}

	public static void listarInformacoes(Cliente cliente, int sec) {
		if (sec == 0) {
			System.out.println(cliente.getCpf());
		}
		System.out.println(cliente.getNome());
		System.out.println(cliente.getIdade());
	}


}
