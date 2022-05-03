package Q3.src;

public class Professor extends Funcionario {
    private String departamentoDeAtuacao;

    public Professor(int numeroDaMatricula, String nome, String email, String cargoOcupado, String departamentoDeAtuacao) {
        super(numeroDaMatricula, nome, email, cargoOcupado);
        this.departamentoDeAtuacao = departamentoDeAtuacao;
    }
}
