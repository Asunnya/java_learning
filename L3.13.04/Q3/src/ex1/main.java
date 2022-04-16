package ex1;


import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Agenda agendaContatos = new Agenda();
        Scanner keyboardInt = new Scanner(System.in);
        Scanner keyboardStr = new Scanner(System.in);

        int n = keyboardInt.nextInt();
        String nome; int telefone;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do novo contato");
            nome = keyboardStr.nextLine();
            System.out.println("Digite o telefone");
            telefone = keyboardInt.nextInt();
            
            agendaContatos.addContatos(nome, telefone);
        }
        agendaContatos.imprimirContatos(agendaContatos);

        System.out.println("Deseja apagar algum contato?\n1 - SIM\t0 - NAO");
        int op = keyboardInt.nextInt();
        if (op == 1) {
            System.out.println("Digite o nome do contato que deseja apagar");
            String contato_name = keyboardStr.nextLine();

            if (agendaContatos.removeContato(agendaContatos.getContatos(), contato_name)) {
                System.out.println("O contato informado foi deletado!");
            } else  {
                System.out.println("O contato informado nao foi encontrado");
            }
            agendaContatos.imprimirContatos(agendaContatos);
        }
    }

}