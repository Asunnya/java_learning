package Q5;

public class Servico implements Recebivel {
	private String descricao;
	private int horas;
	private double precoHora;

	protected Servico(String descricao, int horas, double precoHora) {
		this.descricao = descricao;
		this.horas = horas;
		this.precoHora = precoHora;
	}

	@Override
	public String toString() {
		return "Servico { " +
				"descricao do servico = '" + descricao + '\'' +
				", horas = " + horas +
				", precoHora = " + precoHora +
				" }";
	}

	@Override
	public double totalizarReceita() {
		return this.horas * this.precoHora;
	}
}
