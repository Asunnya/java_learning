package Ex7;

public class Pedido {
    Item[] itens = new Item[10];
    int qtdeItensTotalPedido = 0;
    String modoPagamento = "";

    public void addItens(Item item) {
        itens[qtdeItensTotalPedido] = item;
        qtdeItensTotalPedido++;

    }
}
