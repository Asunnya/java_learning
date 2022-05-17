package Q2;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		ArrayList<CarbonFootprint> listaEmissores = new ArrayList<>();

		Carro hondaCivic = new Carro("Gasosa",1.799, 200);
		Carro hondaCivic2 = new Carro("Gasosa",1.799, 500);
		Construcao casinha = new Construcao(true, 0, 100);
		Construcao casinha2 = new Construcao(false, 560, 70);
		Bicicleta bike1 = new Bicicleta("Bike Agara");
		Bicicleta bike2 = new Bicicleta("Bike File");
		
		listaEmissores.add(hondaCivic);
		listaEmissores.add(hondaCivic2);
		listaEmissores.add(casinha);
		listaEmissores.add(casinha2);
		listaEmissores.add(bike1);
		listaEmissores.add(bike2);

		for (CarbonFootprint emisssores: listaEmissores) {
			System.out.println(emisssores.toString());
			System.out.println(emisssores.getCarbonFootprint());
		}

	}
}
