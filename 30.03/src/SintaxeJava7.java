/*
O setor que terceiriza o restaurante de uma empresa realizou uma pesquisa com os funcionários pedindo que cada um avaliasse a qualidade das refeições informando uma nota de 0 a 100.
O setor quer saber o percentual de funcionários que considera as refeições péssimas (nota entre 0 e 25), ruins (nota acima de 25 e até 50), boas (nota acima de 50 e até 75) e ótimas (acima de 75 até 100).
 Escreva um programa que leia as notas informadas e imprima o percentual de funcionários que votou em cada faixa.
 A entrada de dados deve terminar quando for lido um valor que não pertença a nenhum dos intervalos acima.
 */

import java.util.Scanner;

/**
 * @author Isadora Ribeiro
 */
public class SintaxeJava7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int c = 0;
        int notaOtima = 0;
        int notaBoas = 0;
        int notaPessimas = 0;
        int notaRuins = 0;
        System.out.println("[AVALIE][" + (c + 1) + "] FUNCIONARIO\n[NOTA ENTRE 0 E 100]");
        int value = keyboard.nextInt();
        while (value >= 0 && value <= 100) {
            c++;
            if (value <= 25) {
                notaPessimas++;
            } else if (value > 25 && value <= 50) {
                notaRuins++;
            } else if (value > 50 && value <= 75) {
                notaBoas++;
            } else {
                notaOtima++;
            }

            System.out.println("[AVALIE][" + (c + 1) + "] FUNCIONARIO\n[NOTA ENTRE 0 E 100]");
            value = keyboard.nextInt();
        }
        System.out.println("[NOTAS OTIMAS]: " + notaOtima + "\n[NOTAS BOAS]: " + notaBoas + "\n[NOTAS RUINS]: " + notaRuins + "\n[NOTAS PESSIMAS:] " + notaPessimas);
        System.out.println("[TOTAL DE FUNCIONARIOS]: " + c);

        float percentualOtimas = (notaOtima / (float) c) * 100;
        float percentualBoas = (notaBoas / (float) c) * 100;
        float percentualRuins = (notaRuins / (float) c) * 100;
        float percentualPessimas = (notaPessimas / (float) c) * 100;
        System.out.println("\t[PERCENTUAL]\n[NOTAS OTIMAS]: " + percentualOtimas + "%\n[NOTAS BOAS]: " + percentualBoas + "%\n[NOTAS RUINS]: " + percentualBoas + "%\n[NOTAS PESSIMAS:] " + percentualPessimas + "%");


    }

}
