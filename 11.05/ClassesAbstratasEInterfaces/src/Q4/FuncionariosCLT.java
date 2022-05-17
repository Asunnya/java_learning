package Q4;

public class FuncionariosCLT extends Funcionario {
	private double salarioTotalHoraExtra;
	private double salarioPorHora;
	private final double FATOR_HORA_EXTRA_SALARIO_POR_HORA = 1.5;
	private final int HORAS_LIMITE = 40;
	private int horasTrabalhadasSemanais = 0;

	@Override
	protected void calculaSalarioTotal() {
		calculaHoraExtra();
		this.salarioTotal = this.salarioBaseSemanal + this.salarioTotalHoraExtra;
	}

	public void calculaHoraExtra() {
		if (this.horasTrabalhadasSemanais > this.HORAS_LIMITE) {
			int horasExtras = this.HORAS_LIMITE - this.horasTrabalhadasSemanais;
			this.salarioTotalHoraExtra = this.FATOR_HORA_EXTRA_SALARIO_POR_HORA * (this.salarioPorHora * horasExtras);
		}
	}

	protected void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadasSemanais = horasTrabalhadas;
	}
}
