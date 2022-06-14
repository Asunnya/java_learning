package Cliente.Exceptions;

import Cliente.CadastroCliente;

import java.util.Scanner;

public class TelaCliente {
	public static void menuCliente() {

		do {
			System.out.println("============== MENU ===================");
			;
			System.out.println("1 - Cadastrar novo Cliente\n2 - Buscar cliente pelo nome\n3 - Buscar Cliente por CPF\n4 - Excluir Cliente\n5 - Listar Clientes");
			Scanner scrInt = new Scanner(System.in);
			Scanner scrString = new Scanner(System.in);
			switch (scrInt.nextInt()) {
				case 1:
					System.out.println("Digite o nome");
					String nome = scrString.nextLine();
					System.out.println("Digite o CPF");
					int cpf = scrInt.nextInt();
					System.out.println("Digite a idade");
					int idade = scrInt.nextInt();
					cadastrando(cpf, nome, idade);
					break;
				case 2:
					System.out.println("Digite o nome");
					buscandoNome(scrString.nextLine());
					break;
				case 3:
					System.out.println("Digite o CPF");
					buscandoCPF(scrInt.nextInt());
					break;
				case 4:
					System.out.println("Digite o CPF");
					excluirCliente(scrInt.nextInt());
					break;
				case 5:
					listando();
					break;

			}

		} while (true);

	}

	public static void cadastrando(int cpf, String nome, int idade) {
		try {
			CadastroCliente.inserirCliente(cpf, nome, idade);
		} catch (RepositorioException | DadoInvalidoException e) {
			e.printStackTrace();
		}
	}

	public static void buscandoCPF(int cpf) {
		try {
			CadastroCliente.buscarClienteCPF(cpf);
		} catch (ClienteInexistenteException e) {
			e.printStackTrace();
		}
	}

	public static void buscandoNome(String nome) {
		CadastroCliente.buscarClientesNomes(nome);
	}

	public static void excluirCliente(int cpf) {
		CadastroCliente.excluir(cpf);
	}

	public static void listando() {
		CadastroCliente.listarClientes();
	}
}
