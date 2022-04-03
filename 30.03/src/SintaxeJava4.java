/*
Imprima todos os múltiplos de 3, entre 1 e 100
 */

/**
 * @author Isadora Ribeiro
 */
public class SintaxeJava4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " is multiple of 3");
            }
        }
    }

}
