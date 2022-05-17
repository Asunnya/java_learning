package Q3;

public class Carro implements CarbonFootprint {
	protected String combustivel;
	protected double cilindrada;
	protected double combustivelGastoMensal;

	protected Carro(String combustivel, double cilindrada, double combustivelGastoMensal) {
		this.combustivel = combustivel;
		this.cilindrada = cilindrada;
		this.combustivelGastoMensal = combustivelGastoMensal;
	}

	protected double getCilindrada() {
		return this.cilindrada;
	}

	@Override
	public double getCarbonFootprint() {
		return (combustivelGastoMensal * MONTHLY_OIL);
	}

	@Override
	public String toString() {
		return "Carro {" +
				"combustivel = '" + combustivel + '\'' +
				", cilindrada = " + cilindrada +
				", combustivelGastoMensal = " + combustivelGastoMensal +
				'}';
	}
}


