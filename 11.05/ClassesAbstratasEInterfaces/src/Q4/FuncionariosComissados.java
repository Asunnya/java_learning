package Q4;

import java.util.ArrayList;

public class FuncionariosComissados extends Funcionario implements Vendivel {
	private ArrayList<Double> produtosVendidos;

	protected void setProdutosVendidos(ArrayList<Double> produtosVendidos) {
		this.produtosVendidos = produtosVendidos;
	}

	@Override
	protected void calculaSalarioTotal() {
		this.salarioTotal = porcentagemSobreVendas();
	}

	@Override
	public double porcentagemSobreVendas() {
		double sum = somaProdutosVendidos();
		return sum * PORCENTAGEM_COMISSAO ;
	}

	public double somaProdutosVendidos() {
		double sum = 0;
		for (double produtosPreco: produtosVendidos) {
			sum += produtosPreco;
		}
		return sum;
	}

}
