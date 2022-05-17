package Q3;

public class Bicicleta implements CarbonFootprint {

	@Override
	public double getCarbonFootprint() {
		return 2 * BICYCLE_TIRE;
	}
}