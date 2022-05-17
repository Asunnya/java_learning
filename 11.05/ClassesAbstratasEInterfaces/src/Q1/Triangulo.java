package Q1;

public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public void calculaArea(double base, double altura) {
        this.area = (base *altura) /2;
    }

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
        calculaArea(this.base, this.altura);
    }
}
