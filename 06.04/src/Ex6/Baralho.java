package Ex6;


import Ex8.Celular;

import java.util.Random;

public class Baralho {
    int qtdDeCartas = 0;
    Carta[] cartas = new Carta[52];
    boolean isSorted = true;

    public void embaralhar(Carta[] cartas, int qtdDeCartas) {
        Random random = new Random();

        for (int i=0; i < qtdDeCartas; i++) {
            String auxNaipe; String auxValor;
            int index1 = random.nextInt(qtdDeCartas);
            int index2 = random.nextInt(qtdDeCartas);

            auxNaipe = cartas[index1].naipe;
            auxValor = cartas[index1].valor;
            cartas[index1].naipe =  cartas[index2].naipe;
            cartas[index1].valor =  cartas[index2].valor;

            cartas[index2].naipe =   auxNaipe;
            cartas[index2].valor =   auxValor;
        }
    }
    public void gerarCarta(Carta carta) {
        cartas[qtdDeCartas] = carta;
        qtdDeCartas++;
    }
    public void visualizarCartas(Carta[] cartas, int qtdDeCartas) {
        System.out.println("-------------- BARALHO --------------------");
        for (int i =0; i < qtdDeCartas;i++) {
            System.out.println("NAIPE: " + cartas[i].naipe);
            System.out.println("VALOR: " + cartas[i].valor);
        }
        System.out.println("-------------------------------------------");
    }
}
