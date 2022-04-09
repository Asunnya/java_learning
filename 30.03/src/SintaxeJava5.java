/*
Escreva um programa recebe um valor N inteiro e que, se N for positivo, retorna o fatorial de N (N!).
Se não for possível calcular o fatorial, a função deve imprimir uma mensagem e retornar o valor -1.
 */

import java.util.Scanner;

/**
 * @author Isadora Ribeiro
 */
public class SintaxeJava5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("[DIGITE] Valor");
        int value = keyboard.nextInt();

        if (value > 0) {
            int factorial = 1;
            for (int i = value; i >= 1; i--) {
                factorial = factorial * i;
            }
            System.out.println("[VALOR]: " + value + " [FATORIAL]: " + factorial);
        } else {
            System.out.println("Não é possível calcular o fatorial de um valor negativo.");
        }

    }

}
