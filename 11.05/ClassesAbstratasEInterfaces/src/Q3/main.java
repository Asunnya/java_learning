package Q3;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		ArrayList<CarbonFootprint> listaEmissores = new ArrayList<>();

		Carro hondaCivic = new Carro("Gasosa",1.799, 200);
		Carro hondaCivic2 = new Carro("Gasosa",1.799, 500);
		Casa casinha = new Casa(true, 0, 100);
		Casa casinha2 = new Casa(false, 560, 70);
		Escola cacilda = new Escola(true, 0, 100);
		Escola elisiario = new Escola(false, 560, 70);
		Bicicleta bike1 = new Bicicleta("Bike Bile");
		Bicicleta bike2 = new Bicicleta("Bike Fla");


		//O programa que cria a lista de objetos vai continuar funcionando após a modificação na estrutura de classes? (responda como comentário no código)
		// Não é possivel instanciar um objeto de uma classe abstrata
		
		listaEmissores.add(hondaCivic);
		listaEmissores.add(hondaCivic2);
		listaEmissores.add(casinha);
		listaEmissores.add(casinha2);
		listaEmissores.add(cacilda);
		listaEmissores.add(elisiario);
		listaEmissores.add(bike1);
		listaEmissores.add(bike2);

		for (CarbonFootprint emisssores: listaEmissores) {
			System.out.println(emisssores.toString());
			System.out.println(emisssores.getCarbonFootprint());
		}

	}
}
