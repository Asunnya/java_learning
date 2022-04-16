package Ex7;

public class Produto {
    private String nome;
    private double preco;
    private int qtdeEstoque;

    public Produto(String nome, double preco, int qt) {
        this.nome = nome;
        this.preco = preco;
        this.qtdeEstoque = qt;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQtdeEstoque() {
        return this.qtdeEstoque;
    }
}

