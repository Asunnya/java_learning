package Q3;

import java.util.ArrayList;

public class AreaEPerimetro {

    public static <T extends FormasGeometricas> double somaArea(ArrayList<T> array) {
        double soma = 0;
        for (int i = 0; i < array.size(); i++) {
            soma =  array.get(i).getArea() + soma;
        }
        return soma;
    }
}
