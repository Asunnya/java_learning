package Q2;

public class main {
	public static void main(String[] args) {
		ContaCorrente contaPessoa = TesteContaCorrente.criarContaCorrente("Alguém", 1000);
		if (contaPessoa != null) {
			TesteContaCorrente.setLimiteContaCorrente(contaPessoa, 1000);
			TesteContaCorrente.depositarContaCorrente(contaPessoa, -1);
			TesteContaCorrente.sacarContaCorrente(contaPessoa, 2000);
		}




	}
}
