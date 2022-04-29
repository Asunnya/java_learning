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
    }
}
