public class PessoaFisica extends Contato {
    private String nome;
    private int cpf;
    private String dataDeAniversario;

    public PessoaFisica(String endereco, String nome, int cpf, String dataDeAniversario) {
        super(endereco);
        this.cpf = cpf;
        this.nome = nome;
        this.dataDeAniversario = dataDeAniversario;
    }

    public int getCpf() {
        return this.cpf;
    }

    @Override
    public String toString() {
        return "nome: "+ this.nome + " CPF: " + this.cpf  + " Data de Aniversario: "+ this.dataDeAniversario;
    }

    public String getNome() {
        return this.nome;
    }
}
