package Ex7;

import java.util.Objects;
import java.util.Scanner;

public class Caixa {

    public void imprimindoPedido(Item[] itens, int qtdPedido){
        System.out.println("-------------- PEDIDO DO CLIENTE --------------------");
        for (int i=0; i < qtdPedido; i++) {
            System.out.println("NOME: " + itens[i].nome);
            System.out.println("QUANTIDADE " + itens[i].qtdDoItem);
        }
        System.out.println("-----------------------------------------------------");
    }
    public void imprimindoProdutos(Produto[] produtos, int qtdProdutos){
        System.out.println("-------------- SUPERMERCADO PRODUTOS --------------------");
        for (int i=0; i < qtdProdutos; i++) {
            System.out.println("NOME: " + produtos[i].nome);
            System.out.println("PRECO " + produtos[i].preco);
            System.out.println("QUANTIDADE EM ESTOQUE " + produtos[i].qtdeEstoque);
        }
        System.out.println("-----------------------------------------------------");
    }
    public float buscandoPrecoItem(Produto[] produtos, Item[] itens, int qtdPedido, int qtdProdutos ) {
        float preco = 0.0f;

        for (int i=0; i < qtdPedido; i++) {
            for (int j=0; j < qtdProdutos; j++) {
                 if (Objects.equals(itens[i].nome, produtos[j].nome)) {
                     preco = produtos[j].preco;
                     return preco;
                 }
            }
        }
        System.out.println("Não foi encontrado um produto");
        return preco;
    }
    public float valorTotalCompra(Produto[] produtos, Item[] itens, int qtdPedido, int qtdProdutos) {
        float total = 0.0f;

        float precoItem = buscandoPrecoItem(produtos, itens, qtdPedido, qtdProdutos);
        if (precoItem > 0.0) {
            total += precoItem * qtdPedido;
        }
        return total;
    }
    public void pagandoPedidos(Produto[] produtos, Item[] itens, int qtdPedido, int qtdProdutos, Scanner keyboard) {
        String wordPagamento = ""; int opPagamento;
        float valorTotal =  valorTotalCompra(produtos, itens, qtdPedido, qtdProdutos);
        System.out.println("O TOTAL DA COMPRA FOI DE " + valorTotal + " REAIS");
        System.out.println("[1] PAGAR NO CARTAO CREDITO\t[2] PAGAR NO CARTAO DEBITO\t[3] PAGAR NO DINHEIRO\t[4] PAGAR NO PIX");
        opPagamento = keyboard.nextInt();
        switch (opPagamento) {
            case 1 -> wordPagamento = "CREDITO";
            case 2 -> wordPagamento = "DEBITO";
            case 3 -> wordPagamento = "DINHEIRO";
            case 4 -> wordPagamento = "PIX";
        }

        System.out.println("FOI PAGO O VALOR DE " +valorTotal + " REAIS\nMETODO DE PAGAMENTO: "+ wordPagamento);

    }
}
