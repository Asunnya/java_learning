package Q3.src;

public class Aluno extends Participante {
    private String cursoMatriculado;


    public Aluno(int numeroDaMatricula, String nome, String email, String curso) {
        super(numeroDaMatricula, nome, email);
        this.cursoMatriculado = curso;
    }
}
