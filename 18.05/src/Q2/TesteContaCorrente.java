package Q2;

public class TesteContaCorrente {


	public static ContaCorrente criarContaCorrente(String nome, float value) {
		try {
			return new ContaCorrente(nome, value);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public static void depositarContaCorrente(ContaCorrente a, int value) {
		try {
			a.depositar(value);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public static void sacarContaCorrente(ContaCorrente a, int value) {
		try {
			a.sacar(value);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public static void setLimiteContaCorrente(ContaCorrente a, int value) {
		try {
			a.setValorLimite(value);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
