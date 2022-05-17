package Q4;

public class FuncionarioComissadoAssalariado extends FuncionariosComissados {

	@Override
	protected void calculaSalarioTotal() {
		super.calculaSalarioTotal();
		this.salarioTotal += this.salarioBaseSemanal;
	}

}
