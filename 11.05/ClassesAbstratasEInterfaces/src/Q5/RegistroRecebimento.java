package Q5;

import java.util.ArrayList;

public class RegistroRecebimento {
	private static ArrayList<Recebivel> registros = new ArrayList<>();

	private static void addRegistros(Recebivel registro) {
		registros.add(registro);
	}

	protected static void imprimirRegistros() {
		for (Recebivel registro: registros) {
			System.out.println(registro.toString());
		}
	}

	protected static void novaVenda(String nomeP, int qtdP, double precoU) {
		ItemVenda itemVenda = new ItemVenda(nomeP, qtdP, precoU);
		addRegistros(itemVenda);
	}

	protected static void novoServico(String descricao, int horas, double precoHora) {
		Servico servico = new Servico(descricao, horas, precoHora);
		addRegistros(servico);
	}

}
