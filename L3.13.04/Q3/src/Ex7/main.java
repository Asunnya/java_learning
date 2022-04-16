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
        Scanner keyboardDouble = new Scanner(System.in);


        System.out.println("[OPERADOR SUPERMERCADO] [DIGITE A QUANTIDADE DE PRODUTOS]");
        int nS = keyboardInt.nextInt();

        for (int i=0; i < nS; i++) {
            preencherSupermercado(keyboardDouble, keyboardInt, keyboardStr, americanas);
        }

        caixa.imprimindoProdutos(americanas.getProdutos(), americanas.getQtdeProdutosSupermercado());

        System.out.println("[CLIENTE] [DIGITE A QUANTIDADE DE PRODUTOS]");
        int nC = keyboardInt.nextInt();

        for (int i=0; i < nC; i++) {
            preencherPedido(keyboardInt, keyboardStr, pedido);
        }

        caixa.imprimindoPedido(pedido.getItens(), pedido.getQtdeItensTotalPedido());
        caixa.pagandoPedidos(americanas.getProdutos(), pedido.getItens(), pedido.getQtdeItensTotalPedido(), americanas.getQtdeProdutosSupermercado(), keyboardInt);
    }
    public static void preencherSupermercado(Scanner keyboardDouble, Scanner keyboardInt, Scanner keyboardStr, Supermercado supermercado) {
        String nome; double preco; int qtEst;

        System.out.println("[OPERADOR SUPERMERCADO] [DIGITE O NOME DO PRODUTO]");
        nome = keyboardStr.nextLine();
        System.out.println("[OPERADOR SUPERMERCADO] [DIGITE O VALOR DO PRODUTO]");
        preco = keyboardDouble.nextDouble();
        System.out.println("[OPERADOR SUPERMERCADO] [DIGITE A QUANTIDADE DE ESTOQUE DESSE PRODUTO]");
        qtEst = keyboardInt.nextInt();

        Produto produto = new Produto(nome, preco, qtEst);
        supermercado.addProdutos(produto);
    }

    public static void preencherPedido(Scanner keyboardInt, Scanner keyboardStr, Pedido pedido) {
        String nome; int qtEst;

        System.out.println("[CLIENTE] [DIGITE O NOME DO PRODUTO]");
        nome = keyboardStr.nextLine();
        System.out.println("[CLIENTE] [DIGITE A QUANTIDADE DO PRODUTO ADICIONADO]");
        qtEst  = keyboardInt.nextInt();

        Item item = new Item(nome, qtEst);
        pedido.addItens(item);
    }
}
