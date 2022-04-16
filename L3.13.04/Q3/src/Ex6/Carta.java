package Ex6;

public class Carta {
    private String naipe; //naipes copas, espadas, ouros e paus
    private int valor; // ás, 2 a 10, valete, dama e rei, valete = 11, dama = 12, rei = 13
    private String nomeIdent;

    public Carta(String naipe, int valor, String nI) {
        this.naipe = naipe;
        this.valor = valor;
        this.nomeIdent = nI;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNomeIdent(String nomeIdent) {
        this.nomeIdent = nomeIdent;
    }

    public String getNomeIdent() {
        return this.nomeIdent;
    }

    public int getValor() {
        return this.valor;
    }

    public String getNaipe() {
        return this.naipe;
    }

}
