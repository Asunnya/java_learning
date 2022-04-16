package Ex7;

public class Pedido {
    private Item[] itens = new Item[10];
    private int qtdeItensTotalPedido = 0;
    private String modoPagamento = "";

    public void addItens(Item item) {
        itens[qtdeItensTotalPedido] = item;
        qtdeItensTotalPedido++;

    }

    public Item[] getItens() {
        return this.itens;
    }

    public int getQtdeItensTotalPedido() {
        return this.qtdeItensTotalPedido;
    }


}
