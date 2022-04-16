package Ex8;

public class Ligacao {
    private float tempoEmMinutos;
    private String contato;

    public Ligacao(float T, String c ){
        this.tempoEmMinutos = T;
        this.contato = c;
    }

    public float getTempoEmMinutos() {
        return this.tempoEmMinutos;
    }

}
