package Q4;

public abstract class Funcionario {
	protected double salarioTotal;
	protected double salarioBaseSemanal;


	protected double getSalarioTotal() {
		return this.salarioTotal;
	}

	protected abstract void calculaSalarioTotal();

}
