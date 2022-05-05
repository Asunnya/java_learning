package Q3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        System.out.println(triangulo.CalculaArea(40, 10));
        Retangulo retangulo = new Retangulo();
        System.out.println(retangulo.CalculaArea(40, 10));
        Quadrado quadrado = new Quadrado();
        System.out.println(quadrado.CalculaArea(10));
        Circulo c = new Circulo();
        System.out.println(c.CalculaArea(10));

        ArrayList<Double> arrayAreas = new ArrayList<Double>();
        arrayAreas.add(triangulo.CalculaArea(40, 10));
        arrayAreas.add(retangulo.CalculaArea(40, 10));
        arrayAreas.add(quadrado.CalculaArea (10));
        arrayAreas.add(c.CalculaArea(10));

        AreaEPerimetro.somaArea(arrayAreas);

    }
}
