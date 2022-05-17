package Q2;

import Q3.CarbonFootprint;

public class Bicicleta implements CarbonFootprint {

	@Override
	public double getCarbonFootprint() {
		return 2 * BICYCLE_TIRE;
	}
}
