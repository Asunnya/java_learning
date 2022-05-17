package Q2;

public class Bicicleta implements CarbonFootprint {
	private String nomeBike;

	protected Bicicleta(String nomeBike) {
		this.nomeBike = nomeBike;
	}

	@Override
	public String toString() {
		return "Bicicleta {" +
				"nomeBike = '" + nomeBike + '\'' +
				'}';
	}

	@Override
	public double getCarbonFootprint() {
		return 2 * BICYCLE_TIRE;
	}
}
