package ex1;


import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Agenda agendaContatos = new Agenda();
        Scanner keyboard = new Scanner(System.in);
        Contato contato = new Contato();
        int n = keyboard.nextInt();
        String nome; int idade; int telefone;
        
        for (int i = 0; i < n; i++) {
            keyboard.nextLine();


            System.out.println("Digite o nome do novo contato");
            nome = keyboard.nextLine();
            System.out.println("Digite a idade");
            idade = keyboard.nextInt();
            System.out.println("Digite o telefone");
            telefone = keyboard.nextInt(); 
            
            agendaContatos.addContatos(contato, nome, idade, telefone);
            contato = new Contato();
        }
        agendaContatos.imprimirContatos(agendaContatos);

        System.out.println("Deseja apagar algum contato?\n1 - SIM\t0 - NAO");
        int op = keyboard.nextInt();
        if (op == 1) {
            keyboard.nextLine();
            System.out.println("Digite o nome do contato que deseja apagar");
            String contato_name = keyboard.nextLine();

            if (agendaContatos.buscaContato(contato_name)) {
                System.out.println("O contato informado foi deletado!");
            } else  {
                System.out.println("O contato informado nao foi encontrado");
            }
            agendaContatos.imprimirContatos(agendaContatos);
        }
    }

}