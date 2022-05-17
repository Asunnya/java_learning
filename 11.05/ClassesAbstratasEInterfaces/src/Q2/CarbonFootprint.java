package Q2;

public interface CarbonFootprint {
	int MONTHLY_ELETRIC = 105;
	int MONTHLY_GAS = 105;
	int MONTHLY_OIL = 105;
	int MILEAGE_YEARLY = 79;
	int NUMBER_OF_FLIGHTS_LESS_FOUR_HOURS = 1100;
	int NUMBER_OF_FLIGHTS_MORE_FOUR_HOURS = 4400;
	int NOT_RECYCLE_NEWSPAPER = 184;
	int NOT_RECYCLE_ALUMINIUM = 166;


	double getCarbonFootprint();


}
