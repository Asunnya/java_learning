package Ex7;

public class Item {
    private String nome;
    private int qtdDoItem;

    public Item (String nome, int q) {
        this.nome = nome;
        this.qtdDoItem = q;

    }

    public String getNome() {
        return this.nome;
    }

    public int getQtdDoItem() {
        return this.qtdDoItem;
    }
}
