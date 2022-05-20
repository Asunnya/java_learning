package Q1;
//Eu pesquisei sobre essa exception e só consegui lançando ela mesma num código e não um erro em um código
public class IllegalArgumentTestException {
	public static void main(String[] args) {
		try {
			Calcula.imprimeAteValor(11);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}

		Calcula.imprimeAteValor(10);
	}
}
