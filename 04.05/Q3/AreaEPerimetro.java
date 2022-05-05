package Q3;

import java.util.ArrayList;

public class AreaEPerimetro {

    public static  <T extends Number> double somaArea(ArrayList<T> array) {
        double soma = 0;
        for (int i = 0; i < array.size(); i++) {
            soma = (double) array.get(i) + soma;
        }
        return soma;
    }
}
