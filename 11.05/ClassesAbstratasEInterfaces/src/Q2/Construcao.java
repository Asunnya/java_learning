package Q2;

public class Construcao implements CarbonFootprint {
    private int numeroDePessoas;
    private boolean isEnergiaRenovavel;
    private int contaDeLuz;
    private int contaDeGas;
    private int  numeroDeLampadas;
    private boolean hasArCondicionado;


    protected Construcao(boolean isEnergiaRenovavel, int contaDeLuz, int contaDeGas) {
        this.isEnergiaRenovavel = isEnergiaRenovavel;
        this.contaDeLuz = contaDeLuz;
        this.contaDeGas = contaDeGas;
    }

    protected int getNumeroDePessoas() {
        return this.numeroDePessoas;
    }

    protected int getNumeroDeLampadas() {
        return this.numeroDeLampadas;
    }

    protected boolean isEnergiaRenovavel() {
        return this.isEnergiaRenovavel;
    }

    protected boolean isHasArCondicionado() {
        return this.hasArCondicionado;
    }

    @Override
    public String toString() {
        return "Construcao{" +
                "numeroDePessoas=" + numeroDePessoas +
                ", isEnergiaRenovavel=" + isEnergiaRenovavel +
                ", contaDeLuz=" + contaDeLuz +
                ", contaDeGas=" + contaDeGas +
                ", numeroDeLampadas=" + numeroDeLampadas +
                ", hasArCondicionado=" + hasArCondicionado +
                '}';
    }

    @Override
    public double getCarbonFootprint() {
        if (!this.isEnergiaRenovavel) {
            return (contaDeLuz * MONTHLY_ELETRIC) + (contaDeGas * MONTHLY_GAS);
        }
        return  contaDeGas * MONTHLY_GAS;
    }
}
