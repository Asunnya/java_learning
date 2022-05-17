package Q1;

public class Retangulo extends FormaGeometrica {
    private double lado1;
    private double lado2;

    @Override
    protected double getArea() {
        return this.area;
    }

    @Override
    protected double getPerimetro() {
        return this.perimetro;
    }

    @Override
    protected void calculaArea() {
        calculaArea(this.lado1, this.lado2);
    }

    protected void calculaArea(double lado1, double lado2) {
        this.area = lado1 * lado2;
    }
}
