public class PessoaJuridica extends Contato {
    private String razaoSocial;
    private int cnpj;
    private double faturamento;

    public PessoaJuridica(String endereco, String razaoSocial, int cnpj, double faturamento) {
        super(endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.faturamento = faturamento;
    }

    public int getCnpj() {
        return this.cnpj;
    }

    @Override
    public String toString() {
        return "Razao Social: "+ this.razaoSocial + " CNPJ: " + this.cnpj  + " Faturamento: "+ this.faturamento;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }
}
