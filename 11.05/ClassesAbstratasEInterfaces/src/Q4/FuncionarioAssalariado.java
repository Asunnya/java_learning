package Q4;

public class FuncionarioAssalariado extends Funcionario {


	@Override
	protected void calculaSalarioTotal() {
		this.salarioTotal = this.salarioBaseSemanal;
	}
}
