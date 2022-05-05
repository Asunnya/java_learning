package Q3.src;

public class Funcionario extends Participante {
    private String cargoOcupado;

    public Funcionario(int numeroDaMatricula, String nome, String email, String cargoOcupado) {
        super(numeroDaMatricula, nome, email);
        this.cargoOcupado = cargoOcupado;
    }
}
