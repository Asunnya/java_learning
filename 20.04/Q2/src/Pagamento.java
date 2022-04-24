public class Pagamento {
    private double valorPago;
    private String date;
    private String tipoDePagamento;

    public Pagamento(double vp, String dt, String tipoDePagamento) {
        this.valorPago = vp;
        this.date = dt;
        this.tipoDePagamento = tipoDePagamento;
    }


    public String getTipoDePagamento() {
        return this.tipoDePagamento;
    }

}
