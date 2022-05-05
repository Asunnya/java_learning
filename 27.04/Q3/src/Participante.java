package Q3.src;

public class Participante {
    private int numeroDaMatricula;
    private String nome;
    private String email;

    public Participante(int numeroDaMatricula, String nome, String email) {
        this.numeroDaMatricula = numeroDaMatricula;
        this.nome = nome;
        this.email = email;
    }

    public int getNumeroDaMatricula() {
        return this.numeroDaMatricula;
    }

}

