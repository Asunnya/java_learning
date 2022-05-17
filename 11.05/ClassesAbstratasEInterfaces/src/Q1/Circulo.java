package Q1;

public class Circulo extends FormaGeometrica {
    private double raio;


    protected void calculaArea(double raio) {
        this.area = (raio * raio ) * Math.PI;
    }
    protected void calculaPerimetro(double raio) {}


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
        calculaArea(this.raio);
    }
}
