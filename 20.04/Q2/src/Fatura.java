import java.util.ArrayList;

public class Fatura {
    private String nomeCliente;
    private String date;
    private double valor;
    private boolean estaPaga = false;

    public Fatura(String nC, String dt, double valorTotal) {
        this.nomeCliente = nC;
        this.date = dt;
        this.valor = valorTotal;
    }

    public boolean isEstaPaga(ArrayList<Boleto> boletos, double valorFatura) {
        faturaPaga(boletos, valorFatura);
        return this.estaPaga;
    }

    public void faturaPaga(ArrayList<Boleto> boletos, double valorFatura) {
        double sumBol = ProcessadorDeBoletos.sumListaBoletos(boletos);
        if (sumBol >= valorFatura) {
            this.estaPaga = true;
        }
    }

    public double getValor() {
        return this.valor;
    }
}
