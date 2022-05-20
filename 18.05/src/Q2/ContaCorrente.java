package Q2;

public class ContaCorrente {
	private String donoConta;
	private float limite;
	private float saldo;
	private float valorLimite;

	protected ContaCorrente(String nome, float primeiroDeposito) {
		this.donoConta = nome;
		this.limite = valorLimite;
		depositar(primeiroDeposito);
	}

	public void sacar(float value) {

		if (saldo < value) {
			throw new IllegalArgumentException("Não há saldo suficiente para o saque!");
		} else {
			System.out.println("Sacando...." + value);
		}

	}

	public void depositar(float value){

		if (value < 0) {
			throw new IllegalArgumentException("Não é possivel depositar um valor negativo. ");
		} else if (value == 0) {
			throw new IllegalArgumentException("O valor inserido é 0. Tente novamente");
		} else {
				System.out.println("Depositando...." +value);
				this.saldo += value;
		}

	}

	public void setValorLimite(float value){
		if (value <= 0) {
			throw new IllegalArgumentException("O limite não pode ser 0 ou menor que 0");
		} else {
			this.valorLimite = value;
		}
	}


}
