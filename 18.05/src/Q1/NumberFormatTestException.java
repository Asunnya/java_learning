package Q1;
//Acontece a tentar fazer um cast de uma variavel que não é inteira para inteira
public class NumberFormatTestException {
	public static void main(String[] args) {
		String a = "a"; String b = "b";
		try {
			Integer.parseInt(a);
			Integer.parseInt(b);
		} catch (NumberFormatException ex) {
			System.out.println("Falha ao converter a string para um inteiro");
		}
		System.out.println("A : " +a+"\nB : "+b);


	}
}

