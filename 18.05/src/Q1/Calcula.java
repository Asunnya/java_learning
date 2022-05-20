package Q1;

public class Calcula {

	public static int soma(Integer a, Integer b) {
		return a+b;
	}

	public static void imprimeAteValor(int value){
		if (value > 10) {
			throw new IllegalArgumentException("Nessa aplicacao, apenas conseguimos mostrar valores de 0 a 10.");
		}
		else {
			for (int i = 0; i <= value; i++) {
				System.out.println(i);
			}
		}
	}


}
