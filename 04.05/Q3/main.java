package Q3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.setArea(triangulo.CalculaArea(40, 10));
        Retangulo retangulo = new Retangulo();
        retangulo.setArea(retangulo.CalculaArea(40, 10));
        Quadrado quadrado = new Quadrado();
        quadrado.setArea(quadrado.CalculaArea(10));
        Circulo c = new Circulo();
        c.setArea(c.CalculaArea(10));

        ArrayList<FormasGeometricas> arrayAreas = new ArrayList<FormasGeometricas>();
        arrayAreas.add(triangulo);
        arrayAreas.add(retangulo);
        arrayAreas.add(quadrado);
        arrayAreas.add(c);

        System.out.println(AreaEPerimetro.somaArea(arrayAreas));

    }
}
