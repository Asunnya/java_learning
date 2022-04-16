package Ex7;

public class Supermercado {
    private Produto[] produtos = new Produto[100];
    private int qtdeProdutosSupermercado = 0;

    public void addProdutos(Produto produto) {
        produtos[qtdeProdutosSupermercado] = produto;
        qtdeProdutosSupermercado++;

    }

    public Produto[] getProdutos() {
        return this.produtos;
    }

    public int getQtdeProdutosSupermercado() {
        return this.qtdeProdutosSupermercado;
    }
}
