package ex1;

public class Contato {
    
    private String nome;
    private int telefone;
    private boolean isActive;

    protected Contato(String n, int tel, boolean status) {
        this.nome = n;
        this.telefone = tel;
        this.isActive = status;
    }


    protected void setNome(String nome) {
        this.nome = nome;
    }
    protected void setActive(boolean active) {
        this.isActive = active;
    }
    protected void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    protected String getNome() {
        return this.nome;
    }
    protected int getTelefone() {
        return this.telefone;
    }
    protected boolean isActive() {
        return this.isActive;
    }
}
