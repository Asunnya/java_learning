package Q5;

import java.util.Scanner;

public class Caixa {
	public static void atendimento() {
		Scanner keyboardStr = new Scanner(System.in);
		Scanner keyboardInt = new Scanner(System.in);
		int op;
		do {
			do {
				System.out.println("Bem vindo a loja computaria! Aqui temos servicos de manutencao de computadores e tambem equipamentos de informatica.");
				System.out.println("Escolha uma opcao para o setor responsavel te atender melhor\n1 - Preciso consertar meu computador!\t2 - Gostaria de comprar um produto!");
				op = keyboardInt.nextInt();

			} while (op != 1 && op != 2) ;

			if (op == 1) {
				atendimentoServico(keyboardInt, keyboardStr);
			} else {
				atendimentoClienteItemVenda(keyboardInt, keyboardStr);
			}
			System.out.println("Se deseja nao deseja continuar na operacao, digite algum numero negativo! Se deseja imprimir os registros, digite 0");
			op = keyboardInt.nextInt();

			if (op == 0 || op < 0) {
				System.out.println("====================== REGISTROS REALIZADOS =============================");
				RegistroRecebimento.imprimirRegistros();
				System.out.println("=========================================================================");
			}

		} while (op >= 0);


	}


	public static void atendimentoClienteItemVenda(Scanner keyboardint, Scanner keyboardStr) {

		System.out.println("[VENDEDOR] Digite o nome do produto a venda");
		String nomeP = keyboardStr.nextLine();
		System.out.println("[VENDEDOR] Digite o preço");
		double preco = keyboardint.nextDouble();
		System.out.println("[VENDEDOR] Digite a quantidade ");
		int qtd = keyboardint.nextInt();

		RegistroRecebimento.novaVenda(nomeP, qtd, preco);

	}
	public static void atendimentoServico(Scanner keyboardint, Scanner keyboardStr) {
		System.out.println("[VENDEDOR] Digite a descricao do servico");
		String desc = keyboardStr.nextLine();
		System.out.println("[VENDEDOR] Digite as horas");
		int hora = keyboardint.nextInt();
		System.out.println("[VENDEDOR] Preco por hora de servico");
		double preco = keyboardint.nextDouble();

		RegistroRecebimento.novoServico(desc, hora, preco);
	}

}
