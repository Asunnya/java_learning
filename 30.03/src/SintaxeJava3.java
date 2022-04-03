/*
Imprima a soma de 1 até 999
 */

/**
 * @author Isadora Ribeiro
 */
public class SintaxeJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 999; i++) {
            sum += i;
        }
        System.out.println("[RESPOSTA] " + sum);
    }

}
