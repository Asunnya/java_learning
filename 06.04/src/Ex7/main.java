package Ex7;

/*
* Identifique e implemente as classes em Java para a seguinte especificação:
* O supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma quantidade em estoque.
* Um pedido de um cliente é composto de itens, onde cada item especifica o produto que o cliente deseja e a respectiva quantidade.
* Esse pedido pode ser pago em dinheiro, cheque ou cartão.
*
*/


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Supermercado americanas = new Supermercado();
        Pedido pedido = new Pedido();
        Caixa caixa = new Caixa();

        Scanner keyboardInt = new Scanner(System.in);
        Scanner keyboardStr = new Scanner(System.in);

        System.out.println("[OPERADOR SUPERMERCADO] [DIGITE A QUANTIDADE DE PRODUTOS]");
        int nS = keyboardInt.nextInt();

        for (int i=0; i < nS; i++) {
            Produto produto = new Produto();
            preencherSupermercado(produto, keyboardInt, keyboardStr, americanas);
        }

        caixa.imprimindoProdutos(americanas.produtos, americanas.qtdeProdutosSupermercado);

        System.out.println("[CLIENTE] [DIGITE A QUANTIDADE DE PRODUTOS]");
        int nC = keyboardInt.nextInt();

        for (int i=0; i < nC; i++) {
            Item item = new Item();
            preencherPedido(item, keyboardInt, keyboardStr, pedido);
        }

        caixa.imprimindoPedido(pedido.itens, pedido.qtdeItensTotalPedido);
        caixa.pagandoPedidos(americanas.produtos, pedido.itens, pedido.qtdeItensTotalPedido, americanas.qtdeProdutosSupermercado, keyboardInt);
    }
    public static void preencherSupermercado(Produto produto, Scanner keyboardInt, Scanner keyboardStr, Supermercado supermercado) {
        System.out.println("[OPERADOR SUPERMERCADO] [DIGITE O NOME DO PRODUTO]");
        produto.nome = keyboardStr.nextLine();
        System.out.println("[OPERADOR SUPERMERCADO] [DIGITE O VALOR DO PRODUTO]");
        produto.preco  = keyboardInt.nextInt();
        System.out.println("[OPERADOR SUPERMERCADO] [DIGITE A QUANTIDADE DE ESTOQUE DESSE PRODUTO]");
        produto.qtdeEstoque = keyboardInt.nextInt();

        supermercado.addProdutos(produto);
    }

    public static void preencherPedido(Item item, Scanner keyboardInt, Scanner keyboardStr, Pedido pedido) {
        System.out.println("[CLIENTE] [DIGITE O NOME DO PRODUTO]");
        item.nome = keyboardStr.nextLine();
        System.out.println("[CLIENTE] [DIGITE A QUANTIDADE DO PRODUTO ADICIONADO]");
        item.qtdDoItem  = keyboardInt.nextInt();

        pedido.addItens(item);
    }
}
