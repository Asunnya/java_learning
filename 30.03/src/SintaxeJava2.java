
import java.util.Scanner;

/*
Escreva um programa que efetue a leitura de três valores reais R, S e T, imprimindo qual deles é o maior
 */

/**
 * @author Isadora Ribeiro
 */
public class SintaxeJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("[DIGITE] Um valor: ");
        int R = keyboard.nextInt();
        System.out.println("[DIGITE] Um valor: ");
        int S = keyboard.nextInt();
        System.out.println("[DIGITE] Um valor: ");
        int T = keyboard.nextInt();

        int biggestValue;

        if (R >= S && R >= T) {
            biggestValue = R;
        } else if (T >= S) {
            biggestValue = T;
        } else {
            biggestValue = S;
        }

        System.out.println("[RESPOSTA] O maior valor inserido foi " + biggestValue);
    }

}
