package Ex6;

import java.util.Scanner;

/*
* Para implementar jogos com cartas, são necessárias classes para representar uma carta individual e também um baralho. Sugira implementações para essas classes, considerando:
Cartas - ás, 2 a 9, valete, dama e rei, dos naipes copas, espadas, ouros e paus
Baralho - conjunto de 52 cartas (13 cartas de cada naipe), em ordem ou embaralhado

* */
public class main {
    public static void main(String[] args){
        Baralho baralho = new Baralho();
        Scanner keyboardStr = new Scanner(System.in);
        Scanner keyboardInt = new Scanner(System.in);

        baralho.gerarCartas(baralho);

        baralho.visualizarCartas(baralho.baralhoDeCartas, baralho.qtdDeCartas);
        System.out.println("[DIGITE UM VALOR NEGATIVO]: PARA EMBARALHAR\t[DIGITE UM VALOR POSITIVO]: PARA NAO EMBARALHAR");
        int nO = keyboardInt.nextInt();

        while (nO < 0) {
            baralho.embaralhar(baralho.baralhoDeCartas, baralho.qtdDeCartas);
            System.out.println("------------------- EMBARALHADO ------------------");
            baralho.visualizarCartas(baralho.baralhoDeCartas, baralho.qtdDeCartas);
            System.out.println("[DIGITE UM VALOR NEGATIVO]: PARA EMBARALHAR\t[DIGITE UM VALOR POSITIVO]: PARA NAO EMBARALHAR");
             nO = keyboardInt.nextInt();
        }

        System.out.println("[DIGITE UM VALOR NEGATIVO]: PARA ORDENAR\t[DIGITE UM VALOR POSITIVO]: PARA NAO ORDENAR");
        int n1 = keyboardInt.nextInt();

        while (n1 < 0) {
            baralho.ordenar(baralho.baralhoDeCartas, baralho.qtdDeCartas);
            System.out.println("------------------- ORDENADO ------------------");
            baralho.visualizarCartas(baralho.baralhoDeCartas, baralho.qtdDeCartas);
            System.out.println("[DIGITE UM VALOR NEGATIVO]: PARA ORDENAR\t[DIGITE UM VALOR POSITIVO]: PARA NAO ORDENAR");
            n1 = keyboardInt.nextInt();
        }

        baralho.visualizarCartas(baralho.baralhoDeCartas, baralho.qtdDeCartas);
    }


}
