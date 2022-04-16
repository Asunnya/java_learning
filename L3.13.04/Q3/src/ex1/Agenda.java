package ex1;

import java.util.Objects;

public class Agenda {

    private Contato []contatos = new Contato[10];
    private int qtdeContatos = 0;

    protected void addContatos(String nome,  int tel) {
        Contato contato = new Contato(nome, tel, true);
        contatos[qtdeContatos] = contato;
        qtdeContatos++;
    }

    protected void imprimirContatos (Agenda agenda) {
         for (int i= 0; i < qtdeContatos; i++){
             agenda.imprimirContato(contatos, i);
         }  
    }

    public Contato[] getContatos() {
        return this.contatos;
    }

    protected void imprimirContato(Contato[] contatos, int i) {
        if (contatos[i].isActive()) {
            System.out.println("-------------- IMPRIMINDO CONTATOS --------------------");
            System.out.println("Nome: " + contatos[i].getNome());
            System.out.println("Telefone: " + contatos[i].getTelefone());
        }
     }
    protected boolean removeContato(Contato[] contatos, String nome) {
         int i = buscaContato(nome);
         if (i >= 0) {
             contatos[i].setActive(false);
             contatos[i].setNome("");
             contatos[i].setTelefone(0);
             return true;
         }
         return false;
     }

    protected int buscaContato(String nome) {
         for (int i = 0; i < qtdeContatos; i++) {
             if (Objects.equals(nome, contatos[i].getNome())) {
                   return i;
             }
         }
         return -1;
     }
}