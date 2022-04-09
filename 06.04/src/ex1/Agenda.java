package ex1;

import java.util.Objects;

public class Agenda {

    Contato []contatos = new Contato[10];
    int qtdeContatos = 0;

    public void addContatos(Contato contato, String nome, int idade, int tel) {

        contato.nome = nome;
        contato.idade = idade;
        contato.telefone = tel;
        contato.isActive = true;

        contatos[qtdeContatos] = contato;
        qtdeContatos++;

    }
    
    
     public void imprimirContatos (Agenda agenda) {
         for (int i= 0; i < qtdeContatos; i++){
             agenda.imprimirContato(contatos, i);
         }  
    }
    
     public void imprimirContato(Contato[] contatos, int i) {
        if (contatos[i].isActive) {
            System.out.println("-------------- IMPRIMINDO CONTATOS --------------------");
            System.out.println("Nome: " + contatos[i].nome );
            System.out.println("Idade: " + contatos[i].idade);
            System.out.println("Telefone: " + contatos[i].telefone);
        }
     }
     public void removeContato(Contato[] contatos, int i) {
         contatos[i].isActive = false;
         contatos[i].idade = 0;
         contatos[i].nome = "";
         contatos[i].telefone = 0;
     }

     public boolean buscaContato(String nome) {
         for (int i = 0; i < qtdeContatos; i++) {
             if (Objects.equals(nome, contatos[i].nome)) {
                   removeContato(contatos, i);
                   return true;
             }
         }
         return false;
     }
}