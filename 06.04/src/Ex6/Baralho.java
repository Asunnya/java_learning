package Ex6;


import java.util.Objects;
import java.util.Random;

public class Baralho {
    int qtdDeCartas = 0;
    String[] naipes = {"paus", "ouros", "copas", "espadas"};
    Carta[] baralhoDeCartas = new Carta[52];
    boolean isSorted = true;

    public void embaralhar(Carta[] cartas, int qtdDeCartas) {
        Random random = new Random();

        for (int i=0; i < qtdDeCartas; i++) {
            String auxNaipe; int auxValor; String auxID;
            int index1 = random.nextInt(qtdDeCartas);
            int index2 = random.nextInt(qtdDeCartas);

            auxNaipe = cartas[index1].naipe;
            auxValor = cartas[index1].valor;
            auxID = cartas[index1].nomeIdent;

            cartas[index1].naipe =  cartas[index2].naipe;
            cartas[index1].valor =  cartas[index2].valor;
            cartas[index1].nomeIdent =  cartas[index2].nomeIdent;

            cartas[index2].naipe =   auxNaipe;
            cartas[index2].valor =   auxValor;
            cartas[index2].nomeIdent =   auxID;
        }
    }

    public void visualizarCartas(Carta[] cartas, int qtdDeCartas) {
        System.out.println("-------------- BARALHO --------------------");
        for (int i =0; i < qtdDeCartas;i++) {
            System.out.println("-------------- CARTA " + (i+1) +" --------------------");
            System.out.println("NAIPE: " + cartas[i].naipe);
            System.out.println("VALOR: " + cartas[i].valor);
            if (!Objects.equals(cartas[i].nomeIdent, String.valueOf(cartas[i].valor))) {
                System.out.println("ID: " + cartas[i].nomeIdent);
            }
        }
        System.out.println("-------------------------------------------");
    }

    public void ordenar(Carta[] cartas, int qtdDeCartas) {
        int lenV = cartas.length;
        for (int i=0 ; i < lenV-1; i++) {
            for (int j=1; j < lenV; j++) {
                if (cartas[j].valor < cartas[j-1].valor) {
                    int auxValor = cartas[j-1].valor;
                    cartas[j-1].valor = cartas[j].valor;
                    cartas[j].valor = auxValor;
                }
            }
        }

    }

    public void gerarCartas( Baralho baralho) {

        for (int i = 0; i < naipes.length; i++) {
            for (int j = 1; j <= 13; j++) {
                Carta carta = new Carta();
                carta.naipe = naipes[i];
                carta.valor = j;
                switch (j) {
                    case 1:
                        carta.nomeIdent = "AS";
                        break;
                    case 11:
                        carta.nomeIdent = "JACK";
                        break;
                    case 12:
                        carta.nomeIdent = "QUEEN";
                        break;
                    case 13:
                        carta.nomeIdent = "KING";
                        break;
                    default:
                        carta.nomeIdent = String.valueOf(j);
                        break;
                }
                baralhoDeCartas[qtdDeCartas] = carta;
                qtdDeCartas++;
            }
        }
    }

}
