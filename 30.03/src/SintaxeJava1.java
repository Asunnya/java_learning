/*
Escreva um programa que recebe como parâmetro um número inteiro n. A função deve ler n valores do teclado e retornar quantos destes valores são negativos.
 */

import java.util.Scanner;

/**
 * @author Isadora Ribeiro
 */
public class SintaxeJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String printWord;

        System.out.println("[DIGITE] Quantidade de Valores!");
        int values = keyboard.nextInt();
        int negativeValues = 0;

        for (int i = 0; i < values; i++) {

            System.out.println("[DIGITE] Um valor");
            int value = keyboard.nextInt();
            if (value < 0) {
                negativeValues++;
            }
        }

        if (negativeValues <= 1) {
            printWord = "[RESPOSTA] Foi inserido " + negativeValues + " valor negativo.";
        } else {
            printWord = "[RESPOSTA] Foram inseridos " + negativeValues + " valores negativos.";
        }
        System.out.println(printWord);

    }

}
