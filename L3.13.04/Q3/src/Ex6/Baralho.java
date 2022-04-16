package Ex6;


import java.util.Objects;
import java.util.Random;

public class Baralho {
    private int qtdDeCartas = 0;
    private String[] naipes = {"copas", "espada", "ouro", "paus"};
    private Carta[] baralhoDeCartas = new Carta[52];
    private boolean isSorted = true;

    public Carta[] getBaralhoDeCartas() {
        return this.baralhoDeCartas;
    }

    public int getQtdDeCartas() {
        return this.qtdDeCartas;
    }

    public void embaralhar(Carta[] cartas, int qtdDeCartas) {
        Random random = new Random();

        for (int i=0; i < qtdDeCartas; i++) {
            String auxNaipe; int auxValor; String auxID;
            int index1 = random.nextInt(qtdDeCartas);
            int index2 = random.nextInt(qtdDeCartas);

            auxNaipe = cartas[index1].getNaipe();
            auxValor = cartas[index1].getValor();
            auxID = cartas[index1].getNomeIdent();

            cartas[index1].setNaipe(cartas[index2].getNaipe());
            cartas[index1].setValor(cartas[index2].getValor());
            cartas[index1].setNomeIdent(cartas[index2].getNomeIdent());

            cartas[index2].setNaipe(auxNaipe);
            cartas[index2].setValor(auxValor);
            cartas[index2].setNomeIdent(auxID);
        }
    }

    public void visualizarCartas(Carta[] cartas, int qtdDeCartas) {
        System.out.println("-------------- BARALHO --------------------");
        for (int i =0; i < qtdDeCartas;i++) {
            System.out.println("-------------- CARTA " + (i+1) +" --------------------");
            System.out.println("NAIPE: " + cartas[i].getNaipe());
            System.out.println("VALOR: " + cartas[i].getValor());
            if (!Objects.equals(cartas[i].getNomeIdent(), String.valueOf(cartas[i].getValor()))) {
                System.out.println("ID: " + cartas[i].getNomeIdent());
            }
        }
        System.out.println("-------------------------------------------");
    }

    public void ordenar(Carta[] cartas, int qtdDeCartas) {
        int lenV = cartas.length;
        for (int i=0 ; i < lenV-1; i++) {
            for (int j=1; j < lenV; j++) {
                if (cartas[j].getNaipe().charAt(0) < cartas[j-1].getNaipe().charAt(0)) {
                    int auxValor = cartas[j - 1].getValor();
                    String auxNaipe = cartas[j - 1].getNaipe();
                    String auxId = cartas[j - 1].getNomeIdent();

                    cartas[j - 1].setValor(cartas[j].getValor());
                    cartas[j - 1].setNaipe(cartas[j].getNaipe());
                    cartas[j - 1].setNomeIdent(cartas[j].getNomeIdent());
                    cartas[j].setValor(auxValor);
                    cartas[j].setNaipe(auxNaipe);
                    cartas[j].setNomeIdent(auxId);

                }

                if (Objects.equals(cartas[j].getNaipe(), cartas[j - 1].getNaipe())) {
                    if (cartas[j].getValor() < cartas[j-1].getValor()) {

                        int auxValor = cartas[j-1].getValor();
                        String auxNaipe = cartas[j-1].getNaipe();
                        String auxId = cartas[j-1].getNomeIdent();

                        cartas[j-1].setValor(cartas[j].getValor());
                        cartas[j-1].setNaipe(cartas[j].getNaipe());
                        cartas[j-1].setNomeIdent(cartas[j].getNomeIdent());
                        cartas[j].setValor(auxValor);
                        cartas[j].setNaipe(auxNaipe);
                        cartas[j].setNomeIdent(auxId);

                    }
                }
            }
        }

    }

    public void gerarCartas( Baralho baralho) {
        for (int i = 0; i < naipes.length; i++) {
            for (int j = 1; j <= 13; j++) {
                String naipe; int valor; String nomeIdent;

                naipe = naipes[i];
                valor = j;
                switch (j) {
                    case 1:
                        nomeIdent = "AS";
                        break;
                    case 11:
                        nomeIdent = "JACK";
                        break;
                    case 12:
                        nomeIdent = "QUEEN";
                        break;
                    case 13:
                        nomeIdent = "KING";
                        break;
                    default:
                        nomeIdent = String.valueOf(j);
                        break;
                }
                Carta carta = new Carta(naipe, valor, nomeIdent);
                baralhoDeCartas[qtdDeCartas] = carta;
                qtdDeCartas++;
            }
        }
    }

}
