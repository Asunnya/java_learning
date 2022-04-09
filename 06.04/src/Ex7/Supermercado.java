package Ex7;

public class Supermercado {
    Produto[] produtos = new Produto[100];
    int qtdeProdutosSupermercado = 0;

    public void addProdutos(Produto produto) {
        produtos[qtdeProdutosSupermercado] = produto;
        qtdeProdutosSupermercado++;

    }
}
