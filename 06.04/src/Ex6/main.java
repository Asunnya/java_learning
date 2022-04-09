package Ex6;

import Ex8.Celular;
import Ex8.Ligacao;
import Ex8.Mensagem;

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

        System.out.println("DIGITE A QUANTIDADE DE CARTAS");
        int nC = keyboardInt.nextInt();

        for (int i=0; i < nC; i++) {
            Carta carta = new Carta();
            preencherCartas(carta, keyboardStr, baralho);
        }

        baralho.visualizarCartas(baralho.cartas, baralho.qtdDeCartas);
        System.out.println("[DIGITE UM VALOR NEGATIVO]: PARA EMBARALHAR\t[DIGITE UM VALOR POSITIVO]: PARA NAO EMBARALHAR");
        int nO = keyboardInt.nextInt();

        while (nO < 0) {
            baralho.embaralhar(baralho.cartas, baralho.qtdDeCartas);
            System.out.println("------------------- EMBARALHADO ------------------");
            baralho.visualizarCartas(baralho.cartas, baralho.qtdDeCartas);
            System.out.println("[DIGITE UM VALOR NEGATIVO]: PARA EMBARALHAR\t[DIGITE UM VALOR POSITIVO]: PARA NAO EMBARALHAR");
             nO = keyboardInt.nextInt();
        }
        baralho.visualizarCartas(baralho.cartas, baralho.qtdDeCartas);
    }

    public static void preencherCartas(Carta carta, Scanner keyboardStr, Baralho baralho) {
        System.out.println("DIGITE O NAIPE DA CARTA");
        carta.naipe = keyboardStr.nextLine();
        System.out.println("DIGITE O VALOR DA CARTA");
        carta.valor = keyboardStr.nextLine();
        baralho.gerarCarta(carta);
    }
}
