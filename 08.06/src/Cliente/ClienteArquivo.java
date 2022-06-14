package Cliente;

import Cliente.Exceptions.ClienteInexistenteException;
import Cliente.Exceptions.ClienteJaExistenteException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteArquivo {
	public static final String DIRECTORY_CLIENTE_DADOS = "clientes.dados";

	public static List<Cliente> lerCollectionArquivo(String caminho) throws IOException, ClassNotFoundException {

		ObjectInputStream ois;
		List<Cliente> clientes;
		try {
			ois = abrirArquivosLeitura(caminho);
			clientes = (ArrayList<Cliente>) ois.readObject();
			ois.close();
			if (clientes.size() == 0) {
				throw new RuntimeException("Lista vazia");
			}

		} catch (EOFException exception) {
			clientes = new ArrayList<Cliente>();
			reescreverCollectionArquivo(clientes, caminho);
		}

		return clientes;
	}
	/*
	public static void escreverCollectionArquivo(List<Cliente> objects, String caminho) throws IOException {
		ObjectOutputStream os = abrirArquivosEscrita(caminho, true);
		os.writeObject(objects);
		os.close();
	}*/

	public static void reescreverCollectionArquivo(List<Cliente> objects, String caminho) throws IOException {
		ObjectOutputStream os = abrirArquivosEscrita(caminho, false);
		os.writeObject(objects);
		os.close();
	}


	public static boolean inserir(Cliente c, String caminho) throws IOException, ClassNotFoundException, ClienteJaExistenteException {


		List<Cliente> clientes = null;
		try {
			clientes = lerCollectionArquivo(caminho);
		} catch (RuntimeException exception) {
			clientes = new ArrayList<>();
		}
		//TODO perguntar a vania se eh melhor usar um finally aqui
		/*finally {
			if (buscarPorCPF(c.getCpf(), caminho) == null && clientes != null) {
				clientes.add(c);
				escreverCollectionArquivo(clientes, caminho);
				return true;

			} else {
				throw new ClienteJaExistenteException("Cliente já existente!");
			}
		}*/
		if (buscarPorCPF(clientes, c.getCpf()) == null) {
			clientes.add(c);
			reescreverCollectionArquivo(clientes, caminho);
			return true;

		} else {
			throw new ClienteJaExistenteException("Cliente já existente!");
		}

	}


	public static Cliente buscarPorCPF(List<Cliente> clientes, int cpf) throws IOException, ClassNotFoundException {
		for (Cliente c : clientes) {
			if (c.getCpf() == cpf) {
				return c;
			}
		}
		return null;
	}

	public static Cliente buscarPorCPF(int cpf, String caminho) throws IOException, ClassNotFoundException {
		List<Cliente> clientes = lerCollectionArquivo(caminho);
		for (Cliente c : clientes) {
			if (c.getCpf() == cpf) {
				return c;
			}
		}
		return null;
	}

	public static List<Cliente> buscaPorNome(String nome, String caminho) throws IOException, ClassNotFoundException {
		List<Cliente> clientes;
		List<Cliente> clientesComONomeBuscado = new ArrayList<>();

		clientes = lerCollectionArquivo(caminho);
		for (Cliente c : clientes) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				clientesComONomeBuscado.add(c);
			}
		}
		return clientesComONomeBuscado;
	}


	public static boolean excluir(int cpf, String caminho) throws IOException, ClassNotFoundException, ClienteInexistenteException {
		List<Cliente> clientes = lerCollectionArquivo(caminho);
		Cliente c = buscarPorCPF(clientes, cpf);
		if (c != null) {
			if (clientes.remove(c)) {
				reescreverCollectionArquivo(clientes, caminho);
				return true;
			}
		}
		throw new ClienteInexistenteException("Cliente Inexistente, verifique as informações");
	}

	public static void criarClienteArquivo(String caminho) {
		try {
			File file = new File(caminho);
			if (file.createNewFile()) {
				System.out.println("Criado o arquivo");
			} else {
				System.out.println("Arquivo ja existente");
			}

		} catch (IOException e) {
			throw new RuntimeException("Nao foi possivel criar o arquivo, verifique as permissoes");
		}
	}

	public static ObjectInputStream abrirArquivosLeitura(String caminho) throws IOException {
		FileInputStream fi = new FileInputStream(caminho);
		ObjectInputStream os = new ObjectInputStream(fi);
		return os;
	}

	public static ObjectOutputStream abrirArquivosEscrita(String caminho, boolean flag) throws IOException {
		OutputStream fo;
		if (flag) {
			fo = new FileOutputStream(caminho, true);
		} else {
			fo = new FileOutputStream(caminho);
		}

		return new ObjectOutputStream(fo);
	}

	public static int getQuantidadeDeClientes() throws IOException, ClassNotFoundException {
		List<Cliente> clientes = lerCollectionArquivo(DIRECTORY_CLIENTE_DADOS);
		return clientes.size();
	}
}
