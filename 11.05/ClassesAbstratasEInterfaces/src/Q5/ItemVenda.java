package Q5;

public class ItemVenda implements Recebivel {
	private String nomeProduto;
	private int quantidadeProduto;
	private double precoUnitario;


	protected ItemVenda(String nomeProduto, int quantidadeProduto, double precoUnitario) {
		this.nomeProduto = nomeProduto;
		this.quantidadeProduto = quantidadeProduto;
		this.precoUnitario = precoUnitario;
	}

	@Override
	public String toString() {
		return "Produto Vendido { " +
				"nomeProduto = '" + nomeProduto + '\'' +
				", quantidadeProduto = " + quantidadeProduto +
				", precoUnitario = " + precoUnitario +
				" }";
	}

	@Override
	public double totalizarReceita() {
		return this.precoUnitario * this.quantidadeProduto;
	}


}
